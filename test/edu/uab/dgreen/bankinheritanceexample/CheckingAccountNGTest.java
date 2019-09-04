/*
 * File: CheckingAccountNGTest.java
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
public class CheckingAccountNGTest {

    public CheckingAccountNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of toString method, of class CheckingAccount.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CheckingAccount instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearCheck method, of class CheckingAccount.
     */
    @Test
    public void testClearCheck() {
        System.out.println("clearCheck");
        int cents = 0;
        CheckingAccount instance = null;
        boolean expResult = false;
        boolean result = instance.clearCheck(cents);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}