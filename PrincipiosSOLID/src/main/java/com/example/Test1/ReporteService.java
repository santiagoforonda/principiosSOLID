package com.example.Test1;

public class ReporteService {//Esta clase tiene la responsabilidad de crear reportes

    public void generarRepoerte(Empleado empleado){
        System.out.println("Reporte del empleado:");
        System.out.println("Nombre: "+ empleado.getNombre());
        System.out.println("Cargo:"+ empleado.getCargo());
        System.out.println("Salario:"+empleado.getSalario());
    }
    
}
