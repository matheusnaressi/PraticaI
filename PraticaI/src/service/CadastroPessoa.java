/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Peca;
import model.Pessoa;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author elena
 */
public class CadastroPessoa {
   public void  salvarCadPessoa(String nome, String documento, String tipopessoa, String senha){
       
        Session session = HibernateUtil.getSessionFactory().openSession();
        Pessoa cad_pessoa = new Pessoa();
        cad_pessoa.setNome(nome);
        cad_pessoa.setDocumento(documento);
        cad_pessoa.setTipopessoa(tipopessoa);
        cad_pessoa.setSenha(senha);
        session.getTransaction().begin();
        session.save(cad_pessoa);
        session.getTransaction().commit();
   }
   public void alterarCadPessoa(String nome, String documento, String tipopessoa, String senha,int codigo_pessoa){
   
        Session session = HibernateUtil.getSessionFactory().openSession();
        Pessoa cad_pessoa = new Pessoa();
        cad_pessoa.setId(codigo_pessoa);
        cad_pessoa.setNome(nome);
        cad_pessoa.setDocumento(documento);
        cad_pessoa.setTipopessoa(tipopessoa);
        cad_pessoa.setSenha(senha);
        session.getTransaction().begin();
        session.update(cad_pessoa);
        session.getTransaction().commit();
   
   }
   public void deletarCadPessoa(int codigo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Pessoa cad_pessoa = new Pessoa();
        cad_pessoa.setId(codigo);
        session.getTransaction().begin();
        session.delete(cad_pessoa);
        session.getTransaction().commit();

    }
   
   public void ListaPessoa (String descricao, DefaultTableModel model){
   
   Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Pessoa as p where nome like '%" + descricao + "%' ");
        List<Pessoa> pessoa = q.list();
        model.setNumRows(0);
        
        for (Pessoa p : pessoa) {
            //System.out.println("-> " + t.getDescricao());
            String[] linha
                    = {
                        String.valueOf(p.getId()),
                        p.getNome().toString(),
                        String.valueOf(p.getTipopessoa()),
                        p.getDocumento().toString(),  
                    };
            model.addRow(linha);
        }
    
   
   }
   
}
