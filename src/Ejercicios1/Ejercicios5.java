/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios1;

/**
 *
 * @author kenic
 */
public class Ejercicios5 {
    public static void main(){
            /*Ejercicio 5: Realizar un programa que
        imprima la sumatoria de los números del 
        1 al 50 utilizando ciclos do while.*/
       int i = 1; 
       
        long sumatoria;
        sumatoria = 1;
        do{

        System.out.println(sumatoria);
        i += 1;

        sumatoria = sumatoria + sumatoria;
        }while(i <= 50);
        

    }
}
