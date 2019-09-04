/*
 * File: BankingDemo.java
 * Author: David Green DGreen@uab.edu
 * Assignment:  BankInheritanceExample
 * Vers: 1.1.0 01/24/2019 dgg - clean up
 * Vers: 1.0.0 09/04/2018 dgg - initial coding
 */

package edu.uab.dgreen.bankinheritanceexample;

/**
 * Demo program to explore Banking Model
 * @author dgreen
 */
public class BankingDemo {
    
    /**
     * Program starts here
     * @param args unused
     */
    public static void main(String[] args) {
        
        Bank            bank  = new Bank("Birmingham");
        CheckingAccount ca    = new CheckingAccount("Joe Checking", 10000); 
        SavingsAccount  sa    = new SavingsAccount( "Jill Savings", 20000);
        
        bank.addAccount(ca);
        bank.addAccount(sa);
        
        System.out.println( bank.getStatements() );
    }

}
