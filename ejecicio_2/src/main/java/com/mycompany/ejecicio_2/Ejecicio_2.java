
/*
Ejercicio 2: Una compañía de venta de carros usados, paga a su personal
de ventas un salario de $1000 mensuales, mas una comisión de $150 por cada
carrovendido, más el 5% del valor de la venta por carro. Cada mes
el capturista de la empresa ingresaingresa en la computadora los
datos pertinentes. Hacer un programa que calcule
e imprima el salario mensual de un vendedor dado.
*/

package com.mycompany.ejecicio_2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecicio_2 {

    public static void main(String[] args) {
        
      Scanner salario = new Scanner(System.in);
        
       final short salarioFijo = 1000; 
       float carrosVendidos, montoTatalDeCarrovendidos,salarioMensual,porcentaje;
        
        JOptionPane.showMessageDialog(null,"Progama para calcular su salario mensual.");
       
       // Entrada de datos par usario.
        System.out.print("Diguite la cantidad de carro vendidos: ");
        carrosVendidos = salario.nextFloat();
        System.out.print("Diguite monto total de las ventas por veiculo: ");
        montoTatalDeCarrovendidos = salario.nextFloat(); 
        
      
       porcentaje =  (montoTatalDeCarrovendidos / 100)* 5;
       salarioMensual = salarioFijo + porcentaje + (carrosVendidos * 150);
       
       JOptionPane.showMessageDialog(null,"Su salario de este mes fue de: "+salarioMensual);
    }
}