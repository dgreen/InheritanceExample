/*
 * File: BankNGTest.java
 * Author: David G. Green DGreen@uab.edu
 * Assignment:  BankInheritanceExample - EE333 Spring 2019
 * Vers: 1.1.0 09/03/2019 dgg - change to non-default package
 * Vers: 1.0.0 01/24/2019 dgg - initial coding
 *
 * Credits:  (if any for sections of code)
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
public class BankNGTest {

    public BankNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getName method, of class Bank.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Bank instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumAccounts method, of class Bank.
     */
    @Test
    public void testGetNumAccounts() {
        System.out.println("getNumAccounts");
        Bank instance = null;
        int expResult = 0;
        int result = instance.getNumAccounts();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatements method, of class Bank.
     */
    @Test
    public void testGetStatements() {
        System.out.println("getStatements");
        Bank instance = null;
        String expResult = "";
        String result = instance.getStatements();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatement method, of class Bank.
     */
    @Test
    public void testGetStatement() {
        System.out.println("getStatement");
        int account = 0;
        Bank instance = null;
        String expResult = "";
        String result = instance.getStatement(account);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccount method, of class Bank.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        BankAccount account = null;
        Bank instance = null;
        instance.addAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payInterest method, of class Bank.
     */
    @Test
    public void testPayInterest() {
        System.out.println("payInterest");
        Bank instance = null;
        instance.payInterest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}