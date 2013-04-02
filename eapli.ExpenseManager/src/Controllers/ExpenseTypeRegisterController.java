/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;

import Persistence.*;
import java.util.List;

/**
 *
 * @author i110242 and i110230
 */
public class ExpenseTypeRegisterController {
    
    private IExpenseTypeRepository repo = new ExpenseTypeRepository();
    
    public ExpenseTypeRegisterController() {
    }

    public void registerExpenseType(String what) {
        ExpenseType expensetype = new ExpenseType(what);
        repo.save(expensetype);
    }
    
    public List<ExpenseType> GetAllExpenseTypes() {
        return repo.getList();
    }
}