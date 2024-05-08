/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.carmen.pruebatecnicacarmenmunoz.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int numero = 0; 
        try{
            numero = leerNumero();
        }catch(InputMismatchException ex){
            System.out.println("No has introducido un número. Fin del programa");
            return;
        }
        if(numero%2 == 0){
            System.out.println("Es par");
            imprimirDescendiente(numero);
        }else{
            System.out.println("Es impar");
            imprimirDescendiente(numero);
        }
    }
    public static int leerNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        return scanner.nextInt();
    }

    private static void imprimirDescendiente(int numero) {
        System.out.println("Cuenta descendiente:");
        for (int i = numero; i >= 0 ; i-=2) {
            System.out.println(i);
        }
    }
}