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
<<<<<<< HEAD
    private long numOrden;
    private int limiteInf;
    private int limiteSup;
    @Temporal(TemporalType.DATE)
    private Date fechaLimite;
    @Transient
    private int contador;
    private byte estado;
=======
    protected long numOrden;
    protected long limiteInf;
    protected long limiteSup;
    @Temporal(TemporalType.DATE)
    protected Date fechaLimite;
>>>>>>> 406152f489d6a4472d1527a9c6f8f2939c0020fb
    
    public OrdenFact() {
    }

<<<<<<< HEAD
    public OrdenFact(long numOrden, int limiteInf, int limiteSup, Date fechaLimite, byte estado) {
=======
    public OrdenFact(long numOrden, long limiteInf, long limiteSup, Date fechaLimite) {
>>>>>>> 406152f489d6a4472d1527a9c6f8f2939c0020fb
        this.numOrden = numOrden;
        this.limiteInf = limiteInf;
        this.limiteSup = limiteSup;
        this.fechaLimite = fechaLimite;
        this.contador=limiteInf;
        this.estado=estado;
    }

    public long getId() {
        return id;
    }

<<<<<<< HEAD
=======
   

>>>>>>> 406152f489d6a4472d1527a9c6f8f2939c0020fb
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

<<<<<<< HEAD
    public void setLimiteInf(int limiteInf) {
        this.limiteInf = limiteInf;
    }

    public void setLimiteSup(int limiteSup) {
=======
    public void setLimiteInf(long limiteInf) {
        this.limiteInf = limiteInf;
    }

    public void setLimiteSup(long limiteSup) {
>>>>>>> 406152f489d6a4472d1527a9c6f8f2939c0020fb
        this.limiteSup = limiteSup;
    }

    public void setNumOrden(long numOrden) {
        this.numOrden = numOrden;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
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

