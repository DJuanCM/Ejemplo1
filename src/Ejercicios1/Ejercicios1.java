package Ejercicios1;
import java.util.Scanner;
public class Ejercicios1 {
    public static void main() {
        /*
        Ejercicio 1: Información Personal
        */
        System.out.println("Nombre completo: Juan Eleazar De La Cruz Maldonado");
        System.out.println("Correo Electronico: juaneleazar5999@gmail.com");
        
       /*Ejercicio 8: Determinar si un Número es Par o Impar*/
       Scanner scanner = new Scanner(System.in);
       System.out.println("Escribir un numero y determinar si el numero es par o impar");
       int num = scanner.nextInt();
       
       if(num % 2 == 0){
       System.out.println("Es par");
       }else{System.out.println("Es impar");
       
       }
    }
    
}
