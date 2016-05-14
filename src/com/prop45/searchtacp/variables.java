/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

/**
 *
 * @author Miquel Baena
 */
public class variables {
    private static boolean admin = false;
    private static boolean user = false;
    private static boolean surt = false;
    
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
    public static void setSurt() {
        surt = true;
    }
    public static boolean isSurt() {
        return surt;
    }
}
