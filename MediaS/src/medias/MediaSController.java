/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medias;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

/**
 *
 * @author Aissam
 */
public class MediaSController implements Initializable {

    @FXML
    private MediaView mediaViewer;
    
    private MediaPlayer mediaPlayer;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onChooseMedia(ActionEvent event) {
        
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extentions = new FileChooser.ExtensionFilter ("Medias","*.mp3","*.wave","*.mp4","*.flv");
        fileChooser.getExtensionFilters().add(extentions);
        
        File mediaFile = fileChooser.showOpenDialog(null);
        
        if (mediaFile != null){
            Media media = new Media(mediaFile.toURI().toString());
            mediaPlayer = new MediaPlayer(media);         
            mediaPlayer.setAutoPlay(true);    
            mediaViewer.setMediaPlayer(mediaPlayer);
            
        }
    }

    @FXML
    private void onPlay(ActionEvent event) {
        if (mediaPlayer != null){
            mediaPlayer.play();
        }
    }

    @FXML
    private void onPause(ActionEvent event) {
        if (mediaPlayer != null){
            mediaPlayer.pause();
        }
    }

    @FXML
    private void onStop(ActionEvent event) {
        if (mediaPlayer != null){
            mediaPlayer.stop();
        }
    }
    
}
