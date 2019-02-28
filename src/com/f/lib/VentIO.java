package com.f.lib;
//@author fsancheztemprano

import javax.swing.JOptionPane;

public class VentIO extends IO{
    /**
     * mostrar msg por ventana de JOptionPane
     * @param msg string a ser mostrado en la ventana
     */
    @Override
    public void output(String msg){
        output(msg, "Titulo");
    }

    /**
     * salida de texto por joptionpane
     * @param msg texto a mostrar
     * @param titulo de la ventana
     */
    public void output(String msg, String titulo){
        JOptionPane.showMessageDialog(null, msg, titulo, 0);
    }
    /**
     * devuelve un string introducido por ventana de JOptionPane
     * @param msg mensaje que aparece en la ventana
     * @param titulo de la ventana
     * @return String
     */
    public String input(String msg, String titulo){
        return JOptionPane.showInputDialog(null, msg, titulo, 0);
    }
    /**
     * devuelve un string de una ventana de JOptionPane sin mensaje
     * @return String
     */
    @Override
    public String input() {
        return input("","Titulo");
    }
    /**
     * devuelve un string introducido por ventana de JOptionPane
     * @param msg mensaje que aparece en la ventana
     * @return 
     */
    @Override
    public String input(String msg) {
        return input(msg,"Titulo");
    }
}
