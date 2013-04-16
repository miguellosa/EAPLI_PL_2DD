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
public class GastosSemanaisUI {
    public void listarGastosSemanais(){
        ConsultaController cc = new ConsultaController();
        int i = 0;
        System.out.println("\nGastos da semana: " + eapli.util.DateTime.currentWeekNumber());
        for(Expense e:cc.getListaSemana()){
            i++;
            System.out.println("Despesa " + i + ":");
            e.tostring();
            System.out.println("\n-- / -- \n");
        }
            
    }
}
