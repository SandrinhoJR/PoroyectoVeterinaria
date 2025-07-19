/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Consulta;
import modelo.Mascota;
/**
 *
 * @author sandro rendon
 */
public class ControladorConsulta {
         private ArrayList<Consulta> consultas = new ArrayList<>();
         private ControladorMascota controladorMascota;

    public ControladorConsulta(ControladorMascota controladorMascota) {
        this.controladorMascota = controladorMascota;
        
    }
    private Mascota buscarMascota (String nombre){
        return controladorMascota.buscar(nombre);
    }
    
    

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public boolean guardar(String nombre, Consulta consulta) {
        Mascota m = buscarMascota(nombre);
        if (m != null && buscar(consulta.getId())==null) {
            m.agregarConsulta(consulta);
            consultas.add(consulta);
            return true;
        }
        return false;
    }

    public Consulta buscar(String id) {
        for (Consulta consulta : consultas) {
            if (consulta.getId().equals(id)) {
                return consulta;
            }
        }
        return null;
    }

     public boolean eliminar(String id, String nombre) {
        boolean seElimino = false;
        Consulta consulta =  buscar(id);
        Mascota mascota = buscarMascota(nombre);
        if (mascota!= null) {
            mascota.getHistorial().getConsultas().remove(consulta);
            consultas.remove(consulta);
            seElimino = true;
        }

        return seElimino;
    }

}