/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.controller;

import com.carrent.helper.DashboardHelper;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
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
    private JFXButton Home;
    @FXML
    private JFXButton Clients;

    @FXML
    private JFXButton Invoices;
    @FXML
    private JFXButton Planner;
    @FXML
    private JFXButton Reservations;
    @FXML
    private JFXButton Vehicles;
    @FXML
    private ContextMenu profileMenu;
    @FXML
    private Label profileLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DashboardHelper.loadMenuContent("Home", contentPane);

    }

    @FXML
    private void onMenuAction(ActionEvent event) {
        for (JFXButton btn : Arrays.asList(Home, Clients, Vehicles, Reservations, Invoices, Planner)) {
            if (event.getSource() == btn) {
                DashboardHelper.loadMenuContent(btn.getId(), contentPane);
                DashboardHelper.addDecorationToMenuItem(btn);
            } else {
                DashboardHelper.removeDecorationToMenuItem(btn);
            }
        }
    }

    @FXML
    private void onProfileClick(MouseEvent event) {
         profileMenu.show(profileLabel, event.getScreenX(), event.getScreenY());
    }
}
