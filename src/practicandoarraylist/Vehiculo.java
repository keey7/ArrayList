/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicandoarraylist;

import java.util.ArrayList;

/**
 *
 * @author PLANTA 2 DERECHA
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private ArrayList<Pieza> piezas;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }

    public Vehiculo(String matricula, String marca, String modelo, ArrayList<Pieza> piezas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = piezas;
    }

    public Vehiculo() {
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", piezas=" + piezas + '}';
    }
    
    
}
