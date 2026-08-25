
/* Hacer un programa que calcule e imprima el salario semanal 
   de un empleado a patrir de sus horas semanales trabajadas 
   y de su salario por hora.
*/
package com.mycompany.ejecicio_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecicio_1 {

    public static void main(String[] args) {
            
        Scanner salarioSemanal = new Scanner(System.in);
        float horasTrabajadas,pagoPorHora,totalSalario;
         
        // Esntrada de Datos.
        System.out.print("Porfavor diguite sus horas trabajadas por semana: ");
        horasTrabajadas = salarioSemanal.nextFloat();
        System.out.print("Porfavor diguite cuanto gana por hora: ");
        pagoPorHora = salarioSemanal.nextFloat();
        
        // Calculo de su salario. 
        totalSalario = horasTrabajadas * pagoPorHora;
        
        // Salidad de su salario semanal. 
       JOptionPane.showMessageDialog(null, "Su salario semanal es: "+totalSalario);
    }
}

