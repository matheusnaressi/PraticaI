/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elena
 */
public class CadastroPessoa extends javax.swing.JFrame {
    public int codigo_pessoa = 0;

    /**
     * Creates new form CadastroPessoa
     */
    public CadastroPessoa() {
        initComponents();
        service.CadastroPessoa cad = new service.CadastroPessoa();
        cad.ListaPessoa("", (DefaultTableModel) jTableTabela.getModel());
        
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonJuridica = new javax.swing.JRadioButton();
        jRadioButtonFisica = new javax.swing.JRadioButton();
        jLabelTipoPessoa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButtonFechar = new javax.swing.JButton();
        jPasswordSenha = new javax.swing.JPasswordField();
        jTextFieldDocumento = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelTipoPessoa1 = new javax.swing.JLabel();
        jButtonExcluir1 = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonAlterar = new javax.swing.JButton();

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
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setName("CadastroPessoa"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(117, 117, 123));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 740, 60));

        jRadioButtonJuridica.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jRadioButtonJuridica.setText("Juridica");
        jPanel2.add(jRadioButtonJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));

        jRadioButtonFisica.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jRadioButtonFisica.setText("Física");
        jRadioButtonFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFisicaActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 70, -1));

        jLabelTipoPessoa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelTipoPessoa.setForeground(new java.awt.Color(204, 0, 51));
        jLabelTipoPessoa.setText("Cadastro");
        jPanel2.add(jLabelTipoPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Tipo Pessoa", "Documento"
            }
        ));
        jScrollPane1.setViewportView(jTableTabela);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 700, 90));

        jButtonFechar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 100, 30));

        jPasswordSenha.setText("jPasswordField1");
        jPanel2.add(jPasswordSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, -1));
        jPanel2.add(jTextFieldDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 370, -1));

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 370, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Nome ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Documento");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 80, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Senha");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jPanel4.setBackground(new java.awt.Color(29, 31, 39));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\elena\\Desktop\\a\\Listrinhas.png")); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\elena\\Desktop\\a\\Configurações.png")); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\elena\\Desktop\\a\\Informação.png")); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 50, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 510));

        jLabelTipoPessoa1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelTipoPessoa1.setText("Tipo pessoa");
        jPanel2.add(jLabelTipoPessoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        jButtonExcluir1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonExcluir1.setText("Excluir");
        jButtonExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluir1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonExcluir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 89, -1));

        jButtonSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 89, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Localizar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(29, 31, 39));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 660, 20));

        jButtonAlterar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 89, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFisicaActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

      public void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldDocumento.setText("");
        jPasswordSenha.setText("");
        jRadioButtonFisica.setText("");
        jRadioButtonJuridica.setText("");
        
    }
   
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        
        service.CadastroPessoa cad = new service.CadastroPessoa();
        String nome = jTextFieldNome.getText();
        String documento = jTextFieldDocumento.getText();
        String tipopessoa = "";
        if (!jRadioButtonFisica.isSelected()) {
            tipopessoa = "1"; //pessoa juridica
        } else {
            tipopessoa = "2"; //pessoa fisica
        }
   
        String senha = jPasswordSenha.getText();
       
        
        if (nome == "") {
            JOptionPane.showMessageDialog(this, "Preencher o campo nome!");
        } else if (tipopessoa == "") {
            JOptionPane.showMessageDialog(this, "Preencher o tipo de pessoa");
        } else if (documento == "") {
            JOptionPane.showMessageDialog(this, "Preencher o campo documento!");
        }
        if (codigo_pessoa == 0) {
            cad.salvarCadPessoa(nome, documento, tipopessoa, senha);
        } else {
            cad.AlterarCadPessoa(nome, documento, tipopessoa, senha,codigo_pessoa);
            codigo_pessoa = 0;
            jButtonAlterar.setEnabled(true);
        }
        limparCampos();
        cad.ListaPessoa("", (DefaultTableModel) jTableTabela.getModel());
        
   
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
      
        int linha = jTableTabela.getSelectedRow();
        if (linha >= 0) {
            String codigo = String.valueOf(jTableTabela.getValueAt(linha, 0));
            String nome = String.valueOf(jTableTabela.getValueAt(linha, 1));
            String tipopessoa = String.valueOf(jTableTabela.getValueAt(linha, 2));
            String documento = String.valueOf(jTableTabela.getValueAt(linha, 3));
       
            codigo_pessoa= Integer.parseInt(codigo);
            
            jTextFieldNome.setText(nome);
             
        if (tipopessoa == "1") {//pessoa juridica
            jRadioButtonJuridica.setSelected(true);
        } else {
           jRadioButtonFisica.setSelected(true);
        }
            jTextFieldDocumento.setText(documento);
            jButtonAlterar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela!");
        }
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluir1ActionPerformed
        
          if (JOptionPane.showConfirmDialog(this, "Você tem certeza disso ?")
                == JOptionPane.YES_OPTION) {
            int linha = jTableTabela.getSelectedRow();
            if (linha >= 0) {
                int codigo = Integer.parseInt(
                        String.valueOf(jTableTabela.getValueAt(linha, 0))
                );
                service.CadastroPessoa cad = new service.CadastroPessoa();
                cad.deletarCadPessoa(codigo);
                cad.ListaPessoa(jTextFieldDocumento.getText(), (DefaultTableModel) jTableTabela.getModel());
                limparCampos();
                 jButtonAlterar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma linha!");
            }
        }
        
    }//GEN-LAST:event_jButtonExcluir1ActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose(); 
    }//GEN-LAST:event_jButtonFecharActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir1;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTipoPessoa;
    private javax.swing.JLabel jLabelTipoPessoa1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JRadioButton jRadioButtonFisica;
    private javax.swing.JRadioButton jRadioButtonJuridica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldDocumento;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
