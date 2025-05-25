package com.example.photobooth;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainApp extends Application {

    private PhotoBoothController controller; // Giữ tham chiếu tới controller

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("photobooth_layout.fxml")));
            Parent root = loader.load();

            // Lấy controller để có thể gọi phương thức shutdown
            controller = loader.getController();

            Scene scene = new Scene(root, 700, 600);

            primaryStage.setTitle("JavaFX Photo Booth (FXML)");
            primaryStage.setScene(scene);
            primaryStage.setOnCloseRequest(event -> {
                if (controller != null) {
                    controller.shutdown(); // Gọi shutdown của controller
                }
            });
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Không thể load FXML: " + e.getMessage());
            // Hiển thị thông báo lỗi cho người dùng nếu cần
        }
    }

    @Override
    public void stop() throws Exception {
        // Đảm bảo shutdown được gọi nếu OnCloseRequest không được kích hoạt đúng cách
        if (controller != null) {
            controller.shutdown();
        }
        super.stop();
        System.out.println("Ứng dụng Photo Booth đã dừng.");
    }

    public static void main(String[] args) {
        launch(args);
    }
}