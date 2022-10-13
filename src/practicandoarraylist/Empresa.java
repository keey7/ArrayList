/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicandoarraylist;

import java.util.Objects;

/**
 *
 * @author Alumno Mañana
 */
public class Empresa {
    //atributos
    private String nomEmpresa;
    
    //getter & setter

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }
    
    //constructor

    public Empresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public Empresa() {
    }
    
    
    //toString

    @Override
    public String toString() {
        return nomEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nomEmpresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.nomEmpresa, other.nomEmpresa)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
