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
public class HtlTiposPaquetes {

       BigDecimal club;
       String idpaquete;
       String idcolor;
       String descripcion;
       Date activacion;
       Date caducidad;
       String tipoplan;
       String tipoplanrs;
       String tipoplanls;
       String tipoplansl;
       String tipoplanfv;
       String tipoplantr;
       Integer comisiona;




    public HtlTiposPaquetes() {
    }
    
    public HtlTiposPaquetes( 
            String idpaquete, 
            String descripcion,
            Integer comisiona
            ) {
        this.idpaquete = idpaquete;
        this.descripcion = descripcion;
        this.comisiona = comisiona;
    }    

    public HtlTiposPaquetes(BigDecimal club, String idpaquete, String descripcion,
            Date activacion, Date caducidad, String tipoplan
            , String tipoplanrs
            , String tipoplanls
            , String tipoplansl
            , String tipoplanfv
            , String tipoplantr
            , Integer comisiona

            ) {
        this.club = club;
        this.idpaquete = idpaquete;
        this.descripcion = descripcion;
        this.activacion = activacion;
        this.caducidad = caducidad;
        this.tipoplan = tipoplan;
        this.tipoplanrs = tipoplanrs;
        this.tipoplanls = tipoplanls;
        this.tipoplansl = tipoplansl;
        this.tipoplanfv = tipoplanfv;
        this.tipoplantr = tipoplantr;
        this.comisiona = comisiona;
    }

    public Date getActivacion() {
        return activacion;
    }

    public void setActivacion(Date activacion) {
        this.activacion = activacion;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public BigDecimal getClub() {
        return club;
    }

    public void setClub(BigDecimal club) {
        this.club = club;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(String idpaquete) {
        this.idpaquete = idpaquete;
    }

    public String getIdcolor() {
        return idcolor;
    }

    public void setIdcolor(String idcolor) {
        this.idcolor = idcolor;
    }
    
    

    public String getTipoplan() {
        return tipoplan;
    }

    public void setTipoplan(String tipoplan) {
        this.tipoplan = tipoplan;
    }

    public String getTipoplanfv() {
        return tipoplanfv;
    }

    public void setTipoplanfv(String tipoplanfv) {
        this.tipoplanfv = tipoplanfv;
    }

    public String getTipoplanls() {
        return tipoplanls;
    }

    public void setTipoplanls(String tipoplanls) {
        this.tipoplanls = tipoplanls;
    }

    public String getTipoplanrs() {
        return tipoplanrs;
    }

    public void setTipoplanrs(String tipoplanrs) {
        this.tipoplanrs = tipoplanrs;
    }

    public String getTipoplansl() {
        return tipoplansl;
    }

    public void setTipoplansl(String tipoplansl) {
        this.tipoplansl = tipoplansl;
    }

    public String getTipoplantr() {
        return tipoplantr;
    }

    public void setTipoplantr(String tipoplantr) {
        this.tipoplantr = tipoplantr;
    }

    public Integer getComisiona() {
        return comisiona;
    }

    public void setComisiona(Integer comisiona) {
        this.comisiona = comisiona;
    }

   



}
