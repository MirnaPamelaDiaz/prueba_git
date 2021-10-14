
import java.util.Scanner;


/*ealizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/

public class ejercicio_10 {
    public static void main(String[] args) {
        String frase;
        int long_frase=0, desde=0 , hasta=0;
       Scanner  entrada= new Scanner(System.in);
       
        System.out.println("Ingrese una frase: ");
        frase=entrada.next();
        long_frase= frase.length();
        
        if(long_frase==8){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
    }

}
