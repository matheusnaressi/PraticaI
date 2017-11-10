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
import model.TipoServico;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author elena
 */
public class CadastroTipoServico {

    public void salvarCadTipoServico(String descricao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        TipoServico cad_tipo_servico = new TipoServico();
        cad_tipo_servico.setDescricaoservico(descricao);
        session.getTransaction().begin();
        session.save(cad_tipo_servico);
        session.getTransaction().commit();
    }

    public void AlterarCadTipoServico(String descricao, int codigo_peca) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        TipoServico cad_tipo_servico = new TipoServico();
        cad_tipo_servico.setDescricaoservico(descricao);
        cad_tipo_servico.setIdtiposervico(codigo_peca);
        session.getTransaction().begin();
        session.update(cad_tipo_servico);
        session.getTransaction().commit();
    }

    public void ListaTipoServico(String descricao, DefaultTableModel model) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from TipoServico as p where descricaoservico like '%" + descricao + "%' ");
        List<TipoServico> tiposer = q.list();
        model.setNumRows(0);
        for (TipoServico t : tiposer) {
            String[] linha
                    = {
                        String.valueOf(t.getIdtiposervico()),
                        t.getDescricaoservico().toString()
                    };
            model.addRow(linha);
        }
    }

    public void DeletarCadTipoServico(int codigo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        TipoServico cad_tipo_servico = new TipoServico();
        cad_tipo_servico.setIdtiposervico(codigo);
        session.getTransaction().begin();
        session.delete(cad_tipo_servico);
        session.getTransaction().commit();
    }

}
