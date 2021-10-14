
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
public class ejercicio_6 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada =new Scanner(System.in);
        numero=0;
        System.out.println("Ingrese un numero: "+numero);
        numero=entrada.nextInt();
        System.out.println("el doble del numero, "+numero+" es: "+ numero*2);
        System.out.println("el triple del numero: "+numero+" es: "+numero*3);
         System.out.println("la raiz cuadrada del numero: "+numero+" es: "+Math.sqrt(numero));
    }

}
