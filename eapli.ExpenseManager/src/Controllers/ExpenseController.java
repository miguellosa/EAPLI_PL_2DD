/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.inmemory.ExpenseRepository;
import java.util.Collections;
import java.util.List;

public class ExpenseController {
    public ExpenseController(){        
    }
    
    public List<Expense> getExpenseList()
    {   
        ExpenseRepository repo = new ExpenseRepository();
        return Collections.unmodifiableList (repo.getLista());
    }
}
