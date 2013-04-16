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
         
        final int CreditCard=1;
        final int DebitCard=2;
        final int Check=3;
        final int Cash=4;
                
        
        System.out.println("* * * REGISTER AN PAYMENT MEAN * * *\n");

        PaymentMeanController controller = new PaymentMeanController();
        
        System.out.println("Payment types:");
        List<String> types= controller.getPaymentTypes(); 
        for (int i = 0; i < types.size(); i++)
        {
            System.out.println("    "+(i+1)+"-> "+types.get(i));    
         }
        int tipo = Console.readInteger("Select the option:");         
        String what = Console.readLine("Description:");
        String nome,numero;
        switch (tipo)
        {
            case CreditCard:
                nome =  Console.readLine("Bank name: ");
                numero =  Console.readLine("Number: ");
                int credito= Console.readInteger("Plafom: ");
                //"CC" == Credit CArd
                controller.registerPaymentMean(what, nome, numero,"CC", credito);
                break;
            case DebitCard:
                nome =  Console.readLine("Bank name: ");
                numero =  Console.readLine("Number: ");
                //"DC" == DEbit card
                controller.registerPaymentMean(what, nome, numero,"DC",0);
                break;
            case Check:
                nome =  Console.readLine("Bank name: ");
                numero =  Console.readLine("Number: ");
                //"CK" == Check
                controller.registerPaymentMean(what, nome, numero,"CK",0);
                break;
            case Cash:
                //"CA" == CASH
                controller.registerPaymentMean(what, "", "","CA",0);
                break;
        }
        
        System.out.println("Payment mean recorded.");
    }
}
