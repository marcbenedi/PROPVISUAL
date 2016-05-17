/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static com.prop45.searchtacp.variables.getPath;

/**
 *
 * @author Miquel Baena
 */
public class Cargando_database extends javax.swing.JPanel {

    /**
     * Creates new form Cargando_database
     */
    public Cargando_database() {
        initComponents();      
        ImageIcon Logo_loading = new ImageIcon(getPath() + "\\recursos\\Images\\loading.gif");
        Icon icono_loading = new ImageIcon(Logo_loading.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        Loading.setIcon(icono_loading);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitbutton0 = new javax.swing.JButton();
        bienvenidohoracio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Loading = new javax.swing.JLabel();

        exitbutton0.setMnemonic('E');
        exitbutton0.setText("Exit");
        exitbutton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitbutton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbutton0ActionPerformed(evt);
            }
        });

        bienvenidohoracio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        bienvenidohoracio.setForeground(new java.awt.Color(204, 0, 0));
        bienvenidohoracio.setText("Cargando Data Base...");
        bienvenidohoracio.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                bienvenidohoracioInputMethodTextChanged(evt);
            }
        });
        bienvenidohoracio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                bienvenidohoracioPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel1.setText("Cargando");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitbutton0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(bienvenidohoracio)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(Loading, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Loading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(bienvenidohoracio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(exitbutton0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitbutton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbutton0ActionPerformed
        // TODO add your handling code here:
        Asegurar_exit ae = new Asegurar_exit();
        ae.setVisible(true);
    }//GEN-LAST:event_exitbutton0ActionPerformed

    private void bienvenidohoracioInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bienvenidohoracioInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bienvenidohoracioInputMethodTextChanged

    private void bienvenidohoracioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bienvenidohoracioPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_bienvenidohoracioPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loading;
    public static javax.swing.JLabel bienvenidohoracio;
    public static javax.swing.JButton exitbutton0;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
