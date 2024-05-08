/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.pruebatecnicacarmenmunoz.ejercicio2;

/**
 *
 * @author carme
 */
public class Persona {
    Sexo sexo;
    int edad;

    public Persona(Sexo sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
