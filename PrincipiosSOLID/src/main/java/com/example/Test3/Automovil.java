package com.example.Test3;

public class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil(int velocidadMaxima, int numeroPuertas){
        super(velocidadMaxima);
        this.numeroPuertas=numeroPuertas;
    }

    public int obtenerNumeroPuertas(){
        return numeroPuertas;
    }
    
}
