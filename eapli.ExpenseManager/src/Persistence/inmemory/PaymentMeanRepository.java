/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inmemory;

import Model.PaymentMean;
import Persistence.IPaymentMeanRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110311
 */
public class PaymentMeanRepository implements IPaymentMeanRepository {
    // class member
    private static List<PaymentMean> listPaymentMean= new ArrayList<PaymentMean>();

  

    public PaymentMeanRepository() {}
    
    public boolean save(PaymentMean payment)
    {
        if (payment==null) throw new IllegalArgumentException();
        getListPaymentMean().add(payment);
        return true;
      
    }
      /**
     * @return the listPaymentMean
     */
    public List<PaymentMean> getListPaymentMean() {
        return listPaymentMean;
    }
    
}
