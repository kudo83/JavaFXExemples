/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.controller;

import com.carrent.dto.StatisticsDTO;
import com.carrent.helper.StatisticsHelper;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private Label monthlyIncome;
    @FXML
    private Label startDate;
    @FXML
    private Label endDate;
    @FXML
    private Label weeklyAccounts;
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
    private Label weeklyBilledDaysVariation;
    @FXML
    private Label monthlyIncomeVariation;
    @FXML
    private Label totalIncomeVariation;

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
    @FXML
    private TableView<?> tabltRecentRents;
    @FXML
    private FontAwesomeIconView weeklyBilledDaysGlyph;
    @FXML
    private FontAwesomeIconView monthlyIncomeGlyph;
    @FXML
    private FontAwesomeIconView totalIncomeGlyph;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Statistics
        
        StatisticsDTO statDTO = StatisticsHelper.prepareStatistics();

        monthlyIncome.setText(statDTO.getMonthlyIncome());
        startDate.setText(statDTO.getStartDate());
        endDate.setText(statDTO.getEndDate());
        weeklyAccounts.setText(statDTO.getWeeklyAccounts());
        weeklyRentals.setText(statDTO.getWeeklyRentals());
        weeklyVisits.setText(statDTO.getWeeklyVisits());
        weeklyConversionRate.setText(statDTO.getWeeklyConversionRate());
        weeklyBilledDays.setText(statDTO.getWeeklyBilledDays());
        totalIncome.setText(statDTO.getTotalIncome());
        weeklyBilledDaysVariation.setText(statDTO.getWeeklyBilledDaysVariation());
        weeklyBilledDaysGlyph.setGlyphName(statDTO.getWeeklyBilledDaysGlyphName());
        weeklyBilledDaysGlyph.getStyleClass().removeAll();
        weeklyBilledDaysGlyph.getStyleClass().add(statDTO.getWeeklyBilledDaysGlyphStyle());
        monthlyIncomeGlyph.setGlyphName(statDTO.getMonthlyIncomeGlyphName());
        monthlyIncomeGlyph.getStyleClass().removeAll();
        monthlyIncomeGlyph.getStyleClass().add(statDTO.getMonthlyIncomeGlyphStyle());
        totalIncomeGlyph.setGlyphName(statDTO.getTotalIncomeGlyphName());
        totalIncomeGlyph.getStyleClass().removeAll();
        totalIncomeGlyph.getStyleClass().add(statDTO.getTotalIncomeGlyphStyle());
        monthlyIncomeVariation.setText(statDTO.getMonthlyIncomeVariation());
        totalIncomeVariation.setText(statDTO.getTotalIncomeVariation());
        
        //TableView
        
        ObservableList recentRentList = StatisticsHelper.prepareRecentRentsList();
        refColumn.setCellValueFactory(new PropertyValueFactory<>("refColumn"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nameColumn"));
        totalDaysColumn.setCellValueFactory(new PropertyValueFactory<>("totalDaysColumn"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amountColumn"));
        returnDateColumn.setCellValueFactory(new PropertyValueFactory<>("returnDateColumn"));
        tabltRecentRents.setItems(recentRentList);
        
    }

}
