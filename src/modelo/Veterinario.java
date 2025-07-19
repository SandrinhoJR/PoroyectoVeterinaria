/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author sandro rendon
 */
// Clase Veterinario para representar al médico que atiende a las mascotas
public class Veterinario {

    // Nombre del veterinario
    private String id;
    
    private String nombre;

    // Especialidad del vet (puede ser cirugía, dermatología, etc.)
    private String especialidad;
    
    private String disponibilidad;
    

    // Constructor que recibe el nombre y la especialidad del veterinario

    public Veterinario(String id, String nombre, String especialidad, String disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.disponibilidad = disponibilidad;
    }
    

    // Muestra la info del veterinario por consola
    public void mostrarInfo() {
        System.out.println("Veterinario: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

    // Devuelve el nombre del veterinario
    public String getNombre() {
        return nombre;
    }

    // Permite cambiar el nombre del veterinario
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del veterinario no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    // Devuelve la especialidad del veterinario
    public String getEspecialidad() {
        return especialidad;
    }

    // Permite cambiar la especialidad del veterinario
//    public void setEspecialidad(String especialidad) {
//        this.especialidad = especialidad;
//    }
    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }
        this.especialidad = especialidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
