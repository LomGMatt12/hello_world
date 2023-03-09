package ejercicio05;

import java.util.Scanner;


//actividad5
public class Ejercicio05 {
/**Escribir un programa que lea un número 
 * entero por teclado y muestre por pantalla el doble, el triple y 
 * la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt()*/
    
    public static void main(String[] args) {
      
     int numero;
     Scanner sc = new Scanner(System.in);
     System.out.println("ingrese un numero");
     numero = sc.nextInt();
     System.out.println("El doble de " + numero + " es " + (numero * 2));
     System.out.println("El triple de " + numero + " es " + (numero * 3));
     System.out.println("La raiz de " + numero + " es " + Math.sqrt(numero));
     
     
       
    }
    
}
