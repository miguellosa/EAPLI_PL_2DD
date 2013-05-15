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

     ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
    
    public void show() {
        headline();
        doshow();
        showBalances();
    }

    @Override
    public BaseController controller() {
        return controller;
    }

    @Override
    public void doshow() {
        String shortName = Console.readLine("Short Name:");
        String what = Console.readLine("Description:");

        controller.registerExpenseType(shortName, what);

        System.out.println("expense type recorded.");
    }

    @Override
    public void headline() {
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
    }

    @Override
    protected void showBalances() {
        System.out.println("This week's expenditures: ");
        controller.listarBalancosSemanais();
        System.out.println("This month's expenditures: ");
        controller.listarBalancosMensais();
    }
}