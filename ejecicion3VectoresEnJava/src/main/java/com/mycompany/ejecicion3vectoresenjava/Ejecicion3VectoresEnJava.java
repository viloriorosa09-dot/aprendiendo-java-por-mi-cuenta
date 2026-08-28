/*
 Leer los datos correspondiente a dos tablas de 12 elementos
numéricos,y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B,
otros 3 de A, otros 3 de la B, etc.
*/
package com.mycompany.ejecicion3vectoresenjava;

import java.util.Scanner;

public class Ejecicion3VectoresEnJava {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumaTres = 0;
        float[] tablaA,tablaB, tablaC;
        
        //Iniciando las tablas con sus repetivos valores.
        tablaA = new float[12];
        tablaB = new float[12];
        tablaC = new float[24];
        
        //Pidiendo los datos de la tabla A.
        for(int i = 0; i<12; i++){
            System.out.print((i+1)+" Diguite los valores de la tabla A: ");
            tablaA[i] = entrada.nextFloat();
        }
        
        System.out.println();//<-- para dar un salto de linea y quese mas elgante;
        
        //Pidiendo los datos de la tabla B.
        for(int i = 0; i<12; i++){
            System.out.print((i+1)+" Diguite los valores de la tabla B: ");
            tablaB[i] = entrada.nextFloat();
        }
        
        for(int i = 0; i<12; i+=3 ){
            
            //tablaC[sumaTres] = tablaA[i];
              for (int k = 0 ; k<3; k++){
                   tablaC[sumaTres] = tablaA[i+k];// <-- marca el indice y abansa
                   sumaTres++;
              }
           
            //tablaC[sumaTres] = tablaB[i];sumaTres++;
             for (int j = 0 ; j<3; j++){
                tablaC[sumaTres] = tablaB[i+j];  // <-- marca el indice y abansa
                sumaTres++;
             }
        }
        
        for(int i = 0; i<24; i++){
            System.out.print(tablaC[i]+" , ");
        }
          
     
    }
}
