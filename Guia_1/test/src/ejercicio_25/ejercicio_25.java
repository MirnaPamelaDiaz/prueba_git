/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_25;

import java.util.Random;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas*/
public class ejercicio_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
       int matrix [][]= new int[4][4];
       
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
                matrix[i][j]=random.nextInt(101);
            }
        }
        System.out.println("MATRIZ ORDENADA POR FILAS: ");
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
               System.out.print("["+matrix[i][j]+"]");
                
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("MATRIZ ORDENADA POR COLUMNAS: ");
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print("["+matrix[j][i]+"]");
                
            }
            System.out.println("");
        }
        
        
        
        
    }
    
}
