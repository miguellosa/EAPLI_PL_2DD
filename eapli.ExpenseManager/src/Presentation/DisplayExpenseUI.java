package Presentation;

import Controllers.BaseController;
import Controllers.DisplayExpenseController;
import Model.Expense;
import Model.ExpenseType;
import Persistence.inmemory.ExpenseRepository;
import Persistence.inmemory.ExpenseTypeRepository;
import Persistence.IExpenseRepository;
import Persistence.IExpenseTypeRepository;
import eapli.util.Console;
import java.util.List;


/**
 *
 * @author Luis Marques
 */
public class DisplayExpenseUI extends BaseUI {
    
  @Override
    public void show() {
        headline();
        doshow();
        showBalances();
    }
   
    @Override
    protected void headline() {
        System.out.println("CURRENT MONTHLY EXPENSE BY TYPE:\n");
    }
    
 @Override
    protected BaseController controller() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void doshow() {
       
       DisplayExpenseController controller = new DisplayExpenseController();
       /*List<ExpenseType> expenseTypesList = controller.getTypesExpenseList();
       
       System.out.println("Select an expense type:\n");
        
       for (int i=0;i<expenseTypesList.size();i++)
       {
           System.out.println(i+1+" - "+expenseTypesList.get(i).getDescription()+"\n");
       }   */ 
    }

    @Override
    protected void showBalances() {
        System.out.println("This week's expenditures: ");
        GastosSemanaisUI semui = new GastosSemanaisUI();
        semui.listarGastosSemanais();
        System.out.println("This month's expenditures: ");
        GastosMensaisUI mesui = new GastosMensaisUI();
        mesui.listarGastosMensais();
    }    
}  

