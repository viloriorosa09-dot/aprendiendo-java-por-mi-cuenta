
/*Pedir una nota de 0 a 10 y mostrarla de la forma:
Insuficiente, Suficiente,Bien,Notable y Sobresaliente.
*/ 
package com.mycompany.ejecico6condicionalesenjava;
import javax.swing.JOptionPane;

public class Ejecico6CondicionalesEnJava {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Por favor diguite su nota");
    byte nota;
    nota = Byte.parseByte(JOptionPane.showInputDialog("Diguite su nota que va de 0 a 10."));
    
    
    switch (nota){
        case 0,1,2,4,5: JOptionPane.showMessageDialog(null,"Insuficiente");
            break;
        case 6: JOptionPane.showMessageDialog(null,"Suficiente");
            break;
        case 7: JOptionPane.showMessageDialog(null,"Bien");
            break;
        case 8,9: JOptionPane.showMessageDialog(null,"Notable");
            break;
        case 10:  JOptionPane.showMessageDialog(null,"Sobresaliente");
            break;
        default:  JOptionPane.showMessageDialog(null,"El numero es menor que 0 y mayor 10."); break;
    }
    }
}
