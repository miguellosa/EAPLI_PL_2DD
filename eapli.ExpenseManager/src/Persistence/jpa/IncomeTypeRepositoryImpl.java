/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.jpa;

import Persistence.*;
import Model.*;
import javax.persistence.*;


/**
 *
 * @author Grupo 6
 */

public class IncomeTypeRepositoryImpl extends JpaRepository<IncomeType, String> implements IncomeTypeRepository {
    
    public IncomeType findOrCreate(String key, String description){
        if(key == null || key.trim().length() == 0){
            throw new IllegalArgumentException();
        }
        
        
        EntityManager em = getEntityManager();
        assert em != null;
        
        IncomeType incomeType;
        
        Query q = em.createQuery("SELECT et FROM IncomeType et WHERE et.id = :type").setParameter("type",key);
        
        try{
            incomeType = (IncomeType) q.getSingleResult();
        } catch (NoResultException ex) {
            incomeType = new IncomeType(key,description);
            save(incomeType);
        }
        return incomeType;
    }
   
    
    @Override
    public IncomeType findForName(String key){
        return super.read(key);
    }
    
    
}

