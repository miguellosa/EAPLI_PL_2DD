/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Trinity
 */
public class PaymentType {
    
    private String description;
    
    public PaymentType(String description){
    
        if(description.isEmpty())
            throw new IllegalArgumentException();
        
        this.description = description;
    }
    
    public String getDescription(){
    
        return this.description;
    }
}
