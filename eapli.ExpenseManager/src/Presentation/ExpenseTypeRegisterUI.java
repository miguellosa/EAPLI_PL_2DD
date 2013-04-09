/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseTypeRegisterController;

import eapli.util.*;

/**
 *
 * @author i110242 and i110230
 */
public class ExpenseTypeRegisterUI extends BaseUI {

    public void mainLoop() {
        show();
    }

    @Override
    public BaseController controller() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void doshow() {
        String what = Console.readLine("Description:");

        ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
        controller.registerExpenseType(what);

        System.out.println("expense type recorded.");
    }

    @Override
    public String headline() {
        return "* * * REGISTER AN EXPENSE TYPE * * *\n";
    }
}