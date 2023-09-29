package entities;

public class ContaBancaria{
    private String name;
    private double balance;
    private int accountNumber;

    public ContaBancaria(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public ContaBancaria(int accountNumber, String name, double initialDeposit){
        this.accountNumber = accountNumber;
        this.name = name;
        this.deposit(initialDeposit);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    } 

    public void withdraw(double value){
        this.balance -= value + 5.00;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public String toString(){
        return "Account " + this.accountNumber + ", Holder: " + this.getName() + ", Balance: $ " + this.getBalance();
    }
}
