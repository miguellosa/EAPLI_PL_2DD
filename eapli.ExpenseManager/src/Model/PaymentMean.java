/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i110311
 */
public class PaymentMean {
    public PaymentTypes tipo;
    public String descricao;
    
    public PaymentMean()
    {    
    }
    
    public PaymentMean(PaymentTypes tipo, String desc)
    {    
        if (tipo==null || desc.isEmpty()) throw new IllegalArgumentException();
        
        this.tipo= tipo;
        this.descricao= desc;
    }
        
    
}
