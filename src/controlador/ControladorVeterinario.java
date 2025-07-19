/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Veterinario;

/**
 *
 * @author sandro rendon
 */
public class ControladorVeterinario {
    
    private ArrayList <Veterinario> veterinarios = new ArrayList<>();
    
     public boolean guardar(Veterinario veterinario) {
        if (veterinario != null && buscar (veterinario.getId())==null) {
            veterinarios.add(veterinario);
            return true;
        }
        return false;
    }

    public Veterinario buscar(String id) {
        for (Veterinario veterinario : veterinarios) {
            if (veterinario.getId().equals(id)) {
                return veterinario;
            }
        }
        return null;
    }

    public boolean eliminar(String id) {
        for (int i = 0; i < veterinarios.size(); i++) {
            if (veterinarios.get(i).getId().equals(id)) {
                veterinarios.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean editar(Veterinario veterinario) {
        Veterinario aux = buscar(veterinario.getId());
        if (aux != null) {
            aux.setId(veterinario.getId());
            aux.setNombre(veterinario.getNombre());
            aux.setEspecialidad(veterinario.getEspecialidad());
            aux.setDisponibilidad(veterinario.getDisponibilidad());
            return true;
        }
        return false;
    }
    
     public DefaultTableModel listar() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new String[]{"id","Nombre", "Especialidad", "Disponibilidad"});
    for (Veterinario veterinario : veterinarios) {
        modelo.addRow(new Object[]{
            veterinario.getId(),
            veterinario.getNombre(),
            veterinario.getEspecialidad(),
            veterinario.getDisponibilidad()
        });
    }

    return modelo;
}
    
}
