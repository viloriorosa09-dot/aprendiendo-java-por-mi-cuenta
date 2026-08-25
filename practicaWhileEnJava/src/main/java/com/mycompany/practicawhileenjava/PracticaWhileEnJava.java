/*1.	El programa tiene un saldo inicial fijo de RD$ 15,000.
2.	Muestra un menú (usando switch) con estas opciones:
1.	Consultar saldo
2.	Depositar
3.	Retirar
4.	Salir
El programa debe seguir mostrando el menú repetidamente (usá while) hasta que el usuario elija la opción 4.
Reglas de negocio:
Si elige retirar, el monto debe ser múltiplo de 100 (usá el operador % para verificarlo). 
Si no es múltiplo de 100, mostrar mensaje de error y volver al menú sin retirar nada.
No se puede retirar más de lo que hay en el saldo disponible.
Si elige depositar, el monto no puede ser negativo ni cero.
Cada vez que el usuario intente retirar más dinero del disponible, debe darle 3 intentos.
Si falla los 3, el programa debe cerrar la sesión automáticamente (salir del bucle) mostrando un mensaje de
“cuenta bloqueada por seguridad”.
5.Al salir (opción 4 o bloqueo), debe mostrar un resumen: saldo final y cuántas
transacciones exitosas se hicieron en total (depósitos + retiros).

*/

package com.mycompany.practicawhileenjava;
import javax.swing.JOptionPane;

public class PracticaWhileEnJava {

    public static void main(String[] args) {
       
        short saldoInicial = 15000;
        float consultarSaldo, depositar = 0, retirar = 0, transaciones = 0;
        byte opciones = 0, error = 0;
        
        
        
        // Arreglar los cuatros bugs para que quede perfectos.
        while (opciones != 4 & error < 3){
           
            opciones = Byte.parseByte(JOptionPane.showInputDialog("Hola como esta.\n"
                    + "Diguite 1 para Consultar saldo.\n"
                    + "Diguite 2 para Depositar.\n"
                    + "Diguite 3 para Retirar.\n"
                    + "Diguite 4 para salir. "));
            
                   
                switch(opciones){
                   
                    case 1:
                        JOptionPane.showMessageDialog(null, "Su saldo actual es."+saldoInicial); 
                        
                        break;
                    case 2:
                        if (depositar <=1){
                        depositar = Float.parseFloat(JOptionPane.showInputDialog("Por favor Diguite la cantidad que de sea Depositar."));
                        saldoInicial += depositar; //  saldoInicial = daldoInicial + depositar <-- no se por que da error;
                        JOptionPane.showMessageDialog(null,"Su saldo actual es."+saldoInicial);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No puede ser un numeo negativo o cero");
                        }
                        break;
                    case 3: 
                        retirar = Float.parseFloat(JOptionPane.showInputDialog("Por favor Diguite la cantidad que de sea Retirar."));
                        if (retirar <= saldoInicial  & retirar % 100 == 0 ){
                            saldoInicial -= retirar;  //saldoInicial = saldoInicial - retirar  <-- no se por que da error;
                            JOptionPane.showMessageDialog(null,"Usted a retirado "+retirar+" Y ahora su saldo actual es "+saldoInicial);
                        }
                        
                        else {
                            error +=1 ;
                             JOptionPane.showMessageDialog(null,"Error usted no puede retirar esta cantidad debe de retirar una cantidad \n"
                                     + "que sea multiplo de 100 Y no supere su saldo actual o se BLOQUEARA POR SEGURIDAD.");      
                        }
                        //JOptionPane.showMessageDialog(null, "Se bloquo por segurirdad");
                            break;
                    case 4: 
                        transaciones = depositar + retirar;
                        JOptionPane.showMessageDialog(null, "Usted a salido del Programa Y a echo un total de ."+transaciones +" Transaciones."); 
                        break;
                    default:
                        error +=1;
                        JOptionPane.showMessageDialog(null, "Error esta opcion no existe!, Por favor diguite una Opcion validad o BLOQUEARA POR SEGURIDAD."); 
                        break;
      
            }     
        }
    }
}
