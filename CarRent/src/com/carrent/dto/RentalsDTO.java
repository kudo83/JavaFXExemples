/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.dto;

import java.time.LocalDate;

/**
 *
 * @author Aissam
 */
public class RentalsDTO {

    private long id;
    private String ref;
    private String name;
    private int totalDays;
    private String amount;
    private LocalDate returnDate;

    //Contructor to create static example objects
    public RentalsDTO(String ref, String name, int totalDays, String amount, LocalDate returnDate) {
        this.ref = ref;
        this.name = name;
        this.totalDays = totalDays;
        this.amount = amount;
        this.returnDate = returnDate;
    }

    //Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalDay() {
        return totalDays;
    }

    public void setTotalDay(int totalDay) {
        this.totalDays = totalDays;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
    
}
