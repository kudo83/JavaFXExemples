/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charts;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

/**
 *
 * @author Aissam
 */
public class ChartsController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private BarChart<?, ?> barChart;
    @FXML
    private LineChart<?, ?> lineChart;
    @FXML
    private AreaChart<Number, Number> areaChart;
    
    @FXML
    private NumberAxis yAxisBar;
    @FXML
    private CategoryAxis xAxisBar;
    @FXML
    private NumberAxis xAxisBarLine;
    @FXML
    private CategoryAxis xAxisLine;
    @FXML
    private NumberAxis yAxisArea;
    @FXML
    private NumberAxis xAxisArea;
   
    
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pieChart.setVisible(false);
        barChart.setVisible(false);
        lineChart.setVisible(false);
        areaChart.setVisible(false);
                
    }   
    
    @FXML
    private void onCreatePieChart(ActionEvent event) {
        
        
        pieChart.setVisible(true);
        barChart.setVisible(false);
        lineChart.setVisible(false);
        areaChart.setVisible(false);
        
        
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Cars", 13),
                new PieChart.Data("Motorbikes", 25),
                new PieChart.Data("Vans", 10),
                new PieChart.Data("Buses", 22));
       
       pieChart.setData(pieChartData);
  
    }

    @FXML
    private void onCreateBarChart(ActionEvent event) {
        
        barChart.getData().clear();
        
        pieChart.setVisible(false);
        barChart.setVisible(true);
        lineChart.setVisible(false);
        areaChart.setVisible(false);
        
        
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Mathematics");       
        series1.getData().add(new XYChart.Data("2014", 5));
        series1.getData().add(new XYChart.Data("2015",15));
        series1.getData().add(new XYChart.Data("2016", 10));
        series1.getData().add(new XYChart.Data("2017", 20));
        
        XYChart.Series series2 = new XYChart.Series();
        
        series2.setName("Science");       
        series2.getData().add(new XYChart.Data("2014", 16));
        series2.getData().add(new XYChart.Data("2015",15));
        series2.getData().add(new XYChart.Data("2016", 14));
        series2.getData().add(new XYChart.Data("2017", 20));
        
         XYChart.Series series3 = new XYChart.Series();
        
        series3.setName("English");       
        series3.getData().add(new XYChart.Data("2014", 12));
        series3.getData().add(new XYChart.Data("2015",15));
        series3.getData().add(new XYChart.Data("2016", 22));
        series3.getData().add(new XYChart.Data("2017", 20));
        
        // hack around the dynamic label creation bug
        xAxisBar.setCategories(FXCollections.observableArrayList("2014", "2015", "2016","2017"));
        
        barChart.getData().addAll(series1,series2,series3);
        
        
         
    }

    @FXML
    private void onCreateLineChart(ActionEvent event) {
        
        pieChart.setVisible(false);
        barChart.setVisible(false);
        lineChart.setVisible(true);
        areaChart.setVisible(false);
        
        
        lineChart.getData().clear();
        
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Paul");
        
        series1.getData().add(new XYChart.Data("Jan", 23000));
        series1.getData().add(new XYChart.Data("Feb", 14000));
        series1.getData().add(new XYChart.Data("Mar", 15000));
        series1.getData().add(new XYChart.Data("Apr", 24000));
        series1.getData().add(new XYChart.Data("May", 34000));
        series1.getData().add(new XYChart.Data("Jun", 36000));
        series1.getData().add(new XYChart.Data("Jul", 22000));
        series1.getData().add(new XYChart.Data("Aug", 45000));
        series1.getData().add(new XYChart.Data("Sep", 43000));
        series1.getData().add(new XYChart.Data("Oct", 17000));
        series1.getData().add(new XYChart.Data("Nov", 29000));
        series1.getData().add(new XYChart.Data("Dec", 25000));
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Sara");
        
        series2.getData().add(new XYChart.Data("Jan", 10000));
        series2.getData().add(new XYChart.Data("Feb", 11000));
        series2.getData().add(new XYChart.Data("Mar", 9000));
        series2.getData().add(new XYChart.Data("Apr", 10000));
        series2.getData().add(new XYChart.Data("May", 40000));
        series2.getData().add(new XYChart.Data("Jun", 74000));
        series2.getData().add(new XYChart.Data("Jul", 50000));
        series2.getData().add(new XYChart.Data("Aug", 30000));
        series2.getData().add(new XYChart.Data("Sep", 43000));
        series2.getData().add(new XYChart.Data("Oct", 70000));
        series2.getData().add(new XYChart.Data("Nov", 79000));
        series2.getData().add(new XYChart.Data("Dec", 55000));
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Adam");
        
        series3.getData().add(new XYChart.Data("Jan", 15000));
        series3.getData().add(new XYChart.Data("Feb", 12000));
        series3.getData().add(new XYChart.Data("Mar", 33000));
        series3.getData().add(new XYChart.Data("Apr", 20000));
        series3.getData().add(new XYChart.Data("May", 15000));
        series3.getData().add(new XYChart.Data("Jun", 26000));
        series3.getData().add(new XYChart.Data("Jul", 40000));
        series3.getData().add(new XYChart.Data("Aug", 37000));
        series3.getData().add(new XYChart.Data("Sep", 28000));
        series3.getData().add(new XYChart.Data("Oct", 50000));
        series3.getData().add(new XYChart.Data("Nov", 23000));
        series3.getData().add(new XYChart.Data("Dec", 32000));
        
        lineChart.getData().addAll(series1,series2,series3);
        
        
        // hack around the dynamic label creation bug
        xAxisLine.setCategories(FXCollections.observableArrayList("Jan", "Feb", "Mar","Apr","May", "Jun", "Jul","Aug","Sep", "Oct", "Nov","Dec"));
        
       
        
        
    }

    @FXML
    private void onCreateAreaChart(ActionEvent event) {
        
        pieChart.setVisible(false);
        barChart.setVisible(false);
        lineChart.setVisible(false);
        areaChart.setVisible(true);
        
        areaChart.getData().clear();
        
        
        XYChart.Series<Number, Number> seriesApril =
                new XYChart.Series<Number, Number>();
        seriesApril.setName("April");
        seriesApril.getData().add(new XYChart.Data(1, 4));
        seriesApril.getData().add(new XYChart.Data(3, 10));
        seriesApril.getData().add(new XYChart.Data(6, 15));
        seriesApril.getData().add(new XYChart.Data(9, 8));
        seriesApril.getData().add(new XYChart.Data(12, 5));
        seriesApril.getData().add(new XYChart.Data(15, 18));
        seriesApril.getData().add(new XYChart.Data(18, 15));
        seriesApril.getData().add(new XYChart.Data(21, 13));
        seriesApril.getData().add(new XYChart.Data(24, 19));
        seriesApril.getData().add(new XYChart.Data(27, 21));
        seriesApril.getData().add(new XYChart.Data(30, 21));
        XYChart.Series<Number, Number> seriesMay =
                new XYChart.Series<Number, Number>();
        seriesMay.setName("May");
        seriesMay.getData().add(new XYChart.Data(1, 20));
        seriesMay.getData().add(new XYChart.Data(3, 15));
        seriesMay.getData().add(new XYChart.Data(6, 13));
        seriesMay.getData().add(new XYChart.Data(9, 12));
        seriesMay.getData().add(new XYChart.Data(12, 14));
        seriesMay.getData().add(new XYChart.Data(15, 18));
        seriesMay.getData().add(new XYChart.Data(18, 25));
        seriesMay.getData().add(new XYChart.Data(21, 25));
        seriesMay.getData().add(new XYChart.Data(24, 23));
        seriesMay.getData().add(new XYChart.Data(27, 26));
        seriesMay.getData().add(new XYChart.Data(31, 26));
        

        areaChart.getData().addAll(seriesApril,seriesMay);
        
        
    }
    
}
