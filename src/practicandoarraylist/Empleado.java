
package practicandoarraylist;

import java.util.Objects;


public class Empleado {
    private String dni;
    private String nomEmpleado;
    private Departamento departamento;
    private double sueldo;
    
    
    

    public String getDni() {
        return dni;
    }    
    
    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }


    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String dni, String nomEmpleado, Departamento departamento, double sueldo) {
        this.dni = dni;
        this.nomEmpleado = nomEmpleado;
        this.departamento = departamento;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  dni + ", " + nomEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.dni);
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
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
