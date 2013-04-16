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

    public void show() {
        headline();
        doshow();
        showBalances();
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
    public void headline() {
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
    }

    @Override
    protected void showBalances() {
        System.out.println("This week's expenditures: ");
        GastosSemanaisUI semui = new GastosSemanaisUI();
        semui.listarGastosSemanais();
        System.out.println("This month's expenditures: ");
        GastosMensaisUI mesui = new GastosMensaisUI();
        mesui.listarGastosMensais();
    }
}