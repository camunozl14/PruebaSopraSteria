/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.pruebatecnicacarmenmunoz.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carme
 */
public class Estadisticas {
    private List<Persona> personas;

    public Estadisticas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public int cuentaMayorEdad(){
        return cuentaMayorEdad(personas);
    }
    
    public int cuentaMayorEdad(Sexo sexo){
        return cuentaMayorEdad(devuelveListaSexo(sexo));  
    }
    
    public int cuentaMenorEdad(){
        return cuentaMenorEdad(personas);
    }
    
    public int cuentaMenorEdad(Sexo sexo){
        return cuentaMenorEdad(devuelveListaSexo(sexo));
    }
    
    public double porcentajeMayorEdad(){
        return (double)cuentaMayorEdad()/personas.size()*100;
    }
    
    public double porcentajeSexo(Sexo sexo){
        return (double)devuelveListaSexo(sexo).size()/personas.size()*100;
    }
    
    private List<Persona> devuelveListaSexo(Sexo sexo){
        List<Persona> personaSexo = new ArrayList();
        for (Persona persona : personas) {
            if (persona.getSexo().equals(sexo)){
                personaSexo.add(persona);
            }
        }
        return personaSexo;
    }
    
    private int cuentaMayorEdad(List<Persona> personas){
        int contador=0;
        for (Persona persona : personas) {
            if (persona.getEdad()>=18){
                contador ++;
            }
        }
        return contador;
    }
    
    private int cuentaMenorEdad(List<Persona> personas){
        int contador=0;
        for (Persona persona : personas) {
            if (persona.getEdad()<18){
                contador ++;
            }
        }
        return contador;
    }
}
