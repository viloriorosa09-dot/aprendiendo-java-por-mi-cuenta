



//Pedir dos números y decir cual es el mayor o si son iguales
package com.mycompany.ejcicio1condicionalesenjava;
import javax.swing.JOptionPane;


public class Ejcicio1CondicionalesEnJava {

    public static void main(String[] args) {

    float n1, n2;
    
    JOptionPane.showMessageDialog(null,"Diguite dos numero para ver cual es mayor.");
    
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Diguite el promer numero. "));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Diguite el segundo numero. "));

if (n1 > n2){
    JOptionPane.showMessageDialog(null,"el numero: "+n1+" es mayor ");
}
else if (n2 > n1){
    JOptionPane.showMessageDialog(null,"el numero: "+n2+" es mayor ");
}
        
else {  
    JOptionPane.showMessageDialog(null,"Los numero: "+n1+" y "+n2+" son iguales.");

   }

    }
}
