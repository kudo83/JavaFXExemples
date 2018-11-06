/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject.login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import practiceproject.Practiceproject;
import practiceproject.helpers.DashBoardHelper;

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
    @FXML
    private JFXTextField userName;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXPasswordField confirmPassword;
    @FXML
    private JFXTextField email;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void onMenuAction(ActionEvent event) {
        BtnSignIn.getStyleClass().removeAll("menu-item-selected");
        BtnSignUp.getStyleClass().removeAll("menu-item-selected");

        if (event.getSource() == BtnSignIn) {
            BtnSignIn.getStyleClass().add("menu-item-selected");
            BtnSignUp.getStyleClass().add("menu-item");
            signInPane.toFront();

        } else {
            BtnSignIn.getStyleClass().add("menu-item-selected");
            BtnSignUp.getStyleClass().add("menu-item");
            signUpPane.toFront();
        }
    }

    @FXML
    private void onLogin(ActionEvent event) {
        //Login form validation

//        if ()
        try {

            AnchorPane dashPane = FXMLLoader.load(Practiceproject.class.getResource("dashboard/Dashboard.fxml"));
            Scene dashScene = new Scene(dashPane);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setTitle("Dashboard");
            window.setScene(dashScene);
            dashPane.requestFocus();
//            window.setMaximized(true);
            window.show();

        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onSignUp(ActionEvent event) {
        if (email.getText().isEmpty()) {
            DashBoardHelper.showAlert(Alert.AlertType.ERROR, signUpPane.getScene().getWindow(), "Form Error!", "Please enter your email!");
            return;
        }
        if (!isValidEmailAddress(email.getText())) {
            DashBoardHelper.showAlert(Alert.AlertType.ERROR, signUpPane.getScene().getWindow(), "Form Error!", "Please enter a valid email!");
            return;
        }
        if (userName.getText().isEmpty()) {
            DashBoardHelper.showAlert(Alert.AlertType.ERROR, signUpPane.getScene().getWindow(), "Form Error!", "Please enter your username!");
            return;
        }
        if (password.getText().isEmpty()) {
            DashBoardHelper.showAlert(Alert.AlertType.ERROR, signUpPane.getScene().getWindow(), "Form Error!", "Please enter your password!");
            return;
        }
        if (confirmPassword.getText().isEmpty()) {
            DashBoardHelper.showAlert(Alert.AlertType.ERROR, signUpPane.getScene().getWindow(), "Form Error!", "Please enter your password confirmation!");
            return;
        }
        if (!(password.getText()).equals(confirmPassword.getText())) {
            DashBoardHelper.showAlert(Alert.AlertType.ERROR, signUpPane.getScene().getWindow(), "Form Error!", "password confirmation doesn't match password!");
            return;
        }
    }
    
    public  boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

}
