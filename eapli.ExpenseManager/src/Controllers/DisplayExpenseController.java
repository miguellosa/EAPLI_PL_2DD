/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author Luis Marques
 */
public class DisplayExpenseController {
    
    public DisplayExpenseController() {
    
    }

    public List<ExpenseType> getTypesExpenseList(){
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        return repo.getList();
    }
}
