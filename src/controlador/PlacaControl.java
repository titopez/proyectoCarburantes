/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Placa;
import persistencia.PlacaDAO;

/**
 *
 * @author Roberto
 */
public class PlacaControl extends GenericaControl{
    PlacaDAO placa;
    public PlacaControl(){
        placa=new PlacaDAO();
    }
    
    public List<Placa> buscarPorId(long id){
        return placa.buscarPorId(id);
    }
}
