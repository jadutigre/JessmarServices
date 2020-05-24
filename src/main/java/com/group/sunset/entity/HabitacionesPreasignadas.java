/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

/**
 *
 * @author jdelgado
 */
public class HabitacionesPreasignadas {
    
	                          String idreserva;
	                          String idhabitacion;
	                          String nombre;
				  String fechaentrada;
				  String fechasalida;
	                          String idtipohabit;
	                          String caracteristica;
	                          String idestatus;    

    public HabitacionesPreasignadas(String idreserva,
            String idhabitacion, 
            String nombre, 
            String fechaentrada, 
            String fechasalida,
            String idtipohabit,
            String caracteristica, 
            String idestatus) {
        
        this.idreserva = idreserva;
        this.idhabitacion = idhabitacion;
        this.nombre = nombre;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.idtipohabit = idtipohabit;
        this.caracteristica = caracteristica;
        this.idestatus = idestatus;
        
    }

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(String idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(String idestatus) {
        this.idestatus = idestatus;
    }
    
    
}
