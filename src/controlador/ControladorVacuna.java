/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Vacuna;
import modelo.Mascota;
import modelo.Vacuna;

/**
 *
 * @author sandro rendon
 */
public class ControladorVacuna {
    
     private ArrayList<Vacuna> vacunas = new ArrayList<>();
         private ControladorMascota controladorMascota;

    public ControladorVacuna(ControladorMascota controladorMascota) {
        this.controladorMascota = controladorMascota;
        
    }
    private Mascota buscarMascota (String nombre){
        return controladorMascota.buscar(nombre);
    }
    
    

    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
    }

    public boolean guardar(String nombre, Vacuna vacuna) {
        Mascota m = buscarMascota(nombre);
        if (m != null && buscar(vacuna.getNombre())==null) {
            m.agregarVacuna(vacuna);
            vacunas.add(vacuna);
            return true;
        }
        return false;
    }

   /* public Vacuna buscar(String nombre) {
        for (Vacuna vacuna : vacunas) {
            if (vacuna.getNombre().equals(nombre)) {
                return vacuna;
            }
        }
        return null;
    }
*/
    public Vacuna buscar(String nombre) {
    System.out.println("Vacunas en lista: " + vacunas.size());
    for (Vacuna vacuna : vacunas) {
        if (vacuna.getNombre().equals(nombre)) {
            return vacuna;
        }
    }
    System.out.println("No se encontró la vacuna");
  return null;
    }

     public boolean eliminar(String nombre, String nombreMascota) {
        boolean seElimino = false;
        Vacuna vacuna =  buscar(nombre);
        Mascota mascota = buscarMascota(nombreMascota);
        if (mascota!= null) {
            mascota.getHistorial().getVacunas().remove(vacuna);
            vacunas.remove(vacuna);
            seElimino = true;
        }

        return seElimino;
    }

    
    
    
}
