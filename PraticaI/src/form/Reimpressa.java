/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author elena
 */
public class Reimpressa extends javax.swing.JFrame {

    /**
     * Creates new form Reimpressa
     */
    public Reimpressa() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jBPesquisar1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldLista = new javax.swing.JTextField();
        jButtonCancelar1 = new javax.swing.JButton();
        jButtonCancelar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPessoa = new javax.swing.JTextField();
        jButtonBuscaPessoa2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Consulta de veículos:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 232, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 110, 123));

        jBPesquisar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBPesquisar1.setForeground(new java.awt.Color(51, 51, 51));
        jBPesquisar1.setText("Pesquisar");
        jBPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisar1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Reimpressão da ordem");

        jTextFieldLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(401, 401, 401)
                .addComponent(jBPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(165, Short.MAX_VALUE)
                    .addComponent(jTextFieldLista, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar1)
                    .addComponent(jLabel14))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(jTextFieldLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        jButtonCancelar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonCancelar1.setText("Imprimir");
        jPanel3.add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 120, -1));

        jButtonCancelar2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonCancelar2.setText("Fechar");
        jPanel3.add(jButtonCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 120, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Nome do Cliente");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel3.add(jTextFieldPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 410, 20));

        jButtonBuscaPessoa2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonBuscaPessoa2.setText("Buscar");
        jPanel3.add(jButtonBuscaPessoa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 130, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Data de entrada ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jFormattedTextField1.setText("    /   /   ");
        jPanel3.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Tipo de serviço", "Data entrada"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 660, 90));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisar1ActionPerformed
       
    }//GEN-LAST:event_jBPesquisar1ActionPerformed

    private void jTextFieldListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldListaActionPerformed

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
            java.util.logging.Logger.getLogger(Reimpressa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reimpressa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reimpressa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reimpressa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reimpressa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar1;
    private javax.swing.JButton jButtonBuscaPessoa2;
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonCancelar2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldLista;
    private javax.swing.JTextField jTextFieldPessoa;
    // End of variables declaration//GEN-END:variables
}
