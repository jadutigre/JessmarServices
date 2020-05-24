/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author jdelgado
 */


public class HtlTransportacion {

    private BigDecimal idcliente;
    private BigDecimal idtrans;
    private String servicio;
    private String transportacion;
    private String vuelollegada;
    private String vuelosalida;
    private String aerolinea1;
    private String hora1;
    private String aerolinea2;
    private String hora2;
    private String notas;
    private Date fechallegada;
    private Date fechasalida;
    private String tipo;
    private String iata;
    private String iaco;
    private String origen;
    private String destino;

    public HtlTransportacion() {
    }

    public HtlTransportacion(BigDecimal idcliente, 
            BigDecimal idtrans,
            String servicio,
            String transportacion,
            String vuelollegada,
            String vuelosalida, 
            String aerolinea1,
            String hora1, 
            String aerolinea2, 
            String hora2, String notas, Date fechallegada, Date fechasalida, String tipo,
            String iata,
            String iaco,
            String origen,
            String destino) {
        this.idcliente = idcliente;
        this.idtrans = idtrans;
        this.servicio = servicio;
        this.transportacion = transportacion;
        this.vuelollegada = vuelollegada;
        this.vuelosalida = vuelosalida;
        this.aerolinea1 = aerolinea1;
        this.hora1 = hora1;
        this.aerolinea2 = aerolinea2;
        this.hora2 = hora2;
        this.notas = notas;
        this.fechallegada = fechallegada;
        this.fechasalida = fechasalida;
        this.tipo = tipo;
        this.iata = iata;
        this.iaco = iaco;
        this.origen=origen;
        this.destino=destino;
    }

    public String getAerolinea1() {
        return (aerolinea1==null)?"":aerolinea1;
    }

    public void setAerolinea1(String aerolinea1) {
        this.aerolinea1 = aerolinea1;
    }

    public String getAerolinea2() {
        return (aerolinea2==null)?"":aerolinea2;
    }

    public void setAerolinea2(String aerolinea2) {
        this.aerolinea2 = aerolinea2;
    }

    public Date getFechallegada() {
        return fechallegada;
    }

    public void setFechallegada(Date fechallegada) {
        this.fechallegada = fechallegada;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getHora1() {
        return (hora1==null)?"":hora1;
    }

    public void setHora1(String hora1) {
        this.hora1 = hora1;
    }

    public String getHora2() {
        return (hora2==null)?"":hora2;
    }

    public void setHora2(String hora2) {
        this.hora2 = hora2;
    }

    public BigDecimal getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(BigDecimal idcliente) {
        this.idcliente = idcliente;
    }

    public String getNotas() {
        return (notas==null)?"":notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getServicio() {
        return (servicio==null)?"":servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTransportacion() {
        return (transportacion==null)?"":transportacion;
    }

    public void setTransportacion(String transportacion) {
        this.transportacion = transportacion;
    }

    public String getVuelollegada() {
        return vuelollegada;
    }

    public void setVuelollegada(String vuelollegada) {
        this.vuelollegada = vuelollegada;
    }

    public String getVuelosalida() {
        return vuelosalida;
    }

    public void setVuelosalida(String vuelosalida) {
        this.vuelosalida = vuelosalida;
    }

    public BigDecimal getIdtrans() {
        return idtrans;
    }

    public void setIdtrans(BigDecimal idtrans) {
        this.idtrans = idtrans;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIaco() {
        return iaco;
    }

    public void setIaco(String iaco) {
        this.iaco = iaco;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    


}
