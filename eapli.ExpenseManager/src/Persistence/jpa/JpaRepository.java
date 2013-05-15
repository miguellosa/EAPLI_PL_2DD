/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.jpa;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

/**
 *
 * @author grupo 2
 */
public abstract class JpaRepository<T, PK extends Serializable> {

    @PersistenceUnit
    static protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("eapli.expensemanagerPU");
    EntityManager entityManager;

    protected EntityManager getEnitManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }
    protected Class<T> entityClass;


    public JpaRepository(){
        ParameterizedType genericSuperClass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperClass.getActualTypeArguments()[0];
    }
    
}
