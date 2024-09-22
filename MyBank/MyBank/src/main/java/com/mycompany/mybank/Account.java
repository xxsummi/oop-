/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mybank;

/**
 *
 * @author User
 */
public class Account {
    private double currentBalance;
    private double availableBalance;
    private final String accountName;
    private final int accountNumber;

    public Account(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
    
    
    public boolean deposit(double amount){
        if(amount>0 && amount % 100 == 0){
            currentBalance+=amount;
            System.out.println("\nDeposit is successful. Updated Balance is " + currentBalance);
            return true;
        } else{
            System.out.println("\nBalance to be deposited is not enough.");
            return false;
        }
        
    }
    
    public boolean withdraw(double amount){
        if(amount<=availableBalance-10 && amount % 100 == 0){
            currentBalance-=amount+10;
            availableBalance-=amount+10;
            System.out.println("\nWithdrawal Successful. Updated Balance is " + currentBalance);
            return true;
        } else{
            System.out.println("\nWithdrawal Unsuccessful. Check your balance and make sure to deposit only multiples of 100.");
            return false;
        }
    }
    
    public void verify(){
        availableBalance=currentBalance;
    }
    
    public double checkBalance(){
        return currentBalance;
    }
    
    public boolean transfer(Account another, double amount){
        if(another.accountName != null && amount <= availableBalance-10 && amount % 100 == 0){
            currentBalance-=amount+10;
            availableBalance-=amount+10;
            another.currentBalance+=amount;
            System.out.println("\nTransfer is Successful. Updated Balance is " + currentBalance);
            return true;
        }else{
            System.out.println("\nTransfer is Unsuccessful.");
            return false;
        }
    }
    
    public void display(){
        System.out.println("\nAccount ID: " + accountNumber + "\nAccount Name: " + accountName + "\nCurrent Balance: " + currentBalance + "\nAvailable Balance: " + availableBalance);
    }
    
    @Override
    public String toString(){
        return "\nAccount ID: " + accountNumber + "\nAccount Name: " + accountName + "\nCurrent Balance: " + currentBalance + "\nAvailable Balance: " + availableBalance;
    }
}
