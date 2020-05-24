/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

import java.io.Serializable;

public class HtlCargosExtras {
    
    

    public HtlCargosExtras()
    {
    }

    public int getClub()
    {
        return club;
    }

    public void setClub(int club)
    {
        this.club = club;
    }

    public int getCuenta()
    {
        return cuenta;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public String getDescriphabit()
    {
        return descriphabit;
    }

    public int getFolio()
    {
        return folio;
    }

    public int getHabitacion()
    {
        return habitacion;
    }

    public int getIdcargo()
    {
        return idcargo;
    }

    public int getIdcliente()
    {
        return idcliente;
    }

    public int getMoneda()
    {
        return moneda;
    }

    public int getTipomoneda()
    {
        return tipomoneda;
    }

    public void setTipomoneda(int tipomoneda)
    {
        this.tipomoneda = tipomoneda;
    }

    public void setMoneda(int moneda)
    {
        this.moneda = moneda;
    }

    public void setIdcliente(int idcliente)
    {
        this.idcliente = idcliente;
    }

    public void setIdcargo(int idcargo)
    {
        this.idcargo = idcargo;
    }

    public void setHabitacion(int habitacion)
    {
        this.habitacion = habitacion;
    }

    public void setFolio(int folio)
    {
        this.folio = folio;
    }

    public void setDescriphabit(String descriphabit)
    {
        this.descriphabit = descriphabit;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public void setCuenta(int cuenta)
    {
        this.cuenta = cuenta;
    }

    public double getImporte()
    {
        return importe;
    }

    public void setImporte(double importe)
    {
        this.importe = importe;
    }

    private int club;
    private int idcliente;
    private int idcargo;
    private int cuenta;
    private int habitacion;
    private int folio;
    private String descriphabit;
    private String descripcion;
    private double importe;
    private int moneda;
    private int tipomoneda;
}