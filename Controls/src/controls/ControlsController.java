/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Aissam
 */
public class ControlsController implements Initializable {
    
    
    @FXML
    private ToggleGroup genderGroupe;
    @FXML
    private JFXComboBox<String> educationCombo;
   
    
       @FXML
    private void handleRegistration(ActionEvent event) {
        //Code to complete registration.
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        educationCombo.getItems().addAll("Elementary school", "Middle school" , "High school", "College");
    }  
}
