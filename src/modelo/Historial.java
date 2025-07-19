/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sandro rendon
 */
public class Historial {

    private ArrayList<Consulta> consultas= new ArrayList<>();
    private ArrayList <Vacuna> vacunas = new ArrayList<>();

// Método para agregar una consulta a la lista
    public void agregarConsulta(Consulta consulta) {
        if (consulta != null ) {
            consultas.add(consulta); // Si la consulta no es nula, se agrega a la lista
        }
    }
    
    // Metodo para agregar una vacuna de la mascota
    public void agregarVacuna(Vacuna vacuna) {
        if (vacuna != null) {
            vacunas.add(vacuna); // Si la vacuna no es nula, se agrega a la lista
        }
    }

// Método para mostrar todas las consultas de la mascota
    public String mostrarConsultas() {
        String info = ""; // Variable para guardar el texto con la información

        if (consultas.isEmpty()) {
            // Si no hay consultas, se muestra un mensaje
            JOptionPane.showMessageDialog(null, "Sin consultas registradas.");
        } else {
            // Si hay consultas, se recorre la lista y se agrega cada una al texto
            for (Consulta c : getConsultas()) {
                info += c.toString() + "\n" + "------------------" + "\n";
            }
        }
        return info; // Se devuelve el texto con toda la información
    }
    // Método para mostrar todas las vacunas de la mascota
    public String mostrarVacunas() {
        String info = ""; // Variable para guardar el texto con la información

        if (vacunas.isEmpty()) {
            // Si no hay vacunas, se muestra un mensaje
              JOptionPane.showMessageDialog(null, "Sin vacunas registradas.");
        } else {
            // Si hay vacunas, se recorre la lista y se agrega cada una al texto
            for (Vacuna v : getVacunas()) {
                info += v.toString() + "\n" + "------------------" + "\n";
            }
        }
        return info; // Se devuelve el texto con toda la información
    }


// Método para obtener la lista de consultas (se devuelve una copia)
    public ArrayList<Consulta> getConsultas() {
        return consultas; // Se devuelve una nueva lista con las mismas consultas
    }
    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
    }
}
    
