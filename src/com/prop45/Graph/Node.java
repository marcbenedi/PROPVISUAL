package com.prop45.Graph;

public abstract class Node {
    //esto es como un Struct //

    private int id;
    private String name;
    private int grado;
    private double relevancia;


    public Node(int id, String name) {
        this.id = id;
        this.name = name;
        grado = 0;
        relevancia = 1;

    }
    public Node(int id, String name,double rel) {
        this.id = id;
        this.name = name;
        grado = 0;
        relevancia = rel;

    }
    public abstract String getTipus();

    public int getId() {
        return this.id;
    }
    public int getGrado(){return grado;}
    public void setGrado(int g){grado = g;}
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {this.name = name;}
    public void setRelevancia(double r){this.relevancia = r;}
    public double getRelevancia(){return this.relevancia;}
}
