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
 * @author i110230
 */
public class ExpenseTypeRepositoryImpl implements ExpenseTypeRepository {
    
    @PersistenceUnit
    static protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("expensesPU");
    
    protected EntityManager getEntityManager(){
        EntityManager entityManager = emf.createEntityManager();
        return entityManager;
    }
    
    EntityManager manager = getEntityManager();
    
    public ExpenseType findOrCreate(String key, String description){
        if(key == null || key.trim().length() == 0){
            throw new IllegalArgumentException();
        }
        
        assert manager != null;
        
        ExpenseType expenseType;
        
        Query q = manager.createQuery("SELECT et FROM ExpenseType et WHERE et.id = :type").setParameter("type",key);
        
        try{
            expenseType = (ExpenseType) q.getSingleResult();
        } catch (NoResultException ex) {
            expenseType = new ExpenseType(key,description);
            save(expenseType);
        }
        return expenseType;
    }
   
    @Override
    public ExpenseType save(ExpenseType expenseType){
        manager.getTransaction().begin();
        manager.persist(expenseType);
        manager.getTransaction().commit();
        manager.close();
        
        return expenseType;
    }
    
    @Override
    public ExpenseType findForName(String key){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
