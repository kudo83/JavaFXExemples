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

    public static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();

    }
    
    
    public static boolean isValisEmailAdress(String email){
        boolean result = true;
        
        InternetAddress emailAddress;
        try {
            
            emailAddress = new InternetAddress(email);
            emailAddress.validate();
            
        } catch (AddressException ex) {
            result = false;
        }
        
        
        return result;
    }

}
