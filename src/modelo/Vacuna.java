/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author sandro rendon
 */
public class Vacuna {
    
    private String nombre;
    private LocalDate fecha;
    private String lote;
    private String tipo;
    private LocalDate proxDosis;

    public Vacuna(String nombre, LocalDate fecha, String lote, String tipo, LocalDate proxDosis) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lote = lote;
        this.tipo = tipo;
        this.proxDosis = proxDosis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getProxDosis() {
        return proxDosis;
    }

    public void setProxDosis(LocalDate proxDosis) {
        this.proxDosis = proxDosis;
    }
      @Override
    public String toString() {
        String info = "Nombre: " + nombre + "\n";
        info += "Fecha: " + fecha + "\n";
        info += "Lote: " + lote+ "\n";
        info += "Tipo: " + tipo+ "\n";
        info += "Próxima dosis: " + proxDosis+ "\n";

        return info;
    }
}
