package com.example.photobooth;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.concurrent.Task;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class PhotoBoothController {

    @FXML
    private ImageView cameraView;
    @FXML
    private Button captureButton;
    @FXML
    private Button saveButton;
    @FXML
    private Label statusLabel;

    private Webcam webcam;
    private BufferedImage capturedImageBuffer;
    private ObjectProperty<Image> capturedFxImageProperty = new SimpleObjectProperty<>();

    private boolean isCameraActive = false;
    private Task<Void> cameraTask;

    // Phương thức này sẽ được tự động gọi sau khi FXML được load
    @FXML
    public void initialize() {
        initWebcam();
        if (webcam != null) {
            startCameraStream();
        } else {
            statusLabel.setText("Không tìm thấy webcam!");
            captureButton.setDisable(true);
        }
        // Đảm bảo nút lưu bị vô hiệu hóa khi khởi động
        saveButton.setDisable(true);
    }

    private void initWebcam() {
        webcam = Webcam.getDefault();
        if (webcam != null) {
            webcam.setViewSize(WebcamResolution.VGA.getSize());
            statusLabel.setText("Webcam: " + webcam.getName());
        } else {
            System.err.println("Không tìm thấy webcam!");
            Platform.runLater(() -> statusLabel.setText("Lỗi: Không tìm thấy webcam."));
        }
    }

    private void startCameraStream() {
        if (webcam == null || isCameraActive) return;

        isCameraActive = true;
        saveButton.setDisable(true);
        captureButton.setText("Chụp ảnh");
        capturedImageBuffer = null;
        capturedFxImageProperty.set(null);

        cameraTask = new Task<>() {
            @Override
            protected Void call() {
                if (!webcam.isOpen()) {
                    webcam.open();
                }
                final AtomicReference<Image> imgRef = new AtomicReference<>();
                while (isCameraActive && !isCancelled()) {
                    if (webcam.isImageNew()) {
                        BufferedImage bImage = webcam.getImage();
                        if (bImage != null) {
                            imgRef.set(SwingFXUtils.toFXImage(bImage, null));
                            Platform.runLater(() -> cameraView.setImage(imgRef.get()));
                        }
                    }
                    try {
                        Thread.sleep(30); // ~33 FPS
                    } catch (InterruptedException e) {
                        if (isCancelled()) break;
                    }
                }
                return null;
            }
        };

        cameraTask.setOnFailed(event -> {
            isCameraActive = false;
            Throwable throwable = cameraTask.getException();
            System.err.println("Lỗi luồng camera: " + throwable.getMessage());
            throwable.printStackTrace();
            Platform.runLater(() -> statusLabel.setText("Lỗi camera!"));
        });

        cameraTask.setOnSucceeded(event -> isCameraActive = false);
        cameraTask.setOnCancelled(event -> isCameraActive = false);


        Thread thread = new Thread(cameraTask);
        thread.setDaemon(true);
        thread.start();
        Platform.runLater(() -> statusLabel.setText("Đang hiển thị webcam..."));
    }


    @FXML
    void handleCaptureButtonAction(ActionEvent event) {
        if (!isCameraActive) { // Nếu đang hiển thị ảnh đã chụp, thì chụp lại
            startCameraStream();
            return;
        }

        if (webcam == null || !webcam.isOpen()) {
            statusLabel.setText("Webcam chưa sẵn sàng.");
            return;
        }

        capturedImageBuffer = webcam.getImage();

        if (capturedImageBuffer != null) {
            stopCameraStreamOnly(); // Dừng stream để hiển thị ảnh

            Image fxImage = SwingFXUtils.toFXImage(capturedImageBuffer, null);
            capturedFxImageProperty.set(fxImage);
            cameraView.setImage(fxImage);

            saveButton.setDisable(false);
            captureButton.setText("Chụp lại");
            statusLabel.setText("Đã chụp! Nhấn 'Lưu ảnh' hoặc 'Chụp lại'.");
        } else {
            statusLabel.setText("Không thể chụp ảnh.");
        }
    }

    @FXML
    void handleSaveButtonAction(ActionEvent event) {
        if (capturedImageBuffer == null) {
            statusLabel.setText("Chưa có ảnh để lưu.");
            return;
        }

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Lưu ảnh Photo Booth");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PNG Images", "*.png"),
                new FileChooser.ExtensionFilter("JPG Images", "*.jpg", "*.jpeg")
        );

        // Lấy Stage hiện tại từ một control bất kỳ trong scene
        Stage stage = (Stage) saveButton.getScene().getWindow();
        File file = fileChooser.showSaveDialog(stage);


        if (file != null) {
            try {
                String extension = "";
                String name = file.getName();
                int i = name.lastIndexOf('.');
                if (i > 0) {
                    extension = name.substring(i + 1).toLowerCase();
                }
                if (!"png".equals(extension) && !"jpg".equals(extension) && !"jpeg".equals(extension)) {
                    extension = "png"; // Mặc định là png
                    file = new File(file.getAbsolutePath() + ".png");
                }

                ImageIO.write(capturedImageBuffer, extension.toUpperCase(), file);
                statusLabel.setText("Đã lưu ảnh: " + file.getName());
                saveButton.setDisable(true);
                captureButton.setText("Chụp ảnh");
                // Khởi động lại camera stream sau khi lưu
                startCameraStream();
            } catch (IOException e) {
                System.err.println("Lỗi lưu ảnh: " + e.getMessage());
                statusLabel.setText("Lỗi khi lưu ảnh!");
            }
        }
    }

    private void stopCameraStreamOnly() {
        if (cameraTask != null) {
            cameraTask.cancel(true);
        }
        isCameraActive = false;
        // Không webcam.close() ở đây
    }

    // Phương thức này sẽ được gọi từ MainApp khi ứng dụng đóng
    public void shutdown() {
        stopCameraStreamOnly();
        if (webcam != null && webcam.isOpen()) {
            webcam.close();
            System.out.println("Webcam đã đóng.");
        }
        System.out.println("Controller đã shutdown.");
    }
}