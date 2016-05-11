package com.prop45.Test;

import com.prop45.DataBase.GraphDataBase;
import com.prop45.Graph.*;

import java.io.File;
import java.util.Scanner;

public class Test_GraphDataBase {
    private String route;
    private GraphDataBase gdb = new GraphDataBase();

    public Test_GraphDataBase(String s){
        route = s;
    }

    public void test(){
        File f = new File(route);//"src\\Resources\\"
        gdb.setRoute(f);

        Scanner in = new Scanner(System.in);
        int op;
        Graph g = new Graph();
        boolean ok = true;
        while(ok){
            System.out.println("\n------------------------------\n" +
                    "TEST GRAPH DATA BASE:\n" +
                    "1: Load\n" +
                    "2: Safe\n" +
                    "3: Calcular page rank\n"+
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
                    g.actualitzarRelevanciaGraph();
                    break;
                case 0:
                    ok = false;
                    break;
            }
        }
    }


}