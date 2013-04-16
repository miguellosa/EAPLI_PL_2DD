/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Persistence.IncomeRepository;
import java.util.List;

/**
 *
 * @author i100673
 */
public class ViewIncomeController {
    
    public List<Income> getIncomes(){        
        return IncomeRepository.getList();
    }
    
}
