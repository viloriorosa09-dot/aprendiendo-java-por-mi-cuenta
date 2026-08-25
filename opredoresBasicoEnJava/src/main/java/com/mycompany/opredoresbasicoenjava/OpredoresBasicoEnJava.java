/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.opredoresbasicoenjava;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author wilberV
 */
public class OpredoresBasicoEnJava {

    public static void main(String[] args) {
      
       Scanner numero = new Scanner(System.in);
       float n1,n2,suma,resta,mult,div,resto;
       
       JOptionPane.showMessageDialog(null, "Diguite dos numero para su suma,resta,multiplicacion,divicio y resto");
       
        System.out.print("Diguite el primer numero: ");
        n1 = numero.nextFloat();
        
        System.out.print("Diguite el segundo numero: ");
        n2 = numero.nextFloat();
        
        suma = n1 + n2;
        resta = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        resto = n1 % n2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La divicion es: "+div);
        System.out.println("El resto es: "+resto);
        
        
    }
}
