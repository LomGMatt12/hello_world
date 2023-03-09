package ejercicio01;

import java.util.Scanner;

//actividad1
public class Ejercicio01 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Ingrese un numero");//mostrar
        n1 = sc.nextInt();//para escribir lo que pide
        
        System.out.println("Ingrese un segundo numero");
        n2 = sc.nextInt();
        
        System.out.println("La suma de los numero intruducido es de: " + (n1 + n2));
        
        
        

    }
    
}
