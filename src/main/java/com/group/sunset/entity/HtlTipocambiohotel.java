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
public class HtlTipocambiohotel {
    
       String iddescripcion;
       Double tipocambio;

    public HtlTipocambiohotel() {
    }

    public HtlTipocambiohotel(String iddescripcion, Double tipocambio) {
        this.iddescripcion = iddescripcion;
        this.tipocambio = tipocambio;
    }

    public String getIddescripcion() {
        return iddescripcion;
    }

    public void setIddescripcion(String iddescripcion) {
        this.iddescripcion = iddescripcion;
    }

    public Double getTipocambio() {
        return tipocambio;
    }

    public void setTipocambio(Double tipocambio) {
        this.tipocambio = tipocambio;
    }
       
       
    
    
}
