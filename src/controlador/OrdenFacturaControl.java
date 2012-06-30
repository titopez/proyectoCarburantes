/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.OrdenFact;
import persistencia.OrdenFacturaDAO;

/**
 *
 * @author Roberto
 */
public class OrdenFacturaControl extends GenericaControl {
    OrdenFacturaDAO ordenFactura;
    public OrdenFacturaControl(){
        ordenFactura=new OrdenFacturaDAO();
    }
    public OrdenFact buscarPorEstado(byte estado){
        return ordenFactura.buscarPorEstado(estado);
    }
    
    public OrdenFact buscarPorId(long id){
        return ordenFactura.buscarPorId(id);
    }
}
