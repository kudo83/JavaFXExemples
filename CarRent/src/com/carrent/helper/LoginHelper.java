/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.helper;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.stage.Window;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author Aissam
 */
public class LoginHelper {

    public static void showAlert(Alert.AlertType alertType, String title, String message, Window owner) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress  emailAddress = new InternetAddress(email);
            emailAddress.validate();
        } catch (AddressException ex) {
           result = false;
        }
        
        return result;
    }

}
