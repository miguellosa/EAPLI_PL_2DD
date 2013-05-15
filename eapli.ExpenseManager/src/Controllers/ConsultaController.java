/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.inmemory.ExpenseRepository;
import Model.Expense;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110815
 */
public class ConsultaController {
    public List<Expense> getListaMes(){
        List<Expense> ListMesActual = new ArrayList<Expense>();
        for (Expense e : ExpenseRepository.getLista() ){
            if(eapli.util.DateTime.currentMonth() == eapli.util.DateTime.getMonth(e.getDate())){
                ListMesActual.add(e);
            } 
        }
        return ListMesActual;
    }
    
    public List<Expense> getListaSemana(){
        List<Expense> ListSemanaActual = new ArrayList<Expense>();
        for (Expense e : ExpenseRepository.getLista() ){
            if(eapli.util.DateTime.currentWeekNumber() == eapli.util.DateTime.weekNumber(e.getDate())){
                ListSemanaActual.add(e);
            } 
        }
        return ListSemanaActual;
    }
}
