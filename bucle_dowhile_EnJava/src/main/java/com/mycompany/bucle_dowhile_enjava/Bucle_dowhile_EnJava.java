
// tablas de multiplicar.
package com.mycompany.bucle_dowhile_enjava;
import java.util.Scanner;
public class Bucle_dowhile_EnJava {

    public static void main(String[] args) {
       
        /*
        El bucle do while funciona igual que el while pero este se ejecuta por
        lomenos una vez mira mi ejemplo.
        */
        
       Scanner entrada = new Scanner(System.in);
        int n1  , n2 = 1 ,total ;
        
        // Pidiendo datos al usuario 
         System.out.print("Diguite que tabla quiere: ");
            n1 = entrada.nextInt();
     
        do{
            // Por lo menos se ejcuta una ves
            total = n1 * n2;  
            System.out.println( n1 + " x " +n2+ " = "+total);
            n2++;// Incrementa en uno
        }
        while(n2 <=12);
    
    }
}
