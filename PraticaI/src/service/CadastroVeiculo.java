///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package service;
//
//import java.util.List;
//import javax.swing.table.DefaultTableModel;
//import model.Pessoa;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import util.HibernateUtil;
//
///**
// *
// * @author elena
// */
//public class CadastroVeiculo {
//    
//    public void  salvarCadVeiculo(String descricao, String placa, String modelo, String pessoa){
//       
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Veiculo cad_veiculo = new veiculo();
//        cad_veiculo.setNome(descricao);
//        cad_veiculo.setDocumento(placa);
//        cad_veiculo.setTipopessoa(modelo);
//        cad_veiculo.setSenha(pessoa);
//        session.getTransaction().begin();
//        session.save(cad_veiculo);
//        session.getTransaction().commit();
//   }
//    
//    
//     public void AlterarCadVeiculo(String descricao, String placa, String modelo, String pessoa){
//   
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Veiculo cad_veiculo = new veiculo();
//        cad_veiculo.setNome(descricao);
//        cad_veiculo.setDocumento(placa);
//        cad_veiculo.setTipopessoa(modelo);
//        cad_veiculo.setSenha(pessoa);
//        session.getTransaction().begin();
//        session.save(cad_veiculo);
//        session.getTransaction().commit();
//   }
//     
//     public void deletarCadVeiculo(int codigo) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Veiculo cad_veiculo = new Veiculo();
//        cad_veiculo.setId(codigo);
//        session.getTransaction().begin();
//        session.delete(cad_veiculo);
//        session.getTransaction().commit();
//
//    }
//     
//     public void ListaVeiculo (String descricao, DefaultTableModel model){
//   
//   Session session = HibernateUtil.getSessionFactory().openSession();
//        Query q = session.createQuery("from Veiculo as p where nome like '%" + descricao + "%' ");
//        List<Veiculo> veiculo = q.list();
//        model.setNumRows(0);
//        
//        for (Veiculo p : veiculo) {
//            //System.out.println("-> " + t.getDescricao());
//            String[] linha
//                    = {
//                        String.valueOf(p.getId()),
//                        p.getNome().toString(),
//                        String.valueOf(p.getTipopessoa()),
//                        p.getDocumento().toString(),  
//                    };
//            model.addRow(linha);
//        }
//    
//   
//   }
//    
//}
