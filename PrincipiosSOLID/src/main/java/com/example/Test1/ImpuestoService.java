package com.example.Test1;

public class ImpuestoService {//Esta clase tiene la responsabilidad de calcular impuestos

    public void calcularImpuesto(Empleado empleado){
        Double impuesto = empleado.getSalario()*0.1;
        System.out.println("El impuesto del empleado es:"+impuesto);
    }
    
}
