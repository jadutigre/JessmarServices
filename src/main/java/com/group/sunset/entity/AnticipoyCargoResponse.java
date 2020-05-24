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
public class AnticipoyCargoResponse {
    
    Integer folio;
    String mensaje;

    public AnticipoyCargoResponse() {
    }

    public AnticipoyCargoResponse(Integer folio, String mensaje) {
        this.folio = folio;
        this.mensaje = mensaje;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
    
}
