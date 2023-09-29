import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Person> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
        
            System.out.print("Anual income: ");
            int anualIncome = sc.nextInt();

            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();
                list.add(new NaturalPerson(name, anualIncome, healthExpenses));
            }else if(type == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployess = sc.nextInt();
                list.add(new LegalPerson(name, anualIncome, numberOfEmployess));
            }
        }

        System.out.println();
        double totalTaxes = 0;
        System.out.println("TAXES PAID:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s : %.2f",list.get(i).getName(), list.get(i).tax());
            totalTaxes += list.get(i).tax();
        }

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
        sc.close();
    }
}
