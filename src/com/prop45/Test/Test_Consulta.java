package com.prop45.Test;

import com.prop45.Consulta.Consulta;
import com.prop45.DataBase.DataBase;
import com.prop45.DataBase.GraphDataBase;
import com.prop45.DataBase.RelacionDataBase;
import com.prop45.Graph.Graph;
import com.prop45.Graph.Node;
import com.prop45.Paths.Norma;
import com.prop45.Paths.Relacion;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test_Consulta {
    private Consulta c;
    private Graph g;
    private GraphDataBase gdb;
    private RelacionDataBase rdb;
    private String route;
    public Test_Consulta(String s){
        route = s;
        File f = new File(route);
        gdb = new GraphDataBase();
        gdb.setRoute(f);
        rdb = new RelacionDataBase();
        rdb.setRoute(f);
        g = new Graph();
    }

    public void test(){

        Scanner in = new Scanner(System.in);
        int op;
        boolean ok = true;
        while(ok){
            c = new Consulta(g);
            System.out.println("\n------------------------------\n" +
                    "TEST CONSULTA:\n" +
                    "1: Preparar el sistema per a la primera consulta\n" +
                    "2: Fer una consulta predefinida\n" +
                    "3: Fer una nova consulta\n" +
                    "0: Sortir");
            switch (op = in.nextInt()){
                case 1:
                    System.out.println("Carregant bases de dades, tardara uns segons");
                    g = gdb.load();
                    rdb.load();
                    break;
                case 2:
                    System.out.println("Les consultes predefinides són les següents:");
                    ArrayList<Relacion> relacions = rdb.getRelacions();
                    int index = 0;
                    for (Relacion r: relacions) {
                        System.out.println(index+" - "+r.getName()+" "+r.getTags().toString());
                        ++index;
                    }
                    System.out.println("Introdueix index de la consulta desitjada");
                    index = in.nextInt();
                    Relacion r = relacions.get(index);
                    System.out.println("Introdueixi el nom del Autor/Article/Conferencia/Term per on vol començar" +
                            "la consulta");
                    in.nextLine();
                    String nom = in.nextLine();

                    ArrayList<String>valors = new ArrayList<>();
                    valors.add(nom);
                    for(int i = 1; i < r.getTags().size();++i)valors.add("NULL");
                    ArrayList<Node> resultat = c.consultar(r,valors);
                    System.out.println(r.getName()+"..........");
                    for (Node n:resultat) {
                        System.out.println(n.getName());
                    }
                    break;
                case 3:
                    Norma norm;
                    System.out.println("Insertar nombre de la nueva relación");
                    String name = in.next();
                    r = new Relacion(name);
                    ArrayList<String> dTag= new ArrayList<>();
                    System.out.println("Insertar el numero de tags (ha de ser un natural)");
                    int num = in.nextInt();
                    for (int i = 0; i < num; ++i){
                        System.out.println("Insertar tag (Author||Paper||Conference||Term)");
                        String tag = in.next();
                        dTag.add(tag);
                    }
                    r.setTags(dTag);
                    System.out.println("Inserte numero de normas (ha de ser un natural)");
                    num = in.nextInt();

                    for (int i = 0; i < num; ++i){
                        norm=new Norma();
                        System.out.println("Insert index1 (ha de ser un natural)");                  //setIndex1
                        int i1=in.nextInt();
                        norm.setIndx1(i1);
                        System.out.println("Insert index2 (ha de ser un natural)");
                        int i2=in.nextInt();
                        norm.setIndx2(i2);                                        //setIndex2
                        System.out.println("Insert operator (ha de ser un caràcter)");
                        String c= in.next();
                        norm.setOperator(c.charAt(c.length()-1));                 //setOperator
                        r.afegirNorma(norm);
                    }
                    System.out.println("Relació creada correctament:");
                    System.out.println(r.getName()+" "+r.getTags());
                    System.out.println("Introdueixi el nom del Autor/Article/Conferencia/Term per on vol començar" +
                            "la consulta");
                    in.nextLine();
                    String nomb = in.nextLine();

                    ArrayList<String>valorss = new ArrayList<>();
                    valorss.add(nomb);
                    for(int i = 1; i < r.getTags().size();++i)valorss.add("NULL");
                    ArrayList<Node> resultatt = c.consultar(r,valorss);
                    System.out.println(r.getName()+"..........");
                    for (Node n:resultatt) {
                        System.out.println(n.getName());
                    }

                    break;
                case 0:
                    ok = false;
                    break;
            }
        }
    }
}
