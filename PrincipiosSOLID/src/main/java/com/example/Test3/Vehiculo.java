package com.example.Test3;

public class Vehiculo {//Sustitucion de liskov

    private int velocidadMaxima;

    public Vehiculo(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }

    public int obtenerVelocidadMaxima(){
        return velocidadMaxima;
    }
    
}
