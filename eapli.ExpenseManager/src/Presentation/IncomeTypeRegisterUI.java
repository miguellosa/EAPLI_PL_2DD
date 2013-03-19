/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Controllers.IncomeTypeRegisterController;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Luis Marques
 */
public class IncomeTypeRegisterUI {
      public void mainLoop() {
        System.out.println("* * *  REGISTER A INCOME TYPE  * * *\n");
        
        String name = Console.readLine("Name:");
        String description = Console.readLine("Description:");
        
        IncomeTypeRegisterController controller = new IncomeTypeRegisterController();
        controller.registerIncomeType(name,description); //register income type
        
        System.out.println("income type recorded.");
    }
}
