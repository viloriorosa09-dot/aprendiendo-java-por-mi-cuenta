/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entradade_datosenjava;

    import java.util.Scanner;
/**
 *
 * @author wilberV
 */
public class EntradaDe_DatosEnJava {

    public static void main(String[] args) {
       Scanner cadena = new Scanner(System.in);
       Scanner numero = new Scanner(System.in);
       
      short a,b,c;
      
      System.out.print("Diguite el pirmer numero: ");
      a = numero.nextShort();
      System.out.print("Diguite el segundo numero: ");
      b = numero.nextShort();
      
      c = (short) (a + b);
        System.out.println("El resultado es: "+c);
 
        String saludoUnico,saludo;
        char letra; 
        
        System.out.print("Por favor manda un saludo Unico sin espacios: ");
        saludoUnico = cadena.next();// next: Solamente pone el primer saludo antes de un espacio Ejecuta el codigo para mas entendimiento Wilber.
        System.out.println("El saludo fue: "+saludoUnico);
        
        cadena.nextLine();// Funciona pra comerse el salto de linea del (cadena.next) asi puede funcionar correctamente el (cadena.nextLine).
        
        System.out.print("Diguiet un saludo completo: ");
        saludo = cadena.nextLine();
        System.out.println("El saludo fue: "+saludo);
        
        System.out.print("Diguite una letra: ");
        letra = cadena.next().charAt(0);
        System.out.println("La letra fue: "+letra);
        
     
    }
}
