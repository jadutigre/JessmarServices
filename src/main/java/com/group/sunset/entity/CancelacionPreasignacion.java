/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

import java.util.Vector;

/**
 *
 * @author jdelgado
 */
public class CancelacionPreasignacion {
    
       Vector data;
       String iduser;
       String nohotel;

    public CancelacionPreasignacion() {
    }

    public CancelacionPreasignacion(Vector data, String iduser, String nohotel) {
        this.data = data;
        this.iduser = iduser;
        this.nohotel = nohotel;
    }
       

    public Vector getData() {
        return data;
    }

    public void setData(Vector data) {
        this.data = data;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getNohotel() {
        return nohotel;
    }

    public void setNohotel(String nohotel) {
        this.nohotel = nohotel;
    }
       
 
       
    
}
