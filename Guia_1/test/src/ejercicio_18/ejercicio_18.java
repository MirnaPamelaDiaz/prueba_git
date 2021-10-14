/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_18;



/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/
public class ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //String numero_cadena;
       int long_cont,desde=0 , hasta=0;
        String cadena=" ";
        
        for (int i = 0; i<=999; i++) {
            if (i<=9) {
                if (i==3) {
                    cadena=String.valueOf(i);
                    cadena=cadena.replaceAll("3","E");
                    System.out.println("0-0-"+cadena);
                }else{
                     System.out.println("0-0-"+i);
                }
                
            }else if (i>=10 && i<=99) {
                cadena=String.valueOf(i);
                cadena=cadena.replaceAll("3", "E");
                cadena=cadena.substring(0,1)+"-"+cadena.substring(1,2);  
                System.out.println("0-"+cadena);  
            }else{
                cadena=String.valueOf(i);
                cadena=cadena.replaceAll("3", "E");
                cadena=cadena.substring(0,1)+"-"+cadena.substring(1,2)+"-"+cadena.substring(2,3);  
                System.out.println(cadena);
                
                
                
            }
         
        }
    }
    
}
//if (i>=9) {
//                if (i==3) {
//                    cadena=String.valueOf(i);
//                    cadena=cadena.replaceAll("3", "E");
//                    System.out.println("0-0-"+i);
//                }else{
//                    System.out.println("0-0-"+i);
//                }
//            }else if (i>=10 && i<=99) {
//                
//                cadena=String.valueOf(i);
//                cadena=cadena.replaceAll("3", "E");
//                cadena=cadena.substring(0, 1)+"-"+cadena.substring(1,2);
//                System.out.println("0-"+i);
// if (i<=9) {
//                if (i==3) {
//                     cadena= String.valueOf(i);
//                     cadena= cadena.replaceAll("3","E");
//                     cadena=cadena.substring(0,1)
//                    
//                }
//            }else if (i>=10 && i<=99) {
//                
//            }