

/*
Diseñar una aplicación que declare una tabla de 10 elementos enteros.
Leer mediante el teclado 8 números. Después se debe pedir un número y una
posición, insertarlo en la posición indicada, desplazando los que
estén detrás.
*/
package com.mycompany.ejecicion4vectoresenjava;

import java.util.Scanner;


public class Ejecicion4VectoresEnJava {

    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
        int vector[] = new int[10];
        int numero,copia = 0 ;
        boolean derecha = false;
        int posicion;
        
        System.out.println("Ahora Leeremos mediante el teclado 8 números. ");
        // leyendo los 8 numeros 
       for (int i = 0; i<8; i++){
           System.out.print((i + 1)+". Diguite los numeros de la tabla ");  
           vector[i] = entrada.nextInt();
    }
       for(int i = 0; i<10; i++){
           System.out.print(vector[i]);
       }
       
        // Diguitando  un numero extra
        System.out.print("Diguite otro numero: ");
         numero = entrada.nextInt();
        //Diguitando la pocicion del numero estra;
         System.out.print("\nDiguite un numero de poscion para el numeor que acaba de diguitar: ");
         posicion= entrada.nextInt();
         
       
         if (posicion > 0 ){
             derecha = true;
         }
         
         for (int i = 0; i<10; i++){
             if (derecha = true){
                vector[i] = vector[i+1];
                //vector[i] = vector[posicion] = numero;
                 System.out.print(vector[i]);
             }
         }
             
         
         
         
         
        }
         
      
      }
   


