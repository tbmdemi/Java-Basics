package com.example.dictionary;

import com.almasb.fxgl.cutscene.dialogue.SerializableChoiceNode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

//import java.io.IO;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label weocamL;

    @FXML
    private void newpaa(ActionEvent event) {
        try {
            Parent newPageRoot = FXMLLoader.load(getClass().getResource("newPage.fxml"));
            Scene newPageScene = new Scene(newPageRoot);

            // Tạo Stage mới
            Stage newStage = new Stage();
            newStage.setScene(newPageScene);
            newStage.setTitle("New Window");

            // Hiển thị
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void thahttam(ActionEvent event) {
        try {
            Parent newPageRoot = FXMLLoader.load(getClass().getResource("ThahTtam.fxml"));
            Scene newPageScene = new Scene(newPageRoot);

            Stage newStage = new Stage();
            newStage.setScene(newPageScene);
            newStage.setTitle("Lời chào từ ttam");

            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("minh trinh xin chao");
    }
    public void weocambut() {
        weocamL.setText("Hello guy");
    }

}