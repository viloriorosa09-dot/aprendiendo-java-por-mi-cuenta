
/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
Con meses de 28, 30 y 31 días. Sin años bisiestos.
*/

package com.mycompany.ejecicio5condicionalesenjava;
import javax.swing.JOptionPane;

public class Ejecicio5CondicionalesEnJava {

    public static void main(String[] args) {
   
       byte dias,meses;
       short años;
       
       JOptionPane.showMessageDialog(null,"Indicador de fechas correactas");
       
       
       // Pidiendo datos al usuario.
       dias = Byte.parseByte(JOptionPane.showInputDialog("Introdusca el dia."));
       meses = Byte.parseByte(JOptionPane.showInputDialog("Introdusca el mes.")); 
       años = Short.parseShort(JOptionPane.showInputDialog("Introdusca el años."));
        
       switch (meses){
           
           case 1:
               if (dias >= 1 & dias <= 31){
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
           case 2:
               if (dias >= 1 & dias <= 28){
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
           case 3: 
               if (dias >= 1 & dias <= 31){
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                       
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
           case 4: 
               if (dias >= 1 & dias <= 30){
                
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
            case 5: 
                if (dias >= 1 & dias <= 31){
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
            case 6:
                if (dias >= 1 & dias <= 30){
                 
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                       
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
            case 7:
                if (dias >= 1 & dias <= 31){
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                       
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
            case 8:
                if (dias >= 1 & dias <= 31){
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
            case 9:
                if (dias >= 1 & dias <= 30){
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
            case 10:
                if (dias >= 1 & dias <= 31){
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
            case 11:
                if (dias >= 1 & dias <= 30){
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
            case 12:
                if (dias >= 1 & dias <= 31){
             
                   if (años > 0 ){
                       JOptionPane.showMessageDialog(null,"La fecha es ta correcta.");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Anos incorrecto");
                    }
               }
                else{
                  JOptionPane.showMessageDialog(null,"Dia incorrecto");
               }
               break;
           
            default:
                 JOptionPane.showMessageDialog(null,"La fecha esta incorrecta, El mes es incorrecto.");
                 break;
              
       }    
    }
}
