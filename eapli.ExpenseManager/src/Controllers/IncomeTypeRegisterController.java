/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;

/**
 *
 * @author Luis Marques
 */
public class IncomeTypeRegisterController {

    public IncomeTypeRegisterController() {
    }

    public void registerIncomeType(String name, String description) {
        IncomeType inctype = new IncomeType(name, description);

        IIncomeTypeRepository incomeTypeRepo = new IncomeTypeRepository();

        incomeTypeRepo.save(inctype);
    }
}
