package introjava;

import java.util.Scanner;


public class HolaMundo {

    public static void main(String[] args) {
        
        //se crea una variable Scanner que se utilizara para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una variable cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        //muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre:");
        //leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //mostramos por consilo un saludo personalizado
        System.out.println("Hola mundo! soy " + nombre + " y estoy aprediendo en java" );
        
        
        
    }
    
}
