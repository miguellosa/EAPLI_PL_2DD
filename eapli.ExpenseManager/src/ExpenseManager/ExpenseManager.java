/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpenseManager;

import Presentation.MainMenu;
import eapli.util.Math;
import Persistence.*;
import Presentation.MainMenu;
import eapli.bootstrap.ExpenseBootstrapper;
import eapli.bootstrap.ExpenseTypeBootstrapper;
import eapli.bootstrap.PaymentMeanBootstrapper;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseManager {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loadProperties();
        
//        ExpenseTypeBootstrapper e3 = new ExpenseTypeBootstrapper();
//        ExpenseBootstrapper e=new ExpenseBootstrapper();
//        PaymentMeanBootstrapper e2=new PaymentMeanBootstrapper();
//        
//        MainMenu menu = new MainMenu();
//        menu.mainLoop();
//   
        
        MainMenu menu = new MainMenu();
        menu.mainLoop();
    }
    
    private static Properties applicationProperties = new Properties();
    
    public static Properties getApplicationProperties(){
        return applicationProperties;
    }
    
    private static void loadProperties(){
        try{
            applicationProperties.load(new FileInputStream("./src/eapli/expensemanager/expensemanager.properties"));
        }catch(IOException ex){
            applicationProperties.setProperty("persistence.repositoryFactory","eapli.expensemanager.persistence.JpaRepositoryFactory");
            
            ex.printStackTrace();
        }
    }
    
    private static void doBootStrap(){
//        BootStrap referenceDataBootStrap = new BootStrap();
//        
//        SomeExpensesBootstrap sampleExpensesBootstrap = new SomeExpencesBootstrap();
//        
//        SomeDefaultAlertLimitBootstrap defaultAlertLimits = new SomeDefaultAlertLimitBootstrap();
    }
}