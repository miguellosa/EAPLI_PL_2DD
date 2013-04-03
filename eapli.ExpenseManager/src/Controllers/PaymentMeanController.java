/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Card;
import Model.Cash;
import Model.Check;
import Model.PaymentMean;
import Model.PaymentType;
import Model.PaymentTypes;
import Persistence.PaymentMeanRepository;
import java.util.ArrayList;
import java.util.List;


public class PaymentMeanController {
       public PaymentMeanController() {
    }

    public void registerPaymentMean(String desc, String nome, String numero, String tipo) {
        
        PaymentMeanRepository repo = new PaymentMeanRepository();
        PaymentMean payMean=null;
        
        if(tipo.equals("Card") || tipo.equals("card") || tipo.equals("CARD") )
        {
            payMean =new Card(nome, numero, desc,PaymentTypes.CARTAO);
        }else if(tipo.equals("Check") || tipo.equals("check") || tipo.equals("CHECK"))
        {
            payMean =new Check(nome, numero, desc,PaymentTypes.CHEQUE);
        }else if (tipo.equals("Cash") || tipo.equals("cash") || tipo.equals("CASH"))
        {
            payMean =new Cash(desc,PaymentTypes.DINHEIRO);
        }
        
        repo.save(payMean);
    }   
    
    public List<PaymentMean> getListPaymentMean()
    {
         PaymentMeanRepository repo = new PaymentMeanRepository();
         return repo.getListPaymentMean();
    }
    
    public List<String> getPaymentTypes()
    {
        List<String> tipos= new ArrayList<String>();
        
        tipos.add("Card");
        tipos.add("Check");
        tipos.add("Cash");
        return tipos;
    }
}
