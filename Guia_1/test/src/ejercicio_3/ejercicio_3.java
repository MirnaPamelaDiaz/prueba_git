
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.*/
public class ejercicio_3 {
    public static void main(String[] args) {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre");
        nombre=entrada.next();
        System.out.println("El nombre ingresado es: "+nombre);
        
    }

}
