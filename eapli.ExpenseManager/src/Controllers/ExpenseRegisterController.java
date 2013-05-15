/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.inmemory.ExpenseRepository;
import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMean;

import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController extends BaseController {

    public ExpenseRegisterController() {
    }

    public void registerExpense(String what, Date date, BigDecimal amount, PaymentMean mean,ExpenseType type) {
        Expense expense = new Expense( what, date, amount, mean,type);
        IExpenseRepository repo = new ExpenseRepository();
        
        repo.save(expense);
    }     
}
