/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.PaymentMean;
import Model.PaymentTypes;
import Persistence.PaymentMeanRepository;

/**
 *
 * @author Trinity
 */
public class PaymentMeanBootstrapper {
    
    static {
        PaymentMeanRepository repo = new PaymentMeanRepository();
        repo.save(new PaymentMean("O meu cartao", PaymentTypes.CARTAO));
        repo.save(new PaymentMean("O meu cheque", PaymentTypes.CHEQUE));
    }
    
}
