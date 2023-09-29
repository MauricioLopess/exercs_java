// Fazer um programa para ler os dados de uma conta bancária e depois realizar um
// saque nesta conta bancária, mostrando o novo saldo. 
// Um saque não pode ocorrer
// se não houver saldo na conta, 
// ou se o valor do saque for superior ao limite de saque da conta

import java.util.Locale;
import java.util.Scanner;

import model.exceptions.NotEnoughBalanceException;
import model.entities.Account;
import model.exceptions.AmountExceedsWithdrawLimitException;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            
            Account account = new Account(number, holder, initialBalance, withdrawLimit);
            
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdrawValue = sc.nextDouble();
            account.withdraw(withdrawValue);

            System.out.printf("New balance: %.2f", account.getBalance());

        }catch(NotEnoughBalanceException e){
            System.out.print("Withdraw error: " + e.getMessage());
        }
        catch(AmountExceedsWithdrawLimitException e){
            System.out.print("Withdraw error: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unknown error");
        }


        sc.close();

    }
}
