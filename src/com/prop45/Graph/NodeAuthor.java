package com.prop45.Graph;

public class NodeAuthor extends Node {
    
    private String autor;

    public NodeAuthor(int id, String name) {
        super(id, name);
    }
    public NodeAuthor(int id, String name, double rel) {
        super(id, name,rel);
    }
    @Override
    public String getTipus(){
      //Pre: Cert
      //Post: retorna Autor.
        
        return "Author";
    }
    
}
