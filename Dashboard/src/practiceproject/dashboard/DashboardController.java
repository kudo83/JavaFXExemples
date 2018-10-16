/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject.dashboard;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Aissam
 */
public class DashboardController implements Initializable {

    @FXML
    private HBox mDash;
    @FXML
    private HBox mSearch;
    @FXML
    private HBox mTables;
    @FXML
    private HBox mCharts;
    @FXML
    private HBox mPanels;
    @FXML
    private HBox mIcons;
    @FXML
    private HBox mNotif;
    @FXML
    private HBox mSetting;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onMenuClicked(MouseEvent event) {

        for (HBox box : Arrays.asList(mDash, mSearch, mTables, mCharts, mPanels, mIcons, mNotif, mSetting)) {
            box.getStyleClass().removeAll("menu-item-selected");
            if (event.getSource() == box) {
                box.getStyleClass().add("menu-item-selected");
                
            }

        }
    }
}
