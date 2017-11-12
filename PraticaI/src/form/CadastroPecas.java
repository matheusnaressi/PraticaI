/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Cache;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Peca;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author naressi
 */
public class CadastroPecas extends javax.swing.JFrame {
    
    public int codigo_peca = 0;

    /**
     * Creates new form Pecas
     */
    public CadastroPecas() {
        initComponents();
        service.CadastroPecas cad = new service.CadastroPecas();
        cad.ListaPecas(jTDescricao.getText(), (DefaultTableModel) jTableListagemCadPecas.getModel());
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
        jLabelTipoPessoa = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListagemCadPecas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTDescricao = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextQuantida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextValorUnitario = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextDataEntrada = new javax.swing.JFormattedTextField();

        setName("frmCadastroPecas"); // NOI18N
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(117, 117, 123));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 890, 50));

        jLabelTipoPessoa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelTipoPessoa.setForeground(new java.awt.Color(58, 83, 155));
        jLabelTipoPessoa.setText("Cadastro de Peças");
        jPanel2.add(jLabelTipoPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jButtonFechar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFechar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 100, 30));

        jPanel5.setBackground(new java.awt.Color(29, 31, 39));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\elena\\Desktop\\a\\Listrinhas.png")); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\elena\\Desktop\\a\\Configurações.png")); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 478, 50, 40));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\elena\\Desktop\\a\\Informação.png")); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 50, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 530));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("Localizar");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(29, 31, 39));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 810, 20));

        jTableListagemCadPecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descrição", "Quantidade", "Data entrada", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListagemCadPecas.setUpdateSelectionOnSort(false);
        jTableListagemCadPecas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListagemCadPecasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListagemCadPecas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 870, 100));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Consulta de peças:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jTDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDescricaoActionPerformed(evt);
            }
        });
        jPanel2.add(jTDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 600, -1));

        jBPesquisar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(jBPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 130, -1));

        jBSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jBSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 90, -1));

        jBAlterar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(jBAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, -1));

        jBDeletar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBDeletar.setText("Excluir");
        jBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarActionPerformed(evt);
            }
        });
        jPanel2.add(jBDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade estoque");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));
        jPanel2.add(jTextQuantida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 410, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Valor unitário");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jTextValorUnitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        jTextValorUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormataValor(evt);
            }
        });
        jTextValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValorUnitarioActionPerformed(evt);
            }
        });
        jPanel2.add(jTextValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 410, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Descrição");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        jPanel2.add(jTextDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 480, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Data entrada");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        try {
            jTextDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextDataEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataEntradaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextDataEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limparCampos() {
        jTextDescricao.setText("");
        jTextQuantida.setText("");
        jTextDataEntrada.setText("");
        jTextValorUnitario.setText("");
    }

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        service.CadastroPecas cad = new service.CadastroPecas();
        String descricao = jTextDescricao.getText();
        int qtd_estoque = Integer.parseInt(jTextQuantida.getText());
        String data_entrada = jTextDataEntrada.getText();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = formato.parse(data_entrada);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroPecas.class.getName()).log(Level.SEVERE, null, ex);
        }
        String valor = jTextValorUnitario.getText();
        valor = valor.replace(".", "").replace(".", "").replace(".", "").replace(".", "").replace(",", ".");
        double valor_uni = Double.parseDouble(valor);
        if (descricao == "") {
            JOptionPane.showMessageDialog(this, "Preencher a descrição da peça!");
        } else if (data_entrada == null) {
            JOptionPane.showMessageDialog(this, "Preencher a data de entrada da peça!");
        } else if (valor_uni == 0.00) {
            JOptionPane.showMessageDialog(this, "Preencher o valor unitário da peça!");
        }
        if (codigo_peca == 0) {
            cad.salvarCadPecas(descricao, qtd_estoque, valor_uni, data);
        } else {
            cad.AlterarCadPecas(descricao, qtd_estoque, valor_uni, data, codigo_peca);
            codigo_peca = 0;
            jBAlterar.setEnabled(true);
        }
        limparCampos();
        cad.ListaPecas(jTDescricao.getText(), (DefaultTableModel) jTableListagemCadPecas.getModel());
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jTextValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorUnitarioActionPerformed

    }//GEN-LAST:event_jTextValorUnitarioActionPerformed

    private void FormataValor(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormataValor
    }//GEN-LAST:event_FormataValor

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        int linha = jTableListagemCadPecas.getSelectedRow();
        if (linha >= 0) {
            String codigo = String.valueOf(jTableListagemCadPecas.getValueAt(linha, 0));
            String descricao = String.valueOf(jTableListagemCadPecas.getValueAt(linha, 1));
            String quantidade = String.valueOf(jTableListagemCadPecas.getValueAt(linha, 2));
            String data_entrada = String.valueOf(jTableListagemCadPecas.getValueAt(linha, 3));
            String valor = String.valueOf(jTableListagemCadPecas.getValueAt(linha, 4));
            codigo_peca = Integer.parseInt(codigo);
            
            jTextDescricao.setText(descricao);
            jTextQuantida.setText(quantidade);
            jTextValorUnitario.setText(valor);
            jTextDataEntrada.setText(data_entrada);
            
            jBAlterar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela!");
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Você está certo disso?")
                == JOptionPane.YES_OPTION) {
            int linha = jTableListagemCadPecas.getSelectedRow();
            if (linha >= 0) {
                int codigo = Integer.parseInt(
                        String.valueOf(jTableListagemCadPecas.getValueAt(linha, 0))
                );
                service.CadastroPecas cad = new service.CadastroPecas();
                cad.deletarCadPecas(codigo);
                cad.ListaPecas(jTDescricao.getText(), (DefaultTableModel) jTableListagemCadPecas.getModel());
                limparCampos();
                 jBAlterar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma linha!");
            }
        }
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jTableListagemCadPecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListagemCadPecasMouseClicked
        if (evt.getSource() == jTableListagemCadPecas && evt.getClickCount() == 2) {
            jBAlterarActionPerformed(null);
        }
    }//GEN-LAST:event_jTableListagemCadPecasMouseClicked

    private void jTDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDescricaoActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        service.CadastroPecas cad = new service.CadastroPecas();
        cad.ListaPecas(jTDescricao.getText(), (DefaultTableModel) jTableListagemCadPecas.getModel());
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jTextDataEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPecas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTipoPessoa;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTDescricao;
    private javax.swing.JTable jTableListagemCadPecas;
    private javax.swing.JFormattedTextField jTextDataEntrada;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextQuantida;
    private javax.swing.JFormattedTextField jTextValorUnitario;
    // End of variables declaration//GEN-END:variables
}
