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
public class Depositos {
    
       Integer idkey;
       Integer idreserva;
       String  formapago;
       Double  importe;
       String  descripcion;
       String  noautorizacion;
       String  iduser;
       String  divisa;
       String  tarjeta;
       String  banco;
       Date    fechaexp;
       String  codseg;
       String  terminal;
       Date    fechaoper;
       String  ttarjeta;
       String  sfechaexp;
       String  tipotrans;

    public Depositos() {
    }

    public Depositos(Integer idkey, Integer idreserva, String formapago, Double importe, String descripcion, String noautorizacion, String iduser, String divisa, String tarjeta, String banco, Date fechaexp, String codseg, String terminal, Date fechaoper, String ttarjeta, String sfechaexp, String tipotrans) {
        this.idkey = idkey;
        this.idreserva = idreserva;
        this.formapago = formapago;
        this.importe = importe;
        this.descripcion = descripcion;
        this.noautorizacion = noautorizacion;
        this.iduser = iduser;
        this.divisa = divisa;
        this.tarjeta = tarjeta;
        this.banco = banco;
        this.fechaexp = fechaexp;
        this.codseg = codseg;
        this.terminal = terminal;
        this.fechaoper = fechaoper;
        this.ttarjeta = ttarjeta;
        this.sfechaexp = sfechaexp;
        this.tipotrans = tipotrans;
    }

    public Integer getIdkey() {
        return idkey;
    }

    public void setIdkey(Integer idkey) {
        this.idkey = idkey;
    }

    public Integer getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Integer idreserva) {
        this.idreserva = idreserva;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNoautorizacion() {
        return noautorizacion;
    }

    public void setNoautorizacion(String noautorizacion) {
        this.noautorizacion = noautorizacion;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Date getFechaexp() {
        return fechaexp;
    }

    public void setFechaexp(Date fechaexp) {
        this.fechaexp = fechaexp;
    }

    public String getCodseg() {
        return codseg;
    }

    public void setCodseg(String codseg) {
        this.codseg = codseg;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public Date getFechaoper() {
        return fechaoper;
    }

    public void setFechaoper(Date fechaoper) {
        this.fechaoper = fechaoper;
    }

    public String getTtarjeta() {
        return ttarjeta;
    }

    public void setTtarjeta(String ttarjeta) {
        this.ttarjeta = ttarjeta;
    }

    public String getSfechaexp() {
        return sfechaexp;
    }

    public void setSfechaexp(String sfechaexp) {
        this.sfechaexp = sfechaexp;
    }

    public String getTipotrans() {
        return tipotrans;
    }

    public void setTipotrans(String tipotrans) {
        this.tipotrans = tipotrans;
    }
       
       
       
       
       
    
    
    
    
}
