/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicandoarraylist;

/**
 *
 * @author Alumno Mañana
 */
public class Lampara {
    //atributos
    private boolean encendida;
    private int intensidad;
    
    //getter & setter

    public boolean isEncendida() {
        return encendida;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
        if(intensidad <= 0){
            this.encendida = false;
        }else{
            this.encendida = true;
        }
    }
    
    public void setIntensidad(double voltaje) {
        if(voltaje<1.5){
            this.intensidad = 0;
            this.encendida = false;
        }else if(voltaje>12.5){
            this.intensidad = 100;
            this.encendida = true;
        }else{
            double conversion = (100*voltaje)/11;
            this.intensidad = (int) Math.round(conversion);
            this.encendida = true;
        }
    }
    
    //constructor

    public Lampara(boolean encendida, int intensidad) {
        this.encendida = encendida;
        this.intensidad = intensidad;
    }

    public Lampara() {
    }
    
    //toString

    @Override
    public String toString() {
        if((this.isEncendida()==false) && (this.intensidad == 0)){
            return "Luz: OFF, Intensidad = " + intensidad + '%';
        }else{
            return "Luz: ON, Intensidad = " + intensidad + '%';
        }
        
    }
    
    
}
