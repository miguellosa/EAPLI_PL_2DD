/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Presentation.MainMenu;
import eapli.util.Math;
import Persistence.*;
import eapli.bootstrap.ExpenseBootstrapper;
import eapli.bootstrap.PaymentMeanBootstrapper;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseManager {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExpenseBootstrapper e=new ExpenseBootstrapper();
        PaymentMeanBootstrapper e2=new PaymentMeanBootstrapper();
        
        MainMenu menu = new MainMenu();
        menu.mainLoop();
   
    }
}