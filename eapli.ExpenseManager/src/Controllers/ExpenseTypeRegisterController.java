/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;

import Persistence.*;

/**
 *
 * @author i110242 and i110230
 */
public class ExpenseTypeRegisterController {

    public ExpenseTypeRegisterController() {
    }

    public void registerExpenseType(String what) {
        ExpenseType expensetype = new ExpenseType(what);
        IExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.save(expensetype);
    }
}