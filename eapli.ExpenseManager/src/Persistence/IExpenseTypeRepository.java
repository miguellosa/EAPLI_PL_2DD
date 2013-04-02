/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.util.List;

/**
 *
 * @author i110242 and i110230
 */
public interface IExpenseTypeRepository {

    void save(ExpenseType exptype);

    public List<ExpenseType> getList();
}