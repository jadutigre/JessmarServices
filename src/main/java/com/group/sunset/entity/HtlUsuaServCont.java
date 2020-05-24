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
public class HtlUsuaServCont {
    
    String nohotel;
    String id;
    String codigo;
    String  descrip;
    String activo;

    public HtlUsuaServCont() {
    }

    public HtlUsuaServCont(String nohotel, String id ,String codigo, String descrip, String activo) {
        this.nohotel = nohotel;
        this.id = id;
        this.codigo = codigo;
        this.descrip = descrip;
        this.activo = activo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    

    public String getNohotel() {
        return nohotel;
    }

    public void setNohotel(String nohotel) {
        this.nohotel = nohotel;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
    
}


