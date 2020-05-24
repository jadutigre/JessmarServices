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
public class Htlcatalogomensajes {
    
       Integer idmensaje;
       String descripcion;
       String mensajeesp;
       String mensajeeng;

    public Htlcatalogomensajes() {
    }

    public Htlcatalogomensajes(Integer idmensaje,
            String descripcion, String mensajeesp, String mensajeeng) {
        this.idmensaje = idmensaje;
        this.descripcion = descripcion;
        this.mensajeesp = mensajeesp;
        this.mensajeeng = mensajeeng;
    }
       
    public Integer getIdmensaje() {
        return idmensaje;
    }

    public void setIdmensaje(Integer idmensaje) {
        this.idmensaje = idmensaje;
    }

    public String getMensajeesp() {
        return mensajeesp;
    }

    public void setMensajeesp(String mensajeesp) {
        this.mensajeesp = mensajeesp;
    }

    public String getMensajeeng() {
        return mensajeeng;
    }

    public void setMensajeeng(String mensajeeng) {
        this.mensajeeng = mensajeeng;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
       
       
       
    
}
