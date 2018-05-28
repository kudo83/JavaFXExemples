/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

/**
 *
 * @author Aissam
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Pane root;
    @FXML
    private MediaView mediaViewer;
    
    
    @FXML
    private void onBrowseVideoFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extentions = new FileChooser.ExtensionFilter("Select a video", "*.mp4");
        
        fileChooser.getExtensionFilters().add(extentions);
        
        File videoFile = fileChooser.showOpenDialog(null);
        
        if (videoFile != null){

            Media media = new Media(videoFile.toURI().toString());

            MediaPlayer mediaPlayer = new MediaPlayer(media);

            mediaViewer.setMediaPlayer(mediaPlayer);
            

            mediaViewer.fitHeightProperty().bind(Bindings.selectDouble(mediaViewer.sceneProperty(), "height"));
            mediaViewer.fitWidthProperty().bind(Bindings.selectDouble(mediaViewer.sceneProperty(), "width"));
     
            mediaPlayer.play();
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
