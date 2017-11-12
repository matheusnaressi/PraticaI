/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticai;

import form.Login;
import form.TelaInicial;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author matheus
 */
public class PraticaI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Login l = new Login();
        l.setVisible(true);
        l.setAutoRequestFocus(true);
        l.setVisible(true);
//        Login.main(args);
    }

}
