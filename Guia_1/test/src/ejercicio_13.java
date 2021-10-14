
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.*/
public class ejercicio_13 {
    public static void main(String[] args) {
        int nota;
         Scanner  entrada= new Scanner(System.in);
         
         do{
             System.out.println("Ingrese una nota: ");
         nota=entrada.nextInt();
         }while(nota>=0 && nota<=10);
    }

}
