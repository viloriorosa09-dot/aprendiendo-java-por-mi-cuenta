

/*
Leer 10 números enteros, guardarlos en un arreglo.Debemos mostrarlos en el siguiente orden:
el primero, el último, el segundo, el penúltimo, el tercero, etc.
*/
package com.mycompany.ejercicio2vectoresenjava;
import java.util.Scanner;
public class Ejercicio2VectoresEnJava {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[10];
        
        System.out.println("Ahora vamos a introducir los valores del vector.");
        
        for(int i = 0; i<10; i++){
            System.out.print((i+1)+" Diguite el un valor: ");
            numeros[i] = entrada.nextInt(); 
        }
       
        // Todo lo que esta en parentesis son mis herrosres 
     
        for (int i = 0, j = 9; i<5 && j>=5; i++,j--){
                //System.out.println(i);
// System.out.println(numeros[i]);
    //for(int j = 9; j >= 5; j--){
  //for(int n:numeros){
                System.out.println(numeros[i]);
                System.out.println(numeros[j]);
        //}
            }
//1
    
  
         
     
       // System.out.println(numeros[0]);
        /*
        System.out.println(numeros[9]);
        System.out.println(numeros[1]);
        System.out.println(numeros[8]);
        System.out.println(numeros[2]);
        System.out.println(numeros[7]);
        System.out.println(numeros[3]);
        System.out.println(numeros[6]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);*/

    }
}
