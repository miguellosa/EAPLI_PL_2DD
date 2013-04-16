/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i110476
 */
public class CreditCard extends Card{
    
    
    private int credit; 
    
    
     public CreditCard(String banco, String numero, String desc, PaymentType tipo, int credit)
    {
        super(banco,numero,desc, tipo);
        if (credit<=0 )throw new IllegalArgumentException();
        this.credit=credit;
   
    }
    public CreditCard(){}

    /**
     * @return the credit
     */
    public int getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }
    
}
