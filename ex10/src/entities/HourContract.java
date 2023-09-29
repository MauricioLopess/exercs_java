package entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){}
    public HourContract(LocalDate date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public void setDate(LocalDate newDate){
        this.date = newDate;
    }

    public Double getValuePerHour(){
        return this.valuePerHour;
    }

    public void setValuePerHour(Double newValuePerHour){
        this.valuePerHour = newValuePerHour;
    }

    public Integer getHours(){
        return this.hours;
    }

    public void setHours(Integer newHours){
        this.hours = newHours;
    }

    public Double totalValue(){
        return this.valuePerHour * this.hours;
    }

}
