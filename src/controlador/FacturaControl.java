/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import persistencia.FacturaDAO;

/**
 *
 * @author Roberto
 */
public class FacturaControl extends GenericaControl{
    FacturaDAO factura;
    public FacturaControl(){
        factura=new FacturaDAO();
    }
    
}
