
package Codigo;

import java.io.Serializable;

/**
 *
 * @author Router
 */
public class Materias implements Serializable {
    
    private String nombre;
    private double monto;

    public Materias(String nombre, double monto){
        
        this.nombre=nombre;
        this.monto=monto;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }




}
