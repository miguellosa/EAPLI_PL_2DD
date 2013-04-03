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

    public void registerPaymentMean(String desc, String nome, int numero, String tipo) {
        
        PaymentMeanRepository repo = new PaymentMeanRepository();
        PaymentMean payMean=null;
        
        if(tipo == "Card" || tipo == "card" || tipo == "CARD" )
        {
            payMean =new Card(nome, numero, desc,PaymentTypes.CARTAO);
        }else if(tipo == "Check" || tipo == "check" || tipo == "CHECK")
        {
            payMean =new Check(nome, numero, desc,PaymentTypes.CHEQUE);
        }else if (tipo == "Cash" || tipo == "cash" || tipo == "CASH")
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
