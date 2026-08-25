/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoresdeincrementoydecremento;

/**
 *
 * @author wilberV
 */
public class OperadoresDeIncreMentoYDecremento {

    public static void main(String[] args) {
    
        byte a = 5,b = 10,c = 15; 
        byte x = 10, y;
        
       a ++;// Incremanta uno.
       b --;// DEcremento uno, 
       c++; // Incrementa uno.

       y = x++;// Al estar de sufijo y = x;  Y x Incrementa uno.
       System.out.println(y);
       
       
         y = x--;// Al estar de sufijo y = x;  Y x Decrementa uno.
       System.out.println(y);
        
       
         y = --x;// Al estar de prefijo Y = x - uno; y x Decrementa uno tambien.
        System.out.println(y);
        
       y = ++x;// Al estar de prefijo Y = x + uno; y x Incrementa uno tambien.
        System.out.println(y);
        
      
        
      
    }
}
