

/*
Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar
de dicho número
*/
package com.mycompany.ejecicio8enjava;
 import java.util.Scanner;

public class Ejecicio8EnJava {
  
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int numero , mult; 
       
        System.out.print("Diguite un numero entre 0 y 10: ");
        numero = entrada.nextInt();
        
        if(numero >=0 & numero <= 10){
            for (int i = 1; i<= 12; i++){
            
            mult=numero * i;
            System.out.println(numero+ " x " + i+" = "+mult);
            }
        }
         System.out.println("Sea exedido con la cantidad de numeros es de 0 a 10.");
      
    }
}
