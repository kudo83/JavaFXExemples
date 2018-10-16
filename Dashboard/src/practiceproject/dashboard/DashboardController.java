/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject.dashboard;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
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
                
            }else{
                btn.getStyleClass().removeAll("menu-item-selected");
                btn.getStyleClass().add("menu-item");
            }

        }
    }

}
