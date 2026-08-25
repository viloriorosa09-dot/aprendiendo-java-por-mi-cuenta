

// Pedir 10 numeros  escribir la suma total.
package com.mycompany.ejecicio5buclesenjava;

import java.util.Scanner;


public class Ejecicio5BuclesEnJava {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int sumaTotal = 0 , numero ;
        
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.print("Diguite un numero: ");
            numero = entrada.nextInt();
            sumaTotal += numero;   
        }    
        System.out.println("\n1La suma total es: "+sumaTotal);
            
    }
}
