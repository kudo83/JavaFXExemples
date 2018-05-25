/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableview;

import java.time.LocalDate;

/**
 *
 * @author Aissam
 */
public class Car {
    
    private String brand;
    private String model;
    private LocalDate dateOfCirculation;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDateOfCirculation() {
        return dateOfCirculation;
    }

    public void setDateOfCirculation(LocalDate dateOfCirculation) {
        this.dateOfCirculation = dateOfCirculation;
    }

    public Car(String brand, String model, LocalDate dateOfCirculation) {
        this.brand = brand;
        this.model = model;
        this.dateOfCirculation = dateOfCirculation;
    }
    
    
    
}
