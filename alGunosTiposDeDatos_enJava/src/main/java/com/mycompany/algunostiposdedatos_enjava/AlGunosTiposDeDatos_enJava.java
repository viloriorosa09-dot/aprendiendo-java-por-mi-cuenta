/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algunostiposdedatos_enjava;

/**
 *
 * @author wilberV
 */
public class AlGunosTiposDeDatos_enJava {

    public static void main(String[] args) {
       // Tipo de Dato Enteros byte,short,int,long.
       
       byte edad;// byte: Soporta 8 bits que van Desde (-128 a 127)
       short productos;// short: Soporta 16 bits que van Desde (-32,768 a 32,767)
       int clientes;// int: Soporta 32 bits que van Desde(-2,147,483,648 a 2,147,483,647)
       long saldoBancario;// long: Soportan 64 bits que van Desde (-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)
       
       // Tipos de Datos Decimales float,double.
       
      float sociedad;// float: Soportan 32 bits que van Desde (1.4e-045 a 3.4e+038)
      double poblacionMundial;// double: soporta 64 bits que van Desde (4.9e-324 a 1.8e+038)
      
      // Tipo de Dato Carater char. 
      
      char unaCosa;// chat: Soportan 16 bits Y Solamente Soporta un unico caracter de cualquier tipo pero so lo es uno
      
      // Tipo de Dato boolean verdadero = true, falso = false: Soportan 1 bit lógico y se usa para condiciones Logicas.
      
      boolean verdadero = true;
      boolean falso = false; 
      
      edad = 20;
      productos = 10000;
      clientes = 2000000;
      saldoBancario = 3000000;
      
      /* En java Real mente no exite el tipo de Dato float; Solamente Tenemos 
      el double Para usar float Tenemos que indicarle al Programa que es 
      un float Tenemos dos formas para hacer esto.
      */
      
      sociedad = 11.5f;// Forma uno Agregando una f minuscula alfinal del numero.
      sociedad = (float) 33.3;// Forma Dos Indicandole despues de la variabel Entre parentesis la palabra Reselvada float.
       
      poblacionMundial = 8800303039402903034303920.3939;
      
      unaCosa = 'W';
      
        System.out.println("Hola soy Wilber: "+edad);
        System.out.println("Hay: "+productos +" Productos y "+clientes+" de cientes.");
        System.out.print("Y nuestro saldo bancario es de: "+saldoBancario);
        
        System.out.println(" En nustra sociendad hay "+sociedad+" Y creo que la poblacion Mundial es de: "+poblacionMundial );
        System.out.println("Y mi letra favorita es: "+unaCosa);
      
    }
}
