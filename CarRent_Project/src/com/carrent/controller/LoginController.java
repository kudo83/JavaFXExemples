/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.controller;

import com.carrent.helper.LoginHelper;
import com.carrent.model.User;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;

/**
 *
 * @author Aissam
 */
public class LoginController implements Initializable {

    @FXML
    private Pane signInForm;
    @FXML
    private JFXTextField userName;
    @FXML
    private JFXPasswordField password;
    @FXML
    private Pane signUpForm;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField userNameRegister;
    @FXML
    private JFXPasswordField passRegister;
    @FXML
    private JFXPasswordField confirmPass;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onLogin(ActionEvent event) {
    }

    @FXML
    private void onSignUpNow(ActionEvent event) {
        signUpForm.toFront();
    }

    @FXML
    private void onSignUp(ActionEvent event) {
        if (email.getText().isEmpty()) {

            LoginHelper.showAlert(Alert.AlertType.ERROR, signInForm.getScene().getWindow(),
                    "Form Error!", "Please enter your Email!");
            return;
        }

        if (!LoginHelper.isValisEmailAdress(email.getText())) {

            LoginHelper.showAlert(Alert.AlertType.ERROR, signInForm.getScene().getWindow(),
                    "Form Error!", "Please enter a valid Email!");
            return;
        }
        
        if (userNameRegister.getText().isEmpty()) {

            LoginHelper.showAlert(Alert.AlertType.ERROR, signInForm.getScene().getWindow(),
                    "Form Error!", "Please enter your Username!");

            return;
        }
        if (passRegister.getText().isEmpty()) {

            LoginHelper.showAlert(Alert.AlertType.ERROR, signInForm.getScene().getWindow(),
                    "Form Error!", "Please enter your Password!");

            return;
        }
        if (confirmPass.getText().isEmpty()) {

            LoginHelper.showAlert(Alert.AlertType.ERROR, signInForm.getScene().getWindow(),
                    "Form Error!", "Please enter the Password Confirmation!");

            return;
        }
        if (!(passRegister.getText().equals(confirmPass.getText()))){
             LoginHelper.showAlert(Alert.AlertType.ERROR, signInForm.getScene().getWindow(),
                    "Form Error!", "Password confirmation doesn't match password!!");

        }
        
        
        User newUser = new User(userNameRegister.getText(), email.getText(), passRegister.getText());
        
        System.out.println("Email:"+newUser.getEmail() + " Username:"+ newUser.getUserName()+ " Password:"+newUser.getPassword());

    }

    @FXML
    private void onSignInNow(ActionEvent event) {
        signInForm.toFront();
    }

}
