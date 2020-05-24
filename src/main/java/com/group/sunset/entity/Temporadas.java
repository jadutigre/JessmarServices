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
public class Temporadas {
    
    String idtemporada;
    Date inicial;
    Date finale;
    String finicial;
    String ffinal;

    public Temporadas() {
    }

    public String getIdtemporada() {
        return idtemporada;
    }

    public void setIdtemporada(String idtemporada) {
        this.idtemporada = idtemporada;
    }

    public Date getInicial() {
        return inicial;
    }

    public void setInicial(Date inicial) {
        this.inicial = inicial;
    }

    public Date getFinale() {
        return finale;
    }

    public void setFinale(Date finale) {
        this.finale = finale;
    }

    public String getFinicial() {
        return finicial;
    }

    public void setFinicial(String finicial) {
        this.finicial = finicial;
    }

    public String getFfinal() {
        return ffinal;
    }

    public void setFfinal(String ffinal) {
        this.ffinal = ffinal;
    }


    
    
    
    
}
