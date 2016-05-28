/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import static com.prop45.searchtacp.Busqueda.c2;
import static com.prop45.searchtacp.Busqueda.c3;
import java.awt.Color;
import static com.prop45.searchtacp.Busqueda.pathpublic;
import static com.prop45.searchtacp.Busquedauser.c2user;
import static com.prop45.searchtacp.Busquedauser.c3user;
import static com.prop45.searchtacp.Busquedauser.pathuser;
import static com.prop45.searchtacp.ViewPredPath.controlerrores;
import static com.prop45.searchtacp.ViewPredPath.define;
import static com.prop45.searchtacp.ViewPredPath.selectedpredpath;
import static com.prop45.searchtacp.ViewPredPathuser.controlerrores1;
import static com.prop45.searchtacp.ViewPredPathuser.defineuser;
import static com.prop45.searchtacp.ViewPredPathuser.selectedpredpathuser;
import static com.prop45.searchtacp.variables.getPath;
import static com.prop45.searchtacp.variables.isUser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miquel Baena
 */
public class escribir_term extends javax.swing.JFrame {

    /**
     * Creates new form escribir_term
     */
    
    DefaultTableModel model;
    int filas = 0;
    
    public escribir_term() throws FileNotFoundException, IOException {
        initComponents();
        buscador.requestFocus();
        if (variables.primer_del_cami) {
            escoge.removeAllItems();
            escoge.addItem("Definir");
        }
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        nombreterm.setEditable(false);
        BufferedReader readertxt;
        try (FileReader ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\term.txt")) {
            readertxt = new BufferedReader(ftxt);
            String lineatxt =  "";
            model=(DefaultTableModel)this.tablaterm.getModel();
            while ((lineatxt = readertxt.readLine()) != null && filas < 150) {
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
                model.addRow(new Object[filas]);
                model.setValueAt(n, filas, 0);
                filas++;
            }   filas = 0;
        }
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

        error = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();
        escoge = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        nombreterm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaterm = new javax.swing.JTable();
        error1 = new javax.swing.JLabel();

        error.setForeground(new java.awt.Color(255, 0, 0));

        setTitle("Añadir Term");

        escoge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Definir", "Definir" }));
        escoge.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                escogeItemStateChanged(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setMnemonic('A');
        jButton1.setText("Añadir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setMnemonic('C');
        jButton2.setText("Cancel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablaterm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name Term"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaterm.setShowVerticalLines(false);
        tablaterm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablatermMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaterm);

        error1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscador, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(nombreterm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(escoge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton1))
                            .addComponent(jButton4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreterm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escoge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String busquedatxt = buscador.getText();
        while(model.getRowCount()>0)model.removeRow(0);
        if (!"".equals(busquedatxt)) {
            try {
                FileReader ftxt = null;
                ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\term.txt");
                BufferedReader readertxt = new BufferedReader(ftxt);
                String lineatxt =  "";
                model=(DefaultTableModel)this.tablaterm.getModel();
                int tamaño_b = busquedatxt.length();
                while ((lineatxt = readertxt.readLine()) != null && filas < 150) {
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
                    if (n.length()>= tamaño_b && busquedatxt.equals(n.substring(0,tamaño_b))) {
                        model.addRow(new Object[filas]);
                        model.setValueAt(n, filas, 0);
                        filas++;
                    }
                }
                filas = 0;
                ftxt.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(escribir_term.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(escribir_term.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 
        else {
            FileReader ftxt = null;
            try {
                ftxt = new FileReader(getPath() + "\\recursos\\ficheros\\term.txt");
                BufferedReader readertxt = new BufferedReader(ftxt);
                String lineatxt =  "";
                model=(DefaultTableModel)this.tablaterm.getModel();
                while ((lineatxt = readertxt.readLine()) != null && filas < 150) {
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
                    model.addRow(new Object[filas]);
                    model.setValueAt(n, filas, 0);
                    filas++;
                }   filas = 0;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(escribir_term.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(escribir_term.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    ftxt.close();
                } catch (IOException ex) {
                    Logger.getLogger(escribir_term.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int seleccion = escoge.getSelectedIndex();
        if (!variables.definiendo_pred_path){
            if (variables.primer_del_cami) {
                if (!nombreterm.getText().equals("")) {
                        if (isUser()) {
                            pathuser.setForeground(Color.BLACK);
                            if (pathuser.getText().equals("Escribe tu path")){
                                String p;
                                p = "Term~";
                                p += nombreterm.getText();
                                pathuser.setText(p);
                            }
                            else {
                                String p = pathuser.getText();
                                p += "  ";
                                p += "Term~";
                                p += nombreterm.getText();
                                pathuser.setText(p);
                            }
                            c2user.addItem(String.valueOf(variables.num_words));
                            c3user.addItem(String.valueOf(variables.num_words));
                        }
                        else {
                            pathpublic.setForeground(Color.BLACK);
                            if (pathpublic.getText().equals("Escribe tu path")){
                                String p;
                                p = "Term~";
                                p += nombreterm.getText();
                                pathpublic.setText(p);
                            }
                            else {
                                String p = pathpublic.getText();
                                p += "  ";
                                p += "Term~";
                                p += nombreterm.getText();
                                pathpublic.setText(p);
                            }
                            c2.addItem(String.valueOf(variables.num_words));
                            c3.addItem(String.valueOf(variables.num_words));
                        }
                        this.setVisible(false);
                        variables.primer_del_cami = false;
                        variables.ultim_es_paper = false;
                        ++variables.num_words;
                        variables.tags.add("Term");
                        if(nombreterm.getText().equals("")){
                            variables.valors.add("NULL");
                        }
                        else{
                            variables.valors.add(nombreterm.getText());
                        }
                    }
                else {
                    error.setText("Defina un Term");
                }
            }
            else {
                if (seleccion == 1) {            
                    if (!nombreterm.getText().equals("")) {
                        if (isUser()) {
                            pathuser.setForeground(Color.BLACK);
                            if (pathuser.getText().equals("Escribe tu path")){
                                String p;
                                p = "Term~";
                                p += nombreterm.getText();
                                pathuser.setText(p);
                            }
                            else {
                                String p = pathuser.getText();
                                p += "  ";
                                p += "Term~";
                                p += nombreterm.getText();
                                pathuser.setText(p);
                            }
                            c2user.addItem(String.valueOf(variables.num_words));
                            c3user.addItem(String.valueOf(variables.num_words));
                        }
                        else {
                            pathpublic.setForeground(Color.BLACK);
                            if (pathpublic.getText().equals("Escribe tu path")){
                                String p;
                                p = "Term~";
                                p += nombreterm.getText();
                                pathpublic.setText(p);
                            }
                            else {
                                String p = pathpublic.getText();
                                p += "  ";
                                p += "Term~";
                                p += nombreterm.getText();
                                pathpublic.setText(p);
                            }
                            c2.addItem(String.valueOf(variables.num_words));
                            c3.addItem(String.valueOf(variables.num_words));
                        }
                        this.setVisible(false);
                        variables.ultim_es_paper = false;
                        ++variables.num_words;
                        variables.tags.add("Term");
                        if(nombreterm.getText().equals("")){
                            variables.valors.add("NULL");
                        }
                        else{
                            variables.valors.add(nombreterm.getText());
                        }
                    }
                }
                else  {
                        if (isUser()) {
                            pathuser.setForeground(Color.BLACK);
                            if (pathuser.getText().equals("Escribe tu path")){
                                pathuser.setText("Term~NULL");
                            }
                            else {
                                String p = pathuser.getText();
                                p += "  ";
                                p += "Term~NULL";
                                pathuser.setText(p);
                            }
                            c2user.addItem(String.valueOf(variables.num_words));
                            c3user.addItem(String.valueOf(variables.num_words));
                        }
                        else {
                            pathpublic.setForeground(Color.BLACK);
                            if (pathpublic.getText().equals("Escribe tu path")){
                                pathpublic.setText("Term~NULL");
                            }
                            else {
                                String p = pathpublic.getText();
                                p += "  ";
                                p += "Term~NULL";
                                pathpublic.setText(p);
                            }
                            c2.addItem(String.valueOf(variables.num_words));
                            c3.addItem(String.valueOf(variables.num_words));
                        }
                        this.setVisible(false);
                        variables.ultim_es_paper = false;
                        ++variables.num_words;
                        variables.tags.add("Term");
                        if(nombreterm.getText().equals("")){
                            variables.valors.add("NULL");
                        }
                        else{
                            variables.valors.add(nombreterm.getText());
                        }
                }
            }
        }
        else {
            String dato = String.valueOf(escoge.getSelectedItem());
                if (dato.equals("Definir")) {
                    if (!nombreterm.getText().equals("")) {
                        if (isUser()) {
                            String p = selectedpredpathuser.getText();
                            int inaux = 1;
                            String inicio = "";
                            String finali = "";
                            boolean sal = false;
                            boolean sal2 = false;
                            for (int i=0 ; i<p.length() ; ++i) {
                                if (p.charAt(i) == ' ') {
                                    if (p.charAt(i+1) == ' ') {
                                        ++inaux;
                                        ++i;
                                        ++i;
                                    }
                                }
                                if (inaux == variables.num_del_select && !sal) {                   
                                    inicio += p.substring(0, i);
                                    sal = true;
                                }
                                if (inaux == (variables.num_del_select+1) && !sal2) {
                                    finali = p.substring(i, p.length());
                                    sal2 = true;
                                }
                            }
                            p = "Term~";
                            p += nombreterm.getText();
                            selectedpredpathuser.setText(inicio + p + "  " + finali); 
                            int indiceselect = defineuser.getSelectedIndex();
                            if (2 == defineuser.getItemCount()) {
                                defineuser.setSelectedIndex(0);
                                variables.index = 0;
                                controlerrores1.setText("Todos los nodos estan definidos");
                                controlerrores1.setForeground(Color.green);
                            }
                            else {
                                defineuser.setSelectedIndex(variables.index);
                                ++variables.index;
                            }
                            defineuser.removeItemAt(indiceselect);                      
                        }
                        else {
                            String p = selectedpredpath.getText();
                            int inaux = 1;
                            String inicio = "";
                            String finali = "";
                            boolean sal = false;
                            boolean sal2 = false;
                            for (int i=0 ; i<p.length() ; ++i) {
                                if (p.charAt(i) == ' ') {
                                    if (p.charAt(i+1) == ' ') {
                                        ++inaux;
                                        ++i;
                                        ++i;
                                    }
                                }
                                if (inaux == variables.num_del_select && !sal) {                   
                                    inicio += p.substring(0, i);
                                    sal = true;
                                }
                                if (inaux == (variables.num_del_select+1) && !sal2) {
                                    finali = p.substring(i, p.length());
                                    sal2 = true;
                                }
                            }
                            p = "Term~";
                            p += nombreterm.getText();
                            selectedpredpath.setText(inicio + p + "  " + finali);
                            int indiceselect = define.getSelectedIndex(); 
                            if (2 == define.getItemCount()) {
                                define.setSelectedIndex(0);
                                variables.index = 0;
                                controlerrores.setText("Todos los nodos estan definidos");
                                controlerrores.setForeground(Color.green);
                            }
                            else {
                                define.setSelectedIndex(variables.index);
                                ++variables.index;
                            }
                            define.removeItemAt(indiceselect);
                        }
                        this.setVisible(false);
                        variables.tags.add("Term");
                        if(nombreterm.getText().equals("")){
                            variables.valors.add("NULL");
                        }
                        else{
                            variables.valors.add(nombreterm.getText());
                        }
                    }
                }
                else {
                    if (nombreterm.getText().equals("")) {
                        if (isUser()) {
                            String p = selectedpredpathuser.getText();
                            int inaux = 1;
                            String inicio = "";
                            String finali = "";
                            boolean sal = false;
                            boolean sal2 = false;
                            for (int i=0 ; i<p.length() ; ++i) {
                                if (p.charAt(i) == ' ') {
                                    if (p.charAt(i+1) == ' ') {
                                        ++inaux;
                                        ++i;
                                        ++i;
                                    }
                                }
                                if (inaux == variables.num_del_select && !sal) {                   
                                    inicio += p.substring(0, i);
                                    sal = true;
                                }
                                if (inaux == (variables.num_del_select+1) && !sal2) {
                                    finali = p.substring(i, p.length());
                                    sal2 = true;
                                }
                            }
                            p = "Term~NULL";
                            selectedpredpathuser.setText(inicio + p + "  " + finali);
                            int indiceselect = defineuser.getSelectedIndex();
                            if (variables.index == defineuser.getItemCount()) {
                                defineuser.setSelectedIndex(0);
                                variables.index = 0;
                                controlerrores1.setText("Todos los nodos estan definidos");
                                controlerrores1.setForeground(Color.green);
                            }
                            else {
                                defineuser.setSelectedIndex(variables.index);
                                ++variables.index;
                            }
                            defineuser.removeItemAt(indiceselect);
                        }
                        else {
                            String p = selectedpredpath.getText();
                            int inaux = 1;
                            String inicio = "";
                            String finali = "";
                            boolean sal = false;
                            boolean sal2 = false;
                            for (int i=0 ; i<p.length() ; ++i) {
                                if (p.charAt(i) == ' ') {
                                    if (p.charAt(i+1) == ' ') {
                                        ++inaux;
                                        ++i;
                                        ++i;
                                    }
                                }
                                if (inaux == variables.num_del_select && !sal) {                   
                                    inicio += p.substring(0, i);
                                    sal = true;
                                }
                                if (inaux == (variables.num_del_select+1) && !sal2) {
                                    finali = p.substring(i, p.length());
                                    sal2 = true;
                                }
                            }
                            p = "Term~NULL";
                            selectedpredpath.setText(inicio + p + "  " + finali); 
                            int indiceselect = define.getSelectedIndex();
                            if (2 == define.getItemCount()) {
                                define.setSelectedIndex(0);
                                variables.index = 0;
                                controlerrores.setText("Todos los nodos estan definidos");
                                controlerrores.setForeground(Color.green);
                            }
                            else {
                                define.setSelectedIndex(variables.index);
                                ++variables.index;
                            }
                            define.removeItemAt(indiceselect);
                        }
                        this.setVisible(false);
                        variables.tags.add("Term");
                        if(nombreterm.getText().equals("")){
                            variables.valors.add("NULL");
                        }
                        else{
                            variables.valors.add(nombreterm.getText());
                        }
                    }                    
                }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablatermMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablatermMouseClicked
        // TODO add your handling code here:
        String dato=String.valueOf(model.getValueAt(tablaterm.getSelectedRow(),0));
        nombreterm.setText(dato);
        if (!variables.primer_del_cami) {
            escoge.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tablatermMouseClicked

    private void escogeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_escogeItemStateChanged
        // TODO add your handling code here:
        if (!variables.primer_del_cami && escoge.getSelectedItem().equals("No Definir")) nombreterm.setText(null);
    }//GEN-LAST:event_escogeItemStateChanged

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
            java.util.logging.Logger.getLogger(escribir_term.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new escribir_term().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(escribir_term.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscador;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JComboBox<String> escoge;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreterm;
    private javax.swing.JTable tablaterm;
    // End of variables declaration//GEN-END:variables
}
