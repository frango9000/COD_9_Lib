package com.f.lib;

import javax.swing.*;
import java.util.Scanner;

public abstract class IO {

    public static void output(String msg){
        System.out.println(msg);
    }

    public static void output(String title, String msg){
        JOptionPane.showMessageDialog(null, title, msg, 0);
    }

    public static String input(){
        return new Scanner(System.in).next();
    }


    public static String input(String msg){
        output(msg);
        return new Scanner(System.in).next();
    }

    public static String input(String title, String msg){
        return JOptionPane.showInputDialog(null, title, msg, 0);
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }



}
