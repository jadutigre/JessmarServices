/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

import java.util.Date;

/**
 *
 * @author jdelgado
 */
public class VistaConsultaReservas {
    
              Integer idreserva;
              String  fhaent;
              String fhasal;  
              Integer idhuesped;
              Integer idhabitacion;
              String status;
              String nombre;
              Date  fechaentrada; 
              String idagencia;
              String idgrupo;
              String idpais;
              String idpaquete;
              String idestatus;
              String idcliente;
              Integer idvip;
              Date  fechasalida ;
              String idtipohabit;
              Integer cantidad;
              Integer precheckin;
              
              String origen;
              String tipohuesped;
              String folmembresia;
              
              String vuelohorallegada;
              String vueloestatus;              

    public Integer getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Integer idreserva) {
        this.idreserva = idreserva;
    }

    public String getFhaent() {
        return fhaent;
    }

    public void setFhaent(String fhaent) {
        this.fhaent = fhaent;
    }

    public String getFhasal() {
        return fhasal;
    }

    public void setFhasal(String fhasal) {
        this.fhasal = fhasal;
    }

    public Integer getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(Integer idhuesped) {
        this.idhuesped = idhuesped;
    }

    public Integer getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(Integer idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public String getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(String idagencia) {
        this.idagencia = idagencia;
    }

    public String getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(String idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
    }

    public String getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(String idpaquete) {
        this.idpaquete = idpaquete;
    }

    public String getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(String idestatus) {
        this.idestatus = idestatus;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public Integer getIdvip() {
        return idvip;
    }

    public void setIdvip(Integer idvip) {
        this.idvip = idvip;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getIdtipohabit() {
        return idtipohabit;
    }

    public void setIdtipohabit(String idtipohabit) {
        this.idtipohabit = idtipohabit;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecheckin() {
        return precheckin;
    }

    public void setPrecheckin(Integer precheckin) {
        this.precheckin = precheckin;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTipohuesped() {
        return tipohuesped;
    }

    public void setTipohuesped(String tipohuesped) {
        this.tipohuesped = tipohuesped;
    }

    public String getFolmembresia() {
        return folmembresia;
    }

    public void setFolmembresia(String folmembresia) {
        this.folmembresia = folmembresia;
    }

    public String getVuelohorallegada() {
        return (vuelohorallegada==null)?" ":vuelohorallegada;
    }

    public void setVuelohorallegada(String vuelohorallegada) {
        this.vuelohorallegada = vuelohorallegada;
    }

    public String getVueloestatus() {
        
        return (vueloestatus==null)?" ":vueloestatus;
    }

    public void setVueloestatus(String vueloestatus) {
        this.vueloestatus = vueloestatus;
    }
    
    
           
    
}
