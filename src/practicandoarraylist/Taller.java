/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicandoarraylist;

/**
 *
 * @author PLANTA 2 DERECHA
 */
public class Taller {
    private String nombre;
    private String telefono;
    private double precioHora;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public Taller(String nombre, String telefono, double precioHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precioHora = precioHora;
    }

    public Taller() {
    }

    @Override
    public String toString() {
        return "Taller{" + "nombre=" + nombre + ", telefono=" + telefono + ", precioHora=" + precioHora + '}';
    }
    
    public double repararVehiculo(Vehiculo v, int h){
        double coste=0;
        for (Pieza i: v.getPiezas()){
            coste+=i.getPrecio();
        }
        coste +=h* precioHora;
        return coste;
    }
    

}
