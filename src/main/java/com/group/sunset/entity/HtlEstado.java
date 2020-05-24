/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

/**
 *
 * @author jdelgado
 */
public class HtlEstado {
    
     String clavepais;
     String claveestado;
     String nombreestado;

    public HtlEstado() {
    }

    public HtlEstado(String clavepais, String claveestado, String nombreestado) {
        this.clavepais = clavepais;
        this.claveestado = claveestado;
        this.nombreestado = nombreestado;
    }
     
     
     
     
     

    public String getClavepais() {
        return clavepais;
    }

    public void setClavepais(String clavepais) {
        this.clavepais = clavepais;
    }

    public String getClaveestado() {
        return claveestado;
    }

    public void setClaveestado(String claveestado) {
        this.claveestado = claveestado;
    }

    public String getNombreestado() {
        return nombreestado;
    }

    public void setNombreestado(String nombreestado) {
        this.nombreestado = nombreestado;
    }
     
     
     
     
    
}
