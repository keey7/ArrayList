/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicandoarraylist;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class PracticandoArrayList {
    static Scanner ent = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime fechaprueba=LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("'Son las' h 'y' mm");
        System.out.println(fechaprueba);
        System.out.println(fechaprueba.toLocalDate());
        System.out.println(fechaprueba.toLocalTime());
        System.out.println(fechaprueba.format(f));
      //otros formatos  
        f = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(fechaprueba.format(f));
        f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(fechaprueba.format(f));
      //menú  
        menu();
    }
    
    public static void menu(){
        int opcion=-1;
	while(opcion!=0){
		System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
		System.out.printf("EJERCICIOS\n");
		System.out.printf("========================\n");
                System.out.printf("1.- Clase Lámpara \n");
		System.out.printf("2.- Clase Nómina \n");
		System.out.printf("3.- Clases Taller, Vehículo y Pieza \n");
		System.out.printf("0.- SALIR\n");
		System.out.printf("\n\tSeleccione una de las siguientes opciones: "); 
		opcion = ent.nextInt();
		switch(opcion){
                        case 1:
				ejLampara();
				break;
			case 2:
                                ejNomina();
		
				break;
			case 3:
				ejTaller();
				break;
			
			case 0:
                                System.out.println("Gracias por usar la aplicación");
				break;
			default:
				System.out.printf("\nElija entre 0 y 3\n\n");
				break;
                    }
                ent.nextLine();
                ent.nextLine();
                
		
            }
    
        }
    
    public static void ejLampara(){
        System.out.println("EJERCICIO LAMPARA");
        System.out.println("");
        Lampara l1 = new Lampara(false,0);
        System.out.println(l1.toString());
        l1.setIntensidad(10.5);
        System.out.println(l1.toString());
        l1.setIntensidad(1.4);
        System.out.println(l1.toString());
        l1.setIntensidad(90);
        System.out.println(l1.toString());
        l1.setIntensidad(0);
        System.out.println(l1.toString());
        l1.setIntensidad(12.6);
        System.out.println(l1.toString());
        l1.setIntensidad(8.7);
        System.out.println(l1.toString());
    }
    
    public static void ejNomina(){
        System.out.println("EJERCICIO NOMINA");
        System.out.println("");
        Empresa e1 = new Empresa("Accenture");
        //Empresa e2 = new Empresa("Indra");
        Departamento d1 = new Departamento(e1,"Human Resources");
        System.out.println(d1);
        //Departamento d2 = new Departamento(e2,"Administration");
        Empleado em1 = new Empleado("11A","Antonio",d1,2100.50);
        //Empleado em2 = new Empleado("22B","Marta",new Departamento(new Empresa("Indra"),"Administration"),4900.75);
        Nomina n1 = new Nomina(em1,31.45);
        System.out.println("Nómina de "+em1.getNomEmpleado()+":");
        System.out.println(n1.toString());
        System.out.println("");
        System.out.println("");
        Nomina n2 = new Nomina(new Empleado("22B","Marta",new Departamento(new Empresa("Indra"),"Administration"),4900.75),50.00);
        System.out.println("Nómina de "+n2.getEmpleado().getNomEmpleado()+":");
        System.out.println(n2.toString());
        
    }
    
    public static void ejTaller(){
        System.out.println("EJERCICIO TALLER");
        System.out.println("");
        Pieza p1 = new Pieza ("ssa", 454.45);
        //pero en vez de crearlo asi como siempre
        ArrayList<Pieza> colPiezas = new ArrayList<>();    
        colPiezas.add(new Pieza("Correa",105.25));
        colPiezas.add(new Pieza("Filtro Aire",100.75));
        Vehiculo v = new Vehiculo("4455 BBB","Citroen","C4",colPiezas);
        Taller t = new Taller("Taller 1","915266116",12.50);
        System.out.println(t+", \n"+v+": \n"+"El coste total de la reparacion es: "
                +t.repararVehiculo(v, 2));
    }
}
