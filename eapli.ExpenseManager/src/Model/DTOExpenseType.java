/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import Model.*;

/**
 *
 * @author soaressf
 */
public class DTOExpenseType {
    
    private static List <ExpenseType> listExpenseType; // list off all expense types
    private static List <Expense> listExpenses; // list of currently month
    
    public DTOExpenseType(List firstList, List secondList){
        if(firstList == null || secondList == null) throw new IllegalArgumentException();
        
        listExpenseType = firstList;
        listExpenses = secondList;
    }  
    
    static public List<ExpenseType> getListExpenseType(){
        return listExpenseType;
    }
    
    static public List<Expense> getListExpenses(){
        return listExpenses;
    }
}
