
import java.util.Scanner;



/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
public class ejercicio_9 {
        public static void main(String[] args) {
            String frase;
            Scanner entrada=new Scanner(System.in);
            
            System.out.println("Ingrese una frase: ");
            frase=entrada.next();
            
            if(frase.equalsIgnoreCase("eureka")){//equalsIgnoreCase() compara sin importar las mayusculas o minuculas
                System.out.println("La frase es CORRECTA!");
            }
            else{
                System.out.println("La frase es INCORRECTA!");
            }
        
    }

}
