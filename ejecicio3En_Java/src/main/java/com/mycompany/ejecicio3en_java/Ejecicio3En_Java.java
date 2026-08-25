/*
Ejercicio 6: Hacer un programa que calcule el
cuadrado de una suma. Formula:  (a+b)2= a2 +b2+2ab
*/
package com.mycompany.ejecicio3en_java;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecicio3En_Java {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null, "Cuadrado de una suma.");
         double a,b,suma; 
         
        System.out.print("Diguite el primer valor: ");
        a = entrada.nextFloat();
        System.out.print("Diguite el segundo valor: ");
        b  =  entrada.nextFloat();
        
       suma = Math.pow((a+b), 2);
         
       JOptionPane.showMessageDialog(null, "El resultado es: "+suma);
    }
}
  