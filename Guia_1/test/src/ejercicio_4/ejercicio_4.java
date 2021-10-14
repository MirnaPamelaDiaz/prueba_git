
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/
public class ejercicio_4 {
    public static void main(String[] args) {
        String frase;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre");
        frase=entrada.next();
        System.out.println("El nombre ingresado en mayuscula es : "+frase.toUpperCase());
        System.out.println("El nombre ingresado en minuscula es: "+frase.toLowerCase());
    }

}
