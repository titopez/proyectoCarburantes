/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class OrdenFact implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private long numOrden;
    private int limiteInf;
    private int limiteSup;
    @Temporal(TemporalType.DATE)
    private Date fechaLimite;
    private int contador;
    private byte estado;
    
    public OrdenFact() {
    }

    public OrdenFact(long numOrden, int limiteInf, int limiteSup, Date fechaLimite, byte estado) {

        this.numOrden = numOrden;
        this.limiteInf = limiteInf;
        this.limiteSup = limiteSup;
        this.fechaLimite = fechaLimite;
        this.contador=limiteInf;
        this.estado=estado;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int num) {
        this.contador = num;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public int getLimiteInf() {
        return limiteInf;
    }

    public void setLimiteInf(int limiteInf) {
        this.limiteInf = limiteInf;
    }

    public int getLimiteSup() {
        return limiteSup;
    }

    public void setLimiteSup(int limiteSup) {
        this.limiteSup = limiteSup;
    }

    public long getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(long numOrden) {
        this.numOrden = numOrden;
    }

    public long getId() {
        return id;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrdenFact other = (OrdenFact) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numOrden != other.numOrden) {
            return false;
        }
        if (Double.doubleToLongBits(this.limiteInf) != Double.doubleToLongBits(other.limiteInf)) {
            return false;
        }
        if (Double.doubleToLongBits(this.limiteSup) != Double.doubleToLongBits(other.limiteSup)) {
            return false;
        }
        if (this.fechaLimite != other.fechaLimite && (this.fechaLimite == null || !this.fechaLimite.equals(other.fechaLimite))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public String toString() {
        return "Numero de Orden:{" + "id=" + id + ", numOrden=" + numOrden + ", limiteInf=" + limiteInf + ", limiteSup=" + limiteSup + ", fechaLimite=" + fechaLimite + '}';
    }

}

