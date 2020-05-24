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
public class HabitacionCuenta {
    
        String  idhabitacion;
        String  nombre;
        String  fhaent;
        String  fhasal;
        String  planviaje;
        String  tipo;                              // Tipo 3 = PreCheckIn
        String  idcliente;

    public HabitacionCuenta() {
    }

    public HabitacionCuenta(
            String idhabitacion,
            String nombre,
            String fhaent,
            String fhasal,
            String planviaje,
            String tipo,
            String idcliente
    ) {
        this.idhabitacion = idhabitacion;
        this.nombre = nombre;
        this.fhaent = fhaent;
        this.fhasal = fhasal;
        this.planviaje = planviaje;
        this.tipo = tipo;
        this.idcliente = idcliente;
    }

    public String getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(String idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFhaent() {
        return fhaent;
    }

    public void setFhaent(String fhaent) {
        this.fhaent = fhaent;
    }

    public String getFhasal() {
        return fhasal;
    }

    public void setFhasal(String fhasal) {
        this.fhasal = fhasal;
    }

    public String getPlanviaje() {
        return planviaje;
    }

    public void setPlanviaje(String planviaje) {
        this.planviaje = planviaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }
        
       
    
    
}
