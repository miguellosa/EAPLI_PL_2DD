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
import java.util.*;
import Model.*;

public abstract class BaseUI {
    
    
    protected abstract BaseController controller();
    protected abstract void doshow();
    protected abstract void headline();
    protected abstract void showBalances();
    protected abstract void show();
    
}