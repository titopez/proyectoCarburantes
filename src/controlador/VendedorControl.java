/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Vendedor;
import persistencia.VendedorDAO;

/**
 *
 * @author Roberto
 */
public class VendedorControl extends GenericaControl{
    VendedorDAO vendedor;

    public VendedorControl() {
        vendedor=new VendedorDAO();
    }   
    public List<Vendedor> buscarPorApellidos(String apellido){
        return vendedor.buscarPorApellidos(apellido);
    }
    
    public Vendedor buscarVendedor(String c, String p){
        return vendedor.buscarVendedor(c, p);
    }
    
    public Vendedor buscarVendedorAp(String apellido){
        return vendedor.buscarVendedorAp(apellido);
    }
    
    public List<Vendedor> listar(){
        return vendedor.getAll();
    }
    
    
//    public int obtenerId(String pass){
//        return vendedor.obtenerId(pass);
//    }
}
