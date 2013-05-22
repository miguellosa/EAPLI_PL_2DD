

package Presentation;

import Controllers.BaseController;
import Controllers.IncomeTypeRegisterController;
import eapli.util.*;

/**
 *
 * @author Grupo 6
 */

public class IncomeTypeRegisterUI extends BaseUI {

     IncomeTypeRegisterController controller = new IncomeTypeRegisterController();

     
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
        String shortName = Console.readLine("Name:");
        String what = Console.readLine("Description:");

        controller.registerIncomeType(shortName, what);

        System.out.println("Income type recorded.");
    }

    @Override
    public void headline() {
        System.out.println("* * *  REGISTER AN INCOME TYPE  * * *\n");
    }

    @Override
    protected void showBalances() {
        System.out.println("This week's expenditures: ");
        controller.listarBalancosSemanais();
        System.out.println("This month's expenditures: ");
        controller.listarBalancosMensais();
    }
}