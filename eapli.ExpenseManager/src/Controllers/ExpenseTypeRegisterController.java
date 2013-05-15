/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.jpa.ExpenseTypeRepositoryImpl;

/**
 *
 * @author i110230
 */
public class ExpenseTypeRegisterController extends BaseController {
    public ExpenseTypeRegisterController(){
    }    
    
    public void registerExpenseType(String shortName, String Descr){
        ExpenseType expenseType = new ExpenseType(shortName,Descr);
        ExpenseTypeRepositoryImpl repo;
        repo = new ExpenseTypeRepositoryImpl();
        repo.save(expenseType);
    }
}
