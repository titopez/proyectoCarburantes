
package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Equipo 8
 */
@Entity
public class Placa implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private int numero;
    @ManyToOne
    private Cliente cliente;

    public Placa() {
    }

    public Placa(int numero) {
        this.numero = numero;
    }

    public Placa(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Placa other = (Placa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public String toString() {
        return "Placa{" + "id=" + id + ", numero=" + numero + '}';
    }  
    
}
