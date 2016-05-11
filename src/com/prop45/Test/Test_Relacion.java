package com.prop45.Test;

import com.prop45.Paths.Norma;
import com.prop45.Paths.Relacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Relacion {
    private Relacion r;

    public void test() {

        Scanner in = new Scanner(System.in);
        int op;
        boolean ok = true;
        Norma norm = new Norma();
        while(ok){
            System.out.println("\n------------------------------\n" +
                    "TEST RELACIÓ:\n" +
                    "1: Crear una nova Relació\n" +
                    "2: Mostrar valors relació. (Para usar esto antes se tiene que Crear una relacion.)\n" +
                    "3: Eliminar última norma creada\n" +
                    "0: Tornar a l'inici");
            switch (op = in.nextInt()){
                case 1:
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
                    break;
                case 2:
                    System.out.println("Imprimiendo valores de la relació creada");


                        System.out.println(r.getName());                    //getName
                        System.out.print(r.getTags().toString() + "\n");      //getTag




                    ArrayList<Norma> n = r.getNormas();
                    for (Norma na : n) {
                        System.out.println(na.getIndx1() + " " + na.getIndx2() + " " + na.getOperator());
                    }
                    break;
                case 3:
                    r.eliminarNorma(norm);
                    System.out.println("Eliminada norma que se habia insetado con exito");       //eliminarNorma(Norma n );
                    break;
                case 0:
                    ok = false;
                    break;
            }
        }
    }
}
