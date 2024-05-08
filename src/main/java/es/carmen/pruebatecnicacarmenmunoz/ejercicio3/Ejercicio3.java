/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.carmen.pruebatecnicacarmenmunoz.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio3 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        try{
            int horasTrabajadas=leerHorasTrabajadas();
            double tarifa = leerTarifa();
            double complemento = 0;
            if (horasTrabajadas>40){
                complemento =(horasTrabajadas-40)*tarifa*0.5;
            }
            double salario = horasTrabajadas*tarifa + complemento;
            System.out.println("El salario de esta semana es de: "+ salario+" euros");
        }catch(InputMismatchException ex){
            System.out.println("Error, formato no válido para ese parámetro. Salida del programa");
        }
    }
    
    public static int leerHorasTrabajadas(){
        System.out.println("Introduce las horas trabajadas");
        return scanner.nextInt();
    }
    
    public static double leerTarifa(){
        System.out.println("Introduce la tarifa por hora:");
        return scanner.nextDouble();
    }
}
