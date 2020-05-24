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
public class Hospedaje {
    
    
    ReservaHotel rh;
    ReservaHotel dbdatostmp;
    String       iduser;
    String       idhotel;

    public Hospedaje() {
    }

    public ReservaHotel getRh() {
        return rh;
    }

    public void setRh(ReservaHotel rh) {
        this.rh = rh;
    }

    public ReservaHotel getDbdatostmp() {
        return dbdatostmp;
    }

    public void setDbdatostmp(ReservaHotel dbdatostmp) {
        this.dbdatostmp = dbdatostmp;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(String idhotel) {
        this.idhotel = idhotel;
    }
    
    
    
    
    
}
