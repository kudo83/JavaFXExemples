/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject.dashboard;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Aissam
 */
public class DashboardController implements Initializable {

 
    @FXML
    private JFXButton btnDash;
    @FXML
    private JFXButton btnSearch;
    @FXML
    private VBox vBox;
    @FXML
    private JFXButton btnTables;
    @FXML
    private JFXButton btnPanels;
    @FXML
    private JFXButton btnIcons;
    @FXML
    private JFXButton btnNotifications;
    @FXML
    private JFXButton btnSettings;
    @FXML
    private AnchorPane contentPane;
    @FXML
    private ScrollPane scrollPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onMenuAction(ActionEvent event) {

        for (JFXButton btn : Arrays.asList(btnDash, btnSearch,btnTables,btnPanels,btnIcons,btnNotifications,btnSettings)) {
            if (event.getSource() == btn) {
                btn.getStyleClass().removeAll("menu-item");
                btn.getStyleClass().add("menu-item-selected");
                
                
                if (btn == btnDash){
                    try {
                        AnchorPane OverviewPane = FXMLLoader.load(getClass().getResource("Overview.fxml"));
                        
                        contentPane.getChildren().setAll(OverviewPane);
                        scrollPane.setMinSize(contentPane.getMaxWidth(), contentPane.getMaxHeight());
                    } catch (IOException ex) {
                        Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }else{
                btn.getStyleClass().removeAll("menu-item-selected");
                btn.getStyleClass().add("menu-item");
            }

        }
    }

}
