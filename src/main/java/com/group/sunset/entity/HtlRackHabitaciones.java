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
public class HtlRackHabitaciones {


    BigDecimal	club;
    BigDecimal	idhabitacion;
    String	idtipohabit;
    BigDecimal	piso;
    String	rack;
    BigDecimal	tipopool;
    String	descripcion;
    String	status;
    BigDecimal	reservacion;
    String	caracteristica;
    String	comentario;
    Date	activacion;
    Date	caducidad;
    BigDecimal	idcamaseccion;
    String	clavehabitacion;
    String	clasif;
    BigDecimal	king;
    BigDecimal	fdouble;
    BigDecimal	jacuzzi;
    BigDecimal	coneccion;
    BigDecimal	balcon;
    BigDecimal	terraza;
    BigDecimal	oceanview;
    BigDecimal	riverview;
    BigDecimal	asoleadero;
    BigDecimal	patio;
    String	tipo;
    BigDecimal	mandatorio   ;
    BigDecimal	tolink;

    public HtlRackHabitaciones() {
    }

    public HtlRackHabitaciones(BigDecimal club, BigDecimal idhabitacion, String idtipohabit, BigDecimal piso, String rack, BigDecimal tipopool, String descripcion, String status, BigDecimal reservacion, String caracteristica, String comentario, Date activacion, Date caducidad, BigDecimal idcamaseccion, String clavehabitacion, String clasif, BigDecimal king, BigDecimal fdouble, BigDecimal jacuzzi, BigDecimal coneccion, BigDecimal balcon, BigDecimal terraza, BigDecimal oceanview, BigDecimal riverview, BigDecimal asoleadero, BigDecimal patio, String tipo, BigDecimal mandatorio, BigDecimal tolink) {
        this.club = club;
        this.idhabitacion = idhabitacion;
        this.idtipohabit = idtipohabit;
        this.piso = piso;
        this.rack = rack;
        this.tipopool = tipopool;
        this.descripcion = descripcion;
        this.status = status;
        this.reservacion = reservacion;
        this.caracteristica = caracteristica;
        this.comentario = comentario;
        this.activacion = activacion;
        this.caducidad = caducidad;
        this.idcamaseccion = idcamaseccion;
        this.clavehabitacion = clavehabitacion;
        this.clasif = clasif;
        this.king = king;
        this.fdouble = fdouble;
        this.jacuzzi = jacuzzi;
        this.coneccion = coneccion;
        this.balcon = balcon;
        this.terraza = terraza;
        this.oceanview = oceanview;
        this.riverview = riverview;
        this.asoleadero = asoleadero;
        this.patio = patio;
        this.tipo = tipo;
        this.mandatorio = mandatorio;
        this.tolink = tolink;
    }

    public Date getActivacion() {
        return activacion;
    }

    public void setActivacion(Date activacion) {
        this.activacion = activacion;
    }

    public BigDecimal getAsoleadero() {
        return asoleadero;
    }

    public void setAsoleadero(BigDecimal asoleadero) {
        this.asoleadero = asoleadero;
    }

    public BigDecimal getBalcon() {
        return balcon;
    }

    public void setBalcon(BigDecimal balcon) {
        this.balcon = balcon;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getClasif() {
        return clasif;
    }

    public void setClasif(String clasif) {
        this.clasif = clasif;
    }

    public String getClavehabitacion() {
        return clavehabitacion;
    }

    public void setClavehabitacion(String clavehabitacion) {
        this.clavehabitacion = clavehabitacion;
    }

    public BigDecimal getClub() {
        return club;
    }

    public void setClub(BigDecimal club) {
        this.club = club;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public BigDecimal getConeccion() {
        return coneccion;
    }

    public void setConeccion(BigDecimal coneccion) {
        this.coneccion = coneccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getFdouble() {
        return fdouble;
    }

    public void setFdouble(BigDecimal fdouble) {
        this.fdouble = fdouble;
    }

    public BigDecimal getIdcamaseccion() {
        return idcamaseccion;
    }

    public void setIdcamaseccion(BigDecimal idcamaseccion) {
        this.idcamaseccion = idcamaseccion;
    }

    public BigDecimal getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(BigDecimal idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getIdtipohabit() {
        return idtipohabit;
    }

    public void setIdtipohabit(String idtipohabit) {
        this.idtipohabit = idtipohabit;
    }

    public BigDecimal getJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(BigDecimal jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public BigDecimal getKing() {
        return king;
    }

    public void setKing(BigDecimal king) {
        this.king = king;
    }

    public BigDecimal getMandatorio() {
        return mandatorio;
    }

    public void setMandatorio(BigDecimal mandatorio) {
        this.mandatorio = mandatorio;
    }

    public BigDecimal getOceanview() {
        return oceanview;
    }

    public void setOceanview(BigDecimal oceanview) {
        this.oceanview = oceanview;
    }

    public BigDecimal getPatio() {
        return patio;
    }

    public void setPatio(BigDecimal patio) {
        this.patio = patio;
    }

    public BigDecimal getPiso() {
        return piso;
    }

    public void setPiso(BigDecimal piso) {
        this.piso = piso;
    }

    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }

    public BigDecimal getReservacion() {
        return reservacion;
    }

    public void setReservacion(BigDecimal reservacion) {
        this.reservacion = reservacion;
    }

    public BigDecimal getRiverview() {
        return riverview;
    }

    public void setRiverview(BigDecimal riverview) {
        this.riverview = riverview;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTerraza() {
        return terraza;
    }

    public void setTerraza(BigDecimal terraza) {
        this.terraza = terraza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getTipopool() {
        return tipopool;
    }

    public void setTipopool(BigDecimal tipopool) {
        this.tipopool = tipopool;
    }

    public BigDecimal getTolink() {
        return tolink;
    }

    public void setTolink(BigDecimal tolink) {
        this.tolink = tolink;
    }






}
