/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;
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
    
    public void save(PaymentMean payment)
    {
        if (payment==null) throw new IllegalArgumentException();
        listPaymentMean.add(payment);
      
    }
}
