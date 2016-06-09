/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pdvsmart.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tiago
 */
public class JPAUtil {
    private static final EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("pdvsmart");
    
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
