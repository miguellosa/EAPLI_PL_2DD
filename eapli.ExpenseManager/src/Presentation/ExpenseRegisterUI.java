/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseRegisterController;
import Model.ExpenseType;
import Model.PaymentMean;
import Model.PaymentType;
import Persistence.ExpenseTypeRepository;
import Persistence.PaymentMeanRepository;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI extends BaseUI {
    
    ExpenseRegisterController controller = new ExpenseRegisterController();
    
    @Override
    public void show() {
        headline();
        doshow();
        showBalances();
    }

    @Override
    public BaseController controller() {
        return null;
    }

    @Override
    public void doshow() {
        PaymentMeanRepository meanRepo = new PaymentMeanRepository();
        ExpenseTypeRepository typeRepo = new ExpenseTypeRepository();
        
        //Obter a lista de tipos de despesa
        List<ExpenseType> typesList = typeRepo.getList();
        
        if(typesList.isEmpty()){
            System.out.println("You have yet to create at least one type of expense.\nPlease do so before proceeding.");
            System.out.println("Expense not recorded.");
            return;
        }
        
        //Obter a lista de meios de pagamento
        List<PaymentMean> meansList = meanRepo.getListPaymentMean();
        
        if(meansList.isEmpty()){
            System.out.println("You have yet to create at least one means of payment.\nPlease do so before proceeding.");
            System.out.println("Expense not recorded.");
            return;
        }
        
        
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        List<ExpenseType> listExpenseType = new ArrayList<ExpenseType>();
        boolean notValid = true;
        
        //Listar Tipos de Despesas
        ExpenseType eType = null;
        
        while (notValid){
            System.out.println("These are the types of expense available:");
            
        
        for (int i = 0; i <typesList.size(); i++) {
            System.out.println((i+1)+" - Type: " + typesList.get(i).getDescription());
        }
        
            int answer = Console.readInteger("Please choose a option");
            
            if(answer <= meansList.size() && answer > 0 ){

                notValid = false;
                eType = typesList.get(answer-1);
            }
        
        }
        notValid = true;
        
        
        //Listar meios de pagamento
        PaymentMean mean = null;
        
        while(notValid){
        
            System.out.println("These are the means of payment available:");
            for(int i=0; i<meansList.size(); i++){

                System.out.println((i+1)+" - Type: " + meansList.get(i).tipo.getDescription() + "; Description: " + meansList.get(i).descricao);
            }

            int answer = Console.readInteger("Please choose a option");

            if(answer <= meansList.size() && answer > 0 ){

                notValid = false;
                mean = meansList.get(answer-1);
            }
        }
        
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        controller.registerExpense(what, date, amount, mean, eType);
        
        System.out.println("Expense recorded.");
    }

    @Override
    public void headline() {
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
    }

    @Override
    public void showBalances() {
        System.out.println("This week's expenditures: ");
        GastosSemanaisUI semui = new GastosSemanaisUI();
        semui.listarGastosSemanais();
        System.out.println("This month's expenditures: ");
        GastosMensaisUI mesui = new GastosMensaisUI();
        mesui.listarGastosMensais();
    }
}
