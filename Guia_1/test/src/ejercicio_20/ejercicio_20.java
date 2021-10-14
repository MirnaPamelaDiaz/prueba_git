/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_20;

import java.util.Scanner;

/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 ***/
public class ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner entrada =new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese numero "+(i+1)+": ");
            numero=entrada.nextInt();
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
                
            }
            
            
        }
        
        
    }

}
