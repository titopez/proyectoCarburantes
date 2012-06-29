/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import modelo.Producto;
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
public class ProductoDAO {
    public List<Producto> getAll(){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        List<Producto> p = null;

        String consulta = "from Producto";
        Query q = sesion.createQuery(consulta);
        p = (List<Producto>) q.list();

        tx.commit();
        sesion.close();
        return p;
    }
    
    public Producto buscarPorNombre(String nombre){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        Producto p = null;

        String consulta = "from Producto as p WHERE p.nombre like :nombre";
        Query q = sesion.createQuery(consulta);
        q.setString("nombre",nombre);
        p = (Producto) q.uniqueResult();

        tx.commit();
        sesion.close();
        return p;
    }
}
