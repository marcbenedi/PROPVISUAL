package com.prop45.Test;

import com.prop45.DataBase.GraphDataBase;
import com.prop45.Graph.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test_Graph {
    private Graph g = new Graph();
    private String route;
    public Test_Graph(String s){
        route = s;
    }

    public void test(){

        GraphDataBase gdb = new GraphDataBase();
        File f = new File(route);
        gdb.setRoute(f);

        Scanner in = new Scanner(System.in);
        int op;
        boolean ok = true;
        while(ok){
            System.out.println("\n------------------------------\n" +
                    "TEST GRAPH:\n" +
                    "1: Load graf de la dataBase\n" +
                    "2: Safe graf a la dataBase\n" +
                    "3: Imprimir adjecencies\n"+
                    "4: Imprimir adjecències d'un node en concret\n"+
                    "5: Afegir node\n"+
                    "6: Eliminar node\n"+
                    "7: Afegir aresta\n"+
                    "8: Eliminar aresta\n"+
                    "9: Calcular PageRank\n" +
                    "0: Tornar a l'inici\n");
            switch (op = in.nextInt()){
                case 1:
                    System.out.println("Cargando data base, tardara un poco (no es que se haya colgado)");
                    g = gdb.load();
                    System.out.println("Grafo cargado con exito");
                    break;
                case 2:
                    gdb.safe(g);
                    System.out.println("Grafo guardato con exito");
                    break;
                case 3:
                    g.printAdj();
                    break;
                case 4:
                    System.out.println("Insertar l'id d'un node i el tipus separat per espai " +
                            "(Author||Paper||Conference||Term)");
                    int id = in.nextInt();
                    String tipus = in.next();
                    ArrayList<Node> adj = g.buscarAdjecencies(id,tipus);
                    for (Node n: adj) {
                        System.out.print(n.getId()+" "+n.getName()+"\n");
                    }
                    break;
                case 5:
                    String name;
                    String tipus5;
                    int id5;
                    System.out.println("Insertar id");
                    id5 = in.nextInt();
                    System.out.println("Insertar nom del node (sense espais)");
                    name = in.next();
                    System.out.println("Insertar tipus del node (Author||Paper||Conference||Term)");
                    tipus5 = in.next();
                    switch (tipus5){
                        case "Author":
                            NodeAuthor nodeAuthor = new NodeAuthor(id5,name);
                            nodeAuthor.setRelevancia(1.0);
                            nodeAuthor.setGrado(0);
                            g.afegirNode(nodeAuthor);
                            break;
                        case "Paper":
                            NodePaper nodePaper = new NodePaper(id5,name);
                            nodePaper.setRelevancia(1.0);
                            nodePaper.setGrado(0);
                            g.afegirNode(nodePaper);
                            break;
                        case "Conference":
                            NodeConference nodeConference = new NodeConference(id5,name);
                            nodeConference.setRelevancia(1.0);
                            nodeConference.setGrado(0);
                            g.afegirNode(nodeConference);
                            break;
                        case "Term":
                            NodeTerm nodeTerm = new NodeTerm(id5,name);
                            nodeTerm.setRelevancia(1.0);
                            nodeTerm.setGrado(0);
                            g.afegirNode(nodeTerm);
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Insertar nom del node a eliminar");
                    String name2 = in.next();
                    System.out.println("Insertar tipus del node a eliminar");
                    String tipus2 = in.next();
                    g.eliminarNode(name2,tipus2);
                    break;
                case 7:
                    String a1, a2,t1,t2;
                    System.out.println("Inserta nom del primer node HA DE SER UN PAPER");
                    in.nextLine();
                    a1 = in.nextLine();
                    System.out.println("Inserta tipus del primer node HA DE SER PAPER");
                    t1 = in.next();
                    System.out.println("Inserta nom del segon node HA DE SER DIFERENT D'UN PAPER");
                    in.nextLine();
                    a2 = in.nextLine();
                    System.out.println("Inserta tipus del segon node HA DE SER DIFERENT DE PAPER");
                    t2 = in.next();
                    Node n1 = g.getNode(a1,t1);
                    Node n2 = g.getNode(a2,t2);
                    boolean b1 = false;
                    g.afegirAresta(n1,n2, b1);
                    if (b1) {
                        System.out.println("LA ARESTA JA EXISTEIX");
                    }
                    break;
                case 8:
                    String a14, a24,t14,t24;
                    System.out.println("Inserta nom del primer node HA DE SER UN PAPER");
                    in.nextLine();
                    a14 = in.nextLine();
                    System.out.println("Inserta tipus del primer node, HA DE SER PAPER");
                    t14 = in.next();
                    System.out.println("Inserta nom del segon node HA DE SER DIFERENT D'UN PAPER");
                    in.nextLine();
                    a24 = in.nextLine();
                    System.out.println("Inserta tipus del segon node, HA DE SER DIFERENT DE PAPER");
                    t24 = in.next();
                    Node n14 = g.getNode(a14,t14);
                    Node n24 = g.getNode(a24,t24);
                    boolean b2 = false;
                    g.eliminarAresta(n14,n24,b2);
                    if (b2) {
                        System.out.println("LA ARESTA NO EXISTEIX");
                    }
                    break;
                case 9:
                    g.actualitzarRelevanciaGraph();
                    break;
                case 0:
                    ok = false;
                    break;
            }
        }
    }
}
