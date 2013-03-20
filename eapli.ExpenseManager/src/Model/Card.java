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
    private int numero;
    
    public Card()
    {
    }
    public Card(String banco, int numero)
    {
        if (banco.isEmpty() || numero==0) throw new IllegalArgumentException();
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
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
