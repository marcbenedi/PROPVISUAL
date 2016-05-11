/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import static com.prop45.searchtacp.Cargando.panelmegadinamico;
import static com.prop45.searchtacp.Portadaylogins.paneldinamico;
import static com.prop45.searchtacp.variables.setAdmin;
import static com.prop45.searchtacp.variables.setUser;
import static com.prop45.searchtacp.variables.setfalseAdmin;

/**
 *
 * @author Miquel Baena
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        Loginbutton = new javax.swing.JButton();
        Returnbutton = new javax.swing.JButton();
        Exitbutton = new javax.swing.JButton();
        passwordfield = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(737, 323));

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        userfield.setForeground(new java.awt.Color(153, 153, 153));
        userfield.setText("Escriba su nombre de usuario");
        userfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userfieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userfieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userfieldMouseExited(evt);
            }
        });
        userfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfieldActionPerformed(evt);
            }
        });

        Loginbutton.setText("Login");
        Loginbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginbuttonMouseClicked(evt);
            }
        });
        Loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbuttonActionPerformed(evt);
            }
        });

        Returnbutton.setText("Return");
        Returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnbuttonActionPerformed(evt);
            }
        });

        Exitbutton.setText("Exit");
        Exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbuttonActionPerformed(evt);
            }
        });

        passwordfield.setForeground(new java.awt.Color(153, 153, 153));
        passwordfield.setText("**********");
        passwordfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordfieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordfieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordfieldMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(userfield, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(passwordfield)))
                        .addGap(0, 184, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Loginbutton)
                .addGap(332, 332, 332))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(Loginbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userfieldActionPerformed

    private void LoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginbuttonActionPerformed

    private void ReturnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnbuttonActionPerformed
        // TODO add your handling code here:
        Registrarse_Login p2 = new Registrarse_Login();
        p2.setSize(737,323);
        p2.setLocation(0,0);
        p2.setBackground(Color.WHITE);
        paneldinamico.removeAll();
        paneldinamico.add(p2, BorderLayout.CENTER);
        paneldinamico.revalidate();
        paneldinamico.repaint();
    }//GEN-LAST:event_ReturnbuttonActionPerformed

    private void ExitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbuttonActionPerformed
        // TODO add your handling code here:
        Asegurar_exit ae = new Asegurar_exit();
        ae.setVisible(true);
    }//GEN-LAST:event_ExitbuttonActionPerformed

    private void LoginbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginbuttonMouseClicked
        // TODO add your handling code here:
        String pass=new String(passwordfield.getPassword());
        try {
            FileReader file = new FileReader("src/com/prop45/ficheros/users&passwords.txt");
            BufferedReader reader = new BufferedReader(file);
            
            String usuario= "";
            String contraseña= "";
            String line =  reader.readLine();
            String admin="";
            boolean found = false;
            
            while (line != null) {
                if (line != null) {
                    int i = 0;
                    while (line.charAt(i) != ' ') i++;
                    usuario = line.substring(0,i);
                    contraseña = line.substring(i+1, (line.length()-2));
                    admin = line.substring(((line.length())-1), line.length());
                    if (userfield.getText().equals(usuario) && pass.equals(contraseña)) {
                        if (admin.equals("A")) {
                            setAdmin();
                        }
                        else {
                            setfalseAdmin();
                        } 
                        setUser();
                        File archivo;
                        archivo = new File("src/com/prop45/ficheros/actualuser.txt");
                        archivo.createNewFile();
                        File TextFile = new File("src/com/prop45/ficheros/actualuser.txt"); 
                        FileWriter TextOut = new FileWriter(TextFile, true);
                        TextOut.write(usuario);
                        TextOut.write(" ");
                        TextOut.write(admin);
                        TextOut.write("\n");
                        TextOut.close();
                        found = true;
                        Prebusquedauser p = new Prebusquedauser();
                        p.setSize(738,513);
                        p.setLocation(0,0);
                        p.setBackground(Color.WHITE);
                        panelmegadinamico.removeAll();
                        panelmegadinamico.add(p, BorderLayout.CENTER);
                        panelmegadinamico.revalidate();
                        panelmegadinamico.repaint();
                    }
                }
                line = reader.readLine();
            }
            if (found != true) {
                errorlogin p3 = new errorlogin();
                p3.setSize(737,323);
                p3.setLocation(0,0);
                p3.setBackground(Color.WHITE);
                paneldinamico.removeAll();
                paneldinamico.add(p3, BorderLayout.CENTER);
                paneldinamico.revalidate();
                paneldinamico.repaint();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_LoginbuttonMouseClicked

    private void passwordfieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordfieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldMouseEntered

    private void userfieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userfieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_userfieldMouseEntered

    private void passwordfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordfieldMouseClicked
        // TODO add your handling code here:
        String pass=new String(passwordfield.getPassword());
        if (pass.equals("**********")){
            passwordfield.setText(null);
        }   
        passwordfield.setForeground(Color.black);
    }//GEN-LAST:event_passwordfieldMouseClicked

    private void userfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userfieldMouseClicked
        // TODO add your handling code here:
        if (userfield.getText().equals("Escriba su nombre de usuario")) {
            userfield.setText(null);
        }
        userfield.setForeground(Color.black);
    }//GEN-LAST:event_userfieldMouseClicked

    private void userfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_userfieldMouseExited

    private void passwordfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exitbutton;
    private javax.swing.JButton Loginbutton;
    private javax.swing.JButton Returnbutton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}
