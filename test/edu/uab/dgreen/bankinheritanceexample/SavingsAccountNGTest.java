/*
 * File: SavingsAccountNGTest.java
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
public class SavingsAccountNGTest {

    public SavingsAccountNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of toString method, of class SavingsAccount.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SavingsAccount instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payInterest method, of class SavingsAccount.
     */
    @Test
    public void testPayInterest() {
        System.out.println("payInterest");
        float rate = 0.0F;
        SavingsAccount instance = null;
        instance.payInterest(rate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}