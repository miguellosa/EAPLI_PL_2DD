/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inmemory;
import Model.*;
import Persistence.IExpenseRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author losa
 */
public class ExpenseRepository  implements IExpenseRepository
{
    // class member
    private static List<Expense> listExpense= new ArrayList<Expense>();

    public ExpenseRepository() {}
    
    public void save(Expense exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listExpense.add(exp);
      
    }
    
    static public List<Expense> getLista(){
        return listExpense;
    }
}
