package com.mycompany.condicionales_anidados_en_java;
import javax.swing.JOptionPane;

public class Condicionales_Anidados_En_Java {

    public static void main(String[] args) {
        
        int n1;
        
        JOptionPane.showMessageDialog(null,"Juego de la ruleta rusa intenta igular con la maquiena para ganar.");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero de 1 al 100 aber si Puedes ganar."));
        
        
        int randomInt = (int) (Math.random() * 100) + 1;
        // La loguica del Juego estamal pero solo queria probar los condicionales anidados.
     if(randomInt > n1){
         JOptionPane.showMessageDialog(null,"Felizidades as gansdo que surtudo.");
        if(randomInt < n1){
             JOptionPane.showMessageDialog(null, "Esta legos de ganra pendejo.");
         }
        else if (randomInt > n1){
            JOptionPane.showMessageDialog(null,"UF estubiste serca de ganar pero no ganaste jeje ):");
            if (randomInt >=  50){
                JOptionPane.showMessageDialog(null,"Ganaste por tecniciomos no te deje ganar (^-*)");
            }
            else if (randomInt < 60){
                JOptionPane.showMessageDialog(null,"Rindete no vas a ganar nunca. ");
            }
            else{
                 JOptionPane.showMessageDialog(null,"Rindete no vas a ganar nunca yo me asegure de eso jaja ajajajajajajaj. ");
         
            }
            
        }
        else{
             JOptionPane.showMessageDialog(null,"Rindete no vas a ganar nunca yo me asegure de eso jaja ajajajajajajaj. ");

        }
     }  
     else{
             JOptionPane.showMessageDialog(null,"Rindete no vas a ganar nunca yo me asegure de eso jaja ajajajajajajaj. ");

        }
          
    }
}
