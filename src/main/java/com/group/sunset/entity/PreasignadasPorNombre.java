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
public class PreasignadasPorNombre {
    
                              String idreserva;
	                      String idtipohabit;
	                      String fhaent;
	                      String fhasal;
	                      String nombre;
	                      String idhabitacion;
	                      String compania;
	                      String grupo;
	                      String noadultos;

    public PreasignadasPorNombre(
            
            String idreserva,
            String idtipohabit, 
            String fhaent,
            String fhasal,
            String nombre,
            String idhabitacion,
            String compania,
            String grupo, 
            String noadultos
            
    ) {
        
        this.idreserva = idreserva;
        this.idtipohabit = idtipohabit;
        this.fhaent = fhaent;
        this.fhasal = fhasal;
        this.nombre = nombre;
        this.idhabitacion = idhabitacion;
        this.compania = compania;
        this.grupo = grupo;
        this.noadultos = noadultos;
        
        
        
        
    }

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getIdtipohabit() {
        return idtipohabit;
    }

    public void setIdtipohabit(String idtipohabit) {
        this.idtipohabit = idtipohabit;
    }

    public String getFhaent() {
        return fhaent;
    }

    public void setFhaent(String fhaent) {
        this.fhaent = fhaent;
    }

    public String getFhasal() {
        return fhasal;
    }

    public void setFhasal(String fhasal) {
        this.fhasal = fhasal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(String idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNoadultos() {
        return noadultos;
    }

    public void setNoadultos(String noadultos) {
        this.noadultos = noadultos;
    }
    
    
}
