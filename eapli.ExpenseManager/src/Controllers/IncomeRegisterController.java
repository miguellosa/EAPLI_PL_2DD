/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.inmemory.IncomeRepository;
import Model.*;
import Persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Hugo Ferreira
 */
public class IncomeRegisterController {

    public IncomeRegisterController() {
    }

    public void registerIncome(String what, Date date, BigDecimal amount) {
        Income inc = new Income(what, date, amount);
        IIncomeRepository repo = new IncomeRepository();
        repo.save(inc);
    }
}
