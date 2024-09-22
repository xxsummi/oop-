/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mybank;

/**
 *
 * @author User
 */
public class MyBank {

    private static Account MyAcc;
    private static Account AnotherAcc;
    
    public static void main (String[] args){
        MyAcc = new Account("Jeskha Samantha Derama", 21101228);
        MyAcc.setAvailableBalance(0);
        MyAcc.setCurrentBalance(0);
        
        AnotherAcc = new Account("Arnold Najera", 18020774);
        AnotherAcc.setAvailableBalance(0);
        AnotherAcc.setCurrentBalance(0);
        
        System.out.println(MyAcc);
        System.out.println(AnotherAcc);
        
        System.out.println("Check Balance: " + MyAcc.checkBalance());
        MyAcc.deposit(246000);
        MyAcc.withdraw(2000.64);
        MyAcc.withdraw(2000);
        MyAcc.verify();
        MyAcc.withdraw(2000);
        MyAcc.verify();
        
        MyAcc.transfer(AnotherAcc, 2024.60);
        System.out.println("Check Balance: " + MyAcc.checkBalance());
        System.out.println("Check Balance: " + AnotherAcc.checkBalance());
        
        MyAcc.transfer(AnotherAcc, 2400);
        System.out.println("Check Balance: " + MyAcc.checkBalance());
        System.out.println("Check Balance: " + AnotherAcc.checkBalance());
    }
}
