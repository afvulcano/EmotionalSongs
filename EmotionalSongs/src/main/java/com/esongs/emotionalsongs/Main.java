package com.esongs.emotionalsongs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("homepage.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));


        Scene scene = new Scene(root);
        stage.setTitle("Emotional Songs - Homepage");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}