/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author jdelgado
 */
public class HtlPlanAlimentos {
    
       BigDecimal club;
       String idpaquete;
       String descripcion;
       Date activacion;
       Date caducidad;
       String planalimentos;

    public HtlPlanAlimentos() {
    }

    public HtlPlanAlimentos(BigDecimal club, String idpaquete, String descripcion,
            Date activacion, Date caducidad, String planalimentos
            ) {
        this.club = club;
        this.idpaquete = idpaquete;
        this.descripcion = descripcion;
        this.activacion = activacion;
        this.caducidad = caducidad;
        this.planalimentos = planalimentos;
    }

    public Date getActivacion() {
        return activacion;
    }

    public void setActivacion(Date activacion) {
        this.activacion = activacion;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public BigDecimal getClub() {
        return club;
    }

    public void setClub(BigDecimal club) {
        this.club = club;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(String idpaquete) {
        this.idpaquete = idpaquete;
    }

    public String getPlanalimentos() {
        return planalimentos;
    }

    public void setPlanalimentos(String planalimentos) {
        this.planalimentos = planalimentos;
    }


}
