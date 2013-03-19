/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.IncomeType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Marques
 */
public class IncomeTypeRepository implements IIncomeTypeRepository{
    // class member
    private static List<IncomeType> listIncomeType= new ArrayList<IncomeType>();

    public IncomeTypeRepository() {}
    
    public void save(IncomeType type)
    {
        if (type==null) throw new IllegalArgumentException();
        listIncomeType.add(type);
      
    }
}
