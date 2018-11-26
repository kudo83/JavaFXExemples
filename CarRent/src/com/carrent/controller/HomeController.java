/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.controller;

import com.carrent.dto.RentalsDTO;
import com.carrent.dto.StatisticsDTO;
import com.carrent.helper.StatisticsHelper;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.time.LocalDate;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

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
    private AreaChart<String, Number> areaChart;
    @FXML
    private PieChart pieChart;
    @FXML
    private TableColumn<RentalsDTO, String> refColumn;
    @FXML
    private TableColumn<RentalsDTO, String> nameColumn;
    @FXML
    private TableColumn<RentalsDTO, Integer> totalDaysColumn;
    @FXML
    private TableColumn<RentalsDTO, String> amountColumn;
    @FXML
    private TableColumn<RentalsDTO, LocalDate> returnDateColumn;
    @FXML
    private TableView<RentalsDTO> tabltRecentRents;
    @FXML
    private FontAwesomeIconView weeklyBilledDaysGlyph;
    @FXML
    private FontAwesomeIconView monthlyIncomeGlyph;
    @FXML
    private FontAwesomeIconView totalIncomeGlyph;
//    @FXML
//    private NumberAxis numberOfRents;
//    @FXML
//    private CategoryAxis daysOfWeek;
    @FXML
    private NumberAxis numberOfRents;
    @FXML
    private CategoryAxis daysOfWeek;
    

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
        refColumn.setCellValueFactory(new PropertyValueFactory<>("ref"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        totalDaysColumn.setCellValueFactory(new PropertyValueFactory<>("totalDaysColumn"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        returnDateColumn.setCellValueFactory(new PropertyValueFactory<>("returnDate"));
        tabltRecentRents.setItems(recentRentList);
        
        
        //Area Chart
        areaChart.getData().clear();
        
        Map<String,Integer> map = StatisticsHelper.prepareRentsOfTheWeek();

        XYChart.Series<String, Number> series;
        series = new XYChart.Series<>();
        series.setName("Billed days");
        series.getData().add(new XYChart.Data("Mon", map.get("Mon")));
        series.getData().add(new XYChart.Data("Tue", map.get("Tue")));
        series.getData().add(new XYChart.Data("Wed", map.get("Wed")));
        series.getData().add(new XYChart.Data("Thu", map.get("Thu")));
        series.getData().add(new XYChart.Data("Fri", map.get("Fri")));
        series.getData().add(new XYChart.Data("Sat", map.get("Sat")));
        series.getData().add(new XYChart.Data("Sun", map.get("Sun")));

        areaChart.getData().addAll(series);
        
    }
    
    private void createAreaChart() {

        areaChart.getData().clear();
        
        Map<String,Integer> map = StatisticsHelper.prepareRentsOfTheWeek();

        XYChart.Series<String, Number> series;
        series = new XYChart.Series<>();
        series.setName("Billed days");
        series.getData().add(new XYChart.Data("Mon", map.get("Mon")));
        series.getData().add(new XYChart.Data("Tue", map.get("Tue")));
        series.getData().add(new XYChart.Data("Wed", map.get("Wed")));
        series.getData().add(new XYChart.Data("Thu", map.get("Thu")));
        series.getData().add(new XYChart.Data("Fri", map.get("Fri")));
        series.getData().add(new XYChart.Data("Sat", map.get("Sat")));
        series.getData().add(new XYChart.Data("Sun", map.get("Sun")));

        areaChart.getData().addAll(series);

    }

    private void createPieChart() {

        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
                        new PieChart.Data("Cars", 13),
                        new PieChart.Data("Motorbikes", 25),
                        new PieChart.Data("Vans", 10),
                        new PieChart.Data("Buses", 22));

        pieChart.setData(pieChartData);

    }


}
