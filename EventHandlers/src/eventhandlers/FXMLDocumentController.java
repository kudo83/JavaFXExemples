/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandlers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Aissam
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXButton button;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleMouseExited(MouseEvent event) {
        button.buttonTypeProperty().setValue(JFXButton.ButtonType.FLAT);
    }

    @FXML
    private void handleMouseEntered(MouseEvent event) {
        button.buttonTypeProperty().setValue(JFXButton.ButtonType.RAISED);
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
}
