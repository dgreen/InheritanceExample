/*
 * File: BankAccount.java
 * Author: David Green DGreen@uab.edu
 * Assignment:  BankInheritanceExample
 * Vers: 1.2.0 09/03/2019 dgg - change to non-default package
 * Vers: 1.1.0 01/24/2019 dgg - clean up
 * Vers: 1.0.0 09/04/2018 dgg - initial coding
*/

package edu.uab.dgreen.bankinheritanceexample;

/**
 * Generic BankAccount
 * @author David Green DGreen@uab.edu
 */
public class BankAccount {

    // instance variables

    /**
     * Balance of account in cents
     */
    protected int balance;
    
    /**
     * Name of Account (as text)
     */
    protected String name;

    /**
     * Constructor for objects of class BankAccount
     */
    private BankAccount()
    {
        // Don't Allow
    }
    
    /**
     * Constructor with name, initial balance
     * 
     * @param  aname     name of account
     * @param  abalance  initial amount in cents
     */
    public BankAccount(String aname, int abalance)
    {  
        name = aname;
        balance = abalance;
    }
    
    /**
     * getBalance
     * 
     * @return present balance in cents
     */
    public int getBalance()
    {
        return balance;
    }   
    
    /**
     * deposit money into account
     * 
     * @param cents   amount to add to present balance
     */
    public void deposit( int cents ) 
    {
        balance += cents;
    }
    
    /**
     * withdraw   remove money from account
     * 
     * @param cents   amount to remove from account (if possible)
     * @return boolean  true if withdrawal is successful
     */
    public boolean withdraw( int cents )
    {
        if ( balance >= cents ) 
        {
            balance -= cents;
            return true;
        }
        else
            return false;
    }
     
    /**
     * toString return information about account
     * 
     * @return string with type, name of account and balance
     */  
    @Override
    public String toString()
    {
        return "Banking: " + name + ", " + balance ;
    }
    
    /**
     * getClassAuthor return name of author
     *
     * @return string containing name of author
     */
    public static String getClassAuthor()
    {
        return "David G. Green";
    }
}
