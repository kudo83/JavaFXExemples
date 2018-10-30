/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject.dashboard;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import practiceproject.dto.RecentRentsDTO;

/**
 * FXML Controller class
 *
 * @author Aissam
 */
public class DashFirstController implements Initializable {

    @FXML
    private AreaChart<String, Number> areaChart;
    @FXML
    private Label accounts;
    @FXML
    private Label rentals;
    @FXML
    private Label visits;
    @FXML
    private Label conversions;
    @FXML
    private Label billedDays;
    @FXML
    private Label monthIncome;
    @FXML
    private Label totalIncome;
    @FXML
    private PieChart pieChart;
    @FXML
    private TableView<RecentRentsDTO> tableView;
    @FXML
    private TableColumn<RecentRentsDTO, String> refColumn;
    @FXML
    private TableColumn<RecentRentsDTO, String> nameColumn;
    @FXML
    private TableColumn<RecentRentsDTO, Long> totalColumn;
    @FXML
    private TableColumn<RecentRentsDTO, String> amountColumn;
    @FXML
    private TableColumn<RecentRentsDTO, LocalDate> returnColumn;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Access statistics Service to retrive values
        accounts.setText("1352");
        rentals.setText("645");
        visits.setText("1045");
        conversions.setText("79%");
        billedDays.setText("2047");
        monthIncome.setText("$60,548");
        totalIncome.setText("$535,256");

        createAreaChart();
        createPieChart();
        createTable();

    }

    private void createAreaChart() {

        areaChart.getData().clear();

        XYChart.Series<String, Number> seriesApril
                = new XYChart.Series<String, Number>();
        seriesApril.setName("Billed days");
        seriesApril.getData().add(new XYChart.Data("Mon", 4));
        seriesApril.getData().add(new XYChart.Data("Tue", 10));
        seriesApril.getData().add(new XYChart.Data("Wed", 15));
        seriesApril.getData().add(new XYChart.Data("Thu", 8));
        seriesApril.getData().add(new XYChart.Data("Fri", 5));
        seriesApril.getData().add(new XYChart.Data("Sat", 18));
        seriesApril.getData().add(new XYChart.Data("Sun", 15));

        areaChart.getData().addAll(seriesApril);

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

    private void createTable() {

        ObservableList<RecentRentsDTO> recentRents = FXCollections.observableArrayList();
        recentRents.add(new RecentRentsDTO("45895", "Amber", 10, "$300", LocalDate.of(2018, Month.NOVEMBER, 9)));
        recentRents.add(new RecentRentsDTO("45895", "Steve", 3, "$90", LocalDate.of(2018, Month.OCTOBER, 31)));
        recentRents.add(new RecentRentsDTO("45895", "Carl", 2, "$150", LocalDate.of(2018, Month.OCTOBER, 31)));
        recentRents.add(new RecentRentsDTO("45895", "Sarah", 1, "$40", LocalDate.of(2018, Month.OCTOBER, 31)));
        recentRents.add(new RecentRentsDTO("45895", "Rojer", 5, "$250", LocalDate.of(2018, Month.OCTOBER, 30)));
        
        refColumn.setCellValueFactory(new PropertyValueFactory<>("ref"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("totaldays"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        returnColumn.setCellValueFactory(new PropertyValueFactory<>("returnDate"));
        
        tableView.setItems(recentRents);
    }
}
