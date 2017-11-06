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
import model.ModeloVeiculo;
import model.Peca;
import model.Pessoa;
import model.Veiculo;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author elena
 */
public class CadastroVeiculo {

    public void ListaVeiculo(String descricao, DefaultTableModel model) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Veiculo where nomemodelo like :descricao");
        q.setParameter("descricao", "%" + descricao + "%");
        List<Veiculo> veiculo = q.list();
        model.setNumRows(0);

        for (Veiculo v : veiculo) {
            String[] linha
                    = {
                        String.valueOf(v.getIdveiculo()),
                        String.valueOf(v.getIdveiculo()),
                        String.valueOf(v.getPlacaveiculo()),
                        String.valueOf(v.getModelo().getNomemodelo()),
                        String.valueOf(v.getPessoa().getNome()),};
            model.addRow(linha);
        }
    }

    public void salvarCadVeiculo(String descricao, String placa, String modelo, String pessoa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Veiculo cad_Veiculo = new Veiculo();

        ModeloVeiculo m = new ModeloVeiculo();
        m.setIdmodeloveiculo(Integer.parseInt(modelo));
        cad_Veiculo.setModelo(m);
        cad_Veiculo.setPlacaveiculo(placa);
        cad_Veiculo.setNomemodelo(descricao);
        Pessoa cadPessoa = new Pessoa();
        cadPessoa.setId(Integer.parseInt(pessoa));
        cad_Veiculo.setPessoa(cadPessoa);
        session.getTransaction().begin();
        session.save(cad_Veiculo);
        session.getTransaction().commit();

    }

    public Veiculo buscaPorId(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Veiculo) session.get(Veiculo.class, id);
    }

    public void AlterarCadVeiculo(String descricao, String placa, String modelo, String pessoa, int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Veiculo cad_Veiculo = new Veiculo();
        ModeloVeiculo m = new ModeloVeiculo();
        m.setIdmodeloveiculo(Integer.parseInt(modelo));
        cad_Veiculo.setModelo(m);
        cad_Veiculo.setPlacaveiculo(placa);
        cad_Veiculo.setNomemodelo(descricao);
        Pessoa cadPessoa = new Pessoa();
        cadPessoa.setId(Integer.parseInt(pessoa));
        cad_Veiculo.setPessoa(cadPessoa);
        session.getTransaction().begin();
        session.update(cad_Veiculo);
        session.getTransaction().commit();
    }

    public void deletarCadVeiculo(int codigo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Veiculo cad_Veiculo = new Veiculo();
        cad_Veiculo.setIdveiculo(codigo);
        session.getTransaction().begin();
        session.delete(cad_Veiculo);
        session.getTransaction().commit();
    }

    public List<ModeloVeiculo> listaModelos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ModeloVeiculo> listaVeiculo = session.createQuery("from ModeloVeiculo").list();
        return listaVeiculo;
    }

}
