/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Cash;
import Model.Check;
import Model.CreditCard;
import Model.DebitCard;
import Model.PaymentMean;
import Model.PaymentTypes;
import Persistence.inmemory.PaymentMeanRepository;
import java.util.ArrayList;
import java.util.List;


public class PaymentMeanController {
       public PaymentMeanController() {
    }

    public boolean registerPaymentMean(String desc, String nome, String numero, String tipo, int credit) {
        
        //testar argumento
        // String nulas ou vazias
        if (desc == null || desc.isEmpty()|| nome == null || nome.isEmpty() || numero  == null || numero.isEmpty() || tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException();
        }
        // Credito menor que zero
        if (credit < 0) {
            throw new IllegalArgumentException();
        }
        
        PaymentMeanRepository repo = new PaymentMeanRepository();
        PaymentMean payMean=null;
        
        /*
         * "CC" == Credit CArd
         * "DC" == DEbit card
         * "CK" == Check
         * "CA" == CASH
        */
        
        tipo=tipo.toUpperCase();
        if(tipo.equals("CC") )
        {
            payMean =new CreditCard(nome, numero, desc,PaymentTypes.CARTAO_CREDITO,credit);
        }else if(tipo.equals("DC")){
            payMean =new DebitCard(nome, numero, desc,PaymentTypes.CARTAO_CREDITO);
        }else if( tipo.equals("CK"))
        {
            payMean =new Check(nome, numero, desc,PaymentTypes.CHEQUE);
        }else if (tipo.equals("CA"))
        {
            payMean =new Cash(desc,PaymentTypes.DINHEIRO);
        }
        
        return repo.save(payMean);
    }   
    
    public List<PaymentMean> getListPaymentMean()
    {
         PaymentMeanRepository repo = new PaymentMeanRepository();
         return repo.getListPaymentMean();
    }
    
    public List<String> getPaymentTypes()
    {
        List<String> tipos= new ArrayList<String>();
        
        tipos.add("Credit Card");
        tipos.add("Debit Card");
        tipos.add("Check");
        tipos.add("Cash");
        return tipos;
    }
}
