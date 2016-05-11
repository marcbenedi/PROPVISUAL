package com.prop45.Test;

import com.prop45.DataBase.DataBase;

import java.io.File;
import java.util.Scanner;

public class Test_Database {

    private DataBase db = new DataBase() {
        @Override
        public boolean setRoute(File route) {
            return super.setRoute(route);
        }
    };
    private String route;
    public Test_Database(String s){
        route = s;
    }

    public void test(){

        Scanner in = new Scanner(System.in);
        int op;
        boolean ok = true;
        while(ok){
            System.out.println("\n------------------------------\n" +
                    "TEST DATABASE:\n" +
                    "1: Crear una nova Data Base\n" +
                    "2: Obternir ID\n" +
                    "3: Obtenir ruta\n" +
                    "0: Tornar a l'inici");
            switch (op = in.nextInt()){
                case 1:
                    String ruta= route;
                    if(db.setRoute(new File(ruta)))
                    {
                        System.out.println("Ruta insertada correctamente");
                    }
                    else System.out.println("Ruta NO válida");
                    break;
                case 2:
                    System.out.println("ID Database : "  + db.getId());
                    break;
                case 3:
                    System.out.println("Ruta db :  " + db.getRoute().toString());
                    break;
                case 0:
                    ok = false;
                    break;
            }
        }
    }
}