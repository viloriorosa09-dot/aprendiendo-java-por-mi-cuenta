/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposdedatosno_primitivos_en_java;

/**
 *
 * @author wilberV
 */
public class TiposDeDatosNo_Primitivos_en_Java {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /* Tipos de datos Primitivos byte,shot,int,long,float,double,char Y boolean.
        
        Se consideran tipos de datos primitivos porque:

        1. No son objetos;
        Son tipos básicos que el lenguaje implementa directamente en la memoria, sin métodos ni propiedades.
        No derivan de ninguna clase y no tienen comportamiento asociado o no tienen metodos, solo almacenan valores.
        */
        
       boolean verdadero = true;
       
        /*Tipos de datos No primitivos  Integer,String. Son datos no primitivos porque son objetos, 
        no valores básicos.
        */
        
        Integer bacio = null;// null es ingual a Nada o vacio.
        String saludo = "Hola estoy en Java" ;
        
        System.out.println(bacio);
        System.out.println(saludo);
    }
}
