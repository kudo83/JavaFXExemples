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

/**
 * FXML Controller class
 *
 * @author Aissam
 */
public class DashFirstController implements Initializable {

    @FXML
    private AreaChart<String, Number> areaChart;

 
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
                 
                
    }

    private void onCreateAreaChart() {
        
        areaChart.getData().clear();
        
        
        XYChart.Series<String, Number> seriesApril =
                new XYChart.Series<String, Number>();
        seriesApril.setName("April");
        seriesApril.getData().add(new XYChart.Data("Mon", 4));
        seriesApril.getData().add(new XYChart.Data("Tue", 10));
        seriesApril.getData().add(new XYChart.Data("Wed", 15));
        seriesApril.getData().add(new XYChart.Data("Thu", 8));
        seriesApril.getData().add(new XYChart.Data("Fri", 5));
        seriesApril.getData().add(new XYChart.Data("Sat", 18));
        seriesApril.getData().add(new XYChart.Data("Sun", 15));
        
        XYChart.Series<String, Number> seriesMay =
                new XYChart.Series<String, Number>();
        seriesMay.setName("May");
        seriesApril.setName("April");
        seriesApril.getData().add(new XYChart.Data("Mon", 12));
        seriesApril.getData().add(new XYChart.Data("Tue", 10));
        seriesApril.getData().add(new XYChart.Data("Wed", 47));
        seriesApril.getData().add(new XYChart.Data("Thu", 26));
        seriesApril.getData().add(new XYChart.Data("Fri", 17));
        seriesApril.getData().add(new XYChart.Data("Sat", 18));
        seriesApril.getData().add(new XYChart.Data("Sun", 19));
        

        areaChart.getData().addAll(seriesApril,seriesMay);
        
        
    }
}
