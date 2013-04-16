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
    public final static PaymentType CARTAO_CREDITO = new PaymentType("Cartão Credito");
    public final static PaymentType CARTAO_DEBITO= new PaymentType("Cartão Debito");
    public final static PaymentType CHEQUE = new PaymentType("Cheque");
        
    public PaymentTypes(){
        
    }
}
