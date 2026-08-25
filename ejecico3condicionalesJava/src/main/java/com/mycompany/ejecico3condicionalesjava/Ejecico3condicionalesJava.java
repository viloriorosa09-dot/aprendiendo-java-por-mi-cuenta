
//Hacer un programa que tome dos números y diga si ambos son pares o impares.
package com.mycompany.ejecico3condicionalesjava;

import javax.swing.JOptionPane;

public class Ejecico3condicionalesJava {

    public static void main(String[] args) {
        
        short n1, n2;
        JOptionPane.showMessageDialog(null, "Programa para de terminar si dos numeros son paras o no.");
        
        n1 = Short.parseShort(JOptionPane.showInputDialog("Diguite el primer numero."));
        n2 = Short.parseShort(JOptionPane.showInputDialog("Diguite el segundo numero."));
        
        
        if (n1 % 2 == 0 & n2 % 2 == 0  ){
            JOptionPane.showMessageDialog(null,"Hanbos numeros son pares.");
        }
        else if (n1  % 2 == 0 || n2 % 2 == 0){
                 JOptionPane.showMessageDialog(null,"Por lo menos un numeros es par.");
                }
        else {
                 JOptionPane.showMessageDialog(null,"Hanbos numeros no son pares.");
                }
    }
}
