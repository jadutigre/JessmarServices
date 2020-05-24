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
public class CuentaLimite {
    
        Integer cuenta;
        Double  limite;

    public CuentaLimite() {
    }

    public CuentaLimite(Integer cuenta, Double limite) {
        this.cuenta = cuenta;
        this.limite = limite;
    }
    
    

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

        
        
    
}
