/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.inmemory.ExpenseTypeRegisterController;
import Controllers.ExpenseController;
import Model.DTOExpenseType;
import Model.Expense;
import Model.ExpenseType;
import Model.RecordExpense;
import Persistence.inmemory.ExpenseTypeRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Luis Marques
 */
public class DisplayExpenseController {
    
    private List<ExpenseType> listExpenseTypes;
    private List<Expense> listExpenses;
    
    public DisplayExpenseController() {
    
    }

    public BigDecimal[] getMonthlyExpensesByType(){
        ExpenseTypeRegisterController registerController = new ExpenseTypeRegisterController();
        listExpenseTypes = registerController.GetAllExpenseTypes();
        
        ExpenseController expenseController = new ExpenseController();
        listExpenses =  expenseController.getExpenseList();
        
        DTOExpenseType dto = new DTOExpenseType(listExpenseTypes, listExpenses);
        RecordExpense rce = new RecordExpense(dto);
        return rce.getMonthlyExpensesByType();
    }
}
