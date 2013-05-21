/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
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
////    
////    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
////    @JoinTable(name = "CheckingAccount_Movements")
////    private List<Movement> movements;
//    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
//    @JoinTable(name = "CheckingAccount_Expenses")
//    private List<Expense> expenses;
//    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
//    @JoinTable(name = "CheckingAccount_Incomes")
//    private List<Income> incomes;
////    @OneToOne(cascade = CascadeType.MERGE)
////    private InitialBalance initialBalance;
    
    @Transient
    private Map<ExpenseType, List<Expense>> expensesByType;
    
    public CheckingAccount() {
            expensesByType = new HashMap<ExpenseType, List<Expense>>();
    }
    
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
//    
//    public void registerIncome(Income income){
//        addMovement(income);
//        classifyMovementAsIncome(income);
//    }
    
//    public BigDecimal sumAmount(List<? extends Movement> theMovements){
//        BigDecimal sum = new BigDecimal(0);
//        for(Movement e : theMovements){
////            sum = sum.add(e.getAmount());
//        }
//        return sum;
//    }
//    
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
//    
//    public void registerSavingDeposit(SavingDeposit savingDeposit) throws InsufficientBalanceException{
//        if(!hasEnoughBalance(savingDeposit.getAmount())){
//            //throw new InsufficientBalanceException();
//        }
//        addMovement(savingDeposit);
//    }
//    
//    public void registerSavingWithdraw(SavingWithdraw savingWithdraw){
//        addMovement(savingWithdraw);
//    }
    
//  
//    private void reClassifyMovements(){
//        for(Movement movement : getMovements()){
//            if(movement instanceof Expense){
//                classifyExpense((Expense) movement);
//            }
//        }
//    }
    
//    public Map<ExpenseType, List<Expense>> getExpensesClassifiedByExpenseType(){
//        reClassifyMovements();
//        return Collections.unmodifiableMap(expensesByType);
//    }
    
//    private void addMovement(Movement movement) throws IllegalArgumentException{
//        if(movement == null){
//            throw new IllegalArgumentException();
//        }
//        
//        movements.add(movement);
//    }
    
//    private boolean hasEnoughBalance(BigDecimal amount){
//        if(amount.compareTo(getBalance()) == 1){
//            return false;
//        }
//        
//        return true;
//    }
    
//    public BigDecimal getBalance() {
//        BigDecimal i = new BigDecimal(0);
//        if(initialBalance != null){
//            i = initialBalance.getValue();
//        }
//        
//        return totalEarnings().subtract(totalExpenditure()).add(i);
//    }
    
//    public void registerInitialBalance(InitialBalance initial){
//        if(initial == null || initialBalance != null){
//            throw new IllegalArgumentException();
//        }
//        
//        initialBalance = initial;
//    }
    
//    public boolean hasInitialBalance(){
//        return initialBalance != null;
//    }

    
}
