
package com.mycompany.vectoresenjava;

/*
Deficion de vectores: UN VECTOR ES UNA SERIE DE DATOS DE UN MISMO TIPO QUE SE
ENCUENTRAN ESTRUCTURADO Y A LOS CUALES SE PUEDE ACCEDER EN CUALQUIER MOMENTO 
MEDIANTE EL INDECE.
*/
public class VectoresEnJava {

    public static void main(String[] args) {
      
    int[] vectorManual = new int[3];
        
    int[] vectorSemiManual ={234,3245,12};//<-- declarando un vector en una linea;
        
        
   // de Clarando un vector maual mente 
   vectorManual[0] = 20;
   vectorManual[1] = 11;
   vectorManual[2] = 123;
   
   for (int i = 0; i<3; i++){
        System.out.println(vectorManual[i]);// <-- EJECUNTADO UN VECTOR;
        
   }
      for (int i = 0; i<3; i++ ){
          System.out.println(vectorSemiManual[i]);// <-- EJECUNTADO UN VECTOR;
      }
    }
}
