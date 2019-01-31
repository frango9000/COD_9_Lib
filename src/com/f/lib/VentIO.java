package com.f.lib;
//@author fsancheztemprano

import javax.swing.JOptionPane;

public class VentIO extends IO{
    
    @Override
    public void output(String msg){
        JOptionPane.showMessageDialog(null, msg, "titulo", 0);
    }
}
