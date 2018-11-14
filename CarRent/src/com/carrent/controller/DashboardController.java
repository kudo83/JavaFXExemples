/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.controller;

import com.carrent.Main;
import com.carrent.helper.DashBoardHelper;
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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Aissam
 */
public class DashboardController implements Initializable {

    @FXML
    private AnchorPane contentPane;
    @FXML
    private JFXButton btnHome;
    @FXML
    private JFXButton btnCients;
    @FXML
    private JFXButton btnVehicules;
    @FXML
    private JFXButton btnReservation;
    @FXML
    private JFXButton btnInvoices;
    @FXML
    private JFXButton btnPlanner;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DashBoardHelper.loadMenuContent("Home", contentPane);
//        try {
//            AnchorPane content = FXMLLoader.load(Main.class.getResource("fxml/Home.fxml"));
//            contentPane.getChildren().setAll(content);
//
//        } catch (IOException ex) {
//            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

    @FXML
    private void onMenuAction(ActionEvent event) {
       for (JFXButton btn : Arrays.asList(btnHome,btnCients,btnVehicules,btnReservation,btnInvoices,btnPlanner)) {
           if(event.getSource() == btn){
               
           }
       }
    }

    private void openMenuContent(/*String pane*/) throws IOException {

        try {
            AnchorPane content = FXMLLoader.load(Main.class.getResource("fxml/Home.fxml"));

            contentPane.getChildren().setAll(content);
            contentPane.setMinWidth(content.getMinWidth());
            contentPane.setMinHeight(content.getMinHeight());

        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
