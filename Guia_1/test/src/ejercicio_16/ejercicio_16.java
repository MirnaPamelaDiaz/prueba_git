/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_16;

import java.util.Scanner;

/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
public class ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0, suma=0;
        Scanner entrada= new Scanner(System.in);
        
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese numero: "+(i+1));
            numero=entrada.nextInt();
            
            if (numero==0) {
                System.out.println("SE CAPTURO EN NUMERO 0");
                break;  
            }
            else if (numero>0) {
                suma=suma+numero;
                
            }

            
        }
       
        System.out.println("La suma de los numero es: "+suma);
    }
    
}
