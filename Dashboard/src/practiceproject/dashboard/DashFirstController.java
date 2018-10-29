/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject.dashboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

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

       onCreateAreaChart();          
                
    }

    private void onCreateAreaChart() {
        
        areaChart.getData().clear();
        
        
        XYChart.Series<String, Number> seriesApril =
                new XYChart.Series<String, Number>();
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
}
