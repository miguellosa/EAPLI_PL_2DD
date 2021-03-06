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
        
        final int Expense_Register_UI=1;
        final int Expense_Type_Register_UI=2;
        final int Payment_Mean_Register_UI=3;
        final int Income_Type_Register_UI=6;
        final int Consult_Expense_UI=7;
        final int Income_Register_UI=8;
        final int List_Incomes_UI=9;
        
        int option;
        do {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");
        
            System.out.println("1. Register an expense");
            System.out.println("2. Register an expense type");
            System.out.println("3. Register an Payment Mean");
            System.out.println("6. Register new Income Type");
            System.out.println("7. Consult Expenses");
            System.out.println("8. Register new Income");
            System.out.println("9. List Incomes");
            System.out.println("0. Exit\n\n");
        
            option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0:         //Exit option 
                    System.out.println("bye bye ...");
                    return;
                case Expense_Register_UI:         //Option to regist an expense into the system
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.show();
                    break;
                case Expense_Type_Register_UI:         //Option to regist an expense type into the system
                    ExpenseTypeRegisterUI uit = new ExpenseTypeRegisterUI();
                    uit.show();
                    break;
                case Payment_Mean_Register_UI:         //Option to regist a mean of payment into the system
                    PaymentMeanRegisterUI ui3= new PaymentMeanRegisterUI();
                    ui3.mainLoop();
                    break;
                case Income_Type_Register_UI:         //Option to regist an income type into the system
                    IncomeTypeRegisterUI ui6 = new IncomeTypeRegisterUI();
                    ui6.show();
                    break;
                case Consult_Expense_UI:
                    ConsultExpenseUI ceui = new ConsultExpenseUI();
                    ceui.loopConsultExpenses();
                    break;
                case Income_Register_UI:         //Option to regist an income into the system
                    IncomeRegisterUI ui8 = new IncomeRegisterUI();
                    ui8.mainLoop();
                    break;
                case List_Incomes_UI:         //Option to regist an income into the system
                    ViewIncomeUI ui9 = new ViewIncomeUI();
                    ui9.viewAllIncomes();
                    break;
            }
       }while (option != 0);

     }
}
        