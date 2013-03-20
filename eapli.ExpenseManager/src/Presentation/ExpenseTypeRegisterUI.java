/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeRegisterController;

import eapli.util.*;

/**
 *
 * @author i110242 and i110230
 */
public class ExpenseTypeRegisterUI {

    public void mainLoop() {
        System.out.println("* * * REGISTER AN EXPENSE TYPE * * *\n");

        String what = Console.readLine("Description:");

        ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
        controller.registerExpenseType(what);

        System.out.println("expense type recorded.");
    }
}