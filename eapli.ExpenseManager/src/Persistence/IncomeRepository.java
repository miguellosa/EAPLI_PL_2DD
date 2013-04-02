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
 * @author Hugo Ferreira
 */
public class IncomeRepository implements IIncomeRepository{
     // class member
    private static List<Income> listIncome= new ArrayList<Income>();

    public IncomeRepository() {}
    
    public void save(Income inc)
    {
        if (inc==null) throw new IllegalArgumentException();
        listIncome.add(inc);
      
    }
}
