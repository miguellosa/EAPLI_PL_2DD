/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;

/**
 *
 * @author i110815
 */
public class ConsultExpenseUI {
    
    public void loopConsultExpenses(){
        int option=0;
        final int Montly_Expenses=1;
        final int Weekly_Expenses=2;
        do{
            System.out.println("===================");
            System.out.println("  Consult Expenses ");
            System.out.println("===================\n");

            System.out.println("1. Monthly Expenses");
            System.out.println("2. Weekly Expenses");
            System.out.println("0. Exit\n\n");
            option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0:         //Exit option 
                    System.out.println("bye bye ...");
                    return;
                case Montly_Expenses:         //Option to regist an expense into the system
                    GastosMensaisUI gmui = new GastosMensaisUI();
                    gmui.listarGastosMensais();
                    break;
                case Weekly_Expenses:
                    GastosSemanaisUI gsui = new GastosSemanaisUI();
                    gsui.listarGastosSemanais();
                    break;
        }
        }while(option !=0 );
    }
}

