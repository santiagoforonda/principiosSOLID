package com.example.Test5;

public class CorreoElectronico implements Mensaje {

    @Override
    public void enviar() {
        System.out.println("Correo electronico enviado");
    }
    
}
