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
public class HtlCuentasMaestras {
    
        Integer club;    
        Integer ctama; 
        String  descripcion;
        Integer  nohuesped;
        Integer  cliente;
        String  credito;

    public HtlCuentasMaestras() {
    }

    public HtlCuentasMaestras(Integer club, Integer ctama, String descripcion, Integer nohuesped, Integer cliente, String credito) {
        this.club = club;
        this.ctama = ctama;
        this.descripcion = descripcion;
        this.nohuesped = nohuesped;
        this.cliente = cliente;
        this.credito = credito;
    }

    public Integer getClub() {
        return club;
    }

    public void setClub(Integer club) {
        this.club = club;
    }

    public Integer getCtama() {
        return ctama;
    }

    public void setCtama(Integer ctama) {
        this.ctama = ctama;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNohuesped() {
        return nohuesped;
    }

    public void setNohuesped(Integer nohuesped) {
        this.nohuesped = nohuesped;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
        
        
        
    
}
