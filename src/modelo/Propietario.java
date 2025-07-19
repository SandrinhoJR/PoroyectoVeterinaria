/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sandro rendon
 */
// Clase Propietario para guardar los datos del dueño de las mascotas
public class Propietario {

    // Nombre del dueño
    private String id;
    private String nombre;

    // Número de teléfono del propietario
    private String telefono;

    // Lista de mascotas que tiene este dueño
    private ArrayList<Mascota> mascotas;

    private ArrayList<Propietario> propietarios;

    // Constructor que pide los datos del propietario al crearlo
    public Propietario(String id, String nombre, String telefono) {
        /*this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
         */
        // ✅ Refactor: ahora usamos setters para validar los datos

        setId (id);
        setNombre(nombre);
        setTelefono(telefono);

        // Se crea la lista de mascotas vacía (aún no tiene registradas)
        this.mascotas = new ArrayList<>();
    }

    // Devuelve el nombre del propietario
    public String getNombre() {
        return nombre;
    }

    /*
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     */
    // ✅ Refactor: validación del nombre
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    // Devuelve el número de documento del dueño
    public String getId() {
        return id;
    }

    /*
    public void setDocumento(String documento) {
        this.documento = documento;
    }
     */
    // ✅ Refactor: validación del documento
    public void setId(String id) {
        if (id == null || id.length() < 5) {
            throw new IllegalArgumentException("Documento inválido.");
        }
        this.id = id;
    }

    // Devuelve el teléfono guardado
    public String getTelefono() {
        return telefono;
    }

    /*
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     */
    // ✅ Refactor: validación del teléfono
    public void setTelefono(String telefono) {
        if (telefono == null || telefono.length() < 7) {
            throw new IllegalArgumentException("Teléfono inválido.");
        }
        this.telefono = telefono;
    }

    // Método para agregar una mascota a la lista del propietario
    public boolean agregarMascota(Mascota mascota) {
        if (mascota != null) {
            mascotas.add(mascota); // Solo se agrega si no es null
            return true;
        }
        return false;
    }

    // Devuelve la lista de mascotas de este propietario
    public ArrayList<Mascota> getMascotas() {
        // return mascotas;
        return new ArrayList<>(mascotas); // Se devuelve una copia para proteger la lista original
    }

    // Muestra toda la información del propietario
    public String mostrarInformacion() {
        String info = "Nombre: " + nombre + "\n";
        info += "Documento: " + id + "\n";
        info += "Telefono: " + telefono + "\n";
        return info;
    }

    public String mostrarMascotas() {
        // Recorre la lista de mascotas y muestra los datos de cada una
        String info = " ";
        for (Mascota mascota : mascotas) {
            info += " \n -- Mascota --\n" + mascota.toString() + "\n";
        }
        return info;
    }
}
