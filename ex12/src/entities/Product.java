package entities;

public class Product {
    protected String name;
    protected double price;

    public Product(){}
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }
    
    public double getPrice(){
        return this.price;
    }

    public String priceTag(){
        return this.name + " $ " + this.price;
    }
}
