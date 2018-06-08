/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animatedballscript;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author Aissam
 */
public class AnimatedBallController implements Initializable {

    @FXML
    private Circle circle;
    @FXML
    private AnchorPane rootAnchorPane;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TranslateTransition t = new TranslateTransition(Duration.seconds(2), circle);
        
        //The initial position
        t.setFromX(rootAnchorPane.getPrefWidth() / 2);
        t.setFromY(circle.getRadius());
        
        //The final position
    //    t.setToX(rootAnchorPane.getPrefWidth() / 2);
        t.setToY(rootAnchorPane.getPrefHeight() - circle.getRadius());
        t.setAutoReverse(true);
        
        t.setCycleCount(Transition.INDEFINITE);
        
        t.play();
        
        
        
    }    
    
}
