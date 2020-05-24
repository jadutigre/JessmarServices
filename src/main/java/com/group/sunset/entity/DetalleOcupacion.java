/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

/**
 *
 * @author jaimedelgado
 */
public class DetalleOcupacion {
    
            String idreserva;
            String nombre;
            String idestatus;
            String fechaentrada;
            String fechasalida;
            String idtipohabit;
            String idagencia;
            String desagen;

    public DetalleOcupacion() {
    }

    public DetalleOcupacion(String idreserva, String nombre, String idestatus, String fechaentrada,
            String fechasalida, String idtipohabit, String idagencia, String desagen) {
        this.idreserva = idreserva;
        this.nombre = nombre;
        this.idestatus = idestatus;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.idtipohabit = idtipohabit;
        this.idagencia = idagencia;
        this.desagen = desagen;
    }
            
            
            

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(String idestatus) {
        this.idestatus = idestatus;
    }

    public String getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(String fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getIdtipohabit() {
        return idtipohabit;
    }

    public void setIdtipohabit(String idtipohabit) {
        this.idtipohabit = idtipohabit;
    }

    public String getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(String idagencia) {
        this.idagencia = idagencia;
    }

    public String getDesagen() {
        return desagen;
    }

    public void setDesagen(String desagen) {
        this.desagen = desagen;
    }

    
    
    
}
