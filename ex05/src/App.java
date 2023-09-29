import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta;
        
        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine(); // quebra de linha pendente

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        if(option == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            conta = new ContaBancaria(numberAccount, name, initialDeposit);
        }else{
            conta = new ContaBancaria(numberAccount, name);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta.toString());
        System.out.println();


        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(conta.toString());
        System.out.println();


        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        
        if(withdrawValue > conta.getBalance()){
            while(withdrawValue > conta.getBalance()){
                System.out.print("The value is greater then amount, try again: ");
                withdrawValue = sc.nextDouble();
            }
        }

        System.out.println("Great!");
        conta.withdraw(withdrawValue);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.print(conta.toString());
        System.out.println();
        sc.close();
    }
}
