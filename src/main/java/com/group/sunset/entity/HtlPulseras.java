/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author jdelgado
 */
public class HtlPulseras {
    
        BigDecimal club; 
        BigDecimal idcliente ;
        BigDecimal idpulseras; 
        String color ; 
        BigDecimal pulsera ; 
        Date fecha ;
        String idusuario; 
        String hora ;

    public HtlPulseras() {
    }

    public HtlPulseras(BigDecimal club, BigDecimal idcliente, BigDecimal idpulseras, String color, BigDecimal pulsera, Date fecha, String idusuario, String hora) {
        this.club = club;
        this.idcliente = idcliente;
        this.idpulseras = idpulseras;
        this.color = color;
        this.pulsera = pulsera;
        this.fecha = fecha;
        this.idusuario = idusuario;
        this.hora = hora;
    }

    public BigDecimal getClub() {
        return club;
    }

    public void setClub(BigDecimal club) {
        this.club = club;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public BigDecimal getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(BigDecimal idcliente) {
        this.idcliente = idcliente;
    }

    public BigDecimal getIdpulseras() {
        return idpulseras;
    }

    public void setIdpulseras(BigDecimal idpulseras) {
        this.idpulseras = idpulseras;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public BigDecimal getPulsera() {
        return pulsera;
    }

    public void setPulsera(BigDecimal pulsera) {
        this.pulsera = pulsera;
    }
        
        
    
    
}
