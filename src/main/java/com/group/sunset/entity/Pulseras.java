/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jdelgado
 */
public class Pulseras  
{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private int club;
    private int idcliente;
    private int idpulseras;
    private String color;
    private String descripcion;
    private int pulsera;
    private java.util.Date fecha;
    private String sfecha;
    private String idUsuario;
    private java.util.Date fechaentrada;
    private String sfechaentrada;
    private java.util.Date fechasalida;
    private String sfechasalida;
    private String entregada;    

    public Pulseras()
    {
    }

    public Pulseras(int club, int idcliente, int idpulseras, String color, int pulsera, Date fecha, String idUsuario, Date fechaentrada, Date fechasalida, String entregada) {
        this.club = club;
        this.idcliente = idcliente;
        this.idpulseras = idpulseras;
        this.color = color;
        this.pulsera = pulsera;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.entregada = entregada;
    }

	public String getEntregada() {
		return entregada;
	}

	public java.util.Date getFecha() {
		return fecha;
	}

	public java.util.Date getFechaentrada() {
		return fechaentrada;
	}

	public java.util.Date getFechasalida() {
		return fechasalida;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setEntregada(String string) {
		entregada =	(string == null)?"":((string.length() < 50)? string.toUpperCase(): string.toUpperCase().substring(0, 50));		
	}

	public void setFecha(java.util.Date date) {
		fecha = date;
	}

	public void setFechaentrada(java.util.Date date) {
		fechaentrada = date;
	}

	public void setFechasalida(java.util.Date date) {
		fechasalida = date;
	}

	public void setIdUsuario(String string) {
		idUsuario = string;
	}

    public int getClub()
    {
        return club;
    }

    public void setClub(int club)
    {
        this.club = club;
    }

    public void setIdcliente(int idcliente)
    {
        this.idcliente = idcliente;
    }

    public int getIdcliente()
    {
        return idcliente;
    }

    public void setIdpulseras(int idpulseras)
    {
        this.idpulseras = idpulseras;
    }

    public int getIdpulseras()
    {
        return idpulseras;
    }

    public void setColor(String color)
    {
        this.color = color == null ? "" : color;
    }

    public String getColor()
    {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPulsera(int pulsera)
    {
        this.pulsera = pulsera;
    }

    public int getPulsera()
    {
        return pulsera;
    }

    public String getSfecha() {
        return (this.fecha!=null)?sdf.format(this.fecha):null;
    }

    public void setSfecha(String sfecha) {
        this.sfecha = (this.fecha!=null)?sdf.format(this.fecha):null;
    }

    public String getSfechaentrada() {
        return (this.fechaentrada!=null)?sdf.format(this.fechaentrada):null;
    }

    public void setSfechaentrada(String sfechaentrada) {
        this.sfechaentrada = (this.fechaentrada!=null)?sdf.format(this.fechaentrada):null;
    }

    public String getSfechasalida() {
        return (this.fechasalida!=null)?sdf.format(this.fechasalida):null;
    }

    public void setSfechasalida(String sfechasalida) {
        this.sfechasalida = (this.fechasalida!=null)?sdf.format(this.fechasalida):null;
    }

        
        
}