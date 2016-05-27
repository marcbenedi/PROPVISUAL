/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import static com.prop45.searchtacp.Busquedauser.c2user;
import static com.prop45.searchtacp.Busquedauser.c3user;
import static com.prop45.searchtacp.Busquedauser.clausulasuser;
import static com.prop45.searchtacp.Busquedauser.pathuser;
import static com.prop45.searchtacp.Instrucciones.instruccions_guillem;
import static com.prop45.searchtacp.variables.getInst_Escoger_Path_Predefinido;
import static com.prop45.searchtacp.variables.getPath;
import static com.prop45.searchtacp.variables.getUsuario;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miquel Baena
 */
public class ViewPredPathuser extends javax.swing.JFrame {

    /**
     * Creates new form ViewPredPathuser
     */
    DefaultTableModel model1;
    DefaultTableModel model2;
    int filas = 0;
    public ViewPredPathuser() throws FileNotFoundException, IOException {
        initComponents();
        userlabel.setText(getUsuario());
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        FileReader ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\relacion.txt");
        BufferedReader readertxt = new BufferedReader(ftxt);
        String lineatxt =  "";
        model1=(DefaultTableModel)this.tablarelacion.getModel();
        while ((lineatxt = readertxt.readLine()) != null) {
            String n = "";
            int i=0;
            while (lineatxt.charAt(i)!='\t') {
                ++i;
            }
            ++i;
            while (lineatxt.charAt(i)!='\t') {
                n += lineatxt.charAt(i);
                ++i;
            } 
            model1.addRow(new Object[filas]);
            model1.setValueAt(n, filas, 0);
            filas++;
        }
        filas = 0; 
        ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\relacion_" + getUsuario() + ".txt");
        readertxt = new BufferedReader(ftxt);
        lineatxt =  "";
        model2=(DefaultTableModel)this.tablarelacion1.getModel();
        while ((lineatxt = readertxt.readLine()) != null) {
            String n = "";
            int i=0;
            while (lineatxt.charAt(i)!='\t') {
                ++i;
            }
            ++i;
            while (lineatxt.charAt(i)!='\t') {
                n += lineatxt.charAt(i);
                ++i;
            } 
            model2.addRow(new Object[filas]);
            model2.setValueAt(n, filas, 0);
            filas++;
        }
    }
    private void Instructionsbutton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                    
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
        jLabel1 = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        titolpredpath = new javax.swing.JLabel();
        selectedpredpathuser = new javax.swing.JTextField();
        continuepredpath = new javax.swing.JButton();
        helppredpath = new javax.swing.JButton();
        Instructionsbutton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablarelacion = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablarelacion1 = new javax.swing.JTable();
        textopredpath = new javax.swing.JLabel();
        definanodopredpath = new javax.swing.JButton();
        defineuser = new javax.swing.JComboBox<>();
        controlerrores1 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        Instructionsbutton1.setMnemonic('H');
        Instructionsbutton1.setText("Help");
        Instructionsbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instructionsbutton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Predefined Path");

        userlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userlabel.setForeground(new java.awt.Color(255, 255, 255));
        userlabel.setText("username");

        titolpredpath.setForeground(new java.awt.Color(255, 255, 255));
        titolpredpath.setText("Path escogido:");

        selectedpredpathuser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectedpredpathuser.setText("Seleccione un path predeterminado");

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
        Instructionsbutton3.setText("Cancelar");
        Instructionsbutton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Instructionsbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instructionsbutton3ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clausulas del predefined path seleccionado:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Predefined Path:");

        text.setColumns(1);
        text.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        tablarelacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Predefined Path"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablarelacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablarelacionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablarelacion);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Predefined User Paths:");

        tablarelacion1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Predefined User Paths"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablarelacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablarelacion1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablarelacion1);

        textopredpath.setForeground(new java.awt.Color(255, 255, 255));
        textopredpath.setText("*Es obligatorio definir el primer nodo");

        definanodopredpath.setText("Defina los nodos ");
        definanodopredpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definanodopredpathActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(titolpredpath)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(selectedpredpathuser, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(userlabel)
                                        .addGap(497, 497, 497)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(continuepredpath)
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addComponent(helppredpath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textopredpath)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(definanodopredpath)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(defineuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(controlerrores1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Instructionsbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userlabel)
                            .addComponent(helppredpath)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titolpredpath)
                            .addComponent(selectedpredpathuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(continuepredpath))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(definanodopredpath)
                            .addComponent(defineuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textopredpath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(controlerrores1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Instructionsbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void helppredpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helppredpathActionPerformed
        // TODO add your handling code here:
        Instrucciones ins = new Instrucciones();
        ins.setVisible(true);
        instruccions_guillem.setText(getInst_Escoger_Path_Predefinido());
    }//GEN-LAST:event_helppredpathActionPerformed

    private void Instructionsbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instructionsbutton3ActionPerformed
        // TODO add your handling code here:
        variables.primer_del_cami = true;
        variables.ultim_es_paper = false;
        variables.definiendo_pred_path = false;
        variables.valors = new ArrayList<>();
        this.setVisible(false);
    }//GEN-LAST:event_Instructionsbutton3ActionPerformed

    private void continuepredpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuepredpathActionPerformed
        // TODO add your handling code here:
        if (defineuser.getItemCount()==1) {
            variables.definiendo_pred_path = false;
            if (text.getText().equals("No te\nclausules")) clausulasuser.setText("");
            else {
                clausulasuser.setText(text.getText()+"\n");
            }
            pathuser.setForeground(Color.BLACK); 
            pathuser.setText(selectedpredpathuser.getText());
            this.setVisible(false);
        }
        else {
            controlerrores1.setText("Falta definir nodos");
            controlerrores1.setForeground(Color.red);            
        }
    }//GEN-LAST:event_continuepredpathActionPerformed

    private void tablarelacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablarelacionMouseClicked
        // TODO add your handling code here:
        defineuser.addItem("-");
        FileReader ftxt=null;
        int numaux = 1;
        try {
            String dato=String.valueOf(model1.getValueAt(tablarelacion.getSelectedRow(),0));
            selectedpredpathuser.setText(dato + "~NULL");
            text.setText(null);
            ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\relacion.txt");
            BufferedReader readertxt = new BufferedReader(ftxt);
            String lineatxt =  "";
            boolean primer = true;
            int linea = 0;
            int dat = tablarelacion.getSelectedRow();
            while ((lineatxt = readertxt.readLine()) != null) {
                String camino = "";
                String n = "";
                int i=0;
                while (lineatxt.charAt(i)!='\t') {
                    ++i;
                }
                ++i;
                while (i < lineatxt.length() && lineatxt.charAt(i)!='\t') {
                    if (linea == dat && ' ' == lineatxt.charAt(i) && ' ' == lineatxt.charAt(i+1)) ++numaux;
                    camino += lineatxt.charAt(i);
                    ++i;
                }
                ++i;
                if (linea == dat) {
                    while (i < lineatxt.length()) {
                        n = "";
                        while (i < lineatxt.length() && lineatxt.charAt(i) != '\t') {
                            n += lineatxt.charAt(i);
                            ++i;
                        }
                        ++i;
                        if (primer) {
                            text.setText(n);
                            primer = false;
                        }
                        else {
                            String auxiliar = text.getText();
                            text.setText(auxiliar + "\n" + n);
                        }
                    }          
                }
                ++linea;
            }
            linea = 0;
            String provar_una = "";
            variables.numero_items = 0;
            ++variables.numero_items;
            while (dato.length()>linea) {
                if (dato.charAt(linea) == ' ') {
                    if (dato.charAt(linea+1) == ' ') {
                        provar_una = "";
                        ++variables.numero_items;
                    }
                }
                else {
                    provar_una += dato.charAt(linea);
                }
                ++linea;
            }
            variables.num_words = variables.numero_items;
            c2user.removeAllItems();
            c2user.addItem("-");
            c3user.removeAllItems();
            c3user.addItem("-");
            for (int i=0; i<variables.numero_items ; ++i) {
                c2user.addItem(String.valueOf(i));
                c3user.addItem(String.valueOf(i));
            }
            variables.ultim_es_paper = "Paper".equals(provar_una);
            variables.valors = new ArrayList<>();
            defineuser.removeAllItems();
            defineuser.addItem("-");
            for (int i=1 ; i<numaux; ++i) {
                String aullar = Integer.toString(i);
                defineuser.addItem(aullar);
            }
            variables.index = 2;
            defineuser.setSelectedIndex(1);
            if (text.getText().equals("")) text.setText("No te\nclausules");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ftxt.close();
            } catch (IOException ex) {
                Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tablarelacionMouseClicked

    private void tablarelacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablarelacion1MouseClicked
        // TODO add your handling code here:
        defineuser.addItem("-");
        FileReader ftxt=null;
        int numaux = 1;
        try {
            String dato=String.valueOf(model2.getValueAt(tablarelacion1.getSelectedRow(),0));
            selectedpredpathuser.setText(dato + "~NULL");
            text.setText(null);
            ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\relacion_"+ getUsuario() +".txt");
            BufferedReader readertxt = new BufferedReader(ftxt);
            String lineatxt =  "";
            boolean primer = true;
            int linea = 0;
            int dat = tablarelacion1.getSelectedRow();
            while ((lineatxt = readertxt.readLine()) != null) {
                String camino = "";
                String n = "";
                int i=0;
                while (lineatxt.charAt(i)!='\t') {
                    ++i;
                }
                ++i;
                while (i < lineatxt.length() && lineatxt.charAt(i)!='\t') {
                    if (linea == dat && ' ' == lineatxt.charAt(i) && ' ' == lineatxt.charAt(i+1)) ++numaux;
                    camino += lineatxt.charAt(i);
                    ++i;
                }
                ++i;
                if (linea == dat) {
                    while (i < lineatxt.length()) {
                        n = "";
                        while (i < lineatxt.length() && lineatxt.charAt(i) != '\t') {
                            n += lineatxt.charAt(i);
                            ++i;
                        }
                        ++i;
                        if (primer) {
                            text.setText(n);
                            primer = false;
                        }
                        else {
                            String auxiliar = text.getText();
                            text.setText(auxiliar + "\n" + n);
                        }
                    }          
                }
                ++linea;
            }
            linea = 0;
            String provar_una = "";
            variables.numero_items = 0;
            ++variables.numero_items;
            while (dato.length()>linea) {
                if (dato.charAt(linea) == ' ') {
                    if (dato.charAt(linea+1) == ' ') {
                        provar_una = "";
                        ++variables.numero_items;
                    }
                }
                else {
                    provar_una += dato.charAt(linea);
                }
                ++linea;
            }
            variables.num_words = variables.numero_items;
            c2user.removeAllItems();
            c2user.addItem("-");
            c3user.removeAllItems();
            c3user.addItem("-");
            for (int i=0; i<variables.numero_items ; ++i) {
                c2user.addItem(String.valueOf(i));
                c3user.addItem(String.valueOf(i));
            }
            variables.ultim_es_paper = "Paper".equals(provar_una);
            variables.valors = new ArrayList<>();
            defineuser.removeAllItems();
            defineuser.addItem("-");
            for (int i=1 ; i<numaux; ++i) {
                String aullar = Integer.toString(i);
                defineuser.addItem(aullar);
            }
            variables.index = 2;
            defineuser.setSelectedIndex(1);
            if (text.getText().equals("")) text.setText("No te\nclausules");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ftxt.close();
            } catch (IOException ex) {
                Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tablarelacion1MouseClicked

    private void definanodopredpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definanodopredpathActionPerformed
        // TODO add your handling code here:
        variables.definiendo_pred_path = true;
        if (!defineuser.getSelectedItem().equals("-")) {
            int num_selected = defineuser.getSelectedIndex();
            variables.num_del_select = num_selected;
            String camino_aux = selectedpredpathuser.getText();
            int inaux = 1;
            String que_es = "";
            for (int i=0 ; i<camino_aux.length() ; ++i) {
                if (camino_aux.charAt(i) == ' ') {
                    if (camino_aux.charAt(i+1) == ' ') {
                        ++i;
                        ++i;
                        ++inaux;
                    }
                }
                if (inaux == num_selected) {
                    que_es += camino_aux.charAt(i);
                }
            }
            variables.primer_del_cami = variables.num_del_select == 1;
            switch (que_es) {
                case "Author":
                    try {
                        escribir_author ea = new escribir_author();
                        ea.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(ViewPredPath.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case "Paper":
                    try {
                        escribir_paper ep = new escribir_paper();
                        ep.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(ViewPredPath.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case "Conference":
                    try {
                        escribir_conference ec = new escribir_conference();
                        ec.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(ViewPredPath.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                default:
                    try {
                        escribir_term et = new escribir_term();
                        et.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(ViewPredPath.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
            }
        }        
    }//GEN-LAST:event_definanodopredpathActionPerformed

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
            try {
                new ViewPredPathuser().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Instructionsbutton1;
    private javax.swing.JButton Instructionsbutton3;
    public static javax.swing.JButton continuepredpath;
    public static javax.swing.JLabel controlerrores1;
    public static javax.swing.JButton definanodopredpath;
    public static javax.swing.JComboBox<String> defineuser;
    public static javax.swing.JButton helppredpath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTextField selectedpredpathuser;
    private javax.swing.JTable tablarelacion;
    private javax.swing.JTable tablarelacion1;
    private javax.swing.JTextArea text;
    public static javax.swing.JLabel textopredpath;
    public static javax.swing.JLabel titolpredpath;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
