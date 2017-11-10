/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Peca;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author naressi
 */
public class CadastroPecas {

    public void ListaPecas(String descricao, DefaultTableModel model) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Peca as p where descricaopeca like '%" + descricao + "%' ");
        List<Peca> peca = q.list();
        model.setNumRows(0);
        DecimalFormat decimalFormat = new DecimalFormat("###,###.00");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Peca p : peca) {
            //System.out.println("-> " + t.getDescricao());
            String[] linha
                    = {
                        String.valueOf(p.getIdpeca()),
                        p.getDescricaopeca().toString(),
                        String.valueOf(p.getQuantidade()),
                        sdf.format(p.getData_entrada()).toString(),
                        String.valueOf(decimalFormat.format(p.getValor_praticado()))
                    };
            model.addRow(linha);
        }
    }

    public void salvarCadPecas(String descricao, int qtd_estoque, double valor_uni, Date data) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Peca cad_pecas = new Peca();
        cad_pecas.setDescricaopeca(descricao);
        cad_pecas.setQuantidade(qtd_estoque);
        cad_pecas.setValor_praticado(valor_uni);
        cad_pecas.setData_entrada(data);
        session.getTransaction().begin();
        session.save(cad_pecas);
        session.getTransaction().commit();
    }

    public void AlterarCadPecas(String descricao, int qtd_estoque, double valor_uni, Date data, int codigo_peca) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Peca cad_pecas = new Peca();
        cad_pecas.setIdpeca(codigo_peca);
        cad_pecas.setDescricaopeca(descricao);
        cad_pecas.setQuantidade(qtd_estoque);
        cad_pecas.setValor_praticado(valor_uni);
        cad_pecas.setData_entrada(data);

        session.getTransaction().begin();
        session.update(cad_pecas);
        session.getTransaction().commit();
    }

    public void deletarCadPecas(int codigo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Peca cad_pecas = new Peca();
        cad_pecas.setIdpeca(codigo);
        session.getTransaction().begin();
        session.delete(cad_pecas);
        session.getTransaction().commit();

    }

}
