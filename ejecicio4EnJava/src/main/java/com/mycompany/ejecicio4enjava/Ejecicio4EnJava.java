
/* 
Ejercicio 4: Construir un programa que alcule y muestre
por pantalla las raíces de la ecuación de segundo grado de
coeficientes reales. ax?+bx+c=0-b+Vb2- 4acx =- 2a
*/

package com.mycompany.ejecicio4enjava;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecicio4EnJava {

    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        double a, b, c, potenciacion, resultadoP,resultadoN,raiz,mulT,resta; 
        
        JOptionPane.showMessageDialog(null,"Calulemos las raices de ecuaciones de segundo grado.");
        
        // Pidiendo datos al usuario.
        System.out.print("Diguite el primer termino: ");
        a = entrada.nextDouble();
        System.out.print("Diguite el segundo termino: ");
        b = entrada.nextDouble();
        System.out.print("Diguite el tercer termino: ");
        c = entrada.nextDouble();

        // Realizando la operacion.
        potenciacion = Math.pow(b,2);
        mulT = 4 * (a) *(c);
        resta = potenciacion  - mulT;
        raiz = Math.sqrt(resta); 
        a = 2 *(a);
        b = -b;
        resultadoP = (b + raiz) / a;
        resultadoN = (b - raiz) / a;
        
        
       // Mi error de loguica de Programacion 
       /* a = a * 2;
        b = -b; 
        calculo = Math.sqrt( b*b);
        System.out.println(calculo);
        System.out.println(b);
        raiz = calculo /a; 
        resultadoP = (b + calculo) / a;
        resultadoN = (b - calculo) / a;
       */ 
        // Resultados de la raices de una ecuacion de segundo grado. 
        JOptionPane.showMessageDialog(null,"Primer resultado es: "+resultadoP);
        JOptionPane.showMessageDialog(null,"Segundo resultado es: "+resultadoN);
    }
}
