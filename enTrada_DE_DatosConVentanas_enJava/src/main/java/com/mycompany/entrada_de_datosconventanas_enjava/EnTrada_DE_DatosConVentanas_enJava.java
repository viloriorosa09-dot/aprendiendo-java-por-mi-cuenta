/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entrada_de_datosconventanas_enjava;
import javax.swing.JOptionPane;

/**
 *
 * @author wilberV
 */
public class EnTrada_DE_DatosConVentanas_enJava {

    public static void main(String[] args) {
        
        String saludo;
        char carater;
        int a,b,c;
        float decimal;
        double decimalLong;
        
        saludo = JOptionPane.showInputDialog("Diguite un saludo: ");
        carater = JOptionPane.showInputDialog("Por favor diguite un caracter: ").charAt(0);
        
        JOptionPane.showMessageDialog(null,"Ahora haremso una pequeña suma.");
        a = Integer.parseInt(JOptionPane.showInputDialog("Diguite el primer numero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Diguite el segundo numero: "));
        c = a + b ;
        JOptionPane.showConfirmDialog(null, "El resultado de la suma es: "+c);
        
        JOptionPane.showMessageDialog(null, "Partes Personales.");
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Diguite su estatura en pies:"));
        decimalLong = Double.parseDouble(JOptionPane.showInputDialog("Diguite su peso en libras: "));
        
        
        JOptionPane.showConfirmDialog(null, "El saludo fue: "+saludo);
        JOptionPane.showConfirmDialog(null, "El caracter es: "+carater);
        JOptionPane.showConfirmDialog(null, "Su estatura es: "+decimal);
        JOptionPane.showConfirmDialog(null, "Su peso es: "+decimalLong);
    }
}
