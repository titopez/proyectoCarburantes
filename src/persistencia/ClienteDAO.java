/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import modelo.Cliente;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Roberto
 */
public class ClienteDAO {

    public Cliente buscarPorNit(int nit) {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        Cliente c = null;

        String consulta = "from Cliente as c  WHERE c.nit = :nit";
        Query q = sesion.createQuery(consulta);
        q.setInteger("nit", nit);
        c = (Cliente) q.uniqueResult();

        tx.commit();
        sesion.close();
        return c;
    }
    
    public Cliente buscarPorCi(int ci) {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        Cliente c = null;

        String consulta = "from Cliente as c  WHERE c.ci = :ci";
        Query q = sesion.createQuery(consulta);
        q.setInteger("ci", ci);
        c = (Cliente) q.uniqueResult();

        tx.commit();
        sesion.close();
        return c;
    }
}
