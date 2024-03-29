/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Producto;
import persistencia.ProductoDAO;

/**
 *
 * @author Roberto
 */
public class ProductoControl extends GenericaControl{
    ProductoDAO producto;
    public ProductoControl(){
        producto=new ProductoDAO();
    }
    
    public List<Producto> getAll(){
        return producto.getAll();
    }
    
    public Producto buscarPorNombre(String nombre){
        return producto.buscarPorNombre(nombre);
    }
    
    public double calcularTotalCant(int cantidad, double precio){
        return cantidad*precio;
    }
    
    public double calcularTotalBol(double bolivianos, double precio){
        return Math.round((bolivianos/precio)*100000)/100000;
    }
    
}
