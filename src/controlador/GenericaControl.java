/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import persistencia.GenericaDAO;

/**
 *
 * @author Roberto
 */
public class GenericaControl {
    GenericaDAO generica;

    public GenericaControl() {
        generica=new GenericaDAO();
    }
    
    public void salvar(Object o){
        generica.salvar(o);
    }
    
    public void eliminar(Object o){
        generica.eliminar(o);
    }
}
