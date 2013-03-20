/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i110311
 */
public class Check {
   
    private String banco;
    private int numero;
    
    public Check(){}
    
    public Check(String banco,int n){
     
        if (banco.isEmpty() || n==0) throw new IllegalArgumentException(); 
        
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
