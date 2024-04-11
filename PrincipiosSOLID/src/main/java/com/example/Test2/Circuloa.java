package com.example.Test2;

public class Circuloa  extends Forma {

    private Double radio;

    public Circuloa(Double radio){
        this.radio=radio;
    }

    

    @Override
    double calcularArea() {
        return Math.PI*radio*radio;
    }



    public Double getRadio() {
        return radio;
    }



    public void setRadio(Double radio) {
        this.radio = radio;
    }

    
    
}
