package com.f.lib;
//@author fsancheztemprano

import java.util.Scanner;

public class ConsIO extends IO{
    /**
     * mostrar parametro msg por consola
     * @param msg string a mostrar por consola
     */
    @Override
    public void output(String msg){
        System.out.println(msg);
    }

    /**
     * metodo que devuelve un string introducido por consola
     * @return String
     */
    @Override
    public String input() {
        return new Scanner(System.in).next();
    }
    /**
     * metodo que muestra un mensaje indicando al usuario lo que debe introducir
     * y devuelve el string introducido por consola
     * @return String
     */
    @Override
    public String input(String msg) {
        output(msg);
        return input();
    }

}
