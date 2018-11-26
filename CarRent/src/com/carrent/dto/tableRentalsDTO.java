/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.dto;

/**
 *
 * @author Aissam
 */
public class tableRentalsDTO {

    private long id;
    private String refColumn;
    private String nameColumn;
    private String totalColumn;
    private String amountColumn;
    private String returnColumn;

    //Contructor to create static example objects

    public tableRentalsDTO(String refColumn, String nameColumn, String totalColumn, String amountColumn, String returnColumn) {
        this.refColumn = refColumn;
        this.nameColumn = nameColumn;
        this.totalColumn = totalColumn;
        this.amountColumn = amountColumn;
        this.returnColumn = returnColumn;
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

    public String getTotalColumn() {
        return totalColumn;
    }

    public void setTotalColumn(String totalColumn) {
        this.totalColumn = totalColumn;
    }

    public String getAmountColumn() {
        return amountColumn;
    }

    public void setAmountColumn(String amountColumn) {
        this.amountColumn = amountColumn;
    }

    public String getReturnColumn() {
        return returnColumn;
    }

    public void setReturnColumn(String returnColumn) {
        this.returnColumn = returnColumn;
    }
    
}
