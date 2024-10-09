/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DAM2_11
 */
public class elementoMixto extends javax.swing.JFrame {

    /**
     * Creates new form elementoMixto
     */
    public elementoMixto() {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup1.add(this.Opcion1);
        buttonGroup1.add(this.Opcion2);
        buttonGroup1.add(this.Opcion3);
        buttonGroup1.add(this.Opcion4);
        buttonGroup1.add(this.Opcion5);
        buttonGroup1.add(this.Opcion6);
        
        buttonGroup2.add(this.Opcion1Copia);
        buttonGroup2.add(this.Opcion2Copia);
        buttonGroup2.add(this.Opcion3Copia);
        buttonGroup2.add(this.Opcion4Copia);
        buttonGroup2.add(this.Opcion5Copia);
        buttonGroup2.add(this.Opcion6Copia);
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        textoCorreo = new javax.swing.JTextField();
        primerTexto = new javax.swing.JTextField();
        Opcion1 = new javax.swing.JRadioButton();
        Opcion2 = new javax.swing.JRadioButton();
        Opcion3 = new javax.swing.JRadioButton();
        Opcion4 = new javax.swing.JCheckBox();
        Opcion5 = new javax.swing.JCheckBox();
        Opcion6 = new javax.swing.JCheckBox();
        combobox = new javax.swing.JComboBox<>();
        spinner = new javax.swing.JSpinner();
        correo = new javax.swing.JLabel();
        botonValidar = new javax.swing.JToggleButton();
        slider = new javax.swing.JSlider();
        spinnerCopia = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        sliderCopia = new javax.swing.JSlider();
        textoCorreoCopia = new javax.swing.JTextField();
        primerTextoCopia = new javax.swing.JTextField();
        Opcion1Copia = new javax.swing.JRadioButton();
        Opcion2Copia = new javax.swing.JRadioButton();
        Opcion3Copia = new javax.swing.JRadioButton();
        Opcion4Copia = new javax.swing.JCheckBox();
        Opcion5Copia = new javax.swing.JCheckBox();
        Opcion6Copia = new javax.swing.JCheckBox();
        comboboxCopia = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI mixta");
        setResizable(false);

        textoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCorreoActionPerformed(evt);
            }
        });
        textoCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoCorreoKeyReleased(evt);
            }
        });

        primerTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerTextoActionPerformed(evt);
            }
        });
        primerTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                primerTextoKeyReleased(evt);
            }
        });

        Opcion1.setText("Opcion 1");
        Opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion1ActionPerformed(evt);
            }
        });

        Opcion2.setText("Opcion 2");
        Opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion2ActionPerformed(evt);
            }
        });

        Opcion3.setText("Opcion 3");
        Opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion3ActionPerformed(evt);
            }
        });

        Opcion4.setText("Opcion 4");
        Opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion4ActionPerformed(evt);
            }
        });

        Opcion5.setText("Opcion 5");
        Opcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion5ActionPerformed(evt);
            }
        });

        Opcion6.setText("Opcion 6");
        Opcion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion6ActionPerformed(evt);
            }
        });

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerStateChanged(evt);
            }
        });

        correo.setText("Correo");

        botonValidar.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAM2_11\\Documents\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-Enrique504\\b_off.png")); // NOI18N

        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        spinnerCopia.setEnabled(false);

        jLabel2.setText("Correo");
        jLabel2.setEnabled(false);

        jToggleButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAM2_11\\Documents\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-Enrique504\\b_off.png")); // NOI18N
        jToggleButton2.setEnabled(false);

        sliderCopia.setEnabled(false);
        sliderCopia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCopiaStateChanged(evt);
            }
        });

        textoCorreoCopia.setEnabled(false);
        textoCorreoCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCorreoCopiaActionPerformed(evt);
            }
        });

        primerTextoCopia.setEnabled(false);
        primerTextoCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerTextoCopiaActionPerformed(evt);
            }
        });

        Opcion1Copia.setText("Opcion 1");
        Opcion1Copia.setEnabled(false);
        Opcion1Copia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion1CopiaActionPerformed(evt);
            }
        });

        Opcion2Copia.setText("Opcion 2");
        Opcion2Copia.setEnabled(false);

        Opcion3Copia.setText("Opcion 3");
        Opcion3Copia.setEnabled(false);

        Opcion4Copia.setText("Opcion 4");
        Opcion4Copia.setEnabled(false);
        Opcion4Copia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion4CopiaActionPerformed(evt);
            }
        });

        Opcion5Copia.setText("Opcion 5");
        Opcion5Copia.setEnabled(false);

        Opcion6Copia.setText("Opcion 6");
        Opcion6Copia.setEnabled(false);
        Opcion6Copia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion6CopiaActionPerformed(evt);
            }
        });

        comboboxCopia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxCopia.setEnabled(false);
        comboboxCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCopiaActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Opcion3)
                            .addComponent(Opcion1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Opcion2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Opcion1Copia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Opcion2Copia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Opcion3Copia))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Opcion5)
                            .addComponent(Opcion5Copia)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textoCorreoCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Opcion4)
                                        .addComponent(Opcion6)
                                        .addComponent(Opcion6Copia)
                                        .addComponent(Opcion4Copia))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(primerTextoCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(primerTexto, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spinnerCopia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                .addComponent(spinner, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(combobox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboboxCopia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sliderCopia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Opcion4)
                                    .addComponent(Opcion1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(primerTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Opcion2)
                                .addComponent(Opcion5))
                            .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Opcion3)
                            .addComponent(Opcion6)
                            .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(botonValidar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Opcion1Copia)
                            .addComponent(Opcion4Copia)
                            .addComponent(primerTextoCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderCopia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Opcion2Copia)
                                .addComponent(Opcion5Copia))
                            .addComponent(spinnerCopia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Opcion3Copia)
                            .addComponent(Opcion6Copia)
                            .addComponent(comboboxCopia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jToggleButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCorreoCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion1ActionPerformed
        // TODO add your handling code here:
        this.Opcion1Copia.setSelected(this.Opcion1.isSelected());
        
        
    }//GEN-LAST:event_Opcion1ActionPerformed

    private void primerTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerTextoActionPerformed
        // TODO add your handling code here:
        this.primerTextoCopia.setText(this.primerTexto.getText());
        
        
        
    }//GEN-LAST:event_primerTextoActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
        this.comboboxCopia.setSelectedIndex(this.combobox.getSelectedIndex());
    }//GEN-LAST:event_comboboxActionPerformed

    private void primerTextoCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerTextoCopiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerTextoCopiaActionPerformed

    private void Opcion1CopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion1CopiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Opcion1CopiaActionPerformed

    private void comboboxCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCopiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxCopiaActionPerformed

    private void Opcion4CopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion4CopiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Opcion4CopiaActionPerformed

    private void Opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion2ActionPerformed
        // TODO add your handling code here:
           this.Opcion2Copia.setSelected(this.Opcion2.isSelected());
    }//GEN-LAST:event_Opcion2ActionPerformed

    private void Opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion3ActionPerformed
        // TODO add your handling code here:
           this.Opcion3Copia.setSelected(this.Opcion3.isSelected());
    }//GEN-LAST:event_Opcion3ActionPerformed

    private void Opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion4ActionPerformed
        // TODO add your handling code here:
           this.Opcion4Copia.setSelected(this.Opcion4.isSelected());
    }//GEN-LAST:event_Opcion4ActionPerformed

    private void Opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion5ActionPerformed
        // TODO add your handling code here:
           this.Opcion5Copia.setSelected(this.Opcion5.isSelected());
    }//GEN-LAST:event_Opcion5ActionPerformed

    private void textoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCorreoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_textoCorreoActionPerformed

    private void textoCorreoCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCorreoCopiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCorreoCopiaActionPerformed

    private void Opcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion6ActionPerformed
        // TODO add your handling code here:
         this.Opcion6Copia.setSelected(this.Opcion6.isSelected());
    }//GEN-LAST:event_Opcion6ActionPerformed

    private void Opcion6CopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion6CopiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Opcion6CopiaActionPerformed

    private void textoCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCorreoKeyReleased
        // TODO add your handling code here:
        this.textoCorreoCopia.setText(this.textoCorreo.getText());
        
    }//GEN-LAST:event_textoCorreoKeyReleased

    private void primerTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerTextoKeyReleased
        // TODO add your handling code here:
        
        this.primerTextoCopia.setText(this.primerTexto.getText());
    }//GEN-LAST:event_primerTextoKeyReleased

    private void spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerStateChanged
        // TODO add your handling code here:
        this.spinnerCopia.setValue(this.spinner.getValue());
    }//GEN-LAST:event_spinnerStateChanged

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        // TODO add your handling code here:
        this.sliderCopia.setValue(this.slider.getValue());
        
        
    }//GEN-LAST:event_sliderStateChanged

    private void sliderCopiaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCopiaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_sliderCopiaStateChanged

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
            java.util.logging.Logger.getLogger(elementoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elementoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elementoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elementoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elementoMixto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Opcion1;
    private javax.swing.JRadioButton Opcion1Copia;
    private javax.swing.JRadioButton Opcion2;
    private javax.swing.JRadioButton Opcion2Copia;
    private javax.swing.JRadioButton Opcion3;
    private javax.swing.JRadioButton Opcion3Copia;
    private javax.swing.JCheckBox Opcion4;
    private javax.swing.JCheckBox Opcion4Copia;
    private javax.swing.JCheckBox Opcion5;
    private javax.swing.JCheckBox Opcion5Copia;
    private javax.swing.JCheckBox Opcion6;
    private javax.swing.JCheckBox Opcion6Copia;
    private javax.swing.JToggleButton botonValidar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JComboBox<String> comboboxCopia;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField primerTexto;
    private javax.swing.JTextField primerTextoCopia;
    private javax.swing.JSlider slider;
    private javax.swing.JSlider sliderCopia;
    private javax.swing.JSpinner spinner;
    private javax.swing.JSpinner spinnerCopia;
    private javax.swing.JTextField textoCorreo;
    private javax.swing.JTextField textoCorreoCopia;
    // End of variables declaration//GEN-END:variables
}
