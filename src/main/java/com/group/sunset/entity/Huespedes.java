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
public class Huespedes {

        private BigDecimal idreserva ;
        private String fhaent;
        private String fhasal;
        private BigDecimal idhuesped ;
        private BigDecimal idhabitacion;
        private String     nombre ;
        private Date       fechaentrada ;
        private String     idagencia;
        private String     idgrupo;
        private String     idpais;
        private String     idcompania ;
        private String     idpaquete;
        private String     idestatus ;
        private BigDecimal idcliente ;
        private BigDecimal idvip ;
        private Date fechasalida;
        private String idtipohabit ;
        private String estatus ;
        
        private String nombreidsegmento;
        private String nombretipovip ;
        private String plan;

    public Huespedes() {
    }

    public Huespedes(BigDecimal idreserva, String fhaent, String fhasal, BigDecimal idhuesped,
            BigDecimal idhabitacion, String nombre, Date fechaentrada, String idagencia, 
            String idgrupo, String idpais, String idcompania, String idestatus, BigDecimal idcliente,
            BigDecimal idvip, Date fechasalida, String idtipohabit, String estatus,String idpaquete,
            String nombreidsegmento, String nombretipovip, String plan) {
        this.idreserva = idreserva;
        this.fhaent = fhaent;
        this.fhasal = fhasal;
        this.idhuesped = idhuesped;
        this.idhabitacion = idhabitacion;
        this.nombre = nombre;
        this.fechaentrada = fechaentrada;
        this.idagencia = idagencia;
        this.idgrupo = idgrupo;
        this.idpais = idpais;
        this.idcompania = idcompania;
        this.idestatus = idestatus;
        this.idcliente = idcliente;
        this.idvip = idvip;
        this.fechasalida = fechasalida;
        this.idtipohabit = idtipohabit;
        this.estatus = estatus;
        this.idpaquete = idpaquete;
        this.nombreidsegmento = nombreidsegmento;
        this.nombretipovip = nombretipovip;
        this.plan = plan;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
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

    public String getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(String idagencia) {
        this.idagencia = idagencia;
    }

    public BigDecimal getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(BigDecimal idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdcompania() {
        return idcompania;
    }

    public void setIdcompania(String idcompania) {
        this.idcompania = idcompania;
    }

    public String getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(String idestatus) {
        this.idestatus = idestatus;
    }

    public String getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(String idgrupo) {
        this.idgrupo = idgrupo;
    }

    public BigDecimal getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(BigDecimal idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public BigDecimal getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(BigDecimal idhuesped) {
        this.idhuesped = idhuesped;
    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
    }

    public BigDecimal getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(BigDecimal idreserva) {
        this.idreserva = idreserva;
    }

    public String getIdtipohabit() {
        return idtipohabit;
    }

    public void setIdtipohabit(String idtipohabit) {
        this.idtipohabit = idtipohabit;
    }

    public BigDecimal getIdvip() {
        return idvip;
    }

    public void setIdvip(BigDecimal idvip) {
        this.idvip = idvip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(String idpaquete) {
        this.idpaquete = idpaquete;
    }

    public String getNombreidsegmento() {
        return nombreidsegmento;
    }

    public void setNombreidsegmento(String nombreidsegmento) {
        this.nombreidsegmento = nombreidsegmento;
    }

    public String getNombretipovip() {
        return nombretipovip;
    }

    public void setNombretipovip(String nombretipovip) {
        this.nombretipovip = nombretipovip;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }








}
