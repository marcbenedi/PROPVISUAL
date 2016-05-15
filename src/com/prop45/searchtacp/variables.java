/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import com.prop45.Consulta.Consulta;
import com.prop45.DataBase.GraphDataBase;
import com.prop45.DataBase.RelacionDataBase;
import com.prop45.Graph.Graph;

/**
 *
 * @author Miquel Baena
 */
public class variables {
    private static boolean admin = true;
    private static String usuario = "";
    private static boolean user = false;
    private static boolean surt = false;
    private static String path = "";
    public static Consulta c;
    public static Graph grafo;
    public static GraphDataBase gdb;
    public static RelacionDataBase rdb;
    private static int id = 0;
    
    public static void setAdmin() {
        admin = true;
    }
    public static void setfalseAdmin() {
        admin = true;
    }
    public static boolean isAdmin() {
        return admin;
    }   
    public static void setUser() {
        user = true;
    }
    public static boolean isUser() {
        return user;
    }
    public static void setUsuario(String a) {
        usuario = a;
    }
    public static String getUsuario() {
        return usuario;
    }
     public static void setPath(String a) {
        path = a;
    }
    public static String getPath() {
        return path;
    }
    public static void setSurt() {
        surt = true;
    }
    public static boolean isSurt() {
        return surt;
    }
    public static void setNextid(int i) {
        id = i;
    } 
    public static int getNextid() {
    return id;
    }
}
