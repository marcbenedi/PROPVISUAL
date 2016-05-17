/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static com.prop45.searchtacp.Cargando.panelmegadinamico;
import static com.prop45.searchtacp.ViewPredPathuser.continuepredpath;
import static com.prop45.searchtacp.ViewPredPathuser.dmppn;
import static com.prop45.searchtacp.ViewPredPathuser.dmppnbotton;
import static com.prop45.searchtacp.ViewPredPathuser.duppn;
import static com.prop45.searchtacp.ViewPredPathuser.duppnbutton;
import static com.prop45.searchtacp.ViewPredPathuser.emppn;
import static com.prop45.searchtacp.ViewPredPathuser.emppnbutton;
import static com.prop45.searchtacp.ViewPredPathuser.euppn;
import static com.prop45.searchtacp.ViewPredPathuser.euppnbutton;
import static com.prop45.searchtacp.ViewPredPathuser.helppredpath;
import static com.prop45.searchtacp.ViewPredPathuser.selectedpredpath;
import static com.prop45.searchtacp.ViewPredPathuser.titolpredpath;
import static com.prop45.searchtacp.variables.getPath;
import static com.prop45.searchtacp.variables.getUsuario;

/**
 *
 * @author Miquel Baena
 */
public class CreatePredPath extends javax.swing.JPanel {

    /**
     * Creates new form CreatePredPath
     * @throws java.io.FileNotFoundException
     */
    public CreatePredPath() throws FileNotFoundException, IOException {
        initComponents();
        pathpred.setEditable(false);
        userlabel.setText(getUsuario());
        String textoaux ="--Universal--\n";
        this.setBackground(Color.white);
        text.setEditable(false);
        ImageIcon Logo_image = new ImageIcon(getPath() + "\\recursos\\Images\\descarga.png");
        Icon icono_logo = new ImageIcon(Logo_image.getImage().getScaledInstance(163,116, Image.SCALE_DEFAULT));
        Logo.setIcon(icono_logo);
        FileReader file = new FileReader(getPath() + "\\recursos\\ficheros\\relacion.txt");
        BufferedReader reader = new BufferedReader(file);
        String line =  reader.readLine();
        String frase;
        while (line != null) {
            int i = 0;
            while (line.charAt(i)!='\t') {
                textoaux += line.charAt(i);
                ++i;
            }
            textoaux += "\n";
            line = reader.readLine();
        }
        file = new FileReader(getPath() + "\\recursos\\ficheros\\relacion_" + getUsuario() + ".txt");
        reader = new BufferedReader(file);
        line =  reader.readLine();
        textoaux +="--Mios--\n";        
        while (line != null) {
            int i = 0;
            while (line.charAt(i)!='\t') {
                textoaux += line.charAt(i);
                ++i;
            }
            textoaux += "\n";
            line = reader.readLine();
        }
        text.setText(textoaux);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        pathpred = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Instructionsbutton1 = new javax.swing.JButton();
        term = new javax.swing.JButton();
        Confbutton = new javax.swing.JButton();
        Authorbutton = new javax.swing.JButton();
        Paperbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        numdelete = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        c2 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        clausulas = new javax.swing.JTextArea();
        c3 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();

        userlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userlabel.setText("username");

        pathpred.setForeground(new java.awt.Color(153, 153, 153));
        pathpred.setText("Escribe tu path");
        pathpred.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pathpredMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pathpredMouseEntered(evt);
            }
        });
        pathpred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathpredActionPerformed(evt);
            }
        });

        jLabel1.setText("Path:");

        jButton1.setMnemonic('S');
        jButton1.setText("Submit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        term.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        term.setMnemonic('T');
        term.setText("Term");
        term.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        term.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termActionPerformed(evt);
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

        Authorbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Authorbutton.setMnemonic('A');
        Authorbutton.setText("Author");
        Authorbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Authorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorbuttonActionPerformed(evt);
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

        jLabel2.setText("Mis Predefined Paths:");

        jButton3.setMnemonic('R');
        jButton3.setText("Return");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setMnemonic('E');
        jButton4.setText("Exit");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        text.setColumns(20);
        text.setRows(5);
        text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(text);

        jButton2.setText("Ver mas detalles");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setMnemonic('D');
        jButton8.setText("Elimnar Clausula");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        numdelete.setForeground(new java.awt.Color(153, 153, 153));
        numdelete.setText("num. clausula");
        numdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numdeleteMouseClicked(evt);
            }
        });
        numdelete.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                numdeleteComponentResized(evt);
            }
        });
        numdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numdeleteActionPerformed(evt);
            }
        });

        jButton9.setText("Añadir mas clausulas");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        c2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c2.setForeground(new java.awt.Color(153, 153, 153));

        c1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c1.setForeground(new java.awt.Color(153, 153, 153));

        clausulas.setColumns(20);
        clausulas.setRows(5);
        jScrollPane2.setViewportView(clausulas);

        c3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c3.setForeground(new java.awt.Color(153, 153, 153));

        jButton10.setText("Borrar");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(Instructionsbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(term, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Confbutton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Paperbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Authorbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(numdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jButton2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pathpred, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(608, 608, 608)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userlabel)
                            .addComponent(Instructionsbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathpred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Paperbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(term, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Authorbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Confbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(numdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pathpredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathpredMouseClicked
        // TODO add your handling code here:
        pathpred.setForeground(Color.BLACK);
        if (pathpred.getText().equals("Escribe tu path")){
            pathpred.setText(null);
        }
    }//GEN-LAST:event_pathpredMouseClicked

    private void pathpredMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathpredMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pathpredMouseEntered

    private void pathpredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathpredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathpredActionPerformed

    private void termActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termActionPerformed
        // TODO add your handling code here:
        if (pathpred.getText().equals("Escribe tu path") || pathpred.getText().equals("")) {
            pathpred.setForeground(Color.BLACK);
            pathpred.setText("TERM");
        }
        else {
            String p = pathpred.getText();
            p += " - TERM";
            pathpred.setText(p);
        }
    }//GEN-LAST:event_termActionPerformed

    private void ConfbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfbuttonActionPerformed
        // TODO add your handling code here:
        if (pathpred.getText().equals("Escribe tu path") || pathpred.getText().equals("")) {
            pathpred.setForeground(Color.BLACK);
            pathpred.setText("CONFERENCE");
        }
        else {
            String p = pathpred.getText();
            p += " - CONFERENCE";
            pathpred.setText(p);
        }
    }//GEN-LAST:event_ConfbuttonActionPerformed

    private void AuthorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorbuttonActionPerformed
        // TODO add your handling code here:
        if (pathpred.getText().equals("Escribe tu path") || pathpred.getText().equals("")) {
            pathpred.setForeground(Color.BLACK);
            pathpred.setText("AUTHOR");
        }
        else {
            String p = pathpred.getText();
            p += " - AUTHOR";
            pathpred.setText(p);
        }
    }//GEN-LAST:event_AuthorbuttonActionPerformed

    private void PaperbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaperbuttonActionPerformed
        // TODO add your handling code here:
        if (pathpred.getText().equals("Escribe tu path") || pathpred.getText().equals("")) {
            pathpred.setForeground(Color.BLACK);
            pathpred.setText("PAPER");
        }
        else {
            String p = pathpred.getText();
            p += " - PAPER";
            pathpred.setText(p);
        }
    }//GEN-LAST:event_PaperbuttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            Prebusquedauser p = new Prebusquedauser();
            p.setSize(738,513);
            p.setLocation(0,0);
            p.setBackground(Color.WHITE);
            panelmegadinamico.removeAll();
            panelmegadinamico.add(p, BorderLayout.CENTER);
            panelmegadinamico.revalidate();
            panelmegadinamico.repaint();
        } catch (IOException ex) {
            Logger.getLogger(CreatePredPath.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Asegurar_exit ae = new Asegurar_exit();
        ae.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Instructionsbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instructionsbutton1ActionPerformed
        // TODO add your handling code here:
        Instrucciones i = new Instrucciones();
        i.setVisible(true);
    }//GEN-LAST:event_Instructionsbutton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void numdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numdeleteMouseClicked
        // TODO add your handling code here:
        numdelete.setForeground(Color.BLACK);
        if (numdelete.getText().equals("num. clausula")) {
            numdelete.setText(null);
        }
    }//GEN-LAST:event_numdeleteMouseClicked

    private void numdeleteComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_numdeleteComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_numdeleteComponentResized

    private void numdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numdeleteActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ViewPredPathuser vppu = new ViewPredPathuser();
        vppu.setVisible(true);
        emppnbutton.setVisible(false);
        emppn.setVisible(false);
        dmppn.setVisible(false);
        dmppnbotton.setVisible(false);
        euppn.setVisible(false);
        euppnbutton.setVisible(false);
        duppn.setVisible(false);
        duppnbutton.setVisible(false);
        helppredpath.setVisible(false);
        titolpredpath.setVisible(false);
        selectedpredpath.setVisible(false);
        continuepredpath.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Authorbutton;
    private javax.swing.JButton Confbutton;
    private javax.swing.JButton Instructionsbutton1;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Paperbutton;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextArea clausulas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numdelete;
    public static javax.swing.JTextField pathpred;
    private javax.swing.JButton term;
    private javax.swing.JTextArea text;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
