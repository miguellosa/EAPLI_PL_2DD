/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

    
/**
 *
 * @author Trinity
 */
public class PaymentTypes {

    public final static PaymentType DINHEIRO = new PaymentType("Dinheiro");
    public final static PaymentType CARTAO = new PaymentType("Cartão");
    public final static PaymentType CHEQUE = new PaymentType("Cheque");
        
    public PaymentTypes(){
        
    }
}
