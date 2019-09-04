/*
 * File: BankAccountNGTest.java
 * Author: David G. Green DGreen@uab.edu
 * Assignment:  BankInheritanceExample - EE333 Spring 2019
 * Vers: 1.1.0 09/03/2019 dgg - change to non-default package
 * Vers: 1.0.0 01/24/2019 dgg - initial coding
 */

package edu.uab.dgreen.bankinheritanceexample;

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author David G. Green DGreen@uab.edu
 */
public class BankAccountNGTest {

    private BankAccount ba;
    
    public BankAccountNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        ba = new BankAccount("Joe", 10000);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        assertEquals(ba.getBalance(), 10000);
    }


}