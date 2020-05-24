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
public class HtlHabitacionesBloqueadasModel {
    
    String no ;
    String habitacion;
    String tipo;
    String comentario;
    String reservacion;
    String inicbloq;
    String finabloq;
    String key;
    String bloq;
    String iduser;
    String tipoorder;

    public HtlHabitacionesBloqueadasModel() {
    }

    public HtlHabitacionesBloqueadasModel(String no, String habitacion, String tipo, String comentario, 
            String reservacion, String inicbloq, String finabloq, String key, String bloq, String iduser,
            String tipoorder) {
    
        this.no = no;
        this.habitacion = habitacion;
        this.tipo = tipo;
        this.comentario = comentario;
        this.reservacion = reservacion;
        this.inicbloq = inicbloq;
        this.finabloq = finabloq;
        this.key = key;
        this.bloq = bloq;
        this.iduser=iduser;
        this.tipoorder=tipoorder;
        
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getReservacion() {
        return reservacion;
    }

    public void setReservacion(String reservacion) {
        this.reservacion = reservacion;
    }

    public String getInicbloq() {
        return inicbloq;
    }

    public void setInicbloq(String inicbloq) {
        this.inicbloq = inicbloq;
    }

    public String getFinabloq() {
        return finabloq;
    }

    public void setFinabloq(String finabloq) {
        this.finabloq = finabloq;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getBloq() {
        return bloq;
    }

    public void setBloq(String bloq) {
        this.bloq = bloq;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getTipoorder() {
        return tipoorder;
    }

    public void setTipoorder(String tipoorder) {
        this.tipoorder = tipoorder;
    }
 
}
