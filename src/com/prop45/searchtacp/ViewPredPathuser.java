/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import static com.prop45.searchtacp.Busquedauser.pathuser;
import static com.prop45.searchtacp.Instrucciones.instruccions_guillem;
import static com.prop45.searchtacp.variables.getPath;
import static com.prop45.searchtacp.variables.getUsuario;
import static com.prop45.searchtacp.variables.isAdmin;
import static com.prop45.searchtacp.variables.isNumeric;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miquel Baena
 */
public class ViewPredPathuser extends javax.swing.JFrame {

    /**
     * Creates new form ViewPredPathuser
     */
    private static int num_max_mis = 0;
    private static int num_max_uni = 0;
    public ViewPredPathuser() {
        FileReader file = null;
        try {
            initComponents();
            wnu.setVisible(false);
            wnm.setVisible(false);
            text.setEditable(false);
            text1.setEditable(false);
            this.setLocationRelativeTo(null);
            this.getContentPane().setBackground(Color.BLACK);
            selectedpredpath.setEditable(false);
            userlabel.setText(getUsuario());
            if (!isAdmin()) {
                duppnbutton.setVisible(false);
                duppn.setVisible(false);
            }
            String textoaux ="";
            file = new FileReader(getPath() + "\\recursos\\ficheros\\relacion_" + getUsuario() + ".txt");
            BufferedReader reader = new BufferedReader(file);
            String line =  reader.readLine();
            int iaux = 1;
            while (line != null) {
                int i = 0;
                textoaux += iaux + ".";
                while (line.charAt(i)!='\t') {
                    textoaux += line.charAt(i);
                    ++i;
                }
                ++i;
                textoaux += ": ";
                while (i<line.length() && line.charAt(i)!='\t') {
                    if (line.charAt(i)==' ') {
                        textoaux += " - ";
                    }
                    else {
                        textoaux += line.charAt(i);
                    }
                    ++i;
                }
                ++i;
                int iaux2 = 1;
                if (i<line.length()) {
                    textoaux += "\n   Clausulas:";
                }
                else {
                    textoaux += "\n   No tiene ninguna clausula definida";
                }
                while (i<line.length()) {
                    textoaux += "\n";
                    
                    for (int j=0 ; j<13 ; ++j) {
                        textoaux += "  ";
                    }
                    int iaux3 = i;
                    if (i<line.length()) {
                        textoaux += "c" + iaux2 + ": ";
                    }                    
                    while (i<line.length() && line.charAt(i)!='\t') {
                        textoaux += line.charAt(i);
                        ++i;
                    }
                    ++iaux2;
                    ++i;
                }
                textoaux += "\n\n";
                line = reader.readLine();
                ++iaux;
            }   
            num_max_uni = iaux-1;
            text1.setText(textoaux);
            file = new FileReader("C:\\Users\\Miquel Baena\\Documents\\NetBeansProjects\\SearchTACP\\dist\\recursos\\ficheros\\relacion_miquel.txt");
            reader = new BufferedReader(file);
            line =  reader.readLine();
            textoaux ="";
            iaux = 1;
            while (line != null) {
                int i = 0;
                textoaux += iaux + ".";
                while (line.charAt(i)!='\t') {
                    textoaux += line.charAt(i);
                    ++i;
                }
                ++i;
                textoaux += ": ";
                while (i<line.length() && line.charAt(i)!='\t') {
                    if (line.charAt(i)==' ') {
                        textoaux += " - ";
                    }
                    else {
                        textoaux += line.charAt(i);
                    }
                    ++i;
                }
                ++i;
                int iaux2 = 1;
                if (i<line.length()) {
                    textoaux += "\n   Clausulas:";
                }
                else {
                    textoaux += "\n   No tiene ninguna clausula definida";
                }
                while (i<line.length()) {
                    textoaux += "\n";
                    
                    for (int j=0 ; j<13 ; ++j) {
                        textoaux += "  ";
                    }
                    int iaux3 = i;
                    if (i<line.length()) {
                        textoaux += "c" + iaux2 + ": ";
                    }                    
                    while (i<line.length() && line.charAt(i)!='\t') {
                        textoaux += line.charAt(i);
                        ++i;
                    }
                    ++iaux2;
                    ++i;
                }
                textoaux += "\n\n";
                line = reader.readLine();
                ++iaux;
            }
            num_max_mis = iaux-1;
            text.setText(textoaux);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void Instructionsbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instructionsbutton1ActionPerformed
        // TODO add your handling code here:
        Instrucciones ins = new Instrucciones();
        ins.setVisible(true);
        instruccions_guillem.setText("soc viewpredpathuser");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        Instructionsbutton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        dmppnbotton = new javax.swing.JButton();
        dmppn = new javax.swing.JTextField();
        emppnbutton = new javax.swing.JButton();
        emppn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text1 = new javax.swing.JTextArea();
        duppnbutton = new javax.swing.JButton();
        duppn = new javax.swing.JTextField();
        euppnbutton = new javax.swing.JButton();
        euppn = new javax.swing.JTextField();
        titolpredpath = new javax.swing.JLabel();
        selectedpredpath = new javax.swing.JTextField();
        continuepredpath = new javax.swing.JButton();
        helppredpath = new javax.swing.JButton();
        Instructionsbutton3 = new javax.swing.JButton();
        wnm = new javax.swing.JLabel();
        wnu = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        Instructionsbutton1.setMnemonic('H');
        Instructionsbutton1.setText("Help");
        Instructionsbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instructionsbutton1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mis Predefined Path:");

        text.setColumns(20);
        text.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        dmppnbotton.setMnemonic('D');
        dmppnbotton.setText("Eliminar Pred Path");
        dmppnbotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dmppnbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmppnbottonActionPerformed(evt);
            }
        });

        dmppn.setForeground(new java.awt.Color(153, 153, 153));
        dmppn.setText("num. predpath");
        dmppn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dmppnMouseClicked(evt);
            }
        });
        dmppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmppnActionPerformed(evt);
            }
        });

        emppnbutton.setMnemonic('D');
        emppnbutton.setText("Escoge path");
        emppnbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emppnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emppnbuttonActionPerformed(evt);
            }
        });

        emppn.setForeground(new java.awt.Color(153, 153, 153));
        emppn.setText("num. predpath");
        emppn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emppnMouseClicked(evt);
            }
        });
        emppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emppnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Predefined Path");

        userlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userlabel.setForeground(new java.awt.Color(255, 255, 255));
        userlabel.setText("username");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Predefined Path (universales):");

        text1.setColumns(20);
        text1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        text1.setRows(5);
        jScrollPane2.setViewportView(text1);

        duppnbutton.setMnemonic('D');
        duppnbutton.setText("Eliminar Pred Path");
        duppnbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        duppnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duppnbuttonActionPerformed(evt);
            }
        });

        duppn.setForeground(new java.awt.Color(153, 153, 153));
        duppn.setText("num. predpath");
        duppn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                duppnMouseClicked(evt);
            }
        });
        duppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duppnActionPerformed(evt);
            }
        });

        euppnbutton.setMnemonic('D');
        euppnbutton.setText("Escoge path");
        euppnbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        euppnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euppnbuttonActionPerformed(evt);
            }
        });

        euppn.setForeground(new java.awt.Color(153, 153, 153));
        euppn.setText("num. predpath");
        euppn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                euppnMouseClicked(evt);
            }
        });
        euppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euppnActionPerformed(evt);
            }
        });

        titolpredpath.setForeground(new java.awt.Color(255, 255, 255));
        titolpredpath.setText("Path escogido:");

        selectedpredpath.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectedpredpath.setText("Seleccione un path predeterminado");

        continuepredpath.setText("Continuar");
        continuepredpath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuepredpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuepredpathActionPerformed(evt);
            }
        });

        helppredpath.setMnemonic('H');
        helppredpath.setText("Help");
        helppredpath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helppredpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helppredpathActionPerformed(evt);
            }
        });

        Instructionsbutton3.setMnemonic('H');
        Instructionsbutton3.setText("Exit");
        Instructionsbutton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Instructionsbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instructionsbutton3ActionPerformed(evt);
            }
        });

        wnm.setForeground(new java.awt.Color(255, 0, 0));
        wnm.setText("Wrong number!");

        wnu.setForeground(new java.awt.Color(255, 0, 0));
        wnu.setText("Wrong number!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(emppnbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emppn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(wnm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dmppnbotton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dmppn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(euppnbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(euppn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wnu)
                                .addGap(76, 76, 76)
                                .addComponent(duppnbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(duppn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(497, 497, 497))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(titolpredpath)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(selectedpredpath, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(userlabel)
                                                .addGap(497, 497, 497)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(helppredpath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(continuepredpath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(259, 259, 259)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(554, 554, 554)
                        .addComponent(Instructionsbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userlabel)
                            .addComponent(helppredpath))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titolpredpath)
                            .addComponent(selectedpredpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(continuepredpath))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dmppnbotton)
                            .addComponent(dmppn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emppnbutton)
                            .addComponent(emppn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wnm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duppnbutton)
                            .addComponent(duppn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(euppnbutton)
                            .addComponent(euppn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wnu))
                        .addGap(18, 18, 18)))
                .addComponent(Instructionsbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dmppnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmppnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dmppnActionPerformed

    private void emppnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emppnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emppnActionPerformed

    private void duppnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duppnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duppnActionPerformed

    private void euppnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euppnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_euppnActionPerformed


    private void helppredpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helppredpathActionPerformed
        // TODO add your handling code here:
        Instrucciones i = new Instrucciones();
        i.setVisible(true);
    }//GEN-LAST:event_helppredpathActionPerformed

    private void Instructionsbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instructionsbutton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_Instructionsbutton3ActionPerformed

    private void emppnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emppnbuttonActionPerformed
        // TODO add your handling code here:
        if (isNumeric(emppn.getText())) {
            int num = Integer.parseInt(emppn.getText());
            if (num > num_max_mis) {
                wnm.setVisible(true);
            }
            else {
                try {
                    emppn.setForeground(Color.gray);
                    emppn.setText("num. predpath");
                    wnm.setVisible(false);
                    String texto = emppn.getText();
                    wnm.setVisible(false);
                    String path_used = "";
                    FileReader file = null;
                    file = new FileReader(getPath() + "\\recursos\\ficheros\\relacion_" + getUsuario() + ".txt");
                    BufferedReader reader = new BufferedReader(file);
                    String line =  reader.readLine();
                    int iaux = 1;
                    while (line != null || iaux <= (num+1)) {
                        if (iaux == num) {
                            int i = 0;
                            while (line.charAt(i)!='\t') {
                                ++i;
                            }
                            ++i;
                            while (i<line.length() && line.charAt(i)!='\t') {
                                if (line.charAt(i)==' ') {
                                    path_used += " - ";
                                }
                                else {
                                    path_used += line.charAt(i);
                                }
                                ++i;
                            }
                            selectedpredpath.setText(path_used);
                        }
                        line = reader.readLine();
                        ++iaux;
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            wnm.setVisible(true);
        }
    }//GEN-LAST:event_emppnbuttonActionPerformed

    private void dmppnbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmppnbottonActionPerformed
        // TODO add your handling code here:
        if (isNumeric(dmppn.getText())) {
            int num = Integer.parseInt(dmppn.getText());
            if (num > num_max_mis) {
                wnm.setVisible(true);
            }
            else {
                try {
                    dmppn.setForeground(Color.gray);
                    dmppn.setText("num. predpath");
                    wnm.setVisible(false);
                    String texto = dmppn.getText();
                    wnm.setVisible(false);
                    String path_used = "";
                    String textoaux ="";
                    FileReader file = null;
                    file = new FileReader(getPath() + "\\recursos\\ficheros\\relacion_" + getUsuario() + ".txt");
                    BufferedReader reader = new BufferedReader(file);
                    String line =  reader.readLine();
                    int iaux = 1;
                    while (line != null) {
                        if (iaux != num) {
                            int i = 0;
                            textoaux += iaux + ".";
                            while (line.charAt(i)!='\t') {
                                textoaux += line.charAt(i);
                                ++i;
                            }
                            ++i;
                            textoaux += ": ";                    
                            while (i<line.length() && line.charAt(i)!='\t') {
                                if (line.charAt(i)==' ') {
                                    textoaux += " - ";
                                }
                                else {
                                    textoaux += line.charAt(i);
                                }
                                ++i;
                            }
                            ++i;
                            int iaux2 = 1;
                            if (i<line.length()) {
                                textoaux += "\n   Clausulas:";
                            }
                            else {
                                textoaux += "\n   No tiene ninguna clausula definida";
                            }
                            while (i<line.length()) {
                                textoaux += "\n";
                                
                                for (int j=0 ; j<13 ; ++j) {
                                    textoaux += "  ";
                                }
                                int iaux3 = i;
                                if (i<line.length()) {
                                    textoaux += "c" + iaux2 + ": ";
                                }
                                while (i<line.length() && line.charAt(i)!='\t') {
                                    textoaux += line.charAt(i);
                                    ++i;
                                }
                                ++iaux2;
                                ++i;
                            }
                            textoaux += "\n\n";
                        }
                        line = reader.readLine();
                        ++iaux;
                    }
                    num_max_mis = iaux;
                    text.setText(textoaux);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            wnm.setVisible(true);
        }
    }//GEN-LAST:event_dmppnbottonActionPerformed

    private void euppnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euppnbuttonActionPerformed
        // TODO add your handling code here:
        if (isNumeric(euppn.getText())) {
            int num = Integer.parseInt(euppn.getText());
            if (num > num_max_uni) {
                wnu.setVisible(true);
            }
           else {
                try {
                    euppn.setForeground(Color.gray);
                    euppn.setText("num. predpath");
                    wnu.setVisible(false);
                    String texto = euppn.getText();
                    wnu.setVisible(false);
                    String path_used = "";
                    FileReader file = null;
                    file = new FileReader(getPath() + "\\recursos\\ficheros\\relacion.txt");
                    BufferedReader reader = new BufferedReader(file);
                    String line =  reader.readLine();
                    int iaux = 1;
                    while (line != null || iaux <= (num+1)) {
                        if (iaux == num) {
                            int i = 0;
                            while (line.charAt(i)!='\t') {
                                ++i;
                            }
                            ++i;
                            while (i<line.length() && line.charAt(i)!='\t') {
                                if (line.charAt(i)==' ') {
                                    path_used += " - ";
                                }
                                else {
                                    path_used += line.charAt(i);
                                }
                                ++i;
                            }
                            selectedpredpath.setText(path_used);
                        }
                        line = reader.readLine();
                        ++iaux;
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            wnu.setVisible(true);
        }
    }//GEN-LAST:event_euppnbuttonActionPerformed

    private void duppnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duppnbuttonActionPerformed
        // TODO add your handling code here:
        if (isNumeric(duppn.getText())) {
            int num = Integer.parseInt(duppn.getText());
            if (num > num_max_uni) {
                wnu.setVisible(true);
            }
            else {
                try {
                    duppn.setForeground(Color.gray);
                    duppn.setText("num. predpath");
                    wnu.setVisible(false);
                    String texto = duppn.getText();
                    wnu.setVisible(false);
                    String path_used = "";
                    String textoaux ="";
                    FileReader file = null;
                    file = new FileReader(getPath() + "\\recursos\\ficheros\\relacion.txt");
                    BufferedReader reader = new BufferedReader(file);
                    String line =  reader.readLine();
                    int iaux = 1;
                    while (line != null) {
                        if (iaux != num) {
                            int i = 0;
                            textoaux += iaux + ".";
                            while (line.charAt(i)!='\t') {
                                textoaux += line.charAt(i);
                                ++i;
                            }
                            ++i;
                            textoaux += ": ";                    
                            while (i<line.length() && line.charAt(i)!='\t') {
                                if (line.charAt(i)==' ') {
                                    textoaux += " - ";
                                }
                                else {
                                    textoaux += line.charAt(i);
                                }
                                ++i;
                            }
                            ++i;
                            int iaux2 = 1;
                            if (i<line.length()) {
                                textoaux += "\n   Clausulas:";
                            }
                            else {
                                textoaux += "\n   No tiene ninguna clausula definida";
                            }
                            while (i<line.length()) {
                                textoaux += "\n";
                                
                                for (int j=0 ; j<13 ; ++j) {
                                    textoaux += "  ";
                                }
                                int iaux3 = i;
                                if (i<line.length()) {
                                    textoaux += "c" + iaux2 + ": ";
                                }
                                while (i<line.length() && line.charAt(i)!='\t') {
                                    textoaux += line.charAt(i);
                                    ++i;
                                }
                                ++iaux2;
                                ++i;
                            }
                            textoaux += "\n\n";
                        }
                        line = reader.readLine();
                        ++iaux;
                    }
                    num_max_uni = iaux;
                    text1.setText(textoaux);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            wnm.setVisible(true);
        }
    }//GEN-LAST:event_duppnbuttonActionPerformed

    private void emppnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emppnMouseClicked
        // TODO add your handling code here:
        if (emppn.getText().equals("num. predpath")){
            emppn.setText(null);
            emppn.setForeground(Color.black);
        }
    }//GEN-LAST:event_emppnMouseClicked

    private void euppnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euppnMouseClicked
        // TODO add your handling code here:
        if (euppn.getText().equals("num. predpath")){
            euppn.setText(null);
            euppn.setForeground(Color.black);
        }
    }//GEN-LAST:event_euppnMouseClicked

    private void dmppnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmppnMouseClicked
        // TODO add your handling code here:
        if (dmppn.getText().equals("num. predpath")) {
            dmppn.setForeground(Color.BLACK);
            dmppn.setText(null);
        }
    }//GEN-LAST:event_dmppnMouseClicked

    private void duppnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duppnMouseClicked
        // TODO add your handling code here:
        if (duppn.getText().equals("num. predpath")){
            duppn.setText(null);
            duppn.setForeground(Color.black);
        }
    }//GEN-LAST:event_duppnMouseClicked

    private void continuepredpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuepredpathActionPerformed
        // TODO add your handling code here:
        pathuser.setForeground(Color.BLACK); 
        pathuser.setText(selectedpredpath.getText());
        this.setVisible(false);
    }//GEN-LAST:event_continuepredpathActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPredPathuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewPredPathuser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Instructionsbutton1;
    private javax.swing.JButton Instructionsbutton3;
    public static javax.swing.JButton continuepredpath;
    public static javax.swing.JTextField dmppn;
    public static javax.swing.JButton dmppnbotton;
    public static javax.swing.JTextField duppn;
    public static javax.swing.JButton duppnbutton;
    public static javax.swing.JTextField emppn;
    public static javax.swing.JButton emppnbutton;
    public static javax.swing.JTextField euppn;
    public static javax.swing.JButton euppnbutton;
    public static javax.swing.JButton helppredpath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField selectedpredpath;
    private javax.swing.JTextArea text;
    private javax.swing.JTextArea text1;
    public static javax.swing.JLabel titolpredpath;
    private javax.swing.JLabel userlabel;
    private javax.swing.JLabel wnm;
    private javax.swing.JLabel wnu;
    // End of variables declaration//GEN-END:variables
}
