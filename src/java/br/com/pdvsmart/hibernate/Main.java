/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pdvsmart.hibernate;

import br.com.pdvsmart.model.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tiago
 */
public class Main {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("smartpdv");
        EntityManager em = emf.createEntityManager();
 
        try {
            em.getTransaction().begin();
             
            Produto produto = new Produto();
            produto.setCodigo("Diogo");
            produto.setNome("Bixao");
            produto.setQuantidade(3);
            produto.setQuantidadeMin(2);
            produto.setCusto(40.0);
             
            em.persist(produto);
             
            em.getTransaction().commit();
        }
        catch (Exception e) {
            em.getTransaction().rollback();
        }
        finally{
            emf.close();
        }
         
        System.out.println("Concluído!");
    }
}