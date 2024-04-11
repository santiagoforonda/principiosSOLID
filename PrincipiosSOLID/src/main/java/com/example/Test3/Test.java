package com.example.Test3;

public class Test {//Podemos reemplazar la clase Vehiculo por sus clases hijas
    public static void main(String[] args){
        Vehiculo vehiculo1 = new Automovil(200,4);
        Vehiculo vehiculo2 = new Motocicleta(300, "Deportiva");

        mostrarDetallesVehiculos(vehiculo1);
        mostrarDetallesVehiculos(vehiculo2);

    }

    public static void mostrarDetallesVehiculos(Vehiculo vehiculo){
        System.out.println("Velocidad maxima: "+ vehiculo.obtenerVelocidadMaxima());
        if(vehiculo instanceof Automovil){
            Automovil automovil = (Automovil) vehiculo;
            System.out.println("Numero de puertas"+ automovil.obtenerNumeroPuertas());
        } else if(vehiculo instanceof Motocicleta){
            Motocicleta motocicleta = (Motocicleta) vehiculo;
            System.out.println("El tipo es: "+ motocicleta.obtenerTipo());
        }
    }

    
    
}
