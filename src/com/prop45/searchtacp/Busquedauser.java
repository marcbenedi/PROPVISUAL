/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import com.prop45.Consulta.Consulta;
import com.prop45.Paths.Norma;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static com.prop45.searchtacp.Cargando.panelmegadinamico;
import static com.prop45.searchtacp.Instrucciones.instruccions_guillem;
import static com.prop45.searchtacp.Portadaylogins.paneldinamico;
import static com.prop45.searchtacp.variables.getInst_Realizar_Busqueda;
import static com.prop45.searchtacp.variables.getPath;
import static com.prop45.searchtacp.variables.getUsuario;
import static com.prop45.searchtacp.variables.isNumeric;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Miquel Baena
 */
public class Busquedauser extends javax.swing.JPanel {
    /**
     * Creates new form Busquedauser
     * @throws java.io.FileNotFoundException
     */
    public Busquedauser() throws FileNotFoundException, IOException {
        initComponents();
        num.setVisible(false);
        jButton3.setText("<html><p>Realizar busqueda</p><p>Page Rank</p></html>"); 
        jButton7.setText("<html><p>Realizar busqueda</p><p>Grado Nodo</p></html>");
        variables.primera_clausula_predpath = true;
        pathuser.setEditable(false);
        userlabel.setText(getUsuario());
        clausulasuser.setEditable(false);
        c1user.setForeground(Color.black);
        c3user.setForeground(Color.black);
        c2user.setForeground(Color.black);
        ImageIcon Logo_image = new ImageIcon(getPath() + "\\recursos\\Images\\descarga.png");
        Icon icono_logo = new ImageIcon(Logo_image.getImage().getScaledInstance(191, 129, Image.SCALE_DEFAULT));
        Logo.setIcon(icono_logo);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        controlerrores = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pathuser = new javax.swing.JTextField();
        Instructionsbutton1 = new javax.swing.JButton();
        pathbutton = new javax.swing.JButton();
        Authorbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Confbutton = new javax.swing.JButton();
        Paperbutton = new javax.swing.JButton();
        Returnbutton = new javax.swing.JButton();
        Exitbutton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clausulasuser = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        c1user = new javax.swing.JComboBox<>();
        c2user = new javax.swing.JComboBox<>();
        c3user = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        controlerrores1 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();

        jButton5.setText("Borrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        userlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userlabel.setText("username");

        jLabel1.setText("Path:");

        pathuser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pathuser.setForeground(new java.awt.Color(153, 153, 153));
        pathuser.setText("Escribe tu path");
        pathuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pathuserMouseClicked(evt);
            }
        });

        Instructionsbutton1.setMnemonic('H');
        Instructionsbutton1.setText("Help");
        Instructionsbutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Instructionsbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instructionsbutton1ActionPerformed(evt);
            }
        });

        pathbutton.setMnemonic('d');
        pathbutton.setText("Predefined Paths");
        pathbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pathbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathbuttonActionPerformed(evt);
            }
        });

        Authorbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Authorbutton.setMnemonic('A');
        Authorbutton.setText("Author");
        Authorbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Authorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorbuttonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setMnemonic('T');
        jButton1.setText("Term");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Confbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Confbutton.setMnemonic('C');
        Confbutton.setText("Conference");
        Confbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfbuttonActionPerformed(evt);
            }
        });

        Paperbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Paperbutton.setMnemonic('P');
        Paperbutton.setText("Paper");
        Paperbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Paperbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperbuttonActionPerformed(evt);
            }
        });

        Returnbutton.setMnemonic('R');
        Returnbutton.setText("Return");
        Returnbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnbuttonActionPerformed(evt);
            }
        });

        Exitbutton.setMnemonic('E');
        Exitbutton.setText("Exit");
        Exitbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbuttonActionPerformed(evt);
            }
        });

        jButton2.setText("Añadir mas clausulas");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        clausulasuser.setColumns(1);
        clausulasuser.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        clausulasuser.setRows(1);
        jScrollPane1.setViewportView(clausulasuser);

        jButton4.setMnemonic('D');
        jButton4.setText("Borrar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Borrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        c1user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "D", "E", "L", "M", "d", "e", "l", "m" }));
        c1user.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1userItemStateChanged(evt);
            }
        });

        c2user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        c3user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jButton3.setMnemonic('B');
        jButton3.setText("Realiza búsqueda");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setMnemonic('B');
        jButton7.setText("Realiza búsqueda");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        num.setForeground(new java.awt.Color(153, 153, 153));
        num.setText("num.");
        num.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton6))
                            .addComponent(userlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Confbutton)))
                            .addComponent(Returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Authorbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Paperbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pathbutton)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(controlerrores1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Instructionsbutton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(119, 119, 119)
                                                .addComponent(jButton4))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(18, 18, 18)
                                                .addComponent(c1user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(c2user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(c3user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(71, 71, 71))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pathuser, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(userlabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Instructionsbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(c1user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Authorbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Confbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paperbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controlerrores1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Instructionsbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instructionsbutton1ActionPerformed
        // TODO add your handling code here:
        Instrucciones ins = new Instrucciones();
        ins.setVisible(true);
        instruccions_guillem.setText(getInst_Realizar_Busqueda());

    }//GEN-LAST:event_Instructionsbutton1ActionPerformed

    private void pathbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathbuttonActionPerformed
        try {
            // TODO add your handling code here:
            ViewPredPathuser vppu = new ViewPredPathuser();
            vppu.setVisible(true);
            variables.ultim_es_paper = false;
            variables.primer_del_cami = true;
        } catch (IOException ex) {
            Logger.getLogger(Busquedauser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pathbuttonActionPerformed

    private void AuthorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorbuttonActionPerformed
        try {
            // TODO add your handling code here:
            if (variables.ultim_es_paper || variables.primer_del_cami) {
                escribir_author ea = new escribir_author();
                ea.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(Busquedauser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AuthorbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            if (variables.ultim_es_paper || variables.primer_del_cami) {
                escribir_term et = new escribir_term();
                et.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(Busquedauser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConfbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfbuttonActionPerformed
        try {
            // TODO add your handling code here:
            if (variables.ultim_es_paper || variables.primer_del_cami) {
                escribir_conference ec = new escribir_conference();
                ec.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(Busquedauser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConfbuttonActionPerformed

    private void PaperbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaperbuttonActionPerformed
        try {
            // TODO add your handling code here:
            if (!variables.ultim_es_paper || variables.primer_del_cami) {
                escribir_paper ep = new escribir_paper();
                ep.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(Busquedauser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PaperbuttonActionPerformed

    private void ReturnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnbuttonActionPerformed
        variables.valors.clear();
        variables.tags.clear();
        variables.normes.clear();
        variables.primera_clausula_predpath = true;
        try {
            // TODO add your handling code here:
            variables.ultim_es_paper = false;
            variables.primer_del_cami = true;
            variables.num_words = 0;
            Prebusquedauser p = new Prebusquedauser();
            p.setSize(738,513);
            p.setLocation(0,0);
            p.setBackground(Color.WHITE);
            panelmegadinamico.removeAll();
            panelmegadinamico.add(p, BorderLayout.CENTER);
            panelmegadinamico.revalidate();
            panelmegadinamico.repaint();
        } catch (IOException ex) {
            Logger.getLogger(Busquedauser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReturnbuttonActionPerformed

    private void ExitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbuttonActionPerformed
        // TODO add your handling code here:
        Asegurar_exit ae = new Asegurar_exit();
        ae.setVisible(true);
    }//GEN-LAST:event_ExitbuttonActionPerformed

    private void pathuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathuserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pathuserMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        variables.normes.clear();
        variables.primera_clausula_predpath =  true;
        clausulasuser.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: 
        if (c1user.getSelectedIndex() < 5) {
            if (c1user.getSelectedItem().equals("-") || c2user.getSelectedItem().equals("-") || c3user.getSelectedItem().equals("-")){
                controlerrores1.setText("Error al añadir la clausula");
                controlerrores1.setForeground(Color.red);
                controlerrores1.setVisible(true);
            }
            else if (c2user.getSelectedItem().equals(c3user.getSelectedItem())) {
                controlerrores1.setText("Error al añadir la clausula");
                controlerrores1.setForeground(Color.red);
                controlerrores1.setVisible(true);            
            }
            else {
                controlerrores1.setText("");
                if (variables.primera_clausula_predpath) {
                    clausulasuser.setText(clausulasuser.getText() + c1user.getSelectedItem() + " " + c2user.getSelectedItem() + " " + c3user.getSelectedItem());
                    variables.primera_clausula_predpath = false;
                }
                else {
                    clausulasuser.setText(clausulasuser.getText() + "\n" + c1user.getSelectedItem() + " " + c2user.getSelectedItem() + " " + c3user.getSelectedItem());
                }
                String n1 = String.valueOf(c1user.getSelectedItem());
                String n2string = String.valueOf(c2user.getSelectedItem());
                String n3string = String.valueOf(c3user.getSelectedItem());
                int n2 = Integer.valueOf(n2string);
                int n3 = Integer.valueOf(n3string);
                Norma n = new Norma(n1.charAt(0),n2,n3);
                variables.normes.add(n);
                c1user.setSelectedIndex(0);
                c2user.setSelectedIndex(0);
                c3user.setSelectedIndex(0);
                controlerrores1.setText("Añadió la clausula correctamente");
                controlerrores1.setForeground(Color.green);
                controlerrores1.setVisible(true); 
            }
        }
        else {
            if (c2user.getSelectedItem().equals("-") || !isNumeric(num.getText())){
                controlerrores1.setText("Error al añadir la clausula");
                controlerrores1.setForeground(Color.red);
                controlerrores1.setVisible(true);
                if (!isNumeric(num.getText())) {
                    controlerrores1.setText("Por favor escriba un numero correcto");
                }
            }
            else {
                controlerrores1.setText("");
                int numero_comp = Integer.parseInt(num.getText());
                if (variables.primera_clausula_predpath) {
                    clausulasuser.setText(clausulasuser.getText() + c1user.getSelectedItem() + " " + c2user.getSelectedItem() + " " + numero_comp);
                    variables.primera_clausula_predpath = false;
                }
                else {
                    clausulasuser.setText(clausulasuser.getText() + "\n" + c1user.getSelectedItem() + " " + c2user.getSelectedItem() + " " + numero_comp);
                }
                c1user.setSelectedIndex(0);
                c2user.setSelectedIndex(0);
                controlerrores1.setText("Añadió la clausula correctamente");
                controlerrores1.setForeground(Color.green);
                controlerrores1.setVisible(true); 
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        variables.valors.clear();
        variables.tags.clear();
        
        
        variables.ultim_es_paper = false;
        variables.primer_del_cami = true;
        variables.num_words = 0;
        c2user.removeAllItems();
        c2user.addItem("-");
        c3user.removeAllItems();
        c3user.addItem("-");
        pathuser.setText("Escribe tu path");
        pathuser.setForeground(Color.gray);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean fallo = true;
        for (int i=0; i<pathuser.getText().length(); ++i) {
            if (pathuser.getText().charAt(i) == ' ') {
                fallo = false;
            }
        }
        if (fallo || pathuser.getText().equals("Escribe tu path")) {
            controlerrores.setText("Añade 2 o mas nodos a la busqueda");
            controlerrores.setForeground(Color.red);
            controlerrores.setVisible(true);
        }
        else {
            FileWriter fichero = null;
            PrintWriter pw = null;
            try
            {
                fichero = new FileWriter(getPath() + "\\recursos\\ficheros\\historial_" + getUsuario() + ".txt",true);
                pw = new PrintWriter(fichero);
                pw.println(pathuser.getText());
            } catch (Exception e){} 
            finally {
               try {
               if (null != fichero)
                  fichero.close();
               } catch (Exception e2) {}
            }
            variables.ultim_es_paper = false;
            variables.primer_del_cami = true;
            variables.num_words = 0;
            Portadaylogins panel1 = new Portadaylogins();
            panel1.setSize(738,513);
            panel1.setLocation(0,0);
            panel1.setBackground(Color.WHITE);
            panelmegadinamico.removeAll();
            panelmegadinamico.add(panel1, BorderLayout.CENTER);
            panelmegadinamico.revalidate();
            panelmegadinamico.repaint();
            Loadingresults p2 = new Loadingresults();
            p2.setSize(737,323);
            p2.setLocation(0,0);
            p2.setBackground(Color.WHITE);
            paneldinamico.removeAll();
            paneldinamico.add(p2, BorderLayout.CENTER);
            paneldinamico.revalidate();
            paneldinamico.repaint();
            variables.r.setTags(variables.tags);
            variables.r.setNormes(variables.normes);
            Consulta c = new Consulta(variables.grafo);
            variables.result=c.consultar(variables.r,variables.valors,true);
            ConsultaPanel cp = new ConsultaPanel();
            cp.setSize(738,513);
            cp.setLocation(0,0);
            cp.setBackground(Color.WHITE);
            panelmegadinamico.removeAll();
            panelmegadinamico.add(cp, BorderLayout.CENTER);
            panelmegadinamico.revalidate();
            panelmegadinamico.repaint();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        boolean fallo = true;
        for (int i=0; i<pathuser.getText().length(); ++i) {
            if (pathuser.getText().charAt(i) == ' ') {
                fallo = false;
            }
        }
        if (fallo || pathuser.getText().equals("Escribe tu path")) {
            controlerrores.setText("Añade 2 o mas nodos a la busqueda");
            controlerrores.setForeground(Color.red);
            controlerrores.setVisible(true);
        }
        else {
            variables.ultim_es_paper = false;
            variables.primer_del_cami = true;
            variables.num_words = 0;
            Portadaylogins panel1 = new Portadaylogins();
            panel1.setSize(738,513);
            panel1.setLocation(0,0);
            panel1.setBackground(Color.WHITE);
            panelmegadinamico.removeAll();
            panelmegadinamico.add(panel1, BorderLayout.CENTER);
            panelmegadinamico.revalidate();
            panelmegadinamico.repaint();
            Loadingresults p2 = new Loadingresults();
            p2.setSize(737,323);
            p2.setLocation(0,0);
            p2.setBackground(Color.WHITE);
            paneldinamico.removeAll();
            paneldinamico.add(p2, BorderLayout.CENTER);
            paneldinamico.revalidate();
            paneldinamico.repaint();
            variables.r.setTags(variables.tags);
            variables.r.setNormes(variables.normes);
            Consulta c = new Consulta(variables.grafo);
            variables.result=c.consultar(variables.r,variables.valors,false);
            ConsultaPanel cp = new ConsultaPanel();
            cp.setSize(738,513);
            cp.setLocation(0,0);
            cp.setBackground(Color.WHITE);
            panelmegadinamico.removeAll();
            panelmegadinamico.add(cp, BorderLayout.CENTER);
            panelmegadinamico.revalidate();
            panelmegadinamico.repaint();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void numFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numFocusGained
        // TODO add your handling code here:
        if (num.getText().equals("num.")) {
            num.setForeground(Color.black);
            num.setText(null);
        }
    }//GEN-LAST:event_numFocusGained

    private void numFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numFocusLost
        // TODO add your handling code here:
        if (num.getText().equals("")) {
            num.setForeground(Color.gray);
            num.setText("num.");
        }
    }//GEN-LAST:event_numFocusLost

    private void c1userItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1userItemStateChanged
        // TODO add your handling code here:
        if (c1user.getSelectedIndex()>4) {
            c3user.setVisible(false);
            num.setVisible(true);
        }
        else {
            c3user.setVisible(true);
            num.setVisible(false);            
        }
    }//GEN-LAST:event_c1userItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Authorbutton;
    private javax.swing.JButton Confbutton;
    private javax.swing.JButton Exitbutton;
    private javax.swing.JButton Instructionsbutton1;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Paperbutton;
    private javax.swing.JButton Returnbutton;
    private javax.swing.JComboBox<String> c1user;
    public static javax.swing.JComboBox<String> c2user;
    public static javax.swing.JComboBox<String> c3user;
    public static javax.swing.JTextArea clausulasuser;
    private javax.swing.JLabel controlerrores;
    private javax.swing.JLabel controlerrores1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField num;
    private javax.swing.JButton pathbutton;
    public static javax.swing.JTextField pathuser;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
