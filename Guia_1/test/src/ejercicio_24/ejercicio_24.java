/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_24;

import java.util.Random;
import java.util.Scanner;

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
public class ejercicio_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, len=0;
        int count1=0, count2=0, count3=0, count4=0, count5=0;
        String chain="";
        Scanner entrada= new Scanner(System.in);
        Random random= new Random();
        System.out.println("Ingrese un numero");
        numero=entrada.nextInt();
        
        int vector[]= new int[numero];
        
        for (int i = 0; i < numero; i++) {
          vector[i] = random.nextInt(10000)+1;
          chain = Integer.toString(vector[i]);
          len= chain.length();
         
            switch (len) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;       
          } 
        }
        for (int i = 0; i < numero; i++) {
            System.out.print(i+": ["+vector[i]+"]");  
            System.out.println("");
        }   
        System.out.println("Los numeros de 1 cifra ingresados son: "+count1);
        System.out.println("Los numeros de 2 cifra ingresados son: "+count2);
        System.out.println("Los numeros de 3 cifra ingresados son: "+count3);
        System.out.println("Los numeros de 4 cifra ingresados son: "+count4);
        System.out.println("Los numeros de 5 cifra ingresados son: "+count5);
    }
    
}
//cadena = Integer.toString(vector[i]);
//cadena.length()
//int valorEntero = (int)(Math.random()*(max-min+1)+min);
