
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.*/
public class ejercicio_14 {
    public static void main(String[] args) {
        int numero_limite, numero, suma=0;
         Scanner  entrada= new Scanner(System.in);
         
         System.out.println("Ingrese un numero limite positivo: ");
         numero_limite=entrada.nextInt();
         if(numero_limite>0){
             do{
                 System.out.println("Ingrese un numero: ");
                 numero=entrada.nextInt();
                 suma=suma+numero;
             }while(suma<=numero_limite);
             System.out.println("La suma: "+suma+" supera al numero limite ingresado: "+numero_limite);
         }
         else{
             System.out.println("El numero ingresado: "+numero_limite+", no es positivo");
         }
    }

}
