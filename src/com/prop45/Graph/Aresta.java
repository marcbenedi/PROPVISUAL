package com.prop45.Graph;


public class Aresta {
    
    private int id;//És necessari el id de aresta???
    private int valor;
    private Node node1;//Sempre serà un PAPER
    private Node node2;
    
    public Aresta(int id, int valor, Node node1, Node node2) {
        this.id=id;
        this.valor= valor;
        this.node1 = node1;
        this.node2 = node2;
        node1.setGrado(node1.getGrado()+1);
        node2.setGrado(node2.getGrado()+1);
    }
    public Node getNode1(){return node1;}
    public Node getNode2(){return node2;}

    //Pre: Donat un id,valor i dos nodes
    //Post: Crea una aresta
    
    //public Pair(int,int) getNodes(){return new Pair( 2,2 );}
    //Pre: True
    //Post: retorna un pair amb els id's dels dos nodes que relaciona l'aresta
    
    public int getValor(){return 0;}
    //Pre: True
    //Post: retorna els valor que se li ha assignat a l'aresta
    
    public void setValor(int val){};
    //Pre: True
    //Post: Canvia el valor de l'aresta per val
    
    public boolean compararAresta(int id1, int id2){return true;};
    //Pre: True
    //Post: compara el id1 i el id2 i retorna true si son iguals, sino, retorna false


}
