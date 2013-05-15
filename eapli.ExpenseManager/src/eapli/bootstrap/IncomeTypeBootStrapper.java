/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import Persistence.inmemory.IncomeTypeRepository;

/**
 *
 * @author Luis Marques
 */
public class IncomeTypeBootStrapper {
    static {
        IIncomeTypeRepository repo = new IncomeTypeRepository();
        repo.save(new IncomeType("Alimentacao","Necessidade Basica"));
        repo.save(new IncomeType("Transportes","Necessidade Basica"));
        repo.save(new IncomeType("Lazer","Necessidade Secundaria"));
    }
}
