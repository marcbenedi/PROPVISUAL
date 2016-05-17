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
    private static boolean admin = false;
    private static String usuario = "";
    private static boolean user = false;
    private static boolean surt = false;
    private static String path = "";
    public static Consulta c;
    public static Graph grafo;
    public static GraphDataBase gdb;
    public static RelacionDataBase rdb;
    public static RelacionDataBase userrdb;
    private static int id = 0;
    private static boolean guardat = true;
    
    public static boolean isNumeric(String str)  {  
      try  
      {  
        int d = Integer.parseInt(str);  
      }  
      catch(NumberFormatException nfe)  
      {  
        return false;  
      }  
      return true;  
    }    
    public static void setAdmin() {
        admin = true;
    }
    public static void setfalseAdmin() {
        admin = false;
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
    public static void Cambisnoguardats() {
        guardat = false;
    }
    public static void Guardat() {
        guardat = true;
    }
    public static boolean isGuardat() {
        return guardat;
    }
}
