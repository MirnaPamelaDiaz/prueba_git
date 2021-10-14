/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_28a;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mirna
 */
public class ejercicio_28a {

    public static void main(String[] args) {

        int matrix_M[][] = new int[10][10];
        int matrix_P[][] = new int[3][3];

        int count_p = 0, count_x = 0;
        Scanner input = new Scanner(System.in);
        int zero_P = 0;
        Random rd = new Random();

        //LLENAR MATRIZ M
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix_M[i][j] = rd.nextInt(101);
            }

        }
        //MOSTRAR MATRIZ M           

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-5d", matrix_M[i][j]);
            }
            System.out.println("");
        }
         System.out.println("");

        //LLENAR MATRIZ P
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese numero: " + (count_p + 1));
                matrix_P[i][j] = input.nextInt();
                count_p++;
            }
        }

        zero_P = matrix_P[0][0];
        //MOSTRAR MATRIZ P         

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-5d", matrix_P[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Primera posicion de la matriz P:"+zero_P);

         //COMPROBAR QUE LA VARIABLE QUE INICIA LA MATRIZ P ESTE DENTRO DE LA MATRIZ M
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if ((i != 8 && i != 9 && j != 8 && j != 9) && (zero_P == matrix_M[i][j])) { 
                    if (inside_Matrix(matrix_M, i, j, matrix_P) == true) {
                        System.out.println("La matriz P esta contenida dentro de la matriz M.");
                        System.out.println("Y comienza en la posicion: " + (i) + "," + (j));
                        System.exit(0);
                    }
                }
            }
        }
       
        System.out.println("La matriz P no esta contenida dentro de la matriz M.");

    }

    public static boolean inside_Matrix(int matrixM[][], int rows, int columns, int matrixP[][]) {
        boolean insideR = true;
        int a=0,b=0;
        for (int i = rows; i < (rows + 3); i++) {
            for (int j = columns; j < (columns + 3); j++) {
                   
                if (matrixM[i][j] != matrixP[a][b]) {
                    System.out.println("entra al if");
                    insideR = false;
                    
                }
                b++;
            }
            b=0;
            a++;

        }
        return insideR;
    }
}
