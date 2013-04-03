/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu {

    public void mainLoop() {
        
        
        
        int option;
        do {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");
        
            System.out.println("1. Register an expense");
            System.out.println("2. Register an expense type");
            System.out.println("3. Register an Payment Mean");
            System.out.println("6. Register new Income Type");
            System.out.println("0. Exit\n\n");
        
            option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0: 
                    System.out.println("bye bye ...");
                    return;
                case 1: 
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.mainLoop();
                    break;
                case 2:
                    ExpenseTypeRegisterUI uit = new ExpenseTypeRegisterUI();
                    uit.mainLoop();
                    break;
                case 3:
                    PaymentMeanRegisterUI ui3= new PaymentMeanRegisterUI();
                    ui3.mainLoop();
                    break;
                case 6:
                    IncomeTypeRegisterUI ui6 = new IncomeTypeRegisterUI();
                    ui6.mainLoop();
                    break;
            }
       }while (option != 0);

     }
}
        