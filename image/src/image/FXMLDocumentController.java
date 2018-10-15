/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

/**
 *
 * @author Aissam
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView imageView;
    @FXML
    private AnchorPane root;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onChooseImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extentions = new FileChooser.ExtensionFilter("Select an image", "*.jpg","*.png","*.gif");
        
        fileChooser.getExtensionFilters().add(extentions);
        
        File file = fileChooser.showOpenDialog(null);
        
        if (file != null) {
            Image img = new Image(file.toURI().toString());
            imageView.setImage(img);
            imageView.fitWidthProperty().bind(root.widthProperty());
        }
        
    }
    
}
