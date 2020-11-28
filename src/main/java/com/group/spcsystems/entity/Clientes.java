/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.entity;

import java.math.BigDecimal;

/**
 *
 * @author mrivero
 */
public class Clientes {
    
    Integer id;
    Double iva;
    Long nucta;
    String telefono;
    String rfc;
    String nombre;
    String razonsocial;
    String email;
    String observ;
    String direccion;
    String ciudad;
    Long diascred;
    String noint;
    String noext;
    String codigopost;
    String colonia;
    String municipio;
    Integer pais_id;
    Integer estado_id;
    Integer usocfdi_id;
    
    public Clientes(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Long getNucta() {
        return nucta;
    }

    public void setNucta(Long nucta) {
        this.nucta = nucta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Long getDiascred() {
        return diascred;
    }

    public void setDiascred(Long diascred) {
        this.diascred = diascred;
    }

    public String getNoext() {
        return noext;
    }

    public void setNoext(String noext) {
        this.noext = noext;
    }

    public String getCodigopost() {
        return codigopost;
    }

    public void setCodigopost(String codigopost) {
        this.codigopost = codigopost;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Integer getPais_id() {
        return pais_id;
    }

    public void setPais_id(Integer pais_id) {
        this.pais_id = pais_id;
    }

    public Integer getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(Integer estado_id) {
        this.estado_id = estado_id;
    }

    public Integer getUsocfdi_id() {
        return usocfdi_id;
    }

    public void setUsocfdi_id(Integer usocfdi_id) {
        this.usocfdi_id = usocfdi_id;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNoint() {
        return noint;
    }

    public void setNoint(String noint) {
        this.noint = noint;
    }
    
    


}
