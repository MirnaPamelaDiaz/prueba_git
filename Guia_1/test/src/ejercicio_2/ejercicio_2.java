
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma*/
public class ejercicio_2 {
    public static void main(String[] args) {
        int numero1,numero2, suma;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese primer numero entero: ");
        numero1=entrada.nextInt();
        
        System.out.println("Ingrese segundo numero entero: ");
        numero2=entrada.nextInt();
        
        suma=numero1+numero2;
        System.out.println("La suma de los numeros "+numero1+" y "+numero2+" es "+suma);
    }

}
