/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Hugo Ferreira
 */
public class Income {

    String description;
    BigDecimal amount;
    Date dateoccurred;

    protected Income() {
    }

    public Income(String description, Date dateOccurred, BigDecimal amount) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative income or a zero EUR income
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.dateoccurred = dateOccurred;
    }

    public Income(String description, int year, int month, int day, BigDecimal amount) {
        this(description, DateTime.newDate(year, month, day), amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }
    
    public void tostring(){
        System.out.println("Description: " + description);
        System.out.println("Date: " + dateoccurred);
        System.out.println("Amout: " + amount + "\n");
    }
}
