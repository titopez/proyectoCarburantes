/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.OrdenFact;
import persistencia.IngresarNOrdenADAO;

/**
 *
 * @author HOUSE
 */
public class IngresarNOrdenAControl {
    IngresarNOrdenADAO ordenFact = new IngresarNOrdenADAO();
    
    public List<OrdenFact> getAll()
            {
                return ordenFact.getAll();
                
            }
    
    
}
