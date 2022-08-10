package com.esongs.emotionalsongs;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToHomepage(ActionEvent event) throws IOException {
        Parent root =  FXMLLoader.load(getClass().getResource("homepage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToLogin(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    public void switchToRegistration(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registration.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void switchToRegistrationFromLogin(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registration.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

}
