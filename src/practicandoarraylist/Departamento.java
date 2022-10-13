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
public class Departamento {
    private Empresa empresa;
    private String nomDepartamento;

    public Empresa getEmpresa() {
        return empresa;
    }

    public String getNomDepartamento() {
        return nomDepartamento;
    }

    public void setNomDepartamento(String nomDepartamento) {
        this.nomDepartamento = nomDepartamento;
    }

    public Departamento(Empresa empresa, String nomDepartamento) {
        this.empresa = empresa;
        this.nomDepartamento = nomDepartamento;
    }

    @Override
    public String toString() {
        return nomDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.empresa);
        hash = 47 * hash + Objects.hashCode(this.nomDepartamento);
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
        final Departamento other = (Departamento) obj;
        if (!Objects.equals(this.nomDepartamento, other.nomDepartamento)) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        return true;
    }
    
    
}
