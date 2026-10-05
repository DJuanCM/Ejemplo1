package Ejercicios1;
import java.util.Scanner;
public class main1 {
    public static void main() {
        /*
        Ejercicio 1: Información Personal
        */
        System.out.println("Nombre completo: Juan Eleazar De La Cruz Maldonado");
        System.out.println("Correo Electronico: juaneleazar5999@gmail.com");
        
        /*Ejercicio 2: Realizar un programa que incluya las 4 
        operaciones matemáticas básicas (Suma, Resta, 
        Multiplicación y División).*/
        int suma;
        int resta;
        int multiplicacion;
        float division;
        
        int a = 5;
        int b = 5;
        
        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a/b;
        System.out.println("La suma de 5 + 5 es: " + suma);
        System.out.println("La resta de 5 + 5 es: " + resta);
        System.out.println("La multiplicacion de 5 + 5 es: " + multiplicacion);
        System.out.println("La division de 5 + 5 es: " + division);
        
        
        /*Ejercicio 3: Realizar un programa 
        que imprima los números impares del 1 al
        100 utilizando ciclos for.*/
        
        for (int i = 1; i < 100; i+=2){
        System.out.println(i);
        }
        /*Ejercicio 4: Realizar un programa que 
        imprima los números pares del 
        2 al 100 utilizando ciclos while.*/
        int i = 2;
        while (i <= 100)
        {
        System.out.println(i);
        i = i + 2;
        }
        
        /*Ejercicio 5: Realizar un programa que
        imprima la sumatoria de los números del 
        1 al 50 utilizando ciclos do while.*/
       i = 1; 
       
        long sumatoria;
        sumatoria = 1;
        do{

        System.out.println(sumatoria);
        i+= 1;

        sumatoria = sumatoria + sumatoria;
        }while(i <= 50);
        
        /*
        Ejercicio 6 : Realizar un programa que mediante la 
        utilización de bucles, debe permitir 
        imprimir cualquier tabla de multiplicar.
        */
        
       System.out.println("Escribe un numero que quieras saber su tabla de multiplicacion");
       Scanner scanner = new Scanner(System.in);
       System.out.println("");
       int numero = scanner.nextInt();
       for(i = 1; i <= 10; i++){
       System.out.println(i + "*" + numero + " = " + (numero * i));
       }
       
       /*Ejercicio 7: Realizar un programa que dado dos números, 
       me indique cual es el mayor y cual
       es el menor de ambos.*/
       
       System.out.println("Escribir dos numeros diferentes e identificar el mayor");
       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       
       if(num1 > num2){
       System.out.println("El numero " + num1 + " es mayor que " + num2);
       }
       else{
       System.out.println("El numero " + num2 + " es mayor que " + num1);
       }
       
       /*Ejercicio 8: Determinar si un Número es Par o Impar*/
       
       System.out.println("Escribir un numero y determinar si el numero es par o impar");
       int num = scanner.nextInt();
       
       if(num % 2 == 0){
       System.out.println("Es par");
       }else{System.out.println("Es impar");
       
       }
    }
    
}
