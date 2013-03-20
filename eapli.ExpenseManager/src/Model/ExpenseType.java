/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i110242 and i11230
 */
public class ExpenseType {

    String description;

    protected ExpenseType() {
    }

    public ExpenseType(String description) {
        if (description == null) {
            throw new IllegalArgumentException();
        }
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}