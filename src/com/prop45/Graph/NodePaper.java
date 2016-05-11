/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.Graph;

public class NodePaper extends Node {

    private String article;

    public NodePaper(int id, String name) {
        super(id, name);
    }
    public NodePaper(int id, String name, double rel) {
        super(id, name,rel);
    }

    public String getTipus(){
      //Pre: Cert
      //Post: retorna Article.
        return "Paper";
    }    
    
}
