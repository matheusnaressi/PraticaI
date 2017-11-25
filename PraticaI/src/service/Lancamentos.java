/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import form.Lancamento;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import model.ItensOrdem;
import model.LancamentoOrdem;
import model.LancamentoTipoServico;
import model.Peca;
import model.Pessoa;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import util.HibernateUtil;

/**
 *
 * @author naressi
 */
public class Lancamentos {

    public String buscaDoc(int codigo_pessoa) {
        String documento = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Pessoa as p where id= " + codigo_pessoa);
        List<Pessoa> pessoa = q.list();
        for (Pessoa p : pessoa) {
            String[] linha = {
                String.valueOf(p.getId()),
                p.getNome().toString(),
                String.valueOf(p.getTipopessoa()),
                p.getDocumento().toString()
            };
            documento = linha[3];
        }
        return documento;
    }

    public void salvarLancamento(int pessoa_id, int veiculo_idveiculo, int idlancamentoordem, Date data_entrada) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LancamentoOrdem lan = new LancamentoOrdem();
        lan.setPessoa_id(pessoa_id);
        lan.setVeiculo_idveiculo(veiculo_idveiculo);
        lan.setDataentrada(data_entrada);
        lan.setIdlancamentoordem(idlancamentoordem);
        session.getTransaction().begin();
        session.save(lan);
        session.getTransaction().commit();
    }

    public int buscagetIdlancamentoordem() {
        Integer retorno = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createSQLQuery("select count(*)+1 as retorno from LancamentoOrdem ");
        List valores = q.list();
        Object get = valores.get(0);
        retorno = Integer.parseInt(get.toString());
        return retorno;
    }

    public void salvarLanTipoServico(int idlancamentotiposervico, int idlancamentoordem,
            int idtiposervico, String quantidade, double valorunitario, String descricao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LancamentoTipoServico lan = new LancamentoTipoServico();
        lan.setIdlancamentotiposervico(idlancamentotiposervico);
        lan.setLancamentoordem_idlancamentoordem(idlancamentoordem);
        lan.setTiposervico_idtiposervico(idtiposervico);
        lan.setTiposervico_quantidade(quantidade);
        lan.setTiposervico_valorunitario(valorunitario);
        lan.setDescricaoservico(descricao);
        session.getTransaction().begin();
        session.save(lan);
        session.getTransaction().commit();
    }

    public void salvarLanItens(int idlancamentoordem,
            int idpeca, int quantidade, double valorunitario, String descricao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ItensOrdem lan = new ItensOrdem();
        lan.setDescricao(descricao);
        lan.setLancamentoordem_idlancamentoordem(idlancamentoordem);
        lan.setQuantidade(quantidade);
        lan.setPeca_idpeca(idpeca);
        lan.setValorunitario(valorunitario);
        session.getTransaction().begin();
        session.save(lan);
        session.getTransaction().commit();
    }

    public void deletarItensOrdem(int codigo, int id_lacamento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ItensOrdem itens = new ItensOrdem();
        itens.setIditensordem(codigo);
        itens.setLancamentoordem_idlancamentoordem(id_lacamento);
        session.getTransaction().begin();
        session.delete(itens);
        session.getTransaction().commit();
    }

    public void deletarServicosOrdem(int codigo, int id_lacamento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LancamentoTipoServico ser = new LancamentoTipoServico();
        ser.setIdlancamentotiposervico(codigo);
        ser.setLancamentoordem_idlancamentoordem(id_lacamento);
        session.getTransaction().begin();
        session.delete(ser);
        session.getTransaction().commit();
    }

}
