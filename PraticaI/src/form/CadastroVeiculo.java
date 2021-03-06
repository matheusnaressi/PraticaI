/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModeloVeiculo;
import model.Veiculo;
import service.ChamarQuandoSelecionar;
import service.PegaDadosVeículo;

/**
 *
 * @author elena
 */
public class CadastroVeiculo extends javax.swing.JFrame {

    public int codigo_veiculo = 0;
    private PegaDadosVeículo dadosveiculo;

    /**
     * Creates new form CadastroVeiculo
     */
    public CadastroVeiculo() {
        initComponents();
        jButtonSelecionar.setVisible(false);
        service.CadastroVeiculo cad = new service.CadastroVeiculo();
        cad.ListaVeiculo(jTextFieldDescricao.getText(), (DefaultTableModel) jTabelaVeiculos.getModel());
    }

    CadastroVeiculo(PegaDadosVeículo pegaDadosVeículo) {
        this();
        jButtonSelecionar.setVisible(true);
        this.dadosveiculo = pegaDadosVeículo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void limparCampos() {
        jTextFieldDescricao.setText("");
        jTextFieldPlaca1.setText("");
        // jComboBoxModelo.setComponentOrientation("");
        jTextFieldPessoa.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonFechar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldPessoa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaVeiculos = new javax.swing.JTable();
        jTextFieldPlaca1 = new javax.swing.JTextField();
        jComboBoxModelo = new javax.swing.JComboBox<String>();
        jToggleButtonPessoa = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jBPesquisar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldLista1 = new javax.swing.JTextField();
        jLabelTipoPessoa1 = new javax.swing.JLabel();
        jButtonSelecionar = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonFechar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 100, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Modelo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButtonExcluir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 110, -1));

        jButtonSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 110, -1));

        jButtonAlterar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 110, -1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Descrição ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Placa");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Pessoa");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel2.add(jTextFieldDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 330, -1));

        jTextFieldPessoa.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jTextFieldPessoaAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jTextFieldPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 330, -1));

        jTabelaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Placa", "Modelo", "Pessoa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabelaVeiculos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 860, 120));
        jPanel2.add(jTextFieldPlaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 170, -1));

        jComboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModeloActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 330, -1));

        jToggleButtonPessoa.setText("...");
        jToggleButtonPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPessoaActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 70, -1));

        jPanel3.setBackground(new java.awt.Color(51, 110, 123));

        jBPesquisar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBPesquisar.setForeground(new java.awt.Color(51, 51, 51));
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Consulta de veículos:");

        jTextFieldLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLista1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(654, 654, 654)
                .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextFieldLista1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar)
                    .addComponent(jLabel13))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextFieldLista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 50));

        jLabelTipoPessoa1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelTipoPessoa1.setForeground(new java.awt.Color(51, 110, 123));
        jLabelTipoPessoa1.setText("Cadastro de Veículos");
        jPanel2.add(jLabelTipoPessoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jButtonSelecionar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        service.CadastroVeiculo cad = new service.CadastroVeiculo();
        String descricao = jTextFieldDescricao.getText();
        String placa = jTextFieldPlaca1.getText();
        ModeloVeiculo modelo = (ModeloVeiculo) jComboBoxModelo.getSelectedItem();
        String modeloId = String.valueOf(modelo.getIdmodeloveiculo());
        String pessoa = jTextFieldPessoa.getText();
        //combo da marca 
        //Botão para pegar a pessoa 
        if (descricao == "") {
            JOptionPane.showMessageDialog(this, "Preencher o campo descrição !");
        } else if (placa == null) {
            JOptionPane.showMessageDialog(this, "Preencher o campo placa!");
        }
        if (codigo_veiculo == 0) {
            cad.salvarCadVeiculo(descricao, placa, modeloId, pessoa);
        } else {
            cad.AlterarCadVeiculo(descricao, placa, modeloId, pessoa, codigo_veiculo);
            jButtonAlterar.setEnabled(true);
        }
        codigo_veiculo = 0;
        limparCampos();
        cad.ListaVeiculo(jTextFieldDescricao.getText(), (DefaultTableModel) jTabelaVeiculos.getModel());


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        int linha = jTabelaVeiculos.getSelectedRow();
        if (linha >= 0) {
            int id = Integer.parseInt(jTabelaVeiculos.getValueAt(linha, 0).toString());
            service.CadastroVeiculo cad = new service.CadastroVeiculo();
            Veiculo veiculo = cad.buscaPorId(id);

            codigo_veiculo = id;
            jTextFieldDescricao.setText(veiculo.getNomemodelo());
            jTextFieldPlaca1.setText(veiculo.getPlacaveiculo());
            jComboBoxModelo.setSelectedItem(veiculo.getModelo());
            jTextFieldPessoa.setText(String.valueOf(veiculo.getPessoa().getId()));

            jButtonAlterar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela!");
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTextFieldPessoaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextFieldPessoaAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPessoaAncestorMoved

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Você está certo disso?")
                == JOptionPane.YES_OPTION) {
            int linha = jTabelaVeiculos.getSelectedRow();
            if (linha >= 0) {
                int codigo = Integer.parseInt(
                        String.valueOf(jTabelaVeiculos.getValueAt(linha, 0))
                );
                service.CadastroVeiculo cad = new service.CadastroVeiculo();
                cad.deletarCadVeiculo(codigo);
                cad.ListaVeiculo(jTextFieldDescricao.getText(), (DefaultTableModel) jTabelaVeiculos.getModel());
                limparCampos();
                jButtonAlterar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma linha!");
            }
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        service.CadastroVeiculo cad = new service.CadastroVeiculo();
        List<ModeloVeiculo> listaVeiculo = cad.listaModelos();
        DefaultComboBoxModel model = new DefaultComboBoxModel<>(listaVeiculo.toArray());
        jComboBoxModelo.setModel(model);

    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxModeloActionPerformed

    private void jToggleButtonPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPessoaActionPerformed
        CadastroPessoa form = new CadastroPessoa(new ChamarQuandoSelecionar() {
            @Override
            public void ReceberValor(int id) {
                jTextFieldPessoa.setText(String.valueOf(id));
            }
        });
        form.setVisible(true);
    }//GEN-LAST:event_jToggleButtonPessoaActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        service.CadastroVeiculo cad = new service.CadastroVeiculo();
        cad.ListaVeiculo(jTextFieldDescricao.getText(), (DefaultTableModel) jTabelaVeiculos.getModel());
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jTextFieldLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLista1ActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        int linha = jTabelaVeiculos.getSelectedRow();
        if (linha >= 0) {
            int codigo = Integer.parseInt(
                    String.valueOf(jTabelaVeiculos.getValueAt(linha, 0))
            );
            String placa = jTabelaVeiculos.getValueAt(linha, 2).toString();
            String modelo = jTabelaVeiculos.getValueAt(linha, 3).toString();
            dadosveiculo.ReceberValor(codigo, placa, modelo);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!");
        }
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JComboBox<String> jComboBoxModelo;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTipoPessoa1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaVeiculos;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldLista1;
    private javax.swing.JTextField jTextFieldPessoa;
    private javax.swing.JTextField jTextFieldPlaca1;
    private javax.swing.JToggleButton jToggleButtonPessoa;
    // End of variables declaration//GEN-END:variables

}
