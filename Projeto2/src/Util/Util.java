package Util;

import javax.swing.*;

public class Util {
    public static String lerTexto(String texto){
        return (JOptionPane.showInputDialog(texto));
    }
    public static double lerDouble(String texto){
        return Double.parseDouble(JOptionPane.showInputDialog(texto));
    }
    public static int lerInt(String texto){
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }
}
