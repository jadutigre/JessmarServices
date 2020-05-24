/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.math.BigDecimal;

/**
 *
 * @author jdelgado
 */
public class HtlCliente {

    private BigDecimal club;
    private BigDecimal idcliente;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String emailhogar;
    private String emailnegocios;
    private String nomcia;
    private String dircia;
    private String ciudadcia;
    private String rfc;
    private String obs1;
    private String obs2;
    private String obs3;
    private String idpais;
    private String idestado;
    private BigDecimal garantizada;
    private String springbreak;
    private String tipo;

    private BigDecimal idhabitacion;
    private BigDecimal adultos;
    private BigDecimal ninios;

    private String idpaquete;
    private String idagencia;
    private String idsegmento;
    private String idocupacion;
    private String descocupacion;
    
    private BigDecimal idhuesped;
    
    private String membresia;
    private String folmembresia;


    public HtlCliente() {
    }

    public HtlCliente(BigDecimal club, BigDecimal idcliente, String nombre, String direccion,
            String ciudad, String telefono, String emailhogar, String emailnegocios,
            String nomcia, String dircia, String ciudadcia, String rfc, String obs1,
            String obs2, String obs3, String idpais, String idestado, BigDecimal garantizada,
            String springbreak, String tipo,
            BigDecimal idhabitacion,BigDecimal adultos, BigDecimal ninios,
            String idpaquete,String idagencia,String idsegmento,
            String idocupacion,String descocupacion) {
        this.club = club;
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.emailhogar = emailhogar;
        this.emailnegocios = emailnegocios;
        this.nomcia = nomcia;
        this.dircia = dircia;
        this.ciudadcia = ciudadcia;
        this.rfc = rfc;
        this.obs1 = obs1;
        this.obs2 = obs2;
        this.obs3 = obs3;
        this.idpais = idpais;
        this.idestado = idestado;
        this.garantizada = garantizada;
        this.springbreak = springbreak;
        this.tipo = tipo;

        this.idhabitacion=idhabitacion;
        this.adultos=adultos;
        this.ninios=ninios;

        this.idpaquete=idpaquete;
        this.idagencia=idagencia;
        this.idsegmento=idsegmento;
        this.idocupacion=idocupacion;
        this.descocupacion=descocupacion;

    }

    
public HtlCliente(BigDecimal club, BigDecimal idcliente, String nombre, String direccion,
            String ciudad, String telefono, String emailhogar, String emailnegocios,
            String nomcia, String dircia, String ciudadcia, String rfc, String obs1,
            String obs2, String obs3, String idpais, String idestado, BigDecimal garantizada,
            String springbreak, String tipo,
            BigDecimal idhabitacion,BigDecimal adultos, BigDecimal ninios,
            String idpaquete,String idagencia,String idsegmento,BigDecimal idhuesped,
            String idocupacion,String descocupacion, String membresia, String folmembresia) {
        this.club = club;
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.emailhogar = emailhogar;
        this.emailnegocios = emailnegocios;
        this.nomcia = nomcia;
        this.dircia = dircia;
        this.ciudadcia = ciudadcia;
        this.rfc = rfc;
        this.obs1 = obs1;
        this.obs2 = obs2;
        this.obs3 = obs3;
        this.idpais = idpais;
        this.idestado = idestado;
        this.garantizada = garantizada;
        this.springbreak = springbreak;
        this.tipo = tipo;

        this.idhabitacion=idhabitacion;
        this.adultos=adultos;
        this.ninios=ninios;

        this.idpaquete=idpaquete;
        this.idagencia=idagencia;
        this.idsegmento=idsegmento;
        
        this.idhuesped=idhuesped;
        
        this.idocupacion=idocupacion;
        this.descocupacion=descocupacion;
        
        this.membresia = membresia;
        this.folmembresia = folmembresia;

    }    
    
    
    
    
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudadcia() {
        return ciudadcia;
    }

    public void setCiudadcia(String ciudadcia) {
        this.ciudadcia = ciudadcia;
    }

    public BigDecimal getClub() {
        return club;
    }

    public void setClub(BigDecimal club) {
        this.club = club;
    }

    public String getDircia() {
        return dircia;
    }

    public void setDircia(String dircia) {
        this.dircia = dircia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public BigDecimal getGarantizada() {
        return garantizada;
    }

    public void setGarantizada(BigDecimal garantizada) {
        this.garantizada = garantizada;
    }

    public BigDecimal getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(BigDecimal idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdestado() {
        return idestado;
    }

    public void setIdestado(String idestado) {
        this.idestado = idestado;
    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNomcia() {
        return nomcia;
    }

    public void setNomcia(String nomcia) {
        this.nomcia = nomcia;
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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getSpringbreak() {
        return springbreak;
    }

    public void setSpringbreak(String springbreak) {
        this.springbreak = springbreak;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the idhabitacion
     */
    public BigDecimal getIdhabitacion() {
        return idhabitacion;
    }

    /**
     * @param idhabitacion the idhabitacion to set
     */
    public void setIdhabitacion(BigDecimal idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    /**
     * @return the adultos
     */
    public BigDecimal getAdultos() {
        return adultos;
    }

    /**
     * @param adultos the adultos to set
     */
    public void setAdultos(BigDecimal adultos) {
        this.adultos = adultos;
    }

    /**
     * @return the ninios
     */
    public BigDecimal getNinios() {
        return ninios;
    }

    /**
     * @param ninios the ninios to set
     */
    public void setNinios(BigDecimal ninios) {
        this.ninios = ninios;
    }
    
    public String getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(String idagencia) {
        this.idagencia = idagencia;
    }

    public String getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(String idpaquete) {
        this.idpaquete = idpaquete;
    }

    public String getIdsegmento() {
        return idsegmento;
    }

    public void setIdsegmento(String idsegmento) {
        this.idsegmento = idsegmento;
    }

    public BigDecimal getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(BigDecimal idhuesped) {
        this.idhuesped = idhuesped;
    }

    public String getIdocupacion() {
        return idocupacion;
    }

    public void setIdocupacion(String idocupacion) {
        this.idocupacion = idocupacion;
    }

    public String getDescocupacion() {
        return descocupacion;
    }

    public void setDescocupacion(String descocupacion) {
        this.descocupacion = descocupacion;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public String getFolmembresia() {
        return folmembresia;
    }

    public void setFolmembresia(String folmembresia) {
        this.folmembresia = folmembresia;
    }




    



}
