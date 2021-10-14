/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_28;

import java.util.Scanner;

/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
Ejemplo:
Como podemos observar nuestra submatriz P se encuentra en la matriz M en los
índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
*/
public class ejercicio_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int m, p;
//        Scanner input=new Scanner(System.in);
//        
//        System.out.println("Ingrese dimension de la matriz M: ");
//        m=input.nextInt();
//        System.out.println("Ingrese la dimension de la mattriz P: ");
//        p=input.nextInt();
        
        int matrix_M[][]=new int[10][10];
        int matrix_P[][]=new int[3][3];
        
        matrix_M = fill_matrix_M();
        System.out.println("");
        show_matrix(matrix_M, 10);
        System.out.println("");
        
        matrix_P = fill_matrix_P();
        System.out.println("");
        show_matrix(matrix_P, 3);
    }
    
    //LLENAR MATRIZ M
    public static int[][] fill_matrix_M() {
        int count = 0;
        Scanner input = new Scanner(System.in);

        int matrix_aux[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Ingrese numero: " + (count + 1));
                matrix_aux[i][j] = input.nextInt();
                count++;
            }
        }
        return matrix_aux;
    }
    //LLENAR MATRIZ P
    public static int[][] fill_matrix_P() {
        int count = 0;
        Scanner input = new Scanner(System.in);

        int matrix_aux[][] = new int[3][3];
        
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println("Ingrese numero: " +(count +1));
                matrix_aux[i][j] = input.nextInt();
                count++;
            }
        }
        return matrix_aux;
    }
        
   //MOSTRAT MATRIZ
    public static void show_matrix(int matrix[][], int n){
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-5d",matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void follow_matrix_P(int matrixm[][], int matrixp[][]){
        
    }
}
