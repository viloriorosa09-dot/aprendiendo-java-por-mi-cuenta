

/*
Ejercicio 2: En MegaPlaza se hace un 20% de descuento a los clientes cuya
compra supere los $300. ¿Cuál será la cantidad quepagara
unapersonapor SU compra?
*/
package com.mycompany.ejecico2condicionalesenjava;
import javax.swing.JOptionPane;
public class Ejecico2CondicionalesEnJava {

    public static void main(String[] args) {
        float compras,descuentos,descuentoFinal;
        
       JOptionPane.showMessageDialog(null,"Hola bienvenido a MEGA PLAZA hoy te nemos una promocion\nde una compra de 300 o mas tendra el 20% de descuento");
       
       compras = Float.parseFloat(JOptionPane.showInputDialog("Por favor diguite la cantidad total de su compar."));
       
       descuentos = (compras *20 )/ 100;
        descuentoFinal = compras - descuentos;
        
        if (compras >= 300){
          
            JOptionPane.showMessageDialog(null, "Felisidades se le a aplicado su des cuento del 20% pagara solamente "+descuentoFinal);
        }
        else{
            JOptionPane.showMessageDialog(null,"Lo sentimos usted no califica para el descuento");
        } 
    }  
 
    
}
