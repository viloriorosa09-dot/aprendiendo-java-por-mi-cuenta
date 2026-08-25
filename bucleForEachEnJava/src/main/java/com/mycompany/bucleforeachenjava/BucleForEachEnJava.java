
package com.mycompany.bucleforeachenjava;


public class BucleForEachEnJava {

    public static void main(String[] args) {
      
      short[] numero = {2,3,31,4,51,1,43,45,26,2,14,523,62,51,45,6,42,145,246,23,51,45};  
      String[] nombres = {"Wilber","Rosa","Maria","Juana","Jose","Marta","Albert"};
      
      for(int i = 0; i<numero.length ; i++){//<-- Metodo .length le todos los elementos del el vector.
          System.out.println("los numeros son: "+numero[i]);
      }
        //Bucles for each: Primero el tipo de variable, luego el hiterador dos putos y luego el nombre del el vector 
      for (String i:nombres){//<-- i absorbe todos los elementos del el vector y el vector mismo 
          System.out.println("\nLos nombres son: "+i);
      }
    }
}
