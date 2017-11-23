/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ItensOrdem;
import model.LancamentoOrdem;
import model.LancamentoTipoServico;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import util.HibernateUtil;


/**
 *
 * @author matheus
 */
public class ApresentarRelatorio {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ItensOrdem> list = session.createQuery("from ItensOrdem").list();
        JRBeanCollectionDataSource jrs = new JRBeanCollectionDataSource(list);
        Map parametros = new HashMap();
        try {
            JasperPrint jpr
                    = JasperFillManager.fillReport("src/relatorios/Ordem.jasper",
                            parametros,
                            jrs);
            JasperViewer.viewReport(jpr, false);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }

}
