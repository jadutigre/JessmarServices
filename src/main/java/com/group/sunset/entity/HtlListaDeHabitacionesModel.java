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
public class HtlListaDeHabitacionesModel {
    
        String no ;        
        String habitacion ;
        String tipo;  
        String comentario; 
        String estatus;  
        String descripcion; 
        String key; 
        String disp; 

    public HtlListaDeHabitacionesModel() {
    }

    public HtlListaDeHabitacionesModel(String no, String habitacion, String tipo, String comentario, String estatus, String descripcion, String key, String disp) {
        
        this.no = no;
        this.habitacion = habitacion;
        this.tipo = tipo;
        this.comentario = comentario;
        this.estatus = estatus;
        this.descripcion = descripcion;
        this.key = key;
        this.disp = disp;
        
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

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDisp() {
        return disp;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }
    
    
    
}
