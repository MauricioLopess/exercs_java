package model.entities;

import model.exceptions.AmountExceedsWithdrawLimitException;
import model.exceptions.NotEnoughBalanceException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    
    public Account(){}
    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;       
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber(){
        return this.number;
    }

    public void setNumber(Integer newNumber){
        this.number = newNumber;
    }

    public String getHolder(){
        return this.holder;
    }

    public void setHolder(String newName){
        this.holder = newName;
    }

    public Double getBalance(){
        return this.balance;
    }

    public Double getWithdrawLimit(){
        return this.withdrawLimit;
    }

    public void setWithdrawLimit(Double newWithdrawLimit){
        this.withdrawLimit = newWithdrawLimit;
    }

    public void deposit(Double value){
        this.balance += value;
    }

    public void withdraw(Double value) throws AmountExceedsWithdrawLimitException, NotEnoughBalanceException {
        // se o valor do saque for superior ao limite de saque da conta
        if(value > this.withdrawLimit){
            throw new AmountExceedsWithdrawLimitException("The amount exceeds withdraw limit");
        }
        
        // se não houver saldo na conta, 
        if(value > this.balance){
            throw new NotEnoughBalanceException("Not enough balance");
        }
        this.balance -= value;
    }


}
