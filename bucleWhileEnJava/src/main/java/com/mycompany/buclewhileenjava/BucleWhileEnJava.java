
package com.mycompany.buclewhileenjava;

import javax.swing.JOptionPane;
public class BucleWhileEnJava {

    public static void main(String[] args) {
      
      /* Un bucle (while) se va a mantener ejecutandoce asta que su condicion
         sea falsa de lo con tradio seguira asta el infinito pro eso en algunos
        casos hay que declaras una valriable falasa para salir del programa 
        o algo que sea falso para salir del programa vamos a ver un Ejemplo.
        */ 
      
      float kilogramos;
      byte  opciones = 0;

      while(opciones != 6){
          
          kilogramos = Float.parseFloat(JOptionPane.showInputDialog("Por favor diguite su peso en Kilogramos."));
          opciones = Byte.parseByte(JOptionPane.showInputDialog("Ahora diguite aque otra unidad de medida quiere usted pasar sus Kilogramos.\n"
               + "Diguite 1 para Toneladas\n"
               + "Diguite 2 para Gramos.\n"
               + "Diguite 3 para Miligramos.\n"
               + "Diguite 4 para Libras.\n"
               + "Diguite 5 para Onzas.\n"
               + "Diquite 6 para salir."));
           
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
           case 6:
                 JOptionPane.showMessageDialog(null, "Usted a salido del programa.");
                 break;
           default:   
               JOptionPane.showMessageDialog(null, "Error, esta opcion no es validad.");
               break;
            }
        }
    }
}

