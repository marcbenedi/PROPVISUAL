/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static com.prop45.searchtacp.Cargando.panelmegadinamico;
import static com.prop45.searchtacp.Portadaylogins.Logo;
import static com.prop45.searchtacp.Portadaylogins.paneldinamico;
import static com.prop45.searchtacp.variables.getPath;

/**
 *
 * @author Miquel Baena
 */
public class Busqueda extends javax.swing.JPanel {
    public int i;
    /**
     * Creates new form Busqueda
     */
    public Busqueda() {
        i = 1;
        initComponents();
        clausulas.setEditable(false);
        justi.setVisible(false);
        c1.setForeground(Color.black);
        c3.setForeground(Color.black);
        c2.setForeground(Color.black);
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

        Logo = new javax.swing.JLabel();
        pathbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pathpublic = new javax.swing.JTextField();
        Instructionsbutton1 = new javax.swing.JButton();
        Returnbutton = new javax.swing.JButton();
        Exitbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Confbutton = new javax.swing.JButton();
        Authorbutton = new javax.swing.JButton();
        Paperbutton = new javax.swing.JButton();
        c1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        clausulas = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        numdelete = new javax.swing.JTextField();
        justi = new javax.swing.JLabel();

        pathbutton.setMnemonic('P');
        pathbutton.setText("Predefined Paths");
        pathbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathbuttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Path:");

        pathpublic.setForeground(new java.awt.Color(153, 153, 153));
        pathpublic.setText("Escribe tu path");
        pathpublic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pathpublicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pathpublicMouseEntered(evt);
            }
        });
        pathpublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathpublicActionPerformed(evt);
            }
        });

        Instructionsbutton1.setMnemonic('H');
        Instructionsbutton1.setText("Help");
        Instructionsbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instructionsbutton1ActionPerformed(evt);
            }
        });

        Returnbutton.setMnemonic('R');
        Returnbutton.setText("Return");
        Returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnbuttonActionPerformed(evt);
            }
        });

        Exitbutton.setMnemonic('E');
        Exitbutton.setText("Exit");
        Exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbuttonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setMnemonic('T');
        jButton1.setText("Term");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Confbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Confbutton.setMnemonic('C');
        Confbutton.setText("Conference");
        Confbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfbuttonActionPerformed(evt);
            }
        });

        Authorbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Authorbutton.setMnemonic('A');
        Authorbutton.setText("Author");
        Authorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorbuttonActionPerformed(evt);
            }
        });

        Paperbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Paperbutton.setMnemonic('P');
        Paperbutton.setText("Paper");
        Paperbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperbuttonActionPerformed(evt);
            }
        });

        c1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c1.setForeground(new java.awt.Color(153, 153, 153));
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                c1MouseEntered(evt);
            }
        });
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jButton2.setMnemonic('C');
        jButton2.setText("Añadir mas clausulas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setMnemonic('B');
        jButton3.setText("Realiza búsqueda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        c2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c2.setForeground(new java.awt.Color(153, 153, 153));
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                c2MouseEntered(evt);
            }
        });
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        c3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c3.setForeground(new java.awt.Color(153, 153, 153));
        c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                c3MouseEntered(evt);
            }
        });
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        clausulas.setColumns(20);
        clausulas.setRows(5);
        jScrollPane1.setViewportView(clausulas);

        jButton4.setMnemonic('D');
        jButton4.setText("Eliminar Clausula");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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

        justi.setText("Wrong!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Returnbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pathpublic, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(pathbutton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(justi))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(Instructionsbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Confbutton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Paperbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Authorbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addGap(18, 18, 18)
                                    .addComponent(numdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Instructionsbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathpublic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Authorbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Confbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paperbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(justi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pathbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathbuttonActionPerformed

    private void Instructionsbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instructionsbutton1ActionPerformed
        // TODO add your handling code here:
        Instrucciones i = new Instrucciones();
        i.setVisible(true);
    }//GEN-LAST:event_Instructionsbutton1ActionPerformed

    private void ReturnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnbuttonActionPerformed
        // TODO add your handling code here:
        Portadaylogins panel1 = new Portadaylogins();
        panel1.setSize(738,513);
        panel1.setLocation(0,0);
        panel1.setBackground(Color.WHITE);
        panelmegadinamico.removeAll();
        panelmegadinamico.add(panel1, BorderLayout.CENTER);
        panelmegadinamico.revalidate();
        panelmegadinamico.repaint();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        escribir_term et = new escribir_term();
        et.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConfbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfbuttonActionPerformed
        // TODO add your handling code here:
        escribir_conference ec = new escribir_conference();
        ec.setVisible(true);
    }//GEN-LAST:event_ConfbuttonActionPerformed

    private void AuthorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorbuttonActionPerformed
        // TODO add your handling code here:
        escribir_author ea = new escribir_author();
        ea.setVisible(true);
    }//GEN-LAST:event_AuthorbuttonActionPerformed

    private void PaperbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaperbuttonActionPerformed
        // TODO add your handling code here:
        escribir_paper ep = new escribir_paper();
        ep.setVisible(true);
    }//GEN-LAST:event_PaperbuttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pathpublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathpublicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathpublicActionPerformed

    private void pathpublicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathpublicMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pathpublicMouseEntered

    private void pathpublicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathpublicMouseClicked
        // TODO add your handling code here:
        pathpublic.setForeground(Color.BLACK);
        if (pathpublic.getText().equals("Escribe tu path")){
            pathpublic.setText(null);
        }
    }//GEN-LAST:event_pathpublicMouseClicked

    private void c1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_c1MouseEntered

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_c1MouseClicked

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_c2MouseClicked

    private void c2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_c2MouseEntered

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_c3MouseClicked

    private void c3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_c3MouseEntered

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (!numdelete.getText().equals("")) {
            String number_letter = numdelete.getText();
            String texto = clausulas.getText();
            String variable = "";
            texto = texto.replaceAll("\n", "|");
            if (number_letter.length() < 3) {
                int longitud = texto.length();
                int number = Integer.parseInt(number_letter);
                int cont1 = 1;
                int cont2 = 0;
                while (cont2 < longitud) {
                    if (texto.charAt(cont2) == '|') {
                        ++cont1;
                        if (cont1!=number) {
                            variable += "\n";
                        }
                    }
                    else if (cont1!=number) {
                        variable += texto.charAt(cont2);
                    }
                    ++cont2;
                }
                clausulas.setText(variable);
            }
            --i;
            numdelete.setText("");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void numdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numdeleteActionPerformed

    private void numdeleteComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_numdeleteComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_numdeleteComponentResized

    private void numdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numdeleteMouseClicked
        // TODO add your handling code here:
        numdelete.setForeground(Color.BLACK);
        if (numdelete.getText().equals("num. clausula")) {
            numdelete.setText(null);
        }
    }//GEN-LAST:event_numdeleteMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (c1.getText().equals("")){
            if (!c2.getText().equals("")) {
                justi.setText("Error!");
                justi.setForeground(Color.red);
                justi.setVisible(true);
            }
            else if (!c3.getText().equals("")) {
                justi.setText("Error!");
                justi.setForeground(Color.red);
                justi.setVisible(true);
            }
            else {
                justi.setVisible(false);
            }
        }
        else {
            if (c2.getText().equals("")) {
                justi.setText("Error!");
                justi.setForeground(Color.red);
                justi.setVisible(true);
            }
            else if (c3.getText().equals("")) {
                justi.setText("Error!");
                justi.setForeground(Color.red);
                justi.setVisible(true);
            }
            else {
                String c1aux = c1.getText();
                if (c1aux.length()<3) {
                    String c2aux = c2.getText();
                    if (c2aux.length()<3){
                        String c3aux = c3.getText();
                        if (c3aux.length()<3) {
                            justi.setText("Good!");
                            justi.setForeground(Color.green);
                            justi.setVisible(true);
                            String clausula;
                            String clausulaux;
                            clausulaux = "[";
                            clausulaux += c1.getText();
                            clausulaux += "]";
                            clausulaux += " -> ";
                            clausulaux += "[";
                            clausulaux += c2.getText();
                            clausulaux += "]";
                            clausulaux += " -> ";
                            clausulaux += "[";
                            clausulaux += c3.getText();
                            clausulaux += "]";
                            clausula = clausulas.getText();
                            clausula += "Clausula ";
                            clausula += i;
                            clausula += ": ";
                            clausula += clausulaux;
                            clausula += "\n";
                            clausulas.setText(clausula);
                            ++i;
                            c1.setText("");
                            c2.setText("");
                            c3.setText("");
                        }
                        else {
                            justi.setText("Error!");
                            justi.setForeground(Color.red);
                            justi.setVisible(true);
                        }
                    }
                    else {
                        justi.setText("Error!");
                        justi.setForeground(Color.red);
                        justi.setVisible(true);
                    }
                }
                else {
                    justi.setText("Error!");
                    justi.setForeground(Color.red);
                    justi.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Authorbutton;
    private javax.swing.JButton Confbutton;
    private javax.swing.JButton Exitbutton;
    private javax.swing.JButton Instructionsbutton1;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Paperbutton;
    private javax.swing.JButton Returnbutton;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextArea clausulas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel justi;
    private javax.swing.JTextField numdelete;
    private javax.swing.JButton pathbutton;
    public static javax.swing.JTextField pathpublic;
    // End of variables declaration//GEN-END:variables
}
