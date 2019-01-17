package com.f.lib;

public class Main {

    public static void main(String[] args) {
        //Console Input
            IO.output("Introduce string 1");
        String str1= IO.input();
        String str2 = IO.input("Introduce string 2");

        //Console Output
        IO.output(str1);

        //Window Input
        String str3 = IO.input("Titulo", "Input Message");

        //Window Output
        IO.output("Titulo", str3);


    }
}
