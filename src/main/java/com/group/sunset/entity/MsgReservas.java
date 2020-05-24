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
public class MsgReservas {
    
    Integer reserva;
    Integer solicitud;
    String  message;

    public MsgReservas() {
    }

    public MsgReservas(Integer reserva, Integer solicitud, String message) {
        this.reserva = reserva;
        this.solicitud = solicitud;
        this.message = message;
    }

       
       
       
    public Integer getReserva() {
        return reserva;
    }

    public void setReserva(Integer reserva) {
        this.reserva = reserva;
    }

    public Integer getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Integer solicitud) {
        this.solicitud = solicitud;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
       
       
       
       
       
    
}
