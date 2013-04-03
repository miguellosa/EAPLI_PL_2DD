/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i110311
 */
public class Card extends PaymentMean {
    private String banco;
    private String numero;
    
    public Card()
    {
    }
    public Card(String banco, String numero, String desc, PaymentType tipo)
    {
        super(desc, tipo);
        if (banco.isEmpty() || numero.isEmpty()) throw new IllegalArgumentException();
        this.banco=banco;
        this.numero= numero;
   
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
