/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import static com.prop45.searchtacp.Cargando_database.bienvenidohoracio;
import static com.prop45.searchtacp.Cargando_database.exitbutton0;
import static com.prop45.searchtacp.Cargando_database.gift;
import static com.prop45.searchtacp.Cargando_database.titulo;
import static com.prop45.searchtacp.Portadaylogins.paneldinamico;
import static com.prop45.searchtacp.variables.isSurt;

/**
 *
 * @author Miquel Baena
 */
public class SearchTACP {

    /**
     * @param args the command line arguments
     */
    
    public static boolean surt = false;
    
    public static void pausa(int segons){ 
            try { 
                segons *= 1000;
                Thread.sleep(segons); 
            } catch (Exception ignored) {} 
    }
    
    public static void main(String[] args) {
        // TODO code application logic hereç
        File doc = new File("src/com/prop45/ficheros/actualuser.txt");
        doc.delete();  
        Cargando cg = new Cargando();
        cg.setVisible(true);
        bienvenidohoracio.setVisible(false);
        titulo.setVisible(false);
        gift.setVisible(false);
        exitbutton0.setVisible(false);
        pausa(1);
        Setroute sr = new Setroute();
        sr.setVisible(true); 
    }
    
}
