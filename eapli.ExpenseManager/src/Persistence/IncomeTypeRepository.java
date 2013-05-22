/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.IncomeType;



/**
 *
 * @author Luis Marques
 */
public interface IncomeTypeRepository {
    
    IncomeType findForName (String key);
    
    IncomeType save (IncomeType incomeType);
    
}
