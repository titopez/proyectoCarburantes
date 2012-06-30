/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import modelo.OrdenFact;
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
public class OrdenFacturaDAO {
    public OrdenFact buscarPorEstado(byte estado){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        OrdenFact of = null;

        String consulta = "from OrdenFact as o WHERE o.estado = :estado";
        Query q = sesion.createQuery(consulta);
        q.setByte("estado", estado);
        of = (OrdenFact)q.uniqueResult();

        tx.commit();
        sesion.close();
        return of;  
    }
    
    public OrdenFact buscarPorId(long id){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        OrdenFact of = null;

        String consulta = "from OrdenFact as o WHERE o.id = :id";
        Query q = sesion.createQuery(consulta);
        q.setLong("id", id);
        of = (OrdenFact)q.uniqueResult();

        tx.commit();
        sesion.close();
        return of;
    }
}
