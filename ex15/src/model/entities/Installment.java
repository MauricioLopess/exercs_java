package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    public Installment(){}
    public Installment(LocalDate dueDate, Double amount){
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDate(){
        return this.dueDate;
    }
    
    public void setDate(LocalDate newDueDate){
        this.dueDate = newDueDate;
    }

    public Double getAmount(){
        return this.amount;
    }

    public void setAmount(Double newAmount){
        this.amount = newAmount;
    }

    @Override
    public String toString(){
        return this.dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + String.format("%.2f", this.amount);
    }
}
