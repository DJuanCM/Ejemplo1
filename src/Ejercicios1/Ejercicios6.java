/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios1;
import java.util.Scanner;

/**
 *
 * @author kenic
 */
public class Ejercicios6 {
    public static void main(){
            /*
        Ejercicio 6 : Realizar un programa que mediante la 
        utilización de bucles, debe permitir 
        imprimir cualquier tabla de multiplicar.
        */
        
       System.out.println("Escribe un numero que quieras saber su tabla de multiplicacion");
       Scanner scanner = new Scanner(System.in);
       System.out.println("");
       int i = 0;
       int numero = scanner.nextInt();
       for(i = 1; i <= 10; i++){
       System.out.println(i + "*" + numero + " = " + (numero * i));
       }
       

    }
}
