/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import javax.naming.InsufficientResourcesException;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author i110815
 */
@Entity
public class CheckingAccount extends Observable implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
//    
//    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
//    @JoinTable(name = "CheckingAccount_Movements")
//    private List<Movement> movements;
//    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
//    @JoinTable(name = "CheckingAccount_Expenses")
//    private List<Movement> expenses;
//    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
//    @JoinTable(name = "CheckingAccount_Incomes")
//    private List<Movement> incomes;
//    @OneToOne(cascade = CascadeType.MERGE)
//    private InitialBalance initialBalance;
//    
//    @Transient
//    private Map<ExpenseType, List<Expense>> expensesByType;
//    
//    public CheckingAccount() {
//            expensesByType = new HashMap<ExpenseType, List<Expense>>();
//    }
    
//    public boolean hasId(){
//        return id != null;
//    }
    
//    public BigDecimal totalExpenditure(){
//        return sumAmount(getExpenses());
//    }
//    
//    public BigDecimal totalEarnings(){
//        return sumAmount(getIncomes());
//    }
    
//    public void registerIncome(Income income){
//        addMovement(income);
//        classifyMovemetAsIncome(income);
//    }
    
//    public BigDecimal sumAmount(List<? extends Movement> theMovements){
//        BigDecimal sum = new BigDecimal(0);
//        for(Movement e : theMovements){
////            sum = sum.add(e.getAmount());
//        }
//        return sum;
//    }
    
//    public void registerExpense(Expense expense) throws InsufficientBalanceException{
//        if(!hasEnoughBalance(expense.getAmount())){
//            throw new InsufficientBalanceException();
//        }
//        addMovement(expense);
//        classifyMovementAsExpense(expense);
//        classifyExpense(expense);
//        this.setChanged();
//        ExpenseRegisteredEvent expenseRegisteredEvent = new ExpenseRegisteredEvent(expense);
//        this.notifyObservers(expenseRegisteredEvent);
//    }
    
//    public void registerSavingDeposit(SavingDeposit savingDeposit) throws InsufficientBalanceException{
//        if(!hasEnoughBalance(savingDeposit.getAmount())){
//            //throw new InsufficientBalanceException();
//        }
//        addMovement(savingDeposit);
//    }
    
//    public void registerSavingWithdraw(SavingWithdraw savingWithdraw){
//        addMovement(savingWithdraw);
//    }
//    
//    private void classifyMovementExpense(Expense expense){
//        expenses.add(expense);
//    }
    

    
}
