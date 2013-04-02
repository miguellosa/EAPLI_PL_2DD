/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110242 and i110230
 */
public class ExpenseTypeRepository implements IExpenseTypeRepository {

    private static List<ExpenseType> listExpenseType = new ArrayList<ExpenseType>();

    public ExpenseTypeRepository() {
    }

    public void save(ExpenseType exptype) {
        if (exptype == null) {
            throw new IllegalArgumentException();
        }
        listExpenseType.add(exptype);
    }
    
    public List<ExpenseType> getList() {
        return listExpenseType;
    }
}