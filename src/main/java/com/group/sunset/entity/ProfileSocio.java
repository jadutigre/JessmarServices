/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

import java.util.Date;

/**
 *
 * @author jdelgado
 */
public class ProfileSocio {
    
        String club;
        String idreserva;
        Date fechaentrada;
        String nombre;
        String idhuesped;
        String idcontrato;
        String idestatus;

    public ProfileSocio() {
    }
        
        
        

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(String idhuesped) {
        this.idhuesped = idhuesped;
    }

    public String getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(String idcontrato) {
        this.idcontrato = idcontrato;
    }

    public String getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(String idestatus) {
        this.idestatus = idestatus;
    }
        
        
        
    
}
