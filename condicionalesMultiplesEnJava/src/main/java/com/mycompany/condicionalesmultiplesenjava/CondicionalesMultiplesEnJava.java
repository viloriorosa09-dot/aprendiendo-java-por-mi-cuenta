
package com.mycompany.condicionalesmultiplesenjava;


import javax.swing.JOptionPane;

public class CondicionalesMultiplesEnJava {

    public static void main(String[] args) {
        
        byte edad;
        
        edad = Byte.parseByte(JOptionPane.showInputDialog("Por favar diguite su edad."));
        
        switch (edad){
            
            case 10: JOptionPane.showMessageDialog(null,"Tu eres menor de edad Por mucho");
                break;
            case 15: JOptionPane.showMessageDialog(null,"Tu eres menor de edad pero casi eres mayor");
                break; 
            case 18: JOptionPane.showMessageDialog(null,"Tu eres mayor de edad felisidades ");
                break;
            default: JOptionPane.showMessageDialog(null,"Tu eres o muy menor o muy mayor (:");
                break;
        
        }
        
        
        
        
        
        
        
        
        
        
            }
}
