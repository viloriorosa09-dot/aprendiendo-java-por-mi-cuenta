

package com.mycompany.condicionalesenjava;
import javax.swing.JOptionPane;

public class CondicionalesEnJava {

    public static void main(String[] args) {
        
        /*
        Operadores logicos.
        == : iguladad.
        != : diferente de o distinto de.
        > : mayor que.
        >= : mayor que o mayor o igula que. 
        < : menor que.
        <- : menor que o menor o igula que.
        */
        
        
        byte edad;
        
        edad = Byte.parseByte(JOptionPane.showInputDialog("Por favor diguitesu edad"));
        
        if(edad >= 18){
            
           JOptionPane.showMessageDialog(null, "Felicidade eres mayor de edad.");
        }
        
        else{
           JOptionPane.showMessageDialog(null,"A tomar por culo tio eres menor de edad.");
        }
    }
}
