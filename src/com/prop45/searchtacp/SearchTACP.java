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
import static com.prop45.searchtacp.Portadaylogins.paneldinamico;

/**
 *
 * @author Miquel Baena
 */
public class SearchTACP {

    /**
     * @param args the command line arguments
     */
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
        bienvenidohoracio.setText("Leyendo base de datos");
        pausa(6);
        bienvenidohoracio.setText("Calculando page rank");
        pausa(6);
        Registrarse_Login p2 = new Registrarse_Login();
        p2.setSize(737,323);
        p2.setLocation(0,0);
        p2.setBackground(Color.WHITE);
        paneldinamico.removeAll();
        paneldinamico.add(p2, BorderLayout.CENTER);
        paneldinamico.revalidate();
        paneldinamico.repaint();        
    }
    
}
