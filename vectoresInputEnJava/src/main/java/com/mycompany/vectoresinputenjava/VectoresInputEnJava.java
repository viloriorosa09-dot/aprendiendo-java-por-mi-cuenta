
package com.mycompany.vectoresinputenjava;
import java.util.Scanner;

public class VectoresInputEnJava {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
     byte numeros;
     
        System.out.print("diguite la cantidad de elemes para el vector: ");
        numeros = entrada.nextByte();//<-- Entrada de datos.
      
      int[] vector = new int[numeros];  //<-- Declarando un vector y dandele la canditadad de elementos del usuario.
      
      for (int i = 0; i< numeros; i++){
          System.out.print("Diguite el "+(i+1)+" elemento del vector: ");
          vector [i] = entrada.nextInt();//<-- Entrada de datos de un vector.
      }
      for(int i = 0; i<numeros ; i++){
          System.out.print(vector[i]+" ");//<--  Mostrandos los elementos de el vector.
          System.out.print(10+vector[i]+" ");//<-- Sumandole 10 a cada elemento del vector.
      }
    }
}
