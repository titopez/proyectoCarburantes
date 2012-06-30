/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Random;
import persistencia.FacturaDAO;

/**
 *
 * @author Roberto
 */
public class FacturaControl extends GenericaControl {

    FacturaDAO factura;

    public FacturaControl() {
        factura = new FacturaDAO();
    }

    public String obtenerCodControl() {
        String strHexNumber;
        Random rnd = new Random();
        long liminf = Long.parseLong("FFFFFFFFF", 16);
        long limsup = Long.parseLong("FFFFFFFFFF", 16);
        long nrandom = (long) Math.floor(Math.random() * (limsup - liminf + 1) + liminf);
        strHexNumber = Long.toHexString(nrandom);
        return strHexNumber;
    }
}
