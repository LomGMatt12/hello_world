package practicasjava;

import java.util.Scanner;

public class PracticasJava {

    public static void main(String[] args) {
       
    int num1 = 20;
    int num2 = 10;

    // imprimir operaciones aritmeticas

    System.out.println("La suma de los numeros es: " + (num1 + num2));
    System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));

    // Imprimir operaciones racionales

    System.out.println("Si el primer numero es menor que el secundo numero: " + (num1 < num2));
    System.out.println("Siel segundo numero es mayor o igual que el primero: " + (num1 >= num2));
    
    Scanner entrada = new Scanner(System.in);
    
    float valor;
    System.out.println("Escribe un entero: ");
    valor=entrada.nextFloat();
    System.out.println("Tu numero es: " + valor);
    
    String cadena;
    System.out.println("Escribe una cadena");
    cadena = entrada.nextLine(); 
    //next recibe la primer palabra
    System.out.println("Su valor es: " + cadena);
    
    char caracter;
    System.out.println("Escrbie una letra");
    caracter = entrada.next().charAt(0);
    System.out.println("su valor es: " + caracter);
          
    Scanner sc = new Scanner(System.in);
    int n1, n2;
    
    System.out.println("Ingrese el primer numero: ");
    n1 = sc.nextInt();
    
    System.out.println("Ingrese el segundo numero: ");
    n2 = sc.nextInt();
    
    //suma
    System.out.println(n1 + n2);
    //multiplicacion
     System.out.println(n1 * n2);
    //Son iguales?
      System.out.println(n1 == n2);
    //El primer numero es menor que el segundo?
     System.out.println(n1 < n2);
     //El segundo es mayor o igual que el primero?
      System.out.println(n2 >= n1);
            

    int edad = 18;
    
     //condicion 1
    System.out.println("Condicion 1");
            
    if(edad >= 17){
        System.out.println("Eres menor de edad");
    }else{
        System.out.println("Eres mayor de edad");
    }
    
    
    //condicion 2
    System.out.println("Condicion 2");
    
    if(edad >= 5 && edad <= 10){
        System.out.println("Tu salon es el 1A");
    }else{
        System.out.println("Tu salon es el 1B");
    }
    
    
    Scanner sd = new Scanner(System.in);
    
    String nombre;
    float valor_compra, descuento=0, precio_final=0;
    
    System.out.print("Ingrese el nombre del cliente: ");
    nombre = sd.nextLine();
    
    System.out.print("Ingrese el valor de la compra: ");
    valor_compra = sd.nextFloat();
    
    if(valor_compra <80){
    descuento=0;
    
}else if(valor_compra <80 && valor_compra <= 170){
    descuento = (float) 0.1;
    
}else if(valor_compra >= 170 && valor_compra <= 350){
    descuento = (float) 0.15;
}else if(valor_compra > 350 && valor_compra < 600){
    descuento = (float) 0.2;
}
    
    precio_final = valor_compra - (valor_compra*descuento);
    
    System.out.println(
            "nombre del cliente: " + nombre + "\n" +
            "Valor de compra: " + valor_compra + "\n" +
            "Valor de compra con descuento: " + precio_final);
    
    
  
    
    
    
    
    
}
    
    
}
 
        
    
    
