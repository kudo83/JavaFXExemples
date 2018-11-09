/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.controller;

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
        
        if (email.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Form Error!");
            alert.setContentText("Please enter your email!");
            
            
        }
       
    }

    @FXML
    private void onSignInNow(ActionEvent event) {
        signInPane.toFront();
    }
    
}
