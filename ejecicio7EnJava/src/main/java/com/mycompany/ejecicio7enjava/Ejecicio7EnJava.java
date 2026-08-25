
/*
Pedir 10 sueldos.
Mostrar su suma y cuantos hay
mayores de $1000.
*/
package com.mycompany.ejecicio7enjava;

import javax.swing.JOptionPane;


public class Ejecicio7EnJava {

    public static void main(String[] args) {
        int suma = 0 , contador= 0  , entrada;
        
        for (int i = 1; i<= 10; i++){
           entrada = Integer.parseInt(JOptionPane.showInputDialog("un 10 suledos diferentes."));
           
           
              if (entrada >= 1000){
                 contador++;
               }
            suma+= entrada;
        }   
        System.out.println("La suma de todos los sueldos es : "+suma+" y los que superan los 1,000 son: "+contador);
    }
}
