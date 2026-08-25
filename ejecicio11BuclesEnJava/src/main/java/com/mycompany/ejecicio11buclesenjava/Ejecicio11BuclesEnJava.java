/*
Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso
hacerlos con buleanos.
*/

package com.mycompany.ejecicio11buclesenjava;

import javax.swing.JOptionPane;

public class Ejecicio11BuclesEnJava {

    public static void main(String[] args) {
        
        int nota,contador =0  ; 
        boolean suspenso = false; 
        
        
        for(int i = 1; i <= 5; i++){
            do{
            nota = Integer.parseInt(JOptionPane.showInputDialog("Diguite las nota. " + i));
            
            if (nota < 5){
                suspenso = true; 
                contador++;
            }
            }while(!(nota >= 0 && nota <= 10   ));
            
        }
        if (suspenso == true){
     
        System.out.println("Estudiantes suspendidos hay: " +contador);
        }
        else{
            System.out.println("No hay estudiantes suspensos.");
        }
    }
}
