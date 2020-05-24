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
public class HtlTiposGrupos {

    BigDecimal club;
    String idgrupo;
    String descripcion;
    String groups;
    BigDecimal activo;
    String direccion;
    String contacto;
    String telefono;
    String email;
    Date   fechabloqueoini;
    Date   fechabloqueofin;

    public HtlTiposGrupos() {
    }
    
    public HtlTiposGrupos( String idgrupo, String descripcion ) {
        this.idgrupo = idgrupo;
        this.descripcion = descripcion;
    }    

    public HtlTiposGrupos(
            BigDecimal club,
            String idgrupo,
            String descripcion,
            String groups,
            BigDecimal activo, 
            String direccion,
            String contacto, 
            String telefono, 
            String email, 
            Date fechabloqueoini, 
            Date fechabloqueofin  ) {
        this.club = club;
        this.idgrupo = idgrupo;
        this.descripcion = descripcion;
        this.groups = groups;
        this.activo = activo;
        this.direccion = direccion;
        this.contacto = contacto;
        this.telefono = telefono;
        this.email = email;
        this.fechabloqueoini = fechabloqueoini;
        this.fechabloqueofin = fechabloqueofin;
    }



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(String idgrupo) {
        this.idgrupo = idgrupo;
    }

    public BigDecimal getActivo() {
        return activo;
    }

    public void setActivo(BigDecimal activo) {
        this.activo = activo;
    }

    public BigDecimal getClub() {
        return club;
    }

    public void setClub(BigDecimal club) {
        this.club = club;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechabloqueofin() {
        return fechabloqueofin;
    }

    public void setFechabloqueofin(Date fechabloqueofin) {
        this.fechabloqueofin = fechabloqueofin;
    }

    public Date getFechabloqueoini() {
        return fechabloqueoini;
    }

    public void setFechabloqueoini(Date fechabloqueoini) {
        this.fechabloqueoini = fechabloqueoini;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

}
