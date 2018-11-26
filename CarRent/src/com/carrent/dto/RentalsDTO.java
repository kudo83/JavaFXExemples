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
    private String refColumn;
    private String nameColumn;
    private int totalDaysColumn;
    private String amountColumn;
    private LocalDate returnDateColumn;

    //Contructor to create static example objects

    public RentalsDTO(String refColumn, String nameColumn, int totalDaysColumn, String amountColumn, LocalDate returnDateColumn) {
        this.refColumn = refColumn;
        this.nameColumn = nameColumn;
        this.totalDaysColumn = totalDaysColumn;
        this.amountColumn = amountColumn;
        this.returnDateColumn = returnDateColumn;
    }


  
    
    //Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRefColumn() {
        return refColumn;
    }

    public void setRefColumn(String refColumn) {
        this.refColumn = refColumn;
    }

    public String getNameColumn() {
        return nameColumn;
    }

    public void setNameColumn(String nameColumn) {
        this.nameColumn = nameColumn;
    }

    public int getTotalDaysColumn() {
        return totalDaysColumn;
    }

    public void setTotalDaysColumn(int totalDaysColumn) {
        this.totalDaysColumn = totalDaysColumn;
    }

 

    public String getAmountColumn() {
        return amountColumn;
    }

    public void setAmountColumn(String amountColumn) {
        this.amountColumn = amountColumn;
    }

    public LocalDate getReturnColumn() {
        return returnDateColumn;
    }

    public void setReturnColumn(String returnColumn) {
        this.returnDateColumn = returnDateColumn;
    }
    
}
