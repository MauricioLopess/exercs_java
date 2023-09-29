package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    private List<Installment> installment = new ArrayList<>();

    public Contract(){}
    public Contract(Integer number, LocalDate date, Double totalValue){
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber(){
        return this.number;
    }

    public void setNumber(Integer newNumber){
        this.number = newNumber;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public void setDate(LocalDate newDate){
        this.date = newDate;
    }

    public Double getTotalValue(){
        return this.totalValue;
    }

    public void setTotalValue(Double newTotalValue){
        this.totalValue = newTotalValue;
    }

    public List<Installment> getInstallments(){
        return this.installment;
    }

}
