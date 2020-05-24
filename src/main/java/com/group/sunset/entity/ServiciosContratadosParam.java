/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.util.List;

/**
 *
 * @author jdelgado
 */
public class ServiciosContratadosParam {
    
       Integer idreserva;
       Integer nohotel;
       String  fechallegada;
       Integer habitacion;
       String  segmento;
       List<ServiciosContratados> sercon;
       List<ServiciosEspeciales> seresp;       

    public ServiciosContratadosParam() {
    }

    public ServiciosContratadosParam(Integer idreserva, 
                                     Integer nohotel,
                                     String  fechallegada,
                                     Integer habitacion,
                                     String  segmento,
                                     List<ServiciosContratados> sercon,
                                     List<ServiciosEspeciales> seresp ) {
        this.idreserva = idreserva;
        this.nohotel = nohotel;
        this.fechallegada=fechallegada;
        this.habitacion=habitacion;
        this.segmento=segmento;
        this.sercon = sercon;
        this.seresp= seresp;
    }

    public Integer getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Integer idreserva) {
        this.idreserva = idreserva;
    }

    public Integer getNohotel() {
        return nohotel;
    }

    public void setNohotel(Integer nohotel) {
        this.nohotel = nohotel;
    }

    public List<ServiciosContratados> getSercon() {
        return sercon;
    }

    public void setSercon(List<ServiciosContratados> sercon) {
        this.sercon = sercon;
    }

    public String getFechallegada() {
        return fechallegada;
    }

    public void setFechallegada(String fechallegada) {
        this.fechallegada = fechallegada;
    }

    public Integer getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Integer habitacion) {
        this.habitacion = habitacion;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public List<ServiciosEspeciales> getSeresp() {
        return seresp;
    }

    public void setSeresp(List<ServiciosEspeciales> seresp) {
        this.seresp = seresp;
    }
       
       
       
       
    
}
