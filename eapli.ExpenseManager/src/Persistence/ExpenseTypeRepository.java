/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.util.List;

/**
 *
 * @author i110230
 */
public interface ExpenseTypeRepository {
    
    ExpenseType findForName(String key);
    
    ExpenseType save(ExpenseType expenseType);
    
}
