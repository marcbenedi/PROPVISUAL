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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static com.prop45.searchtacp.Cargando.panelmegadinamico;
import static com.prop45.searchtacp.CreatePredPath.pathpred;
import static com.prop45.searchtacp.Portadaylogins.paneldinamico;
import static com.prop45.searchtacp.variables.isAdmin;

/**
 *
 * @author Miquel Baena
 */
public class Busquedauser extends javax.swing.JPanel {

    public int i;
    /**
     * Creates new form Busquedauser
     */
    public Busquedauser() throws FileNotFoundException, IOException {
        i = 1;
        initComponents();
        clausulas.setEditable(false);
        justi.setVisible(false);
        c1.setForeground(Color.black);
        c3.setForeground(Color.black);
        c2.setForeground(Color.black);
        FileReader file = new FileReader("src/com/prop45/ficheros/actualuser.txt");
        BufferedReader reader = new BufferedReader(file);
        String usuario;
        String line =  reader.readLine();
        int i = 0;
        if (line != null) {
            while (line.charAt(i) != ' ') i++;
            usuario = line.substring(0,i);
            userlabel.setText(usuario);
        }
        ImageIcon Logo_image = new ImageIcon("src/com/prop45/Images/descarga.png");
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

        userlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pathuser = new javax.swing.JTextField();
        Instructionsbutton1 = new javax.swing.JButton();
        pathbutton = new javax.swing.JButton();
        c2 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        Authorbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Confbutton = new javax.swing.JButton();
        Paperbutton = new javax.swing.JButton();
        Returnbutton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Exitbutton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clausulas = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        numdelete = new javax.swing.JTextField();
        justi = new javax.swing.JLabel();

        userlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userlabel.setText("username");

        jLabel1.setText("Path:");

        pathuser.setForeground(new java.awt.Color(153, 153, 153));
        pathuser.setText("Escribe tu path");
        pathuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pathuserMouseClicked(evt);
            }
        });

        Instructionsbutton1.setMnemonic('H');
        Instructionsbutton1.setText("Help");
        Instructionsbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instructionsbutton1ActionPerformed(evt);
            }
        });

        pathbutton.setMnemonic('P');
        pathbutton.setText("Predefined Paths");
        pathbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathbuttonActionPerformed(evt);
            }
        });

        c2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c2.setForeground(new java.awt.Color(153, 153, 153));

        c1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c1.setForeground(new java.awt.Color(153, 153, 153));

        c3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c3.setForeground(new java.awt.Color(153, 153, 153));

        Authorbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Authorbutton.setMnemonic('A');
        Authorbutton.setText("Author");
        Authorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorbuttonActionPerformed(evt);
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

        Paperbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Paperbutton.setMnemonic('P');
        Paperbutton.setText("Paper");
        Paperbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperbuttonActionPerformed(evt);
            }
        });

        Returnbutton.setMnemonic('R');
        Returnbutton.setText("Return");
        Returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnbuttonActionPerformed(evt);
            }
        });

        jButton3.setMnemonic('B');
        jButton3.setText("Realiza búsqueda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Exitbutton.setMnemonic('E');
        Exitbutton.setText("Exit");
        Exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbuttonActionPerformed(evt);
            }
        });

        jButton2.setText("Añadir mas clausulas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        clausulas.setColumns(20);
        clausulas.setRows(5);
        jScrollPane1.setViewportView(clausulas);

        jButton4.setMnemonic('D');
        jButton4.setText("Elimnar Clausula");
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

        justi.setText("error!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pathuser, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pathbutton)
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Confbutton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Authorbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Paperbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(numdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(justi)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(Instructionsbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userlabel)
                            .addComponent(Instructionsbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(justi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Authorbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Confbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paperbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(numdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Instructionsbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instructionsbutton1ActionPerformed
        // TODO add your handling code here:
        Instrucciones i = new Instrucciones();
        i.setVisible(true);
    }//GEN-LAST:event_Instructionsbutton1ActionPerformed

    private void pathbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathbuttonActionPerformed

    private void AuthorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorbuttonActionPerformed
        // TODO add your handling code here:
        escribir_author ea = new escribir_author();
        ea.setVisible(true);
    }//GEN-LAST:event_AuthorbuttonActionPerformed

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

    private void PaperbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaperbuttonActionPerformed
        // TODO add your handling code here:
        escribir_paper ep = new escribir_paper();
        ep.setVisible(true);
    }//GEN-LAST:event_PaperbuttonActionPerformed

    private void ReturnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnbuttonActionPerformed
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
            Logger.getLogger(Busquedauser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReturnbuttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            FileWriter TextOut = null;
            File TextFile = new File("src/com/prop45/ficheros/historial.txt");
            TextOut = new FileWriter(TextFile, true);
            TextOut.write(pathuser.getText());
            TextOut.write("\n");
            TextOut.close();
            
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
        } catch (IOException ex) {
            Logger.getLogger(Busquedauser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ExitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbuttonActionPerformed
        // TODO add your handling code here:
        Asegurar_exit ae = new Asegurar_exit();
        ae.setVisible(true);
    }//GEN-LAST:event_ExitbuttonActionPerformed

    private void pathuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathuserMouseClicked
        // TODO add your handling code here:
        pathuser.setForeground(Color.BLACK);
        if (pathuser.getText().equals("Escribe tu path")){
            pathuser.setText(null);
        }
    }//GEN-LAST:event_pathuserMouseClicked

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
    public static javax.swing.JTextField pathuser;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}