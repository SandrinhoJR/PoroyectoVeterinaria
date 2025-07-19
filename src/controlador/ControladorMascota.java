/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Mascota;
import modelo.Propietario;
import controlador.ControladorPropietario;

/**
 *
 * @author sandro rendon
 */
public class ControladorMascota {
    


    private ArrayList<Mascota> mascotasVeterinario = new ArrayList<>();
    private ControladorPropietario controladorPropietario;

    public ControladorMascota(ControladorPropietario controladorPropietario) {
        this.controladorPropietario = controladorPropietario;
    }

    public ArrayList<Mascota> getMascotasVeterinario() {
        return mascotasVeterinario;
    }
    
    

    private Propietario buscarPropietarioPorId(String documento) {
        return controladorPropietario.buscar(documento);
    }

    public boolean guardar(String documento, Mascota mascota) {
        Propietario p = buscarPropietarioPorId(documento);
        if (p != null && buscar(mascota.getNombre())==null) {
            p.agregarMascota(mascota);
            
            mascotasVeterinario.add(mascota);
            return true;
        }
        return false;
    }

    public Mascota buscar(String nombre) {
        for (Mascota mascota : mascotasVeterinario) {
            if (mascota.getNombre().equals(nombre)) {
                return mascota;
            }
        }
        return null;
    }

    public boolean eliminar(String nombre, String documento) {
        boolean seElimino = false;
        Mascota mascota =  buscar(nombre);
        Propietario propietario = buscarPropietarioPorId(documento);
        if (propietario != null) {
            propietario.getMascotas().remove(mascota);
            mascotasVeterinario.remove(mascota);
            seElimino = true;
        }

        return seElimino;
    }

 public DefaultTableModel listar() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new String[]{"Nombre", "Especie","Raza","Edad","Peso"});
    for (Mascota mascota : mascotasVeterinario) {
        modelo.addRow(new Object[]{
            mascota.getNombre(),
            mascota.getEspecie(),
            mascota.getRaza(),
            mascota.getEdad(),
            mascota.getPeso()
       
        });
    }

    return modelo;
}

}
    

