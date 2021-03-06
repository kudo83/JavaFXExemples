/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Aissam
 */
public class Practiceproject extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login/Login.fxml"));

        Scene scene = new Scene(root);

        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Yesteryear");
        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Lobster");
        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Montserrat");

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
