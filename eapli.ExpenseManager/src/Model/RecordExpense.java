/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author soaressf
 */
public class RecordExpense {
    
    private List <ExpenseType> listExpenseType; // list off all expense types
    private List <Expense> listExpenses; // list of currently month
    private DTOExpenseType dto;
    
    public RecordExpense(DTOExpenseType dto){
        this.dto = dto;
    }    
    
    public BigDecimal [] getMonthlyExpensesByType(){
        listExpenseType = dto.getListExpenseType();
        listExpenses = dto.getListExpenses();
        
        BigDecimal [] expenseListAmount = new BigDecimal[listExpenseType.size()];
        
        for(int i = 0; i < listExpenseType.size(); i ++){
            
            expenseListAmount[i].add(new BigDecimal(0));
            
            for(int j = 0; j < listExpenses.size(); j ++){
                Date date = new Date();
                if(listExpenses.get(j).getDate().getMonth() == date.getMonth() && listExpenses.get(j).type == listExpenseType.get(i)){
                    expenseListAmount[i].add(listExpenses.get(j).getAmount());
                }
            }            
        }
        return expenseListAmount;
    }
}