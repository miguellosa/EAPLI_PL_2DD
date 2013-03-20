/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.PaymentMeanRepository;

/**
 *
 * @author i110311
 */
public class PaymentMeanController {
       public PaymentMeanController() {
    }

    public void registerPaymentMean(String desc, String nome, int numero) {
        
        PaymentMeanRepository repo = new PaymentMeanRepository();
        
        repo.save(null);
    }   
}
