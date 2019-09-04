/*
 * File: SavingsAccount.java
 * Author: David Green DGreen@uab.edu
 * Assignment:  BankInheritanceExample
 * Vers: 1.1.0 09/03/2019 dgg - change to non-default package
 * Vers: 1.0.0 09/04/2018 dgg - initial coding
 */

package edu.uab.dgreen.bankinheritanceexample;

/**
 * Model a Savings Account
 * @author David Green DGreen@uab.edu
 */
public class SavingsAccount extends BankAccount {

    /**
     * Create a savings account with a given name and balance
     * @param name text name for account
     * @param cents opening balance
     */
    public SavingsAccount( String name, int cents ) 
    {
        super( name, cents );
    }
    
    @Override
    public String toString()
    {
        return "Savings: " + name + ", " + balance;
    }
    
    /**
     * Change savings account balance by paying interest at furnished rate for period
     * of time since last call to this method.
     * Rounding goes to the bank (not paid) to account
     * @param rate interest rate for period of time since last call in percent
     */
    public void payInterest( float rate ) 
    {
        int interest = (int)( (float) balance * rate ) / 100;
        balance += interest;
    }
}
