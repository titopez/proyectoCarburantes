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
    protected long numOrden;
    protected long limiteInf;
    protected long limiteSup;
    @Temporal(TemporalType.DATE)
    protected Date fechaLimite;
    
    public OrdenFact() {
    }

    public OrdenFact(long numOrden, long limiteInf, long limiteSup, Date fechaLimite) {
        this.numOrden = numOrden;
        this.limiteInf = limiteInf;
        this.limiteSup = limiteSup;
        this.fechaLimite = fechaLimite;
    }

    public long getId() {
        return id;
    }

   

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public long getLimiteInf() {
        return limiteInf;
    }

    public long getLimiteSup() {
        return limiteSup;
    }

    public long getNumOrden() {
        return numOrden;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setLimiteInf(long limiteInf) {
        this.limiteInf = limiteInf;
    }

    public void setLimiteSup(long limiteSup) {
        this.limiteSup = limiteSup;
    }

    public void setNumOrden(long numOrden) {
        this.numOrden = numOrden;
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

