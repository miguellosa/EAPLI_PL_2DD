/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Check extends PaymentMean {
   
    private String banco;
    private String numero;
    
    public Check(){}
    
    public Check(String banco ,String n, String desc, PaymentType tipo)
    {
        super(desc, tipo);
        if (banco.isEmpty() || n.isEmpty()) throw new IllegalArgumentException(); 
        
        this.banco=banco;
        this.numero=n;
        
        
        
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
