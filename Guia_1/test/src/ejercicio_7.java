
import java.util.Scanner;



/* Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla*/
public class ejercicio_7 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese 1° numero: ");
        numero1=entrada.nextInt();
         System.out.println("Ingrese 2° numero: ");
        numero2=entrada.nextInt();
        
        if(numero1>numero2){
            System.out.println("El numero mayor es: "+numero1);          
        }
        else{
            
            System.out.println("El numero mayor es: "+numero2);          
        }
    }

}
