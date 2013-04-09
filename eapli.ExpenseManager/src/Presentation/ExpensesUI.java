/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseController;
import Model.Expense;
import eapli.util.Console;

/**
 *
 * @author Grupo 2
 */
public class  ExpensesUI{
    public ExpensesUI(){}
    public void mainLoop() {
        System.out.println("* * *  Expenses List  * * *\n");
        
        ExpenseController controller = new ExpenseController();
        
        for (Expense expense : controller.getExpenseList()){
            expense.tostring();
        }
        
        System.out.println("done. <Enter>");
        Console.readLine("");
    }
    
}
