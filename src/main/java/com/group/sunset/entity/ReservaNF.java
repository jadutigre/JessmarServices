/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 *
 * @author jdelgado
 */
public class ReservaNF implements Serializable{

        BigDecimal reserva;
        Date       fechaentrada;
        Date       fechasalida;
        BigDecimal habitacion;
        String     idestatus;
        String     nombre;
        String     idtipohabit;
        String     status; 
        String     tipocama; 

    public ReservaNF() {
    }

    public ReservaNF(BigDecimal reserva, Date fechaentrada, Date fechasalida, BigDecimal habitacion,
            String idestatus,String nombre,String idtipohabit,String status,String tipocama) {
        this.reserva = reserva;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.habitacion = habitacion;
        this.idestatus = idestatus;
        this.nombre = nombre;
        this.idtipohabit=idtipohabit;
        this.status=status;
        this.tipocama=tipocama;
    }


    public String getIdtipohabit() {
        return idtipohabit;
    }

    public void setIdtipohabit(String idtipohabit) {
        this.idtipohabit = idtipohabit;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(String idestatus) {
        this.idestatus = idestatus;
    }

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public BigDecimal getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(BigDecimal habitacion) {
        this.habitacion = habitacion;
    }

    public BigDecimal getReserva() {
        return reserva;
    }

    public void setReserva(BigDecimal reserva) {
        this.reserva = reserva;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public String getTipocama() {
		return tipocama;
	}

	public void setTipocama(String tipocama) {
		this.tipocama = tipocama;
	}

        

}
