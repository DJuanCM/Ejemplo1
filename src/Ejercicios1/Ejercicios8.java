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
public class Ejercicios8 {
    public static void main(){
    
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
