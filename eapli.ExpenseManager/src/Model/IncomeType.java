/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;

/**
 *
 * @author Luis Marques
 */

@Entity
public class IncomeType {
    @Id
    @GeneratedValue
    private Long id;
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
