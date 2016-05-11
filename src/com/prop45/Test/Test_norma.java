package com.prop45.Test;

import com.prop45.Paths.Norma;

import java.util.Scanner;

public class Test_norma {
    private Norma n = new Norma();

    public void test(){

        Scanner in = new Scanner(System.in);
        int op;
        boolean ok = true;
        while(ok){
            System.out.println("\n------------------------------\n" +
                    "TEST NORMA:\n" +
                    "1: Crear una nova Norma\n" +
                    "2: Obtenir dades de la norma\n" +
                    "0: Tornar a l'inici");
            switch (op = in.nextInt()){
                case 1:
                    System.out.println("Inset index1 (ha de ser un natural)");                  //setIndex1
                    int i1=in.nextInt();
                    n.setIndx1(i1);
                    System.out.println("Inser index2 (ha de ser un natural)");
                    int i2=in.nextInt();
                    n.setIndx1(i2);                                        //setIndex2
                    System.out.println("Inser operator (ha de ser un caràcter)");
                    String c= in.next();
                    n.setOperator(c.charAt(c.length()-1));                 //setOperator

                    System.out.println("Norma creada");
                    break;
                case 2:
                    System.out.println("Atributs de la norma creada");
                    System.out.println(n.getIndx1());                   //getIndex1
                    System.out.println(n.getIndx2());                   //getIndex2
                    System.out.println(n.getOperator());                //getOperator
                    break;
                case 0:
                    ok = false;
                    break;
            }
        }





    }
}
