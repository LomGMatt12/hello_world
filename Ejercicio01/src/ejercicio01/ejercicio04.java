package ejercicio01;

//actividad4
/**Dada una cantidad de grados 
 * centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

import java.util.Scanner;

public class ejercicio04 {

    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in); 
       
         double n1, n2;
        
        System.out.println("Ingrese Grados celcius");
        n1 = sc.nextDouble();
        n2 = (n1 * 9/5) + 32;
        System.out.println( n1 + "en grados celcius es igual a " + n2 + " grados Fahrenheit");
        
        
    }
    
}
