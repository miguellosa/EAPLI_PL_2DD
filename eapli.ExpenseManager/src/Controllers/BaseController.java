/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.*;
import Model.*;
import Persistence.*;
import Controllers.*;
import Presentation.*;

/*
 *
 * @author i110230 and i110242
 */
public abstract class BaseController {
    
    public BaseController(){
        
    }
    
    public void listarBalancosMensais(){
        GastosMensaisUI mesui = new GastosMensaisUI();
        mesui.listarGastosMensais();
    }
    
    public void listarBalancosSemanais(){
        GastosSemanaisUI semui = new GastosSemanaisUI();
        semui.listarGastosSemanais();
    }
//    public BigDecimal getThisMonthExpenditure(){
//        
//    }
    
}