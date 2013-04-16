/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author anomimo
 */
public class DebitCard extends Card{
     
    public DebitCard(){}
    
    public DebitCard(String banco, String numero, String desc, PaymentType tipo)
    {
        super(banco,numero,desc, tipo);
  
    }
    
}
