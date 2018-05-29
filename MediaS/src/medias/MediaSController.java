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
    private MediaView audioPlayer;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onChooseAudio(ActionEvent event) {
        
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extentions = new FileChooser.ExtensionFilter ("Videos","*.mp3","*.wave");
        fileChooser.getExtensionFilters().add(extentions);
        
        File mediaFile = fileChooser.showOpenDialog(null);
        if (mediaFile != null){
            Media media = new Media(mediaFile.toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            
            audioPlayer.setMediaPlayer(mediaPlayer);
            
            
            mediaPlayer.setAutoPlay(true);
            
            
        }
    }
    
}
