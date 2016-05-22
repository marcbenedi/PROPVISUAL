/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import com.prop45.DataBase.GraphDataBase;
import com.prop45.DataBase.RelacionDataBase;
import com.prop45.Graph.Graph;
import static com.prop45.searchtacp.Cargando_database.bienvenidohoracio;
import static com.prop45.searchtacp.Cargando_database.exitbutton0;
import static com.prop45.searchtacp.Cargando_database.terminal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import static com.prop45.searchtacp.Portadaylogins.Logo;
import static com.prop45.searchtacp.Portadaylogins.paneldinamico;
import static com.prop45.searchtacp.variables.gdb;
import static com.prop45.searchtacp.variables.getPath;
import static com.prop45.searchtacp.variables.grafo;
import static com.prop45.searchtacp.variables.rdb;
import static com.prop45.searchtacp.variables.setNextid;
import static com.prop45.searchtacp.variables.setPath;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Miquel Baena
 */
public class SearchTACP {

    /**
     */
    
    public static boolean surt = false;
    
    public static void pausa(int segons){ 
            try { 
                segons *= 1000;
                Thread.sleep(segons); 
            } catch (Exception ignored) {} 
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here:
        File file1 = new File("").getAbsoluteFile();
        String route = file1.toString();
        setPath(route);
        Cargando cg = new Cargando();
        cg.setVisible(true);
        ImageIcon Logo_image = new ImageIcon(route + "\\recursos\\Images\\descarga.png");
        Icon icono_logo = new ImageIcon(Logo_image.getImage().getScaledInstance(266, 157, Image.SCALE_DEFAULT));
        Logo.setIcon(icono_logo);
        bienvenidohoracio.setVisible(true);
        exitbutton0.setVisible(true);
        FileReader file = null;
        try {
            // TODO add your handling code here:
            file = new FileReader(getPath() + "\\recursos\\ficheros\\seg_id.txt");
            BufferedReader reader = new BufferedReader(file);
            String line =  reader.readLine();
            String num_id = "";
            int numero;
            if (line != null) {
                num_id = line.substring(0, line.length());
            }   
            file.close();
            numero = Integer.parseInt(num_id);
            setNextid(numero);
            File f = new File(getPath() + "\\recursos\\ficheros\\seg_id.txt");
            f = new File(getPath() + "\\recursos\\ficheros");
            gdb = new GraphDataBase();
            rdb = new RelacionDataBase();
            grafo = new Graph();
            gdb.setRoute(f);            
            rdb.setRoute(f);
            grafo = gdb.load();
            String salida = terminal.getText();
            terminal.setText(salida + "Cargando paths predeterminados\n");
            int indice_ultima_linea = terminal.getDocument().getLength();
            terminal.setCaretPosition(indice_ultima_linea);
            rdb.load();
            salida = terminal.getText();
            terminal.setText(salida + "100.00%\n\n");
            indice_ultima_linea = terminal.getDocument().getLength();
            terminal.setCaretPosition(indice_ultima_linea);
            bienvenidohoracio.setText("Calculando Page Rank...");
            salida = terminal.getText();
            indice_ultima_linea = terminal.getDocument().getLength();
            terminal.setCaretPosition(indice_ultima_linea);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cargando_database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cargando_database.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Cargando_database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //grafo.actualitzarRelevanciaGraph();
        String salida = terminal.getText();
        int indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        terminal.setText(salida + "Enjoy the application (SearchTACP)\n\n");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        pausa(2);
        Registrarse_Login p1 = new Registrarse_Login();
        p1.setSize(737,323);
        p1.setLocation(0,0);
        p1.setBackground(Color.WHITE);
        paneldinamico.removeAll();
        paneldinamico.add(p1, BorderLayout.CENTER);
        paneldinamico.revalidate();
        paneldinamico.repaint();
    }
    
}
