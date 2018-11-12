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
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 *
 * @author Aissam
 */
public class LoginController implements Initializable {

    @FXML
    private JFXTextField userName;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXTextField userNameRegister;
    @FXML
    private JFXPasswordField confirmPass;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField passRegister;

    @FXML
    private Pane signInPane;
    @FXML
    private Pane signUpPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onLogin(ActionEvent event) {
    }

    @FXML
    private void onSignUpNow(ActionEvent event) {
        signUpPane.toFront();
    }

    @FXML
    private void onSignUp(ActionEvent event) {

        if (email.getText().isEmpty()) {
            LoginHelper.showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your email!", signUpPane.getScene().getWindow());
            return;
        }
        if (!LoginHelper.isValidEmailAddress(email.getText())) {
            LoginHelper.showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter a valid Email!", signUpPane.getScene().getWindow());
            return;
        }

        if (userNameRegister.getText().isEmpty()) {
            LoginHelper.showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your user name!", signUpPane.getScene().getWindow());
            return;
        }
        if (passRegister.getText().isEmpty()) {
            LoginHelper.showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your password!", signUpPane.getScene().getWindow());
            return;
        }
        if (confirmPass.getText().isEmpty()) {
            LoginHelper.showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your confirmation password!", signUpPane.getScene().getWindow());
            return;
        }
        if (!(passRegister.getText().equals(confirmPass.getText()))) {
            LoginHelper.showAlert(Alert.AlertType.ERROR, "Form Error!", "password confirmation doesn't match password!", signUpPane.getScene().getWindow());
            return;
        }
        
        User newUser = new User(userNameRegister.getText(),email.getText(),passRegister.getText()) ;
        
        //This is where you call the service to persisit the user OBJECT in the data base
        System.out.println("Email:"+newUser.getEmail()+"   User name:"+newUser.getUserName()+ "   Password:"+newUser.getPassword() );

    }

    @FXML
    private void onSignInNow(ActionEvent event) {
        signInPane.toFront();
    }

}
