/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import static com.prop45.Graph.Graph.existsNode;
import java.awt.Color;
import static com.prop45.searchtacp.Busqueda.pathpublic;
import static com.prop45.searchtacp.Busquedauser.pathuser;
import static com.prop45.searchtacp.variables.isUser;

/**
 *
 * @author Miquel Baena
 */
public class escribir_paper extends javax.swing.JFrame {

    /**
     * Creates new form escribir_paper
     */
    public escribir_paper() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        wa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escoge = new javax.swing.JComboBox<>();
        nombrepaper = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        wa = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setTitle("Añadir Paper");

        escoge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Definir", "No Definir" }));

        jButton1.setMnemonic('A');
        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        wa.setForeground(new java.awt.Color(255, 0, 0));
        wa.setText("Wrong Argument!");

        jButton2.setMnemonic('C');
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(wa)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nombrepaper)
                        .addGap(38, 38, 38)
                        .addComponent(escoge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrepaper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escoge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wa, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int seleccion = escoge.getSelectedIndex();        
        if (seleccion == 0) {
            if (nombrepaper.getText().equals("")) {
                wa.setVisible(true);
            }
            else if (!existsNode(nombrepaper.getText(),"Paper")) {
                wa.setVisible(true);
                wa.setText("El Paper no existe");
            }
            else {
                if (isUser()) {
                    pathuser.setForeground(Color.BLACK);
                    if (pathuser.getText().equals("Escribe tu path")){
                        String p;
                        p = "PAPER:";
                        p += nombrepaper.getText();
                        pathuser.setText(p);
                    }
                    else {
                        String p = pathuser.getText();
                        p += " - ";
                        p += "PAPER:";
                        p += nombrepaper.getText();
                        pathuser.setText(p);
                    }
                }
                else {
                    pathpublic.setForeground(Color.BLACK);
                    if (pathpublic.getText().equals("Escribe tu path")){
                        String p;
                        p = "PAPER:";
                        p += nombrepaper.getText();
                        pathpublic.setText(p);
                    }
                    else {
                        String p = pathpublic.getText();
                        p += " - ";
                        p += "PAPER:";
                        p += nombrepaper.getText();
                        pathpublic.setText(p);
                    }
                }
                this.setVisible(false);
            }
        }
        else {
            if (nombrepaper.getText().equals("")) {
                if (isUser()) {
                    pathuser.setForeground(Color.BLACK);
                    if (pathuser.getText().equals("Escribe tu path")){
                        pathuser.setText("PAPER:(not_defined)");
                    }
                    else {
                        String p = pathuser.getText();
                        p += " - ";
                        p += "PAPER:(not_defined)";
                        pathuser.setText(p);
                    }
                }
                else {
                    pathpublic.setForeground(Color.BLACK);
                    if (pathpublic.getText().equals("Escribe tu path")){
                        pathpublic.setText("PAPER:(not_defined)");
                    }
                    else {
                        String p = pathpublic.getText();
                        p += " - ";
                        p += "PAPER:(not_defined)";
                        pathpublic.setText(p);
                    }
                }
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(escribir_paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(escribir_paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(escribir_paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(escribir_paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new escribir_paper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> escoge;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField nombrepaper;
    private javax.swing.JLabel wa;
    // End of variables declaration//GEN-END:variables
}
