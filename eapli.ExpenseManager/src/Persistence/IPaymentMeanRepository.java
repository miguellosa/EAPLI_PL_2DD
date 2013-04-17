/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;

/**
 *
 * @author i110311
 */
public interface IPaymentMeanRepository {
    boolean save(PaymentMean payment);
}
