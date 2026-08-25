


// Pedir tres numeros y mostralos ordenados de mayor a menor;

package com.mycompany.ejcicio4condicionalesenjava;
import javax.swing.JOptionPane;

public class Ejcicio4condicionalesEnJava {

    public static void main(String[] args) {
        
        int n1, n2, n3;
      JOptionPane.showMessageDialog(null, "Ordenador de numeros de mayor a moner.");
      
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Diguite el primer numero entero."));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Diguite el primer sengundo entero."));
      n3 = Integer.parseInt(JOptionPane.showInputDialog("Diguite el primer tercer entero."));
      
      if ( n1 > n2 & n1 > n3 & n2 > n3 ){
            JOptionPane.showMessageDialog(null, "El orden de los numeros es "+n1+ " "+n2+ " " +n3);
      }
      else if (n2 > n1 & n2 > n3 & n1> n3){
          JOptionPane.showMessageDialog(null, "El orden de los numeros es "+n2+ " "+n1+ " " +n3);
      }
      else if (n3 > n1 & n3 > n2 & n1 > n2){
          JOptionPane.showMessageDialog(null, "El orden de los numeros es "+n3+ " "+n1+ " " +n2);
      }
      else if ( n1 < n2 & n2 >n3 & n3 >n1){
          JOptionPane.showMessageDialog(null, "El orden de los numeros es "+n2+ " "+n3+ " " +n1);
      }
      
      else if ( n1 > n2 & n2  < n3 ){
          JOptionPane.showMessageDialog(null, "El orden de los numeros es "+n1+ " "+n3+ " " +n2);
      }
      else{
          JOptionPane.showMessageDialog(null, "El orden de los numeros es "+n3+ " "+n2+ " " +n1);
    }
    }
}
    
