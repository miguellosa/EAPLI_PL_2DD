/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class PaymentMean {
    public PaymentType tipo;
    public String descricao;
    
    public PaymentMean()
    {    
    }
    
    public PaymentMean(String desc,PaymentType tipo)
    {    
        if (tipo==null || desc.isEmpty()) throw new IllegalArgumentException();
        
        this.tipo= tipo;
        this.descricao= desc;
    }
        
    
}
