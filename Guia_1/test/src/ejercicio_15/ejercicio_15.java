/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15;

import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/
public class ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, opcion;
        Scanner entrada= new Scanner(System.in);
        char sn =' ';
        do { 
            
            System.out.println("Ingrese primer numero: ");
            numero1=entrada.nextInt();
            System.out.println("Ingrese segundo numero: ");
            numero2=entrada.nextInt();
            
        } while (numero1<0 && numero2<0);
        
        do{
               System.out.println("MENU: \n 1. Sumar");
               System.out.println("");
               System.out.println("2. Restar");
               System.out.println("3. Multiplicar");
               System.out.println("4. Dividir");
               System.out.println("5. Salir");
               System.out.println("Elija opción:");
               opcion= entrada.nextInt();
           
          switch(opcion){
              case 1:
                  System.out.println("El resultado de la suma es: "+ (numero1+numero2));
                  break;
              case 2:
                 System.out.println("El resultado de la suma es: "+ (numero1-numero2));
                 break;
              case 3:
                  System.out.println("El resultado de la suma es: "+ (numero1*numero2));
                  break;
              case 4:
                 System.out.println("El resultado de la suma es: "+ (numero1/numero2));
                 break;
              case 5:
                  System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                   sn = entrada.next().toUpperCase().charAt(0);
                   System.out.println(sn);
                   break;
                  
           }
         }while(sn!='S');
        
        
        
        
        
        
        
        
                
        
    }
    
}
