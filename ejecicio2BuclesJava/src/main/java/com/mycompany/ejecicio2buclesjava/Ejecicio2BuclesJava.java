package com.mycompany.ejecicio2buclesjava;


import javax.swing.JOptionPane;
/*
Pedir números hasta que se teclee uno negativo,
y mostrar cuántos números se han introducido.
package com.mycompany.ejecicio2buclesjava;
*/

public class Ejecicio2BuclesJava {

    public static void main(String[] args) {
   
        int numero  , contador = 0 ;
        
        do{
        numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero entero."));
         if (numero > 0 ){
             contador++;
         }
           
        }
        while(numero > 0);
          //contador++; // <-- lo intente pero no funciona ahi 
        
        JOptionPane.showMessageDialog(null,contador);
        
        
        // mis errores 
     /* numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero entero."));
      
        for (contador = 1; numero > 0; contador++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero entero."));
            JOptionPane.showMessageDialog(null,contador);
        }
        */
    }
}
