/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableview;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 *
 * @author Aissam
 */
public class TableViewController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<Car> carTableView;
    @FXML
    private TableColumn<Car, String> brandColumn;
    @FXML
    private TableColumn<Car, String> modelColumn;
    @FXML
    private TableColumn<Car, LocalDate> dateColumn;
    @FXML
    private Button deleteButton;
    @FXML
    private TextField brand;
    @FXML
    private TextField model;
    @FXML
    private DatePicker dateOfCirculation;
    @FXML
    private Button addCarButton;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<Car> cars = FXCollections.observableArrayList();
        
        cars.add(new Car("BMW","X1",LocalDate.of(2017, 8, 25)));
        cars.add(new Car("VW","ARTEON",LocalDate.of(2018, 4, 12)));
        cars.add(new Car("MERCESED","CLA",LocalDate.of(2015, 1, 22)));
        cars.add(new Car("AUDI","Q7",LocalDate.of(2013, 12, 2)));
        
        brandColumn.setCellValueFactory(new PropertyValueFactory<> ("brand"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<> ("model"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<> ("dateOfCirculation"));
        
        brandColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        modelColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        
        carTableView.setItems(cars);
        
        carTableView.setEditable(true);
        
        carTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
    }    

    
    @FXML
    private void onEditBrandCell(TableColumn.CellEditEvent<Car, String> event) {
        Car carSelected = carTableView.getSelectionModel().getSelectedItem();
        
        carSelected.setBrand(event.getNewValue());
        
    }

    @FXML
    private void onEditModelCell(TableColumn.CellEditEvent<Car, String> event) {
        
        Car carSelected = carTableView.getSelectionModel().getSelectedItem();
        
        carSelected.setModel(event.getNewValue());
    }
    
    @FXML
    private void onDeleteRow(ActionEvent event){
        
        ObservableList<Car> cars = carTableView.getItems();
        
        ObservableList<Car> carsSelected = carTableView.getSelectionModel().getSelectedItems();
        
        cars.removeAll(carsSelected);
    }

   

    @FXML
    private void onAddCar(ActionEvent event) {
        
        Car newCar = new Car(brand.getText(),model.getText(),dateOfCirculation.getValue());
           
        carTableView.getItems().add(newCar);
    }
}
