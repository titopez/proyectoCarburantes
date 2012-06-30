/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;

import modelo.OrdenFact;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author HOUSE
 */
public class IngresarNOrdenADAO {
    
     public List<OrdenFact> getAll()
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        List<OrdenFact> v = null;

        String consulta = "from OrdenFact";
        Query q = sesion.createQuery(consulta);
        v = (List<OrdenFact>) q.list();

        tx.commit();
        sesion.close();
        return v;
    }
    
}
