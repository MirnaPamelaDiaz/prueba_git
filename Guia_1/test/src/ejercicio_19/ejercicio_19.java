/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_19;

/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * ***/

import java.util.Scanner;

public class ejercicio_19 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner entrada =new Scanner(System.in);
        
        System.out.println("Ingrese eun numero entero");
        numero=entrada.nextInt();
        
        for (int i = 0; i<numero ; i++) {  
            for (int j = 0; j < numero; j++) {
                if (i==0|| i==numero-1||j==0 || j==numero-1) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }System.out.println("");
        }
        
    }
    
}
