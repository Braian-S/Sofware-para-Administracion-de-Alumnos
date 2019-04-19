
package Codigo;

import java.io.Serializable;

/**
 *
 * @author Router
 */
public class Alumnos implements Serializable {
    
    private String nombre;
    private String apellido;
    private Double pago;
    private String materia;
    private String fecha;

    public Alumnos(String nombre,String apellido, String materia,Double pago,String fecha){
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.materia=materia;
        this.pago=pago;
        this.fecha=fecha;
        
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    
    
}
