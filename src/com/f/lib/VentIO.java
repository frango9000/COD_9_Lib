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

    
    public void output(String msg, String titulo){
        JOptionPane.showMessageDialog(null, msg, "titulo", 0);
        //JOptionPane.showIn
    }
}
