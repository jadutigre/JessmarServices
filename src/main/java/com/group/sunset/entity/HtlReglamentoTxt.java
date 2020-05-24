/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

/**
 *
 * @author jaimedelgado
 */
public class HtlReglamentoTxt {
    
       Integer hotel;
       String  reglamentoesp;
       String  reglamentoing;

    public HtlReglamentoTxt() {
    }

    public HtlReglamentoTxt(Integer hotel, String reglamentoesp, String reglamentoing) {
        this.hotel = hotel;
        this.reglamentoesp = reglamentoesp;
        this.reglamentoing = reglamentoing;
    }

    public Integer getHotel() {
        return hotel;
    }

    public void setHotel(Integer hotel) {
        this.hotel = hotel;
    }

    public String getReglamentoesp() {
        return reglamentoesp;
    }

    public void setReglamentoesp(String reglamentoesp) {
        this.reglamentoesp = reglamentoesp;
    }

    public String getReglamentoing() {
        return reglamentoing;
    }

    public void setReglamentoing(String reglamentoing) {
        this.reglamentoing = reglamentoing;
    }

       
       
    
}
