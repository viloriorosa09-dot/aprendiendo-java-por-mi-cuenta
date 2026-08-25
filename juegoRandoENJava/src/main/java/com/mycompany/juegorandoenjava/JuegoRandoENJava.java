
package com.mycompany.juegorandoenjava;

import javax.swing.JOptionPane;


public class JuegoRandoENJava {

    public static void main(String[] args) {
       int aleatorio, contador = 0, numero; 
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("digute un numero entre 0 y 100"));
       
        
        aleatorio = (int )(Math.random()*100);
        
        do{
            if(numero > aleatorio){
                JOptionPane.showMessageDialog(null,"El numero es menor. ");
            }
            else{
                JOptionPane.showMessageDialog(null,"El numero es mayor ");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("digute otro numero entre 0 y 100"));
            contador++;
           
       
        }while(numero != aleatorio);
      JOptionPane.showMessageDialog(null,"win (: intentos realisazodos "+contador);
    } 
}  
