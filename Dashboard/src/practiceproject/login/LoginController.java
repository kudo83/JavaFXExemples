/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject.login;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import practiceproject.Practiceproject;

/**
 *
 * @author Aissam
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton BtnSignIn;
    @FXML
    private JFXButton BtnSignUp;
    @FXML
    private AnchorPane signInPane;
    @FXML
    private AnchorPane signUpPane;
    @FXML
    private JFXButton loginBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }

    @FXML
    private void onMenuAction(ActionEvent event) {
        BtnSignIn.getStyleClass().removeAll("menuButtonSelected", "menuButton");
        BtnSignUp.getStyleClass().removeAll("menuButtonSelected", "menuButton");

        if (event.getSource() == BtnSignIn) {
            BtnSignIn.getStyleClass().add("menuButtonSelected");
            BtnSignUp.getStyleClass().add("menuButton");
            signInPane.toFront();

        } else {
            BtnSignIn.getStyleClass().add("menuButton");
            BtnSignUp.getStyleClass().add("menuButtonSelected");
            signUpPane.toFront();
        }
    }

    @FXML
    private void onLogin(ActionEvent event) {
        try {
          
            AnchorPane dashPane = FXMLLoader.load(Practiceproject.class.getResource("dashboard/Dashboard.fxml"));
            Scene dashScene = new Scene(dashPane);
            
            Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
            Window.setTitle("Dashboard");
            Window.setScene(dashScene);
            Window.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
