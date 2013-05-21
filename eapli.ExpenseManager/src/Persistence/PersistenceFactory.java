/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import ExpenseManager.ExpenseManager;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author i110242 and i110230
 */
public class PersistenceFactory {
    private PersistenceFactory(){
        
    }
    
    public static RepositoryFactory buildPersitenceFactory(){
        String factoryClassName = ExpenseManager.getApplicationProperties().getProperty("Persistence.repositoryFactory");
        
        try{
            return (RepositoryFactory) Class.forName(factoryClassName).newInstance();
        }catch(ClassNotFoundException ex){
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }catch(InstantiationException ex){
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE,null,ex);
        }catch(IllegalAccessException ex){
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
        return null;
    }
}
