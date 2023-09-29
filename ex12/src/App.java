import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Product #" + (i+1) + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String productName = sc.nextLine();

            System.out.print("Price: ");
            double productPrice = sc.nextDouble();

            if(type == 'i'){
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                products.add(new ImportedProduct(productName, productPrice, fee));
            }else if(type == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateString = sc.next();
                LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(productName, productPrice, date));
            }else if(type == 'c'){
                products.add(new Product(productName, productPrice));
            }            
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
