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
public class HtlPromacoModel {
    
        String id;         
        String habit;      
        String nombre;     
        String cantidad;   
        String entrada;    
        String salida;         

    public HtlPromacoModel() {
    }

    public HtlPromacoModel(String id, String habit, String nombre, String cantidad, String entrada, String salida) {
       
        this.id = id;
        this.habit = habit;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.entrada = entrada;
        this.salida = salida;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
        
}
