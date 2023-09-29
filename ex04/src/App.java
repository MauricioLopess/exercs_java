/*
    Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
    uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
    que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
    para ser responsável pelos cálculos.  
*/

import java.util.Locale;
import java.util.Scanner;

import utilities.CurrencyConverter;

public class App {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ler cotação do dolar
        System.out.print("What is the dollar price?");
        double dollarPrice = sc.nextDouble();

        // valor em dolares a ser comprado
        System.out.print("How many dollars will be bought?");
        double dollarBought = sc.nextDouble();

        // valor pago + IOF de 6%
        double total = CurrencyConverter.dollarConverter(dollarPrice, dollarBought);
        System.out.printf("Amount to be paid in reais = %.2f", total);

        sc.close();
        
    }
}
