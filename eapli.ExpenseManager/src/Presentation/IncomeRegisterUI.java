/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.IncomeRegisterController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Hugo Ferreira
 */
public class IncomeRegisterUI {
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN Income  * * *\n");
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        IncomeRegisterController controller = new IncomeRegisterController();
        controller.registerIncome(what, date, amount);
        
        System.out.println("income recorded.");
    }
    
}
