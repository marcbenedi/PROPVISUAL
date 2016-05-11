package com.prop45.Graph;

public class NodeTerm extends Node {
    
    private String term;

    public NodeTerm(int id, String name) {
        super(id, name);
    }
    public NodeTerm(int id, String name, double rel) {
        super(id, name,rel);
    }
    @Override
    public String getTipus(){
      //Pre: Cert
      //Post: retorna Term.
        
        return "Term";
    }
    
    
    
}
