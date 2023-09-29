package utilities;

public class CurrencyConverter{
    public static double dollarConverter(double dollarPrice, double dollarBought){
        double total = dollarPrice * dollarBought;
        return total * (1 + 0.06);
    }
}
