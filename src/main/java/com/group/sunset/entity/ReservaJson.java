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
public class ReservaJson {
       
    Reservacion reservacion;
    Unidad      unidad;
    public List<ServiciosContratados> servicioscontratados;
    

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public List<ServiciosContratados> getServicioscontratados() {
        return servicioscontratados;
    }

    public void setServicioscontratados(List<ServiciosContratados> servicioscontratados) {
        this.servicioscontratados = servicioscontratados;
    }

             
    
}
