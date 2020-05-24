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
public class SaldoPorCuenta {
    
       Integer nohuesped;
       Integer cuenta;
       Double  Saldo;

    public SaldoPorCuenta() {
    }

    public SaldoPorCuenta(Integer nohuesped, Integer cuenta, Double Saldo) {
        this.nohuesped = nohuesped;
        this.cuenta = cuenta;
        this.Saldo = Saldo;
    }

    public Integer getNohuesped() {
        return nohuesped;
    }

    public void setNohuesped(Integer nohuesped) {
        this.nohuesped = nohuesped;
    }

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }
       
       
    
}
