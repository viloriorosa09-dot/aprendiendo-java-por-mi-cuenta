
//Pedir un número N, y mostrar todos los números del 1
//al N.
package com.mycompany.ejecicio4buclesenjava;
import javax.swing.JOptionPane;

public class Ejecicio4BuclesEnJava {

    public static void main(String[] args) {
        
       int numero;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("diguite un numero. "));
        
       for(int i = 1; i <= numero; i++){
           System.out.println(i);
       }
    }
}
