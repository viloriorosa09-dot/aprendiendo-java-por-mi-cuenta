

/*
Hacer unas modificaciones al jercicio anterior suponiendo que no
• que no se
introduce el precio por litro. Solo existen tres productos con precios:
1- 0,6 $/litro
2- 3 $/litro
3- 1,25 €/litro.
*/
package com.mycompany.ejecicio9buclesenjava;

import javax.swing.JOptionPane;


public class Ejecicio9BuclesEnJava {

    public static void main(String[] args) {
       
        int codigo;
        int  facturasMasDE600 = 0 ;
        
        float facturacionTotal = 0, suma = 0,cantidadEnLitros, sumaLitrosUno = 0;
        for (int i = 1; i<= 5; i++){
            
           codigo = Integer.parseInt( JOptionPane.showInputDialog("Diguite el codigo. "+i)); 
           cantidadEnLitros = Integer.parseInt( JOptionPane.showInputDialog("Diguite la cantidad de litros vendidos. "+i)); 
         
           
           switch(codigo){
               
               case 1:
                   suma = (float)cantidadEnLitros * 0.6f;
                   sumaLitrosUno +=cantidadEnLitros;
                   
                   break;
               case 2: 
                   suma = (float)cantidadEnLitros * 3;
                    break;
               case 3: 
                   suma = (float)cantidadEnLitros * 1.25f;
                   break;
               default: 
                   JOptionPane.showMessageDialog(null," Codigo no falido ");
                   break;
           }
            facturacionTotal += suma;
         
           if(suma >= 600){
               facturasMasDE600++;  
           }
  
        } 
        
        System.out.println("facturacion total es: "+facturacionTotal);
        System.out.println("cantidad en litros vendidos del artículo 1: "+sumaLitrosUno);
        System.out.println(" cuantas facturas se emitieron de más de $600: "+facturasMasDE600);
    }
}
