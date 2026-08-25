
// Pedir un numero N y calcular su factorial 
// N! = 1*2*3....*N

package com.mycompany.ejecicio6buclesenjava;
import java.util.Scanner;

public class Ejecicio6BuclesEnJava {

    public static void main(String[] args) {
     
        long factorial = 1; 
      Scanner entrada = new Scanner(System.in);
        System.out.print("Diguite un numero: ");
        int numero = entrada.nextInt();
        
            
      for (long i = 1; i <= numero; i++){
          
          factorial *=i;
      }
        System.out.println( factorial);
    
    }
}
