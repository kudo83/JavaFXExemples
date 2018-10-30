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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import practiceproject.Practiceproject;

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
    @FXML
    private Label profileLabel;
    @FXML
    private ContextMenu contextProfile;
    @FXML
    private MenuItem menuProfile;
    @FXML
    private MenuItem menuSignOut;
    @FXML
    private AnchorPane rootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
            openMenuContent("btnDash.fxml");
        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void onMenuAction(ActionEvent event) {

        for (JFXButton btn : Arrays.asList(btnDash, btnSearch, btnTables, btnPanels, btnIcons, btnNotifications, btnSettings)) {
            if (event.getSource() == btn) {
                btn.getStyleClass().removeAll("menu-item");
                btn.getStyleClass().add("menu-item-selected");
                btn.getGraphic().setStyle("-fx-fill: #04AEFF;");

                if (btn == event.getSource()) {
                    try {
                        openMenuContent(btn.getId().toString() + ".fxml");
                    } catch (IOException ex) {
                        Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            } else {
                btn.getStyleClass().removeAll("menu-item-selected");
                btn.getStyleClass().add("menu-item");
                btn.getGraphic().setStyle("-fx-fill: #AAAAAA;");
            }

        }
    }

    private void openMenuContent(String pane) throws IOException {

        try {
            AnchorPane OverviewPane = FXMLLoader.load(getClass().getResource(pane));

            contentPane.getChildren().setAll(OverviewPane);
            contentPane.setMinWidth(OverviewPane.getMinWidth());
            contentPane.setMinHeight(OverviewPane.getMinHeight());

        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onClickProfile(MouseEvent event) {

        contextProfile.show(profileLabel, event.getScreenX(), event.getScreenY());

    }

    @FXML
    private void onProfileSelected(ActionEvent event) throws IOException {
        AnchorPane profilePane = FXMLLoader.load(Practiceproject.class.getResource("profile/Profile.fxml"));
        Scene scene = new Scene(profilePane);

        Stage window = new Stage();
        window.setTitle("Profile");
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void onSignOutSelected(ActionEvent event) {
        System.exit(0);
    }
}
