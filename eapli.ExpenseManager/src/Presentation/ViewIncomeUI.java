/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ViewIncomeController;
import Model.Income;

/**
 *
 * @author i100673
 */
public class ViewIncomeUI {
    
    public void viewAllIncomes(){
        
        ViewIncomeController vic = new ViewIncomeController();
        for(Income i:vic.getIncomes()){
            i.tostring();
        }
    }
}
