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
            produto.setCodigo("codigo");
            produto.setNome("produto");
            produto.setQuantidade(1);
            produto.setQuantidadeMin(1);
            produto.setCusto(10.0);
             
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