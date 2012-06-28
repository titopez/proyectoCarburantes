/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Roberto
 */
public class GenericaDAO {
    public void salvar(Object o)
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        sesion.saveOrUpdate(o);
        tx.commit();
        sesion.close();
    }
    public void eliminar(Object o)
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        sesion.delete(o);
        tx.commit();
        sesion.close();
    }
}
