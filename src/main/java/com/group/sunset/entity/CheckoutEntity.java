/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity;

import java.util.List;

/**
 *
 * @author jdelgado
 */
public class CheckoutEntity {
    
    String idestatus;
    String idcliente;
    String fhaent;
    String fhasal;
    String nombre;
    String direccion;
    String ciudad;
    String obs1;
    String obs2;
    String obs3;
    String nomcia;
    String dircia;
    String ciudadcia;
    String idtipohabit;
    String idagencia;
    String formapago;
    String idhuesped;
    String comentarios;
    String credito;
    String idhabitacion;
    String rfc;
    String emailhogar;
    String emailnegocios;
    String telefonohogar;
    String telefononegocios;
    String idpais;  
    String idreserva;
    
    /* Cta maestra */
    String idctama;
    String descripcion;
    String nohuesped;
    
    String noadultos;
    String noninios;
    
    String club;
    String idestado;
    String cpostal;
    String cpostalcia;
    
    
    
    List<Acompaniantes> acompaniantes;
    

    public CheckoutEntity() {
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getIdestado() {
        return idestado;
    }

    public void setIdestado(String idestado) {
        this.idestado = idestado;
    }

    public String getCpostal() {
        return cpostal;
    }

    public void setCpostal(String cpostal) {
        this.cpostal = cpostal;
    }

    public String getCpostalcia() {
        return cpostalcia;
    }

    public void setCpostalcia(String cpostalcia) {
        this.cpostalcia = cpostalcia;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getObs1() {
        return obs1;
    }

    public void setObs1(String obs1) {
        this.obs1 = obs1;
    }

    public String getObs2() {
        return obs2;
    }

    public void setObs2(String obs2) {
        this.obs2 = obs2;
    }

    public String getObs3() {
        return obs3;
    }

    public void setObs3(String obs3) {
        this.obs3 = obs3;
    }

    public String getNomcia() {
        return nomcia;
    }

    public void setNomcia(String nomcia) {
        this.nomcia = nomcia;
    }

    public String getDircia() {
        return dircia;
    }

    public void setDircia(String dircia) {
        this.dircia = dircia;
    }

    public String getCiudadcia() {
        return ciudadcia;
    }

    public void setCiudadcia(String ciudadcia) {
        this.ciudadcia = ciudadcia;
    }

    public String getIdtipohabit() {
        return idtipohabit;
    }

    public void setIdtipohabit(String idtipohabit) {
        this.idtipohabit = idtipohabit;
    }

    public String getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(String idagencia) {
        this.idagencia = idagencia;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public String getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(String idhuesped) {
        this.idhuesped = idhuesped;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(String idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getIdctama() {
        return idctama;
    }

    public void setIdctama(String idctama) {
        this.idctama = idctama;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNohuesped() {
        return nohuesped;
    }

    public void setNohuesped(String nohuesped) {
        this.nohuesped = nohuesped;
    }

    public String getEmailhogar() {
        return emailhogar;
    }

    public void setEmailhogar(String emailhogar) {
        this.emailhogar = emailhogar;
    }

    public String getEmailnegocios() {
        return emailnegocios;
    }

    public void setEmailnegocios(String emailnegocios) {
        this.emailnegocios = emailnegocios;
    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
    }

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public List<Acompaniantes> getAcompaniantes() {
        return acompaniantes;
    }

    public void setAcompaniantes(List<Acompaniantes> acompaniantes) {
        this.acompaniantes = acompaniantes;
    }

    public String getTelefonohogar() {
        return telefonohogar;
    }

    public void setTelefonohogar(String telefonohogar) {
        this.telefonohogar = telefonohogar;
    }

    public String getTelefononegocios() {
        return telefononegocios;
    }

    public void setTelefononegocios(String telefononegocios) {
        this.telefononegocios = telefononegocios;
    }

    public String getNoadultos() {
        return noadultos;
    }

    public void setNoadultos(String noadultos) {
        this.noadultos = noadultos;
    }

    public String getNoninios() {
        return noninios;
    }

    public void setNoninios(String noninios) {
        this.noninios = noninios;
    }
    
    
    
    
}
