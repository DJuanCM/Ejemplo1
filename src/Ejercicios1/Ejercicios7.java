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
public class Ejercicios7 {
    public static void main(){
           /*Ejercicio 7: Realizar un programa que dado dos números, 
       me indique cual es el mayor y cual
       es el menor de ambos.*/
       Scanner scanner = new Scanner(System.in);
       System.out.println("Escribir dos numeros diferentes e identificar el mayor");
       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       
       if(num1 > num2){
       System.out.println("El numero " + num1 + " es mayor que " + num2);
       }
       else{
       System.out.println("El numero " + num2 + " es mayor que " + num1);
       }
       

    }
    
}
