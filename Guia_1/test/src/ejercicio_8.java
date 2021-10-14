
import java.util.Scanner;



/*Crear un programa que dado un numero determine si es par o impar.*/
public class ejercicio_8 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        numero=entrada.nextInt();
        
        if(numero%2==0){
            System.out.println("El numero "+numero+ " es par");
        }
        else{
            System.out.println("El numero "+numero+ " es impar");
        }
    }

}
