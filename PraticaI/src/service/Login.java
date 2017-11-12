/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Peca;
import model.Pessoa;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author elena
 */
public class Login {

    public Pessoa consultaUsuarioSenha(String user, String senha) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Pessoa where nome like :nome");
        q.setParameter("nome", user);
        List<Pessoa> lista = q.list();
        if (!lista.isEmpty()){
            if(senha.equals(lista.get(0).getSenha())){
                return lista.get(0);
            }
        }
        return null;
    }
    
}
