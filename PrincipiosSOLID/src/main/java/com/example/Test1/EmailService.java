package com.example.Test1;

public class EmailService {//Esta clase tiene la responsabilidad den enviar emails

    public void enviarEmail(Empleado empleado){
        System.out.println("Email enviado a :"+empleado.getNombre());
    }
    
}
