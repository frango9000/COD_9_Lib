package com.f.lib;

public class Main {

    public static void main(String[] args) {
        IO ioc = IO.crearIO(Tipo.CONSOLA);
        ioc.output("msg por consola");
        
        IO iov = IO.crearIO(Tipo.VENTANA);
        iov.output("msg por ventana");
        
        
        

    }
}
