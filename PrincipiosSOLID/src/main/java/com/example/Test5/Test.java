package com.example.Test5;

public class Test {

    public static void main(String[] args){


        Mensaje mensajeCorreo = new CorreoElectronico();
        Mensaje mensajeSMS = new SMS();

        Notificador notificadorCorreo = new Notificador(mensajeCorreo);
        Notificador notificadorSms = new Notificador(mensajeSMS);

        notificadorCorreo.enviarMensaje();
        notificadorSms.enviarMensaje();



    }
    
}
