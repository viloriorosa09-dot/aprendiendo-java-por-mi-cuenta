/*
Leer 5 números, guardarlos en un arreglo mostrarlos en el orden inverso
al introducido.
*/

package com.mycompany.ejecicio1vectoresenjava;

import java.util.Scanner;


public class Ejecicio1VectoresEnJava {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        
        System.out.println("Diguite los numero del Vector.\n");
        
        for(int i = 0; i<numeros.length; i++){
            System.out.print((i+1)+" Diguite el numero: ");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println ("\nMostrandos los datos de forma inversa.");
        
        for(int i = numeros.length - 1; i >= 0; i-- ){
            System.out.println(numeros[i]);
        }
    }
}
