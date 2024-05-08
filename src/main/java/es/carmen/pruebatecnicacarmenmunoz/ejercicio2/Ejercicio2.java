/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.carmen.pruebatecnicacarmenmunoz.ejercicio2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numPersonas = 50;
        List<Persona> personas = leerPersonas(numPersonas);
        Estadisticas estadisticas = new Estadisticas(personas);
        System.out.println("Personas mayores de edad:");
        System.out.println(estadisticas.cuentaMayorEdad());
        System.out.println("Personas menores de edad:");
        System.out.println(estadisticas.cuentaMenorEdad());
        System.out.println("Personas Masculinas mayores de edad");
        System.out.println(estadisticas.cuentaMayorEdad(Sexo.M));
        System.out.println("Personas Femeninas menores de edad");
        System.out.println(estadisticas.cuentaMenorEdad(Sexo.F));
        System.out.println("Porcentaje de personas mayores de edad");
        System.out.println(estadisticas.porcentajeMayorEdad());
        System.out.println("Porcentaje de mujeres");
        System.out.println(estadisticas.porcentajeSexo(Sexo.F));
       
    }
    public static List<Persona> leerPersonas(int numPersonas){
        List<Persona> personas = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        String sexo = null;
        while(personas.size() < numPersonas){
            System.out.println("Persona nº"+(personas.size()+1));
            System.out.println("Introduce el sexo (M/F):");
            sexo = scanner.nextLine().toUpperCase();
            if(!sexo.equals("M")&&!sexo.equals("F")){
                System.out.println("Formato introducido no válido para el sexo, vuelva a intentarlo");
                continue;
            }
            System.out.println("Introduce la edad");
            try{
                edad = scanner.nextInt();
                scanner.nextLine(); //limpiar el buffer del scanner
                if (edad<0){
                    System.out.println("La edad no puede ser negativa, vuelve a intentarlo.");
                    continue;
                }
            }catch(InputMismatchException ex){
                System.out.println("No has introducido un número. Vuelve a comenzar con esta persona");
                continue;
            }
            personas.add(new Persona(Sexo.valueOf(sexo),edad));
        }
        return personas;
    }
}
