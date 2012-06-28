/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Usuario;
import persistencia.UsuarioDAO;

/**
 *
 * @author Roberto
 */
public class UsuarioControl extends GenericaControl {
    UsuarioDAO usuario;
    public UsuarioControl(){
        usuario=new UsuarioDAO();
    }
    
    public Usuario buscarUsuario(String c, String p){
        return usuario.buscarUsuario(c, p);
    }
    
//    public int obtenerId(String pass){
//        return usuario.obtenerId(pass);
//    } 
}
