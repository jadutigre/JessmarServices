/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.entity;

import java.util.Date;

/**
 *
 * @author mrivero
 */
public class Hieleras {
     Integer id;
     String clave;
     String descripcion;
     Date fecha_adquisicion;
     Date fecha_baja;
     Boolean activa;  
     Long num_pedido_actual;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(Date fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Long getNum_pedido_actual() {
        return num_pedido_actual;
    }

    public void setNum_pedido_actual(Long num_pedido_actual) {
        this.num_pedido_actual = num_pedido_actual;
    }
             
    
     
     
}
