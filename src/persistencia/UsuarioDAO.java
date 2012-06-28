/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import modelo.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Roberto
 */
public class UsuarioDAO {
    public Usuario buscarUsuario(String c, String p){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        Usuario u = null;

        String consulta = "from Usuario as us  WHERE us.cuenta = :cuenta  and us.contrasenia = :contrasenia";
        Query q = sesion.createQuery(consulta);
        q.setString("cuenta", c);
        q.setString("contrasenia", p);
        u = (Usuario)q.uniqueResult();

        tx.commit();
        sesion.close();
        return u;      
    }
    
//    public int obtenerId(String pass){
//        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
//        Session sesion = sessionFactory.openSession();
//
//        Transaction tx = sesion.beginTransaction();
//
//        int id;
//
//        String consulta = "select id from Vendedor as v  WHERE v.contrasenia = :contrasenia";
//        Query q = sesion.createQuery(consulta);
//        q.setString("contrasenia", pass);
//        id = (Integer)q.uniqueResult();
//
//        tx.commit();
//        sesion.close();
//        return id;
//    }
}
