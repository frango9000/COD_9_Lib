package com.f.lib;

public class Main {

    public static void main(String[] args) {
        IO ioc = IO.crearIO(IO.Tipo.CONSOLA);
        ioc.output("msg por consola");
        
        IO iov = IO.crearIO(IO.Tipo.VENTANA);
        iov.output("msg por ventana");
        
        
        

    }
}
