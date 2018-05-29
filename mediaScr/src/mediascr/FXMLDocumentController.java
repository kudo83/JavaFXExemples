/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediascr;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 *
 * @author Aissam
 */
public class FXMLDocumentController implements Initializable {
    
    private String videoPath;
    @FXML
    private MediaView mediaViewer;
    @FXML
    private Button browseButton;
    @FXML
    private AnchorPane root;
    
    @FXML
    private void onBrowseVideoFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        ExtensionFilter extentions = new ExtensionFilter("Select a video", "*.mp4");
        
        fileChooser.getExtensionFilters().add(extentions);
        
        File videoFile = fileChooser.showOpenDialog(null);
        
        if (videoFile != null){
            videoPath = videoFile.toURI().toString();

            Media media = new Media(videoPath);

            MediaPlayer mediaPlayer = new MediaPlayer(media);

            mediaViewer.setMediaPlayer(mediaPlayer);
            

//            mediaViewer.fitHeightProperty().bind(Bindings.selectDouble(mediaViewer.sceneProperty(), "height"));
//            mediaViewer.fitWidthProperty().bind(Bindings.selectDouble(mediaViewer.sceneProperty(), "width"));
            
            
            
           

            mediaPlayer.play();
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        mediaViewer.fitWidthProperty().addListener(
//                (observable, oldvalue,newvalue) -> {
//                  root.setMinWidth((Double)newvalue+100);
//                  root.setMaxWidth((Double)newvalue+100);
//                  root.setPrefWidth((Double)newvalue+100);
//        });
    }    
    
}
