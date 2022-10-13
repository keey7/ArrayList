/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicandoarraylist;

import java.time.LocalDateTime;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author Alumno Mañana
 */
public class Nomina {
    private Empleado empleado;
    private LocalDateTime fecha;
    private double retencion;

    


    public Empleado getEmpleado() {
        return empleado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getRetencion() {
        return retencion;
    }


    public Nomina(Empleado empleado, double retencion) {
        this.empleado = empleado;
        this.fecha = LocalDateTime.now();
        this.retencion = retencion;
    }

    @Override
    public String toString() {
        return "Nomina:" + "\n\tEmpresa = " + this.empleado.getDepartamento().getEmpresa().toString() + "\n\tDepartamento = " + this.empleado.getDepartamento().toString() + "\n\tEmpleado = " + empleado.toString() + "\n\tFecha = " + fecha + "\n\tSalario Bruto = " + this.empleado.getSueldo() + " euros\n\tRetención = " + retencion +"%"+ "\n\tSalario Neto = " + (this.empleado.getSueldo()-(this.empleado.getSueldo()*(retencion/100))) + " euros";
    }
    
    
    
    
    
    
    
    
    
    
    
}
