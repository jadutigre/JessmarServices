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
public class HtlCuenta {
    
       Integer club;
       Integer cuenta;
       String  descripcion;
       String  tipocuenta;
       Integer multiformato;
       Integer activo;
       Integer actiauto;
       Integer hextra;
       Double  limite;
       Integer comisionable;
       String  clasif1;
       String  clasif2;
       String  beneficios;

    public HtlCuenta() {
    }

    public HtlCuenta(Integer club,
            Integer cuenta,
            String descripcion,
            String tipocuenta,
            Integer multiformato,
            Integer activo,
            Integer actiauto,
            Integer hextra,
            Double limite,
            Integer comisionable,
            String clasif1,
            String clasif2,
            String beneficios) {
        this.club = club;
        this.cuenta = cuenta;
        this.descripcion = descripcion;
        this.tipocuenta = tipocuenta;
        this.multiformato = multiformato;
        this.activo=activo;
        this.actiauto = actiauto;
        this.hextra = hextra;
        this.limite = limite;
        this.comisionable=comisionable;
        this.clasif1=clasif1;
        this.clasif2=clasif2;
        this.beneficios=beneficios;
    }

    public Integer getClub() {
        return club;
    }

    public void setClub(Integer club) {
        this.club = club;
    }

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public Integer getMultiformato() {
        return multiformato;
    }

    public void setMultiformato(Integer multiformato) {
        this.multiformato = multiformato;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getActiauto() {
        return actiauto;
    }

    public void setActiauto(Integer actiauto) {
        this.actiauto = actiauto;
    }

    public Integer getHextra() {
        return hextra;
    }

    public void setHextra(Integer hextra) {
        this.hextra = hextra;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Integer getComisionable() {
        return comisionable;
    }

    public void setComisionable(Integer comisionable) {
        this.comisionable = comisionable;
    }

    public String getClasif1() {
        return clasif1;
    }

    public void setClasif1(String clasif1) {
        this.clasif1 = clasif1;
    }

    public String getClasif2() {
        return clasif2;
    }

    public void setClasif2(String clasif2) {
        this.clasif2 = clasif2;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
    
    
    
}
