/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import modelo.Placa;
import modelo.Vendedor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Roberto
 */
public class PlacaDAO {
    public List<Placa> buscarPorId(long id)
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        List<Placa> p = null;

        String consulta = "from Placa as p WHERE p.cliente like :id";
        Query q = sesion.createQuery(consulta);
        q.setLong("id", id);
        p = (List<Placa>) q.list();

        tx.commit();
        sesion.close();
        return p;
    }
}
