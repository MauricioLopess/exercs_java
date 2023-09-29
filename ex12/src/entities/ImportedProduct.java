package entities;

public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct(){}
    public ImportedProduct(String name, double price, double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return this.price + this.customsFee;
    } 

    @Override
    public String priceTag(){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(this.name);
        strBuilder.append(" $ " + this.totalPrice());
        strBuilder.append(" (Customs fee: " + this.customsFee + ")");

        return strBuilder.toString();
    }

}
