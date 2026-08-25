


/*
Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
*/
package com.mycompany.ejecicio10buclesenjava;

import javax.swing.JOptionPane;

public class Ejecicio10BuclesEnJava {

    public static void main(String[] args) {
        
        int numero,sueldos = 0,contador = 0;
       
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero."));
        
        for (int i = 1; i<= numero; i++){
            do{
               sueldos = Integer.parseInt(JOptionPane.showInputDialog("Diguete el sueldo "+i));
            }while(sueldos <= 0);// Para evitar los bugs ne los sueldos negativos y 0 ya que no exiten.
            
            
           if (sueldos > contador) {
              contador = sueldos ;
           }
        }
        System.out.println("el numeor mayor es: "+contador);
    }
}
