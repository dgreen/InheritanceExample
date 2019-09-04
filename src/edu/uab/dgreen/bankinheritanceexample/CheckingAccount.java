/*
 * File: CheckingAccount.java
 * Author: David Green DGreen@uab.edu
 * Assignment:  BankInheritanceExample
 * Vers: 1.1.0 09/03/2019 dgg - change to non-default package
 * Vers: 1.0.0 09/04/2018 dgg - initial coding
 */

package edu.uab.dgreen.bankinheritanceexample;

/**
 * Simple checking account
 * @author David Green DGreen@uab.edu
 */
public class CheckingAccount extends BankAccount {
    /**
     * constructor to build checking account
     * 
     * @param   name   name of account
     * @param   cents  initial balance
     */
    public CheckingAccount( String name, int cents )
    {
        super( name, cents );
    }

    /**
     * toString - convert information to string representation
     * 
     * @return String information about account
     */
    @Override
    public String toString()
    {
        return "Checking: " + name + ", " + balance;
    }
    
    /**
     * clearCheck process a check with overdraft penalty
     * 
     * @param cents - amount of check
     * @return boolean - true if check clears
     */
    public boolean clearCheck( int cents )
    {
        if ( withdraw( cents ) )
            return true;
        // overdraw penalty
        balance -= 1500;
        return false;
    }
}
