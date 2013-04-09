/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author i110230 and i110242
 */

import Controllers.*;

public abstract class BaseUI {
    
    
    protected abstract BaseController controller();
    protected abstract void doshow();
    protected abstract String headline();
    
    public void show(){
        showHeadline();
        doshow();
        //Para ser finalizado...... showBalances();
    }
    
    public void showHeadline(){
        System.out.println("headline: "+headline());
    }
    
    public void showBalances(){
        /*sout  ---------------------------
        this week expenditure:
        sout das cenas
        sout |
        sout this month expenditure
        sout das cenas
        */
    }
    
}