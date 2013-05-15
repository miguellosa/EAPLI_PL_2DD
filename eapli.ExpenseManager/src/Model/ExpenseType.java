/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;
/**
 *
 * @author i110242 and i11230
 */

@Entity
public class ExpenseType {
    @Id
    @GeneratedValue
    private Long id;
    String description;
    String shortName;

    protected ExpenseType() {
    }

    public ExpenseType(String shortName, String description) {
        if (description == null) {
            throw new IllegalArgumentException();
        }
        this.shortName = shortName;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}