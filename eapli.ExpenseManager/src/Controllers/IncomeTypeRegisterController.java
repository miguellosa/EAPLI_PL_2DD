/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.inmemory.IncomeTypeRepository;
import Persistence.jpa.IncomeTypeRepositoryImpl;
import Model.IncomeType;
import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;

/**
 *
 * @author Luis Marques
 */
public class IncomeTypeRegisterController extends BaseController{

    public IncomeTypeRegisterController() {
    }

    public void registerIncomeType(String name, String description) {
        IncomeType inctype = new IncomeType(name, description);

        IncomeTypeRepositoryImpl repo = new IncomeTypeRepositoryImpl();

        repo.save(inctype);
    }
}
