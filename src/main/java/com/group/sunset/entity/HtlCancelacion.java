/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.math.BigDecimal;

/**
 *
 * @author jdelgado
 */
public class HtlCancelacion {
    
    BigDecimal nohotel;
    BigDecimal noreserva;
    String causa;
    String iduser;

    public HtlCancelacion() {
    }

    public HtlCancelacion(BigDecimal nohotel, BigDecimal noreserva, String causa, String iduser) {
        this.nohotel = nohotel;
        this.noreserva = noreserva;
        this.causa = causa;
        this.iduser = iduser;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public BigDecimal getNohotel() {
        return nohotel;
    }

    public void setNohotel(BigDecimal nohotel) {
        this.nohotel = nohotel;
    }

    public BigDecimal getNoreserva() {
        return noreserva;
    }

    public void setNoreserva(BigDecimal noreserva) {
        this.noreserva = noreserva;
    }

    
    
    
    
    
}
