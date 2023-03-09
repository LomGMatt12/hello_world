package ejercicio01;

import java.util.Scanner;

//actitivad 3
public class Ejercicio03 {

    
    public static void main(String[] args) {
        
        
       Scanner sd = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre");
        
        nombre = sd.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
        
        System.out.print("en mayuscula ");
        System.out.println(nombre.toUpperCase());
        
        System.out.print("y en Minuscula ");
        System.out.println(nombre.toLowerCase());
        
        
        
    }
    
}
