/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import service.ChamarQuandoSelecionar;
import service.PegaDadosVeículo;

/**
 *
 * @author elena
 */
public class ConsultaHistoricoVeiculo extends javax.swing.JFrame {

    public int codigo_pessoa = 0;
    public int codigo_veiculo = 0;

    /**
     * Creates new form ConsultaHistoricoVeiculo
     */
    public ConsultaHistoricoVeiculo() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonVeiculo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldVeiculo = new javax.swing.JTextField();
        jButtonVeiculo1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPessoa = new javax.swing.JTextField();
        jButtonVeiculo2 = new javax.swing.JButton();
        jButtonImprimirOrdem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 110, 123));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Histórico Veículo / Pessoa ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(494, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 40));

        jButtonVeiculo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonVeiculo.setText("Buscar");
        jButtonVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 80, 20));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Veículo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel1.add(jTextFieldVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, -1));

        jButtonVeiculo1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonVeiculo1.setText("Buscar");
        jButtonVeiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeiculo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVeiculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 80, 20));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setText("Pessoas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel1.add(jTextFieldPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, -1));

        jButtonVeiculo2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonVeiculo2.setText("Imprimir");
        jButtonVeiculo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeiculo2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVeiculo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 120, 30));

        jButtonImprimirOrdem.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonImprimirOrdem.setText("Imprimir Ordem");
        jPanel1.add(jButtonImprimirOrdem, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 170));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeiculoActionPerformed
        CadastroVeiculo form = new CadastroVeiculo(new PegaDadosVeículo() {
            @Override
            public void ReceberValor(int id, String placa, String nome_modelo) {
                jTextFieldVeiculo.setText(String.valueOf(placa));
                codigo_veiculo = id;
            }
        });
        form.setVisible(true);


    }//GEN-LAST:event_jButtonVeiculoActionPerformed

    private void jButtonVeiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeiculo1ActionPerformed
        CadastroPessoa form = new CadastroPessoa(new ChamarQuandoSelecionar() {
            @Override
            public void ReceberValor(int id) {
                codigo_pessoa = id;
                service.Lancamentos lan = new service.Lancamentos();
                if (codigo_pessoa != 0) {
                    String docu = lan.buscaDoc(codigo_pessoa);
                    jTextFieldPessoa.setText(docu);
                }
            }
        });
        form.setVisible(true);
    }//GEN-LAST:event_jButtonVeiculo1ActionPerformed

    private void jButtonVeiculo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeiculo2ActionPerformed
        if (codigo_pessoa != 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/PraticaI", "root", "");
                HashMap parametros = new HashMap();
                parametros.put("pessoa_id", codigo_pessoa);
                JasperPrint print = JasperFillManager.fillReport("src/relatorios/ResumoPessoa.jasper", parametros, conn);
                JasperViewer jv = new JasperViewer(print, false);
                jv.setVisible(true); //chama o formulario para visualização
                jv.toFront(); //set o formulario a frente da aplicação
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório!\nErro:" + ex);
            }
        } else if (codigo_veiculo != 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/PraticaI", "root", "");
                HashMap parametros = new HashMap();
                parametros.put("veiculo_id", codigo_veiculo);
                JasperPrint print = JasperFillManager.fillReport("src/relatorios/ResumoVeiculo.jasper", parametros, conn);
                JasperViewer jv = new JasperViewer(print, false);
                jv.setVisible(true); //chama o formulario para visualização
                jv.toFront(); //set o formulario a frente da aplicação
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório!\nErro:" + ex);
            }
        }
    }//GEN-LAST:event_jButtonVeiculo2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaHistoricoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaHistoricoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaHistoricoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaHistoricoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaHistoricoVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImprimirOrdem;
    private javax.swing.JButton jButtonVeiculo;
    private javax.swing.JButton jButtonVeiculo1;
    private javax.swing.JButton jButtonVeiculo2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldPessoa;
    private javax.swing.JTextField jTextFieldVeiculo;
    // End of variables declaration//GEN-END:variables
}
