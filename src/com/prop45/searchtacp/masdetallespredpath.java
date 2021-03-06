/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import static com.prop45.searchtacp.Instrucciones.instruccions_guillem;
import static com.prop45.searchtacp.variables.getInst_Escoger_Path_Predefinido;
import static com.prop45.searchtacp.variables.getPath;
import static com.prop45.searchtacp.variables.getUsuario;
import static com.prop45.searchtacp.variables.isAdmin;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miquel Baena
 */
public class masdetallespredpath extends javax.swing.JFrame {

    /**
     * Creates new form masdetallespredpath
     */
    DefaultTableModel model1;
    DefaultTableModel model2;
    int filas = 0;

    public masdetallespredpath() throws FileNotFoundException, IOException {
        initComponents();
        if (!isAdmin()) {
            jButton4.setVisible(false);
        }
        userlabel.setText(getUsuario());
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        FileReader ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\relacion.txt");
        BufferedReader readertxt = new BufferedReader(ftxt);
        String lineatxt = "";
        model1 = (DefaultTableModel) this.tablarelacion.getModel();
        while ((lineatxt = readertxt.readLine()) != null) {
            String n = "";
            int i = 0;
            while (lineatxt.charAt(i) != '\t') {
                ++i;
            }
            ++i;
            while (lineatxt.charAt(i) != '\t') {
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
        lineatxt = "";
        model2 = (DefaultTableModel) this.tablarelacion1.getModel();
        while ((lineatxt = readertxt.readLine()) != null) {
            String n = "";
            int i = 0;
            while (lineatxt.charAt(i) != '\t') {
                ++i;
            }
            ++i;
            while (lineatxt.charAt(i) != '\t') {
                n += lineatxt.charAt(i);
                ++i;
            }
            model2.addRow(new Object[filas]);
            model2.setValueAt(n, filas, 0);
            filas++;
        }
        ftxt.close();
        readertxt.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userlabel = new javax.swing.JLabel();
        titolpredpath = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        selectedpredpathuser = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablarelacion1 = new javax.swing.JTable();
        helppredpath = new javax.swing.JButton();
        Instructionsbutton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        borrobien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablarelacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userlabel.setForeground(new java.awt.Color(255, 255, 255));
        userlabel.setText("username");

        titolpredpath.setForeground(new java.awt.Color(255, 255, 255));
        titolpredpath.setText("Path escogido:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Predefined User Paths:");

        selectedpredpathuser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectedpredpathuser.setText("Seleccione un path predeterminado");

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

        helppredpath.setMnemonic('H');
        helppredpath.setText("Help");
        helppredpath.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        helppredpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helppredpathActionPerformed(evt);
            }
        });

        Instructionsbutton3.setMnemonic('H');
        Instructionsbutton3.setText("Cancelar");
        Instructionsbutton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jButton3.setText("Borrar user predpath seleccionado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Borrar predpath seleccionado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Predefined Path");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 482, Short.MAX_VALUE)
                                .addComponent(helppredpath, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(titolpredpath)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectedpredpathuser)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(46, 46, 46))
                                    .addComponent(Instructionsbutton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(borrobien, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                            .addComponent(selectedpredpathuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(borrobien, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Instructionsbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablarelacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablarelacion1MouseClicked

        
        
        try {
            // TODO add your handling code here:
            FileReader ftxt = null;
            int numaux = 1;
            String dato = String.valueOf(model2.getValueAt(tablarelacion1.getSelectedRow(), 0));
            selectedpredpathuser.setText(dato);
            text.setText(null);
            ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\relacion_" + getUsuario() + ".txt");
            BufferedReader readertxt = new BufferedReader(ftxt);
            String lineatxt = "";
            boolean primer = true;
            int linea = 0;
            int dat = tablarelacion1.getSelectedRow();
            while ((lineatxt = readertxt.readLine()) != null) {
                String camino = "";
                String n = "";
                int i = 0;
                while (lineatxt.charAt(i) != '\t') {
                    ++i;
                }
                ++i;
                while (i < lineatxt.length() && lineatxt.charAt(i) != '\t') {
                    if (linea == dat && ' ' == lineatxt.charAt(i) && ' ' == lineatxt.charAt(i + 1)) {
                        ++numaux;
                    }
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
                        } else {
                            String auxiliar = text.getText();
                            text.setText(auxiliar + "\n" + n);
                        }
                    }
                }
                ++linea;
            }
            if (text.getText().equals("")) {
                text.setText("No te\nclausules");
            }
            
                
            ftxt.close();               //CLOSE
            readertxt.close();          //CLOSE
        } catch (FileNotFoundException ex) {
            Logger.getLogger(masdetallespredpath.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(masdetallespredpath.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         

    }//GEN-LAST:event_tablarelacion1MouseClicked

    private void helppredpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helppredpathActionPerformed
        // TODO add your handling code here:
        Instrucciones ins = new Instrucciones();
        ins.setVisible(true);
        instruccions_guillem.setText(getInst_Escoger_Path_Predefinido());
    }//GEN-LAST:event_helppredpathActionPerformed

    private void Instructionsbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instructionsbutton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_Instructionsbutton3ActionPerformed
    private boolean isMathc(String qry, String qry_read) {
        boolean flag = false;

        int i = 0;
        int j = 0;

        while (qry_read.charAt(i) != '\t') {
            i++;
        }
        i++;
        j = i;

        while (qry_read.charAt(j) != '\t') {
            j++;
        }

        if (qry.equals(qry_read.substring(i, j))) {
            flag = true;
        }

        return flag;
    }

    private String delete_Name_Clausole(String val) {
        String q = "";

        int i = 0;
        while (val.charAt(i) != '\t') {

            i++;
        }
        i++;
        int j = i;
        while (val.charAt(j) != '\t') {

            j++;
        }
        j++;

        q = val.substring(i, --j);

        return q;
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        final char CR = (char) 0x0D;
        final char LF = (char) 0x0A;
    if(tablarelacion1.getRowCount()>0){
        try {
            String a = tablarelacion1.getValueAt(tablarelacion1.getSelectedRow(), tablarelacion1.getSelectedColumn()).toString();

            FileReader fr = new FileReader(getPath() + "\\recursos\\ficheros\\relacion_" + getUsuario() + ".txt");
            BufferedReader br = new BufferedReader(fr);
            ArrayList<String> tmp = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                if (!isMathc(a, line)) {    /// get tabella |author paper author| == line
                    tmp.add(line);
                }
                line = br.readLine();

            }
            
            br.close();
            fr.close();
           
            
            
            DefaultTableModel model3 = new DefaultTableModel();
            model3.addColumn("Predefined User Path");
            tablarelacion1.setModel(model3);

            // Append a row 
        
                for (int j = 0; j < tmp.size(); j++) {
                    model3.addRow(new Object[]{(delete_Name_Clausole(tmp.get(j).toString()))});

                }
                FileWriter fw = new FileWriter(getPath() + "\\recursos\\ficheros\\relacion_" + getUsuario() + ".txt");
                BufferedWriter bw = new BufferedWriter(fw);

                for (int j = 0; j < tmp.size(); j++) {
                    bw.write(tmp.get(j).toString()+CR+LF);
                }
                
                bw.close();
                fw.close();
                
                //filas--;
            
           

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

 final char CR = (char) 0x0D;
        final char LF = (char) 0x0A;

        if(tablarelacion.getRowCount()>0){
        try {
            String a = tablarelacion.getValueAt(tablarelacion.getSelectedRow(), tablarelacion.getSelectedColumn()).toString();

            FileReader fr = new FileReader(getPath() + "\\recursos\\ficheros\\relacion.txt");
            BufferedReader br = new BufferedReader(fr);
            ArrayList<String> tmp = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                if (!isMathc(a, line)) {    /// get tabella |author paper author| == line
                    tmp.add(line);
                }
                line = br.readLine();

            }
            
            br.close();
            fr.close();
           
            
            
            DefaultTableModel model3 = new DefaultTableModel();
            model3.addColumn("Predefined User Path");
            tablarelacion.setModel(model3);

            // Append a row 
        
                for (int j = 0; j < tmp.size(); j++) {
                    model3.addRow(new Object[]{(delete_Name_Clausole(tmp.get(j).toString()))});

                }
                FileWriter fw = new FileWriter(getPath() + "\\recursos\\ficheros\\relacion.txt");
                BufferedWriter bw = new BufferedWriter(fw);

                for (int j = 0; j < tmp.size(); j++) {
                    bw.write(tmp.get(j).toString()+CR+LF);
                }
                
                bw.close();
                fw.close();
                
                //filas--;
            
           

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        }

/*
        BufferedReader br = null;
        try {
            // TODO add your handling code here:
            File inFile = new File(getPath() + "\\recursos\\ficheros\\relacion.txt");
            File tempFile = new File(getPath() + "\\recursos\\ficheros\\relacionaux.txt");
            br = new BufferedReader(new FileReader(getPath() + "\\recursos\\ficheros\\relacion.txt"));
            int cualborro = tablarelacion.getSelectedRow();
            String line = null;
            int n = 0;
            boolean noborra = true;
            try (PrintWriter pw = new PrintWriter(new FileWriter(tempFile))) {
                line = null;
                while ((line = br.readLine()) != null) {
                    if (n != cualborro) {
                        pw.println(line);
                        pw.flush();
                    } else {
                        noborra = false;
                    }
                    ++n;
                }
            }
            if (!noborra) {
                borrobien.setVisible(true);
                borrobien.setForeground(Color.green);
                borrobien.setText("Borro correctamente el predpath nº " + ++cualborro + " universal");
            } else {
                borrobien.setVisible(true);
                borrobien.setForeground(Color.red);
                borrobien.setText("Error al borrar el predpath nº" + ++cualborro + " universal");
            }
            br.close();
            inFile.delete();
            tempFile.renameTo(inFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(masdetallespredpath.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(masdetallespredpath.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        */
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablarelacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablarelacionMouseClicked
        // TODO add your handling code here:
        FileReader ftxt = null;
        int numaux = 1;
        try {
            String dato = String.valueOf(model1.getValueAt(tablarelacion.getSelectedRow(), 0));
            selectedpredpathuser.setText(dato);
            text.setText(null);
            ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\relacion.txt");
            BufferedReader readertxt = new BufferedReader(ftxt);
            String lineatxt = "";
            boolean primer = true;
            int linea = 0;
            int dat = tablarelacion.getSelectedRow();
            while ((lineatxt = readertxt.readLine()) != null) {
                String camino = "";
                String n = "";
                int i = 0;
                while (lineatxt.charAt(i) != '\t') {
                    ++i;
                }
                ++i;
                while (i < lineatxt.length() && lineatxt.charAt(i) != '\t') {
                    if (linea == dat && ' ' == lineatxt.charAt(i) && ' ' == lineatxt.charAt(i + 1)) {
                        ++numaux;
                    }
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
                        } else {
                            String auxiliar = text.getText();
                            text.setText(auxiliar + "\n" + n);
                        }
                    }
                }
                ++linea;
            }
            if (text.getText().equals("")) {
                text.setText("No te\nclausules");
            }
            ftxt.close();
            readertxt.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPredPathuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablarelacionMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(masdetallespredpath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masdetallespredpath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masdetallespredpath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masdetallespredpath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new masdetallespredpath().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(masdetallespredpath.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Instructionsbutton3;
    public static javax.swing.JLabel borrobien;
    public static javax.swing.JButton helppredpath;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTextField selectedpredpathuser;
    private javax.swing.JTable tablarelacion;
    private javax.swing.JTable tablarelacion1;
    private javax.swing.JTextArea text;
    public static javax.swing.JLabel titolpredpath;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
