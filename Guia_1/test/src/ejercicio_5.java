
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)*/
public class ejercicio_5 {
    public static void main(String[] args) {
        double temperatura;
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese la temperatura: ");
         temperatura=entrada.nextDouble();
         System.out.print("°C");
         System.out.println("La temperatura en farenheit es: "+(((9*temperatura)/5)+32)+"°F");
    }
}
