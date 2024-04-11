package com.example.Test1;

public class Empleado {//Esta clase debe tener una sola responsabilidad, debido al principio de single responsability


    private String nombre;
    private String cargo;
    private Double salario;

    public Empleado(){

    }

    public Empleado(String nombre, String cargo, Double salario){
        this.cargo=cargo;
        this.nombre=nombre;
        this.salario=salario;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public Double getSalario() {
        return salario;
    }


    public void setSalario(Double salario) {
        this.salario = salario;
    }

    
    
}
