/* Leer un número e indicar si es positivo o negativo.
   El proceso se repetirá hasta que se introduzca un 0.
*/

package com.mycompany.ejecicio1buclesjava;

import javax.swing.JOptionPane;


public class Ejecicio1BuclesJava {

    public static void main(String[] args) {
     
        float numero; 
        
        numero = Float.parseFloat(JOptionPane.showInputDialog("Diguite un numero."));
        
        while( numero != 0){
            
            
            if (numero >= 1){
             JOptionPane.showMessageDialog(null,"El numero es positivo. "+numero); 
            }
            else{
                JOptionPane.showMessageDialog(null,"El numero es negativo. "+numero);
            }
         numero = Float.parseFloat(JOptionPane.showInputDialog("Diguite otro  numero."));
        }
        
      JOptionPane.showMessageDialog(null,"A salido del programa.");
    }
}
