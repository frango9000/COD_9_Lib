package com.f.lib;
/**
 * @author fsancheztemprano
 */
public class Asserts {

    /**
     * Comprueba si el argumento str es int
     *
     * @param str String a ser comprobado
     * @return boolean true si es int
     * @exception NumberFormatException e si str no es int
     */
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Comprueba si el parametro str es parseable a int, si lo es, devuelve
     * el int, de lo contrario devuelve null
     *
     * @param str string a parsear a int
     * @return String parseado a int
     */
    public static int stringToInt(String str) {
        return isInteger(str) ? Integer.parseInt(str) : null;
    }

    /**
     * Comprueba si el argumento str es float
     *
     * @param str String a ser comprobado
     * @return boolean true si es float
     * @exception NumberFormatException e si str no es float
     */
    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
