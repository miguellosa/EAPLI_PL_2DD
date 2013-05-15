/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inmemory;

import Controllers.BaseController;
import Persistence.inmemory.ExpenseTypeRepository;
import Model.ExpenseType;

import Persistence.*;
import java.util.List;

/**
 *
 * @author i110242 and i110230
 */
public class ExpenseTypeRegisterController extends BaseController {
    
    private IExpenseTypeRepository repo = new ExpenseTypeRepository();
    
    public ExpenseTypeRegisterController() {
    }

    public void registerExpenseType(String shortName, String what) {
        ExpenseType expensetype = new ExpenseType(shortName, what);
        repo.save(expensetype);
    }
    
    public List<ExpenseType> GetAllExpenseTypes() {
        return repo.getList();
    }
}