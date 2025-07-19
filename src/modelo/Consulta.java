/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author sandro rendon
 */
// Creamos la clase Consulta que representa una cita con el veterinario
public class Consulta {

    // Atributo para guardar el código único de la consulta
    private String id;

    // Atributo para guardar la fecha en la que se hace la consulta
    // private String fecha;
    // ✅ Refactor: ahora usamos LocalDate en vez de String para manejar mejor las fechas
    private LocalDate fecha;

    // Atributo para guardar el veterinario que atiende la consulta
    private Veterinario veterinario;
    
   

    public Consulta(String id, LocalDate fecha, Veterinario veterinario) {
        this.id = id;
        this.fecha = fecha;
        this.veterinario = veterinario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    // Devuelve el código de la consulta
    public String getId() {
        return id;
    }

    /*
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     */
    // Método para asignar el código, con validación para que no esté vacío o nulo
    public void setId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Código inválido.");
        }
        this.id = id;
    }

    /*
    public String getFecha() {
        return fecha;
    }
     */
    // Método para obtener la fecha de la consulta (ahora como LocalDate)
    public LocalDate getFecha() {
        return fecha;
    }

    // Método para asignar la fecha, convirtiendo el texto a LocalDate
    public void setFecha(String fechaTexto) {
        try {
            this.fecha = LocalDate.parse(fechaTexto); // Formato esperado: YYYY-MM-DD
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha inválido.");
        }
    }

  
    
    
    
    

    /*
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
     */
    // Este método devuelve todos los datos de la consulta en forma de texto
    @Override
    public String toString() {
        String info = "ID   : " + id + "\n";
        info += "Fecha: " + fecha + "\n";
        info += "Veterinario: " + veterinario.getNombre()+ "\n";
        return info;
    }
}
