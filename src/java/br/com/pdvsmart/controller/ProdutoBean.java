/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pdvsmart.controller;

import br.com.pdvsmart.model.Produto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago
 */
@ManagedBean(name = "produtoBean")
@RequestScoped
public class ProdutoBean {
    private Produto produto;
    
    public ProdutoBean() {
        
        this.produto = new Produto();
    }
    
    public String index() {
        return "/View/index.xhtml";
    }
    
    public void cadastrar() {
        System.out.println("Produto: " + produto.getNome());
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
