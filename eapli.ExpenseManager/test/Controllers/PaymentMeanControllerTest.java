/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.PaymentMeanRepository;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentMeanControllerTest {
    
    public PaymentMeanControllerTest() {
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
     * Test of registerPaymentMean method, of class PaymentMeanController.
     */
    @Test//(expected  = IllegalArgumentException.class)
    public void tesaArgumentosNaInsercaoRegistoMeiosPagamento() {
        System.out.println("registerPaymentMean");
        
        PaymentMeanController instance = new PaymentMeanController();

        String desc = "asd";
        String nome = "BPI GOLD";
        String numero = "1242343436";
        String tipo = "CC";
        int credit = 2000;
        
        boolean boolResult =instance.registerPaymentMean(desc, nome, numero, tipo, credit); 
        assertEquals(true , boolResult);
        
        desc = "Cartão BPI";
        nome = "BPI GOLD";
        numero = "1242343436";
        tipo = "CC";
        credit = 2000;
        
       
        boolResult =instance.registerPaymentMean(desc, nome, numero, tipo, credit);  
        assertEquals(true , boolResult);
        
       
        
        
    }
}
