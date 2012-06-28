/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Cliente;
import persistencia.ClienteDAO;

/**
 *
 * @author Roberto
 */
public class ClienteControl extends GenericaControl {
    ClienteDAO cliente;
    public ClienteControl(){
        cliente=new ClienteDAO();
    }
    public Cliente buscarPorNit(int nit){
        return cliente.buscarPorNit(nit);
    }
    
    public Cliente buscarPorCi(int ci){
        return cliente.buscarPorCi(ci);
    }
  
}
