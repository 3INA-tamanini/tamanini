
package figureGeometriche;


public class TriangoloForm extends javax.swing.JFrame {
     Triangolo t;
    
    public TriangoloForm() {
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

        lblTriangolo = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        lblLato2 = new javax.swing.JLabel();
        txtLato2 = new javax.swing.JTextField();
        txtLato3 = new javax.swing.JTextField();
        lblLato3 = new javax.swing.JLabel();
        lblDatiDiInput = new javax.swing.JLabel();
        lblDatiDiOutput = new javax.swing.JLabel();
        lblLato4 = new javax.swing.JLabel();
        txtLato1 = new javax.swing.JTextField();
        btnCalcolaPerimetro = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        btnCalcolaArea = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTriangolo.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        lblTriangolo.setText("Programma per fare cose su un triangolo");

        lblPerimetro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPerimetro.setText("Perimetro:");

        txtPerimetro.setEditable(false);
        txtPerimetro.setBackground(new java.awt.Color(40, 220, 20));
        txtPerimetro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerimetroActionPerformed(evt);
            }
        });

        lblLato2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLato2.setText("Lato 2:");

        txtLato2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLato2ActionPerformed(evt);
            }
        });

        txtLato3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLato3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLato3ActionPerformed(evt);
            }
        });

        lblLato3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLato3.setText("Lato 3:");

        lblDatiDiInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDatiDiInput.setText("Dati Di Input");

        lblDatiDiOutput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDatiDiOutput.setText("Dati Di Output");

        lblLato4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLato4.setText("Lato 1:");

        txtLato1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLato1ActionPerformed(evt);
            }
        });

        btnCalcolaPerimetro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcolaPerimetro.setText("Calcola");
        btnCalcolaPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcolaPerimetroActionPerformed(evt);
            }
        });

        lblArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblArea.setText("Area:");

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(40, 220, 20));
        txtArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });

        btnCalcolaArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcolaArea.setText("Calcola");
        btnCalcolaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcolaAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblTriangolo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLato4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLato1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblDatiDiInput)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDatiDiOutput)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPerimetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcolaPerimetro))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLato3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLato3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLato2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLato2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(lblArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcolaArea)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTriangolo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatiDiInput)
                    .addComponent(lblDatiDiOutput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLato4)
                    .addComponent(txtLato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerimetro)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcolaPerimetro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLato2)
                    .addComponent(txtLato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArea)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcolaArea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLato3)
                    .addComponent(txtLato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerimetroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerimetroActionPerformed

    private void txtLato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLato2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLato2ActionPerformed

    private void txtLato3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLato3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLato3ActionPerformed

    private void txtLato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLato1ActionPerformed

    private void btnCalcolaPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcolaPerimetroActionPerformed
        
        float n1 = Float.parseFloat(txtLato1.getText());
        float n2 = Float.parseFloat(txtLato2.getText());
        float n3 = Float.parseFloat(txtLato3.getText());
        
        t = new Triangolo(n1, n2, n3);
        
        float p = t.perimetro();
        
        txtPerimetro.setText(String.valueOf(p));
        
    }//GEN-LAST:event_btnCalcolaPerimetroActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void btnCalcolaAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcolaAreaActionPerformed
        float n1 = Float.parseFloat(txtLato1.getText());
        float n2 = Float.parseFloat(txtLato2.getText());
        float n3 = Float.parseFloat(txtLato3.getText());
        
        t = new Triangolo(n1, n2, n3);
        
        float a = t.area();
        txtArea.setText(String.valueOf(a));
    }//GEN-LAST:event_btnCalcolaAreaActionPerformed

    
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
            java.util.logging.Logger.getLogger(TriangoloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriangoloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriangoloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriangoloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriangoloForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcolaArea;
    private javax.swing.JButton btnCalcolaPerimetro;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblDatiDiInput;
    private javax.swing.JLabel lblDatiDiOutput;
    private javax.swing.JLabel lblLato2;
    private javax.swing.JLabel lblLato3;
    private javax.swing.JLabel lblLato4;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblTriangolo;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLato1;
    private javax.swing.JTextField txtLato2;
    private javax.swing.JTextField txtLato3;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
