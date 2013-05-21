/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

/**
 *
 * @author i110242 and i110230
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Movement implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String description;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOcurred;
    private BigDecimal amount;
    
    public Movement(){
        
    }
    
    public Movement(String description,Date dateOccurred,BigDecimal amoount){
        if(description == null || dateOccurred == null || amount == null){
            throw new IllegalArgumentException();
        }
        
        if(amount.signum() == -1 || amount.signum() == 0){
            throw new IllegalArgumentException();
        }
        
        this.description = description;
        this.dateOcurred = dateOcurred;
        this.amount = amount;
    }
    
    public BigDecimal getAmount(){
        return amount;
    }
    
    public boolean OccursThisWeek(){
        int weekOfMovement = DateTime.weekNumber(getDateOcurred());
        int thisWeek = DateTime.currentWeekNumber();
        return thisWeek == weekOfMovement;
    }
    
    public boolean occursThisMonth(){
        int thisMonth = DateTime.today().get(Calendar.MONTH);
        int movementMonth = DateTime.dateToCalendar(getDateOcurred()).get(Calendar.MONTH);
        return (thisMonth == movementMonth);
    }
    public String getDescription(){
        return description;
    }
    
    public Date getDateOcurred(){
        return dateOcurred;
    }
    
//    public String toXml(){
//        return "<description>"+description+"</description>"
//                +"<amount>"+amount+"</amount>"
//                +"<dateOcurred>"+dateToString(dateOcurred)+"</dateOcurred>";
//    }
    
    private String dateToString(Date date){
        Calendar cal = DateTime.dateToCalendar(date);
        String dateString = cal.get(Calendar.DAY_OF_MONTH)+"-";
        dateString += cal.get(Calendar.MONTH)+1+"-";
        dateString += cal.get(Calendar.YEAR);
        return dateString;
    }
    
//    public String toCsv(){
//        return description+","+amount+","
//                +dateToString(dateOcurred)+",";
//    }
}
