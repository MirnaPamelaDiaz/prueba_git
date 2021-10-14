/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_21;

import java.util.Scanner;

/*Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
public class ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float euros;
        String change_coin="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantida de euros a convertir: ");
        euros=entrada.nextFloat();
        System.out.println("Ingrese la moneda a la que quiere convertir los euros ingreesados: ");
        change_coin=entrada.next();
        convert_currency(euros,change_coin);
        
    }
    public static void convert_currency(float euros, String change_coin) {
        float yen, libra, dolar;
        String cadena = "";
        switch (change_coin.toLowerCase()) {
            case "yen":
                yen = euros * 129.852f;
                cadena = String.valueOf(yen);
                System.out.println(cadena);
                break;
            case "libra":
                yen = euros * 0.86f;
                cadena = String.valueOf(yen);
                System.out.println(cadena);
                break;
            case "dollar":
                yen = euros * 1.28611f;
                cadena = String.valueOf(yen);
                System.out.println(cadena);
                break;
                
        }
    }
}
