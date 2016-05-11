package com.prop45.Test;

import com.prop45.DataBase.RelacionDataBase;
import com.prop45.Paths.Norma;
import com.prop45.Paths.Relacion;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test_RelacionDataBase {

    private RelacionDataBase rdb = new RelacionDataBase();
    private String route;
    public Test_RelacionDataBase(String s){
        route = s;
    }
    public void test(){

        Scanner in = new Scanner(System.in);
        int op;
        boolean ok = true;
        File f = new File(route);
        rdb.setRoute(f);

        ArrayList<Relacion> test = new ArrayList<>();
        while(ok){
            System.out.println("\n------------------------------\n" +
                    "TEST Relació Data Base:\n" +
                    "1: Carregar Relació Data Base (Del fitxer src\\Resources\\relacion.txt)\n" +
                    "2: Inserir una nova relació (relació poc configurable ja que ja existeix " +
                        "un test específic per a relació)\n" +
                    "3: Guardar canvis al fitxer\n" +
                    "4: Eliminar relació\n"+
                    "0: Tornar a l'inici");
            switch (op = in.nextInt()){
                case 1:
                    rdb.load();
                    System.out.println("RelacionDase cargado con exito");
                    test = rdb.getRelacions();
                    break;
                case 2:
                    System.out.println("Insert nombre");
                    String name= in.next();
                    System.out.println("Insert 1 tag (Author||Paper||Conference||Term)");
                    String tag1= in.next();
                    System.out.println("Insert otro tag (Author||Paper||Conference||Term)");
                    String tag2= in.next();
                    ArrayList<String> tags = new ArrayList<>();
                    tags.add(tag1);
                    tags.add(tag2);
                    Relacion r = new Relacion(name);
                    r.setTags(tags);
                    System.out.println("Crear nova norma per a la relació \n");
                    System.out.println("Insert index1 (ha de ser un natural)");
                    int i1 = in.nextInt();
                    System.out.println("Insert index2 (ha de ser un natural)");
                    int i2 = in.nextInt();
                    System.out.println("Insert operator (ha de ser un caràcter)");
                    String c = in.next();
                    Norma n1 = new Norma(c.charAt(c.length() - 1), i1, i2);
                    r.afegirNorma(n1);
                    System.out.println("Norma insertada con exito");
                    test.add(r);
                    break;
                case 3:
                    rdb.safe(test);
                    System.out.println("Guardado con éxito, para comprobarlo con exito mirar el " +
                            "fichero Relacion.txt en " +
                            "src/Resourcesa");
                    break;
                case 4:
                    System.out.println("Inserta posició de la relació a eliminar (ha de ser un natural)");
                    test.remove(in.nextInt());
                    break;
                case 0:
                    ok = false;
                    break;
            }
        }
    }
}
