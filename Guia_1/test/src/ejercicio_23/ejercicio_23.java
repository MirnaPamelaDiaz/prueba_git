/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_23;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mirna
 */
public class ejercicio_23 {

    /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido*/
    public static void main(String[] args) {
        int n=0, cont=0, numero, posicion=0;
        Scanner entrada= new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Ingrese dimension del vector: ");
        n=entrada.nextInt();
        System.out.println("Ingrese numero a buscar en el vector: ");
        numero=entrada.nextInt();
        
        int vector[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=random.nextInt(99)+1;  
            if (vector[i]==numero) {
                cont=cont+1;
                posicion=i;
            }
         
        }
        
           for (int j = 0; j <cont; j++) {
                System.out.println(posicion);
                
            }
        for (int i = 0; i < n; i++) {
            System.out.print(i+": ["+vector[i]+"]");  
            System.out.println("");
        }
        if (cont==0) {
            System.out.println("El numero: "+numero+" no se encuentra en el vector");  
        }else{
             System.out.println("El numero: "+numero+" se encuentra en la posicion "+posicion+", "+cont+" veces");

        }
           }
    
    
}
