/*
Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
introducidos.
*/
package com.mycompany.ejecicio3bulcesenjava;

import javax.swing.JOptionPane;


public class Ejecicio3BulcesEnJava {

    public static void main(String[] args) {
       
       int n1,sumando = 0;
       
     do {
         n1 = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
         sumando +=n1;
         
     }while(n1 != 0);
     JOptionPane.showMessageDialog(null,"Todo los numero sumados "+sumando);
    }
}
