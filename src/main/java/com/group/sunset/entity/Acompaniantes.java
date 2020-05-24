/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

/**
 *
 * @author jdelgado
 */
public class Acompaniantes
{

    public Acompaniantes()
    {
    }

    public int getClub()
    {
        return club;
    }


    public void setClub(int club)
    {
        this.club = club;
    }

    public void setIdcliente(int idcliente)
    {
        this.idcliente = idcliente;
    }

    public int getIdcliente()
    {
        return idcliente;
    }

    public void setIdacompaniantes(int idacompaniantes)
    {
        this.idacompaniantes = idacompaniantes;
    }

    public int getIdacompaniantes()
    {
        return idacompaniantes;
    }

    public void setNombre(String nombre)
    {
        this.nombre = (nombre == null) ? "" : ( (nombre.length()<70) ? nombre.toUpperCase() : nombre.toUpperCase().substring(0,70) ) ;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = (direccion == null) ? "" :  ( ( direccion.length() < 70 ) ? direccion.toUpperCase() : direccion.toUpperCase().substring(0,70) ) ;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setCiudad(String ciudad)
    {
        this.ciudad = (ciudad == null) ? "" : ( (ciudad.length() < 25) ? ciudad.toUpperCase() : ciudad.toUpperCase().substring(0,25) );
    }

    public String getCiudad()
    {
        return ciudad;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = (telefono == null) ? "" :   ( (telefono.length()<25) ? telefono.toUpperCase() : telefono.toUpperCase().substring(0,25) );
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setNomcia(String nomcia)
    {
        this.nomcia = (nomcia == null) ? "" :  ( ( nomcia.length()<70 ) ? nomcia.toUpperCase() :  nomcia.toUpperCase().substring(0,70) );
    }

    public String getNomcia()
    {
        return nomcia;
    }

    public void setDircia(String dircia)
    {
        this.dircia = (dircia == null) ? "" : ( (dircia.length()<70) ? dircia.toUpperCase() : dircia.toUpperCase().substring(0,70) );
    }

    public String getDircia()
    {
        return dircia;
    }

    public void setCiucia(String ciucia)
    {
        this.ciucia = (ciucia == null) ? "" :   ( ( ciucia.length()<25 ) ? ciucia.toUpperCase() : ciucia.toUpperCase().substring(0,25) );
    }

    public String getCiucia()
    {
        return ciucia;
    }

    public void setTelcia(String telcia)
    {
        this.telcia = ( telcia == null ) ? "" : ( (telcia.length()<25) ? telcia.toUpperCase() : telcia.toUpperCase().substring(0,25) );
    }

    public String getTelcia()
    {
        return telcia;
    }
    
    public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
        this.parentesco = ( parentesco == null ) ? "" : ( (parentesco.length()<35) ? parentesco.toUpperCase() : parentesco.toUpperCase().substring(0,35) );
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
        this.ocupacion = ( ocupacion == null ) ? "" : ( (ocupacion.length()<35) ? ocupacion.toUpperCase() : ocupacion.toUpperCase().substring(0,35) );
	}
    

    private int club;
    private int idcliente;
    private int idacompaniantes;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String nomcia;
    private String dircia;
    private String ciucia;
    private String telcia;
    private String edad;
    private String parentesco;
    private String ocupacion;
    
}