/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pdvsmart.hibernate;

import br.com.pdvsmart.model.Produto;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author tiago
 */
public class GeraTabelas {
    public static void main(String[] args) {
        AnnotationConfiguration cfg;
        cfg = new AnnotationConfiguration();
        cfg.addAnnotatedClass(Produto.class);
        
        SchemaExport se = new SchemaExport(cfg);
        se.create(true, true);
    }
}
