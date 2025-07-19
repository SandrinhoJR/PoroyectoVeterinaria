/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Mascota;
import modelo.Propietario;

/**
 *
 * @author sandro rendon
 */
public class ControladorPropietario {



    private ArrayList<Propietario> propietarios = new ArrayList<>();

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public boolean guardar(Propietario propietario) {
        if (propietario != null && buscar(propietario.getId())==null) {
            propietarios.add(propietario);
            return true;
        }
        return false;
    }

    public Propietario buscar(String id) {
        for (Propietario propietario : propietarios) {
            if (propietario.getId().equals(id)) {
                return propietario;
            }
        }
        return null;
    }

    public boolean eliminar(String id) {
        for (int i = 0; i < propietarios.size(); i++) {
            if (propietarios.get(i).getId().equals(id)) {
                propietarios.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean editar(Propietario propietario) {
        Propietario aux = buscar(propietario.getId());
        if (aux != null) {
            aux.setNombre(propietario.getNombre());
            aux.setTelefono(propietario.getTelefono());
            return true;
        }
        return false;
    }

   public DefaultTableModel listar() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new String[]{"Id", "Nombre", "Telefono", "Mascotas"});

    for (Propietario propietario : propietarios) {
        String id = propietario.getId();
        String nombre = propietario.getNombre();
        String telefono = propietario.getTelefono();

        // Concatenar nombres de mascotas en un solo String
        String mascotasStr = "";
        for (Mascota mascota : propietario.getMascotas()) {
            mascotasStr += mascota.getNombre() + ", ";
        }

        // Quitar la última coma si hay mascotas
        if (!mascotasStr.equals("")) {
            mascotasStr = mascotasStr.substring(0, mascotasStr.length() - 2);
        } else {
            mascotasStr = "Sin mascotas";
        }

        modelo.addRow(new Object[]{id, nombre, telefono, mascotasStr});
    }

    return modelo;

   }
}
