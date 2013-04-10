package Presentation;

import Controllers.BaseController;
import Controllers.DisplayExpenseController;
import Model.ExpenseType;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
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
    }
   
    @Override
    protected String headline() {
        return "CURRENT MONTHLY EXPENSE BY TYPE:\n";
    }
    
 @Override
    protected BaseController controller() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void doshow() {
       
       DisplayExpenseController controller = new DisplayExpenseController();
       List<ExpenseType> expenseTypesList = controller.getTypesExpenseList();
       
       System.out.println("Select an expense type:\n");
        
       for (int i=0;i<expenseTypesList.size();i++)
       {
           System.out.println(i+1+" - "+expenseTypesList.get(i).getDescription()+"\n");
       }    
       
    }
}

   


  

    

