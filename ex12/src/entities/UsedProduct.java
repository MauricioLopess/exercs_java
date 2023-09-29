package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public UsedProduct(){}
    public UsedProduct(String name, double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate(){
        return this.manufactureDate;
    }

    @Override
    public String priceTag(){

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(this.name + " (used) ");
        strBuilder.append(this.price + " ");
        strBuilder.append("(Manufacture date: " + this.manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")");

        return strBuilder.toString();
    }

}
