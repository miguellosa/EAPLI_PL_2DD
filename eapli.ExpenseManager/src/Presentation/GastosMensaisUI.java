/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ConsultaController;
import Model.Expense;

/**
 *
 * @author i110815
 */
public class GastosMensaisUI {
    public void listarGastosMensais(){
        ConsultaController cc = new ConsultaController();
        int i = 0;
        System.out.println("\nGastos do mes: " + eapli.util.DateTime.currentMonth());
        for(Expense e:cc.getListaMes()){
            i++;
            System.out.println("Despesa " + i + ":");
            e.tostring();
            System.out.println("\n-- / -- \n");
        }
            
    }
        
}
