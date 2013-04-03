/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentMeanController;
import eapli.util.Console;
import java.util.List;

public class PaymentMeanRegisterUI {
    
     public void mainLoop() {
        System.out.println("* * * REGISTER AN PAYMENT MEAN * * *\n");

        PaymentMeanController controller = new PaymentMeanController();
        
        System.out.println("Payment types:");
        List<String> types= controller.getPaymentTypes(); 
        for (int i = 0; i < types.size(); i++)
        {
            System.out.println(" -> "+types.get(i));    
         }
        String tipo = Console.readLine("->");
         
        String what = Console.readLine("Description:");
        
        if(!tipo.equals("Cash"))
        {
            String nome =  Console.readLine("Bank name: ");
            String numero =  Console.readLine("Number: ");
            controller.registerPaymentMean(what, nome, numero,tipo);
        }
        else controller.registerPaymentMean(what, "", "",tipo);

        System.out.println("Payment mean recorded.");
    }
}
