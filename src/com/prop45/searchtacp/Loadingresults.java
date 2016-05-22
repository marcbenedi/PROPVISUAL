/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import static com.prop45.searchtacp.Busqueda.pathpublic;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static com.prop45.searchtacp.Cargando.panelmegadinamico;
import static com.prop45.searchtacp.variables.getPath;
import static com.prop45.searchtacp.variables.isUser;

/**
 *
 * @author Miquel Baena
 */
public class Loadingresults extends javax.swing.JPanel {

    /**
     * Creates new form Loadingresults
     */
    public Loadingresults() {
        initComponents();
        
        ImageIcon Loading_image = new ImageIcon(getPath() + "\\recursos\\Images\\loading.gif");
        Icon icono_loading = new ImageIcon(Loading_image.getImage().getScaledInstance(61 ,61, Image.SCALE_DEFAULT));
        gift.setIcon(icono_loading);
        //titulo.setText(pathpublic.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        gift = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        titulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        titulo.setText("Loading results");

        exitbutton.setMnemonic('E');
        exitbutton.setText("Exit");
        exitbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        jButton1.setMnemonic('A');
        jButton1.setText("Abandonar busqueda");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(29, 29, 29)
                .addComponent(gift, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        Asegurar_exit ae = new Asegurar_exit();
        ae.setVisible(true);
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (isUser()){
            try {
            // TODO add your handling code here:
            Busquedauser p = new Busquedauser();
            p.setSize(738,513);
            p.setLocation(0,0);
            p.setBackground(Color.WHITE);
            panelmegadinamico.removeAll();
            panelmegadinamico.add(p, BorderLayout.CENTER);
            panelmegadinamico.revalidate();
            panelmegadinamico.repaint();
        } catch (IOException ex) {
            Logger.getLogger(Prebusquedauser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else {
            Busqueda p = new Busqueda();
            p.setSize(738,513);
            p.setLocation(0,0);
            p.setBackground(Color.WHITE);
            panelmegadinamico.removeAll();
            panelmegadinamico.add(p, BorderLayout.CENTER);
            panelmegadinamico.revalidate();
            panelmegadinamico.repaint();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel gift;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
