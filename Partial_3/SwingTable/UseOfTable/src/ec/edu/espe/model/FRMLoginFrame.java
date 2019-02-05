
package ec.edu.espe.model;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author bryan
 */
public class FRMLoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public FRMLoginFrame() {
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

        cmbChoose = new javax.swing.JComboBox<>();
        btnGo = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtDesc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnTable = new javax.swing.JMenu();

        setTitle("¡Bienvenido a nuestro sistema!");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cmbChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Bodega", "Gerente" }));
        cmbChoose.setToolTipText("Usted se identifica como...");
        cmbChoose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbChoose.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbChooseItemStateChanged(evt);
            }
        });
        cmbChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseActionPerformed(evt);
            }
        });

        btnGo.setText("Ingresar");
        btnGo.setToolTipText("Botón para el inicio de sesión, este puede habilitarse o deshabilitarse dependiendo de la persona que se esté seleccionando\n");
        btnGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoMouseClicked(evt);
            }
        });
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        txtPass.setToolTipText("Si está habilitado, ingrese la contraseña del propietario de la cuenta respectiva");
        txtPass.setEnabled(false);
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });

        txtDesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDesc.setText("Elija su tipo de inicio de sesión");
        txtDesc.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido al sistema contable de usuarios");

        btnTable.setText("Tabla de Registro");
        btnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnTable);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtDesc)
                        .addGap(62, 62, 62)
                        .addComponent(cmbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGo)
                                .addGap(61, 61, 61))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesc))
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGo)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbChooseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbChooseItemStateChanged
   
    }//GEN-LAST:event_cmbChooseItemStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       if(cmbChoose.getSelectedItem().toString()=="Gerente")
       { 
           txtPass.setEnabled(false);
       }
    }//GEN-LAST:event_formComponentShown

    private void cmbChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseActionPerformed
       if(cmbChoose.getSelectedItem().toString()=="Cliente")
       { 
           txtPass.setText("");
           txtPass.setEnabled(false);
           btnGo.setEnabled(true);
           
       }
       else if(cmbChoose.getSelectedItem().toString()=="Gerente")
       { 
          txtPass.setText("");
          txtPass.setEnabled(true);
          btnGo.setEnabled(false);
       }
       else if(cmbChoose.getSelectedItem().toString()=="Bodega")
       { 
 
           txtPass.setText("");
           txtPass.setEnabled(true);
           btnGo.setEnabled(false);
       }
    }//GEN-LAST:event_cmbChooseActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
 
    }//GEN-LAST:event_btnGoActionPerformed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
    
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        if(txtPass.getText().equals(""))
        {
            btnGo.setEnabled(false);
        }
        else
        {
            btnGo.setEnabled(true); 
        }       
    }//GEN-LAST:event_txtPassKeyReleased

    private void btnGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoMouseClicked
        if(cmbChoose.getSelectedItem().toString()=="Gerente")
        {
            if(txtPass.getText().equals("admin"))
            {
                 //amostrar salesnote 
            }
            else
            {
               showMessageDialog(null, "Contraseña Incorrecta para el Gerente", "ERROR", ERROR_MESSAGE);  
               txtPass.setText("");
            }
        
        }
        else if(cmbChoose.getSelectedItem().toString()=="Bodega")
        {
            
            if(txtPass.getText().equals("bodega"))
            {
                //amostrar storehouse
            }
            else
            {
               showMessageDialog(null, "Contraseña Incorrecta para el Bodeguero", "ERROR", ERROR_MESSAGE);  
               txtPass.setText("");
            }
            
        }
        else if(cmbChoose.getSelectedItem().toString()=="Cliente")
        {
            this.setVisible(false);
    
        }
        
    }//GEN-LAST:event_btnGoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened

    private void btnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTableMouseClicked
      new FRMTable().setVisible(true);
    }//GEN-LAST:event_btnTableMouseClicked

   
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
            java.util.logging.Logger.getLogger(FRMLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JMenu btnTable;
    private javax.swing.JComboBox<String> cmbChoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel txtDesc;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}