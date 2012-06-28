/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import modelo.Administrador;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Roberto
 */
public class AdministradorDAO {
    public List<Administrador> buscarPorApellidos(String apellidos)
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        List<Administrador> v = null;

        String consulta = "from Administrador as a WHERE a.apellidos like :apellido";
        Query q = sesion.createQuery(consulta);
        q.setString("apellido", "%"+apellidos+"%");
        v = (List<Administrador>) q.list();

        tx.commit();
        sesion.close();
        return v;
    }
    
    public List<Administrador> getAll()
    {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        List<Administrador> v = null;

        String consulta = "from Administrador";
        Query q = sesion.createQuery(consulta);
        v = (List<Administrador>) q.list();

        tx.commit();
        sesion.close();
        return v;
    }
    
    public Administrador buscarAdministrador(String c, String p){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        Administrador a = null;

        String consulta = "from Administrador as a  WHERE a.cuenta = :cuenta  and a.contrasenia = :contrasenia";
        Query q = sesion.createQuery(consulta);
        q.setString("cuenta", c);
        q.setString("contrasenia", p);
        a = (Administrador)q.uniqueResult();

        tx.commit();
        sesion.close();
        return a;      
    }
}
