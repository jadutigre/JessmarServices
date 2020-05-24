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
public class SaldoResortCredit {
    
       SaldoPorCuenta  saldoporcuenta;
       CuentaLimite    cuentalimite;
       TipoCambioDia   tipocambiodia;

    public SaldoResortCredit() {
    }

    public SaldoResortCredit(SaldoPorCuenta saldoporcuenta, CuentaLimite cuentalimite, TipoCambioDia tipocambiodia) {
        this.saldoporcuenta = saldoporcuenta;
        this.cuentalimite = cuentalimite;
        this.tipocambiodia = tipocambiodia;
    }

    public SaldoPorCuenta getSaldoporcuenta() {
        return saldoporcuenta;
    }

    public void setSaldoporcuenta(SaldoPorCuenta saldoporcuenta) {
        this.saldoporcuenta = saldoporcuenta;
    }

    public CuentaLimite getCuentalimite() {
        return cuentalimite;
    }

    public void setCuentalimite(CuentaLimite cuentalimite) {
        this.cuentalimite = cuentalimite;
    }

    public TipoCambioDia getTipocambiodia() {
        return tipocambiodia;
    }

    public void setTipocambiodia(TipoCambioDia tipocambiodia) {
        this.tipocambiodia = tipocambiodia;
    }
       
       
       
        
    
}
