package com.prop45.Graph;

public class NodeConference extends Node {
    
    private String conf;

    public NodeConference(int id, String name) {
        super(id, name);
    }
    public NodeConference(int id, String name, double rel) {
        super(id, name,rel);
    }
    @Override
    public String getTipus(){
      //Pre: Cert
      //Post: retorna Conf.
        
        return "Conference";
    }
    
}
