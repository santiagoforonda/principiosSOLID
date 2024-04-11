package com.example.Test5;

public class Notificador  {//Principio de inversion de dependencias, una clase de alto nivel no depende de las clases de bajo nivel

    private Mensaje mensaje;

    public Notificador(Mensaje mensaje){
        this.mensaje=mensaje;
    }

    public void enviarMensaje(){
        mensaje.enviar();
    }
    
}
