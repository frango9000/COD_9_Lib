package com.f.lib;


public abstract class IO implements Mostrable{

    /**
     * Muestra un mensage por consola o por JOptionPane
     * 
     * @param msg String a ser mostrado por consola
     */
    @Override
    public abstract void output(String msg);

    /**
     * Devuelve un String introducido por consola o por JOptionPane
     *
     * @return String
     */
    @Override
    public abstract String input();

    /**
     * Muestra un mensaje por consola o por JOptionPane solicitando introducir datos Devuelve un
     * String introducido en la consola o por JOptionPane
     *
     * @param msg String a ser mostrado
     * @return String introducido
     */
    @Override
    public abstract String input(String msg);

    /**
     * metodo que devuelve un objeto de la clase IO ya creado depende del tipo de salida que necesite quien utilice el metodo
     * @param tipo TIPO (CONSOLA, VENTANA)
     * @return instanceof IO
     */
    public static IO crearIO(Tipo tipo){
        IO io;
        switch(tipo){
            case CONSOLA:
                io = new ConsIO();
                break;
            case VENTANA:
                io = new VentIO();
                break;
            default:                
                io = new ConsIO();
                break;
        }
        return io;        
    }
}
