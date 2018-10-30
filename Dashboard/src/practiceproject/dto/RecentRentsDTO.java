/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject.dto;

import java.time.LocalDate;

/**
 *
 * @author Aissam
 */
public class RecentRentsDTO {
    
    private String ref;
    private String Name;
    private Long totaldays;
    private String amount;
    private LocalDate returnDate;

    public RecentRentsDTO(String ref, String Name, long totaldays, String amount, LocalDate returnDate) {
        this.ref = ref;
        this.Name = Name;
        this.totaldays = totaldays;
        this.amount = amount;
        this.returnDate = returnDate;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public long getTotaldays() {
        return totaldays;
    }

    public void setTotaldays(long totaldays) {
        this.totaldays = totaldays;
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
