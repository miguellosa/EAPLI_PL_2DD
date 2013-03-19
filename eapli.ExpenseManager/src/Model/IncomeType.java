/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Luis Marques
 */
public class IncomeType {
    
    String name;
    String description;
    
    protected IncomeType() {}
    
    public IncomeType(String name, String description) {
        if (description == null || name == null ) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.description = description;
    }
   
    public String getIncomeType() {
        return name;
    }
}
