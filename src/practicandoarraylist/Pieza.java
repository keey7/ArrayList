/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicandoarraylist;

/**
 *
 * @author Alumno Mañana
 */
public class Pieza {
    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pieza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Pieza() {
    }

    @Override
    public String toString() {
        return "Pieza{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
}
