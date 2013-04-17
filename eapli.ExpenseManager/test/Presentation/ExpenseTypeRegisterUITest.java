/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i110230
 */
public class ExpenseTypeRegisterUITest {
    
    public ExpenseTypeRegisterUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of show method, of class ExpenseTypeRegisterUI.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        ExpenseTypeRegisterUI instance = new ExpenseTypeRegisterUI();
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of controller method, of class ExpenseTypeRegisterUI.
     */
    @Test
    public void testController() {
        System.out.println("controller");
        ExpenseTypeRegisterUI instance = new ExpenseTypeRegisterUI();
        BaseController expResult = null;
        BaseController result = instance.controller();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doshow method, of class ExpenseTypeRegisterUI.
     */
    @Test
    public void testDoshow() {
        System.out.println("doshow");
        ExpenseTypeRegisterUI instance = new ExpenseTypeRegisterUI();
        instance.doshow();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of headline method, of class ExpenseTypeRegisterUI.
     */
    @Test
    public void testHeadline() {
        System.out.println("headline");
        ExpenseTypeRegisterUI instance = new ExpenseTypeRegisterUI();
        instance.headline();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showBalances method, of class ExpenseTypeRegisterUI.
     */
    @Test
    public void testShowBalances() {
        System.out.println("showBalances");
        ExpenseTypeRegisterUI instance = new ExpenseTypeRegisterUI();
        instance.showBalances();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
