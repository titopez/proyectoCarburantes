/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
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
public class VendedorDAO {
    public List<Vendedor> buscarPorApellidos(String apellidos)
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        List<Vendedor> v = null;

        String consulta = "from Vendedor as v WHERE v.apellidos like :apellido";
        Query q = sesion.createQuery(consulta);
        q.setString("apellido", "%"+apellidos+"%");
        v = (List<Vendedor>) q.list();

        tx.commit();
        sesion.close();
        return v;
    }
    
    public List<Vendedor> getAll()
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        List<Vendedor> v = null;

        String consulta = "from Vendedor";
        Query q = sesion.createQuery(consulta);
        v = (List<Vendedor>) q.list();

        tx.commit();
        sesion.close();
        return v;
    }
    
    public Vendedor buscarVendedor(String c, String p){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        Vendedor v = null;

        String consulta = "from Vendedor as v  WHERE v.cuenta = :cuenta  and v.contrasenia = :contrasenia";
        Query q = sesion.createQuery(consulta);
        q.setString("cuenta", c);
        q.setString("contrasenia", p);
        v = (Vendedor)q.uniqueResult();

        tx.commit();
        sesion.close();
        return v;      
    }
    
    public Vendedor buscarVendedorAp(String apellido){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        Vendedor v = null;

        String consulta = "from Vendedor as v  WHERE v.apellido = :apellido";
        Query q = sesion.createQuery(consulta);
        q.setString("apellido", apellido);
        v = (Vendedor)q.uniqueResult();

        tx.commit();
        sesion.close();
        return v;      
    }
    
    public int obtenerId(String pass){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        int id;

        String consulta = "select id from Vendedor as v  WHERE v.contrasenia = :contrasenia";
        Query q = sesion.createQuery(consulta);
        q.setString("contrasenia", pass);
        id = (Integer)q.uniqueResult();

        tx.commit();
        sesion.close();
        return id;
    }
}
