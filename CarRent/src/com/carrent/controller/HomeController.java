/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Aissam
 */
public class HomeController implements Initializable {

    @FXML
    private AnchorPane innerContentPane;
    @FXML
    private Pane monthlyIncome;
    @FXML
    private Label startDate;
    @FXML
    private Label endDate;
    @FXML
    private Label weeklyAccounts;
    @FXML
    private Label rentals;
    @FXML
    private Label weeklyRentals;
    @FXML
    private Label weeklyVisits;
    @FXML
    private Label weeklyConversionRate;
    @FXML
    private Label weeklyBilledDays;
    @FXML
    private Label totalIncome;
    @FXML
    private AreaChart<?, ?> areaChart;
    @FXML
    private PieChart pieChart;
    @FXML
    private TableColumn<?, ?> refColumn;
    @FXML
    private TableColumn<?, ?> nameColumn;
    @FXML
    private TableColumn<?, ?> totalDaysColumn;
    @FXML
    private TableColumn<?, ?> amountColumn;
    @FXML
    private TableColumn<?, ?> returnDateColumn;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
       
    }    
    
    
    
}
