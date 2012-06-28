/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Administrador;
import persistencia.AdministradorDAO;

/**
 *
 * @author Roberto
 */
public class AdministradorControl extends GenericaControl {
    AdministradorDAO administrador;

    public AdministradorControl() {
        administrador=new AdministradorDAO();
    }
    
    public Administrador buscarAdministrador(String c, String p){
        return administrador.buscarAdministrador(c, p);
    }
}
