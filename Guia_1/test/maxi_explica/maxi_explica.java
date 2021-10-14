/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxi_explica;

import java.util.Random;

/**
 *
 * @author Mirna
 */
public class maxi_explica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matrix[][]= new int[3][3];
        
         matrix=llenar_matrix();
         showMatrix(matrix,3);//no hace falta mandar las dimensiones de la matrixxx
         System.out.println("");
         llenar_matrix(matrix);
         showMatrix(matrix,3);
      
        
    }
    public static int [][]llenar_matrix(){
        int matrix_aux[][]=new int[3][3];
        Random ram = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix_aux[i][j]= ram.nextInt(101);  
            }
        }
        return matrix_aux;   
    }
    
    public static void showMatrix(int [][] m,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-5d",m[i][j]);
            }
            System.out.println("");
        }
    }
    public static void llenar_matrix(int matrix[][]){
        Random ram = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j]=ram.nextInt(101);
                
            }
            
        }
    }
    

}
