// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/12/2003 02:01:10 p.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3)
// Source File Name:   AnticiposyCargos.java

package com.group.sunset.entity;

import java.io.*;
import java.util.*;



public class AnticiposyCargos  implements  Serializable
{

    public AnticiposyCargos()
    {
        club = 0;
        idcliente = 0;
        idcargos = 0;
        huesped = 0;
        grupo = 0;
        numero = 0;
        reserva = 0;
        cuarto = 0;
        cuenta = 0;
        cargo = 0.0D;
        credito = 0.0D;
        status = 0;
        fecha = null;
        referencia = null;
        usuario = null;
        cage = null;
        factura = 0;
        numeroref = 0;
        habitacion = 0;
        cliente = 0;
        paquete = null;
        folpaq = 0;
        numhues = 0;
        fechaaplicacion = null;
        multiformato = 0;
        fechacierre = null;
        personas = 0;
        tarifa = 0.0D;
        tpersonas = null;
        tcambio = null;

    }

    public void setClub(int club)
    {
        this.club = club;
    }

    public int getClub()
    {
        return club;
    }

    public void setIdCliente(int xidcliente)
    {
        idcliente = xidcliente;
    }

    public int getIdCliente()
    {
        return idcliente;
    }

    public void setIdCargos(int xidcargos)
    {
        idcargos = xidcargos;
    }

    public int getIdCargos()
    {
        return idcargos;
    }

    public void setHuesped(int huesped)
    {
        this.huesped = huesped;
    }

    public int getHuesped()
    {
        return huesped;
    }

    public void setGrupo(int grupo)
    {
        this.grupo = grupo;
    }

    public int getGrupo()
    {
        return grupo;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setReserva(int reserva)
    {
        this.reserva = reserva;
    }

    public int getReserva()
    {
        return reserva;
    }

    public void setCuarto(int cuarto)
    {
        this.cuarto = cuarto;
    }

    public int getCuarto()
    {
        return cuarto;
    }

    public void setCuenta(int cuenta)
    {
        this.cuenta = cuenta;
    }

    public int getCuenta()
    {
        return cuenta;
    }

    public void setCargo(double cargo)
    {
        this.cargo = cargo;
    }

    public double getCargo()
    {
        return cargo;
    }

    public void setCredito(double credito)
    {
        this.credito = credito;
    }

    public double getCredito()
    {
        return credito;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public int getStatus()
    {
        return status;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public void setReferencia(String referencia)
    {
        this.referencia = (referencia == null) ? "" :   ( ( referencia.length()<80 ) ? referencia.toUpperCase() : referencia.toUpperCase().substring(0,80) );

        //this.referencia = referencia.substring(0,80);
    }

    public String getReferencia()
    {
        return referencia;
    }

    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }

    public String getUsuario()
    {
        return usuario;
    }

    public void setCage(String cage)
    {
        this.cage = (cage == null) ? "" :   ( ( cage.length()<1 ) ? cage.toUpperCase() : cage.toUpperCase().substring(0,1) );
        //this.cage = cage.substring(0,1);
    }

    public String getCage()
    {
        return cage;
    }

    public void setFactura(int factura)
    {
        this.factura = factura;
    }

    public int getFactura()
    {
        return factura;
    }

    public void setNumeroref(int numeroref)
    {
        this.numeroref = numeroref;
    }

    public int getNumeroref()
    {
        return numeroref;
    }

    public void setHabitacion(int habitacion)
    {
        this.habitacion = habitacion;
    }

    public int getHabitacion()
    {
        return habitacion;
    }

    public void setCliente(int cliente)
    {
        this.cliente = cliente;
    }

    public int getCliente()
    {
        return cliente;
    }

    public void setPaquete(String paquete)
    {
        this.paquete = (paquete == null) ? "" :   ( ( paquete.length()<10 ) ? paquete.toUpperCase() : paquete.toUpperCase().substring(0,10) );

        //this.paquete = paquete.substring(0,10);
    }

    public String getPaquete()
    {
        return paquete;
    }

    public void setFolpaq(int folpaq)
    {
        this.folpaq = folpaq;
    }

    public int getFolpaq()
    {
        return folpaq;
    }

    public void setNumhues(int numhues)
    {
        this.numhues = numhues;
    }

    public int getNumhues()
    {
        return numhues;
    }

    public void setKeymovtos(int keymovtos)
    {
        this.keymovtos = keymovtos;
    }

    public int getKeymovtos()
    {
        return keymovtos;
    }


    public void setFechaAplicacion(Date fechaaplicacion)
    {
           this.fechaaplicacion = fechaaplicacion;
    }

       public Date getFechaAplicacion()
    {
           return fechaaplicacion;
    }


    private int club;
    private int idcliente;
    private int idcargos;
    private int huesped;
    private int grupo;
    private int numero;
    private int reserva;
    private int cuarto;
    private int cuenta;
    private double cargo;
    private double credito;
    private int status;
    private Date fecha;
    private String referencia;
    private String usuario;
    private String cage;
    private int factura;
    private int numeroref;
    private int habitacion;
    private int cliente;
    private String paquete;
    private int folpaq;
    private int numhues;
    private int keymovtos;
    private Date fechaaplicacion;
    private int multiformato;
    private Date fechacierre;
    private int personas;
    private double tarifa;
    private String tpersonas;
    private String tcambio;

	public int getMultiformato() {
		return multiformato;
	}

	public void setMultiformato(int i) {
		multiformato = i;
	}

	public Date getFechacierre() {
		return fechacierre;
	}

  public String getTpersonas() {
    return tpersonas;
  }

  public int getPersonas() {
    return personas;
  }

  public String getTcambio() {
    return tcambio;
  }

  public double getTarifa() {
    return tarifa;
  }

  public void setFechacierre(Date fechacierre) {
		this.fechacierre = fechacierre;
	}

  public void setTpersonas(String tpersonas) {
    this.tpersonas = tpersonas;
  }

  public void setPersonas(int personas) {
    this.personas = personas;
  }

  public void setTcambio(String tcambio) {
    this.tcambio = tcambio;
  }

  public void setTarifa(double tarifa) {
    this.tarifa = tarifa;
  }

}
