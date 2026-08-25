/*
    Hacer un programa que pese de Kg a otra uidad de medida de mas, mostrar
    en pantalla un menu con las opciones posibles.
 */

package com.mycompany.ejecico7condicionalesenjava;
import javax.swing.JOptionPane;

public class Ejecico7CondicionalesEnJava {

    public static void main(String[] args) {
        float kilogramos;
        byte  opciones;
        
       kilogramos = Float.parseFloat(JOptionPane.showInputDialog("Por favor diguite su peso en Kilogramos."));
       
       opciones = Byte.parseByte(JOptionPane.showInputDialog("Ahora diguite aque otra unidad de medida quiere usted pasar sus Kilogramos.\n"
               + "Diguite 1 para Toneladas\n"
               + "Diguite 2 para Gramos.\n"
               + "Diguite 3 para Miligramos.\n"
               + "Diguite 4 para Libras.\n"
               + "Diguite 5 para Onzas."));
       
       switch(opciones){
           case 1: 
               kilogramos /= 1000;
               JOptionPane.showMessageDialog(null, "Sus Kilogramso en Toneladas es "+ kilogramos);
               break;
           case 2: 
             kilogramos *= 1000;
             JOptionPane.showMessageDialog(null, "Sus Kilogramso en Gramos es "+ kilogramos);
             break;
           case 3:
               kilogramos *= 1000000;
               JOptionPane.showMessageDialog(null, "Sus Kilogramso en Miligramos es "+ kilogramos);
               break;
           case 4:
               kilogramos *= 2.20462;
               JOptionPane.showMessageDialog(null, "Sus Kilogramso en Libras es "+ kilogramos);
               break;
           case 5: 
               kilogramos *= 35.274;
               JOptionPane.showMessageDialog(null, "Sus Kilogramso en Onzas es "+ kilogramos);
               break;
           default: JOptionPane.showMessageDialog(null, "Erro, La opcion diguitadad no Existe");
           break;
    }
       
    }
}
