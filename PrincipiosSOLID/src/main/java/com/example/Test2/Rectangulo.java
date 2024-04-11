package com.example.Test2;

public class Rectangulo extends Forma {

    private Double base;
    private Double altura;

    public Rectangulo(){

    }

    public Rectangulo(Double base, Double altura){
        this.altura=altura;
        this.base=base;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base*altura;
    }   

    

    
}
