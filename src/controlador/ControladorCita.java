/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Cita;
import modelo.Mascota;

/**
 *
 * @author sandro rendon
 */
public class ControladorCita {
    
    private ArrayList <Cita> citas = new ArrayList<>();
    
     public boolean guardar(Cita cita) {
        if (cita != null && buscar(cita.getId())==null) {
            citas.add(cita);
            return true;
        }
        return false;
    }

    public Cita buscar(String id) {
        for (Cita cita : citas) {
            if (cita.getId().equals(id)) {
                return cita;
            }
        }
        return null;
    }

    public boolean eliminar(String id) {
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getId().equals(id)) {
                citas.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean editar(Cita cita) {
        Cita aux = buscar(cita.getId());
        if (aux != null) {
            aux.setId(cita.getId());
            aux.setFecha(cita.getFecha());
            aux.setHora(cita.getHora());
            return true;
        }
        return false;
    }
    
     public DefaultTableModel listar() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new String[]{"Id", "Fecha", "Hora","Mascota","Propietario","Veterinario"});
    for (Cita cita : citas) {
        modelo.addRow(new Object[]{
            cita.getId(),
            cita.getFecha(),
            cita.getHora(),
            cita.getMascota().getNombre(),
            cita.getPropietario().getNombre(),
            cita.getVeterinario().getNombre()
        });
    }

    return modelo;
}
    
}
