/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Model.PaymentMean;
import Persistence.PaymentMeanRepository;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {
    public void mainLoop() {
        
        PaymentMeanRepository meanRepo = new PaymentMeanRepository();
        //Obter a lista de meios de pagamento
        List<PaymentMean> meansList = meanRepo.getListPaymentMean();
        
        if(meansList.isEmpty()){
            System.out.println("You have yet to create at least one means of payment.\nPlease do so before proceeding.");
            System.out.println("Expense not recorded.");
            return;
        }
        
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        //Listar meios de pagamento
        PaymentMean mean = null;
        boolean notValid = true;
        
        while(notValid){
        
            System.out.println("These are the means of payment available:");
            for(int i=0; i<meansList.size(); i++){

                System.out.println((i+1)+" - Type: " + meansList.get(i).tipo.getDescription() + "; Description: " + meansList.get(i).descricao);
            }

            int answer = Console.readInteger("Please choose a option");

            if(answer <= meansList.size() || answer > 0 ){

                notValid = false;
                mean = meansList.get(answer-1);
            }
        }
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        controller.registerExpense(what, date, amount, mean);
        
        System.out.println("Expense recorded.");
    }
}
