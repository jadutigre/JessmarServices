/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.util.Date;

/**
 *
 * @author jdelgado
 */
public class HtlAnticiposyCargos {


    private int club;
    private int idcliente;
    private int idcargos;
    private int huesped;
    private int grupo;
    private int numero;
    private int reserva;
    private int cuarto;
    private int cuenta;
    private double cargo;
    private double credito;
    private int status;
    private Date fecha;
    private String referencia;
    private String usuario;
    private String cage;
    private int factura;
    private int numeroref;
    private int habitacion;
    private int cliente;
    private String paquete;
    private int folpaq;
    private int numhues;
    private int keymovtos;
    private Date fechaaplicacion;
    private int multiformato;
    private Date fechacierre;
    private int personas;
    private double tarifa;
    private String tpersonas;
    private String tcambio;
    
    private String sfecha;
    private String sfechaaplicacion;
    private String sfechacierre;

    public HtlAnticiposyCargos() {
    }

    public HtlAnticiposyCargos(int club, int idcliente, int idcargos, int huesped, int grupo, int numero, int reserva, int cuarto, int cuenta, double cargo, double credito, int status, Date fecha, String referencia, String usuario, String cage, int factura, int numeroref, int habitacion, int cliente, String paquete, int folpaq, int numhues, int keymovtos, Date fechaaplicacion, int multiformato, Date fechacierre, int personas, double tarifa, String tpersonas, String tcambio) {
        this.club = club;
        this.idcliente = idcliente;
        this.idcargos = idcargos;
        this.huesped = huesped;
        this.grupo = grupo;
        this.numero = numero;
        this.reserva = reserva;
        this.cuarto = cuarto;
        this.cuenta = cuenta;
        this.cargo = cargo;
        this.credito = credito;
        this.status = status;
        this.fecha = fecha;
        this.referencia = referencia;
        this.usuario = usuario;
        this.cage = cage;
        this.factura = factura;
        this.numeroref = numeroref;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.paquete = paquete;
        this.folpaq = folpaq;
        this.numhues = numhues;
        this.keymovtos = keymovtos;
        this.fechaaplicacion = fechaaplicacion;
        this.multiformato = multiformato;
        this.fechacierre = fechacierre;
        this.personas = personas;
        this.tarifa = tarifa;
        this.tpersonas = tpersonas;
        this.tcambio = tcambio;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getClub() {
        return club;
    }

    public void setClub(int club) {
        this.club = club;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public int getCuarto() {
        return cuarto;
    }

    public void setCuarto(int cuarto) {
        this.cuarto = cuarto;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaaplicacion() {
        return fechaaplicacion;
    }

    public void setFechaaplicacion(Date fechaaplicacion) {
        this.fechaaplicacion = fechaaplicacion;
    }

    public Date getFechacierre() {
        return fechacierre;
    }

    public void setFechacierre(Date fechacierre) {
        this.fechacierre = fechacierre;
    }

    public int getFolpaq() {
        return folpaq;
    }

    public void setFolpaq(int folpaq) {
        this.folpaq = folpaq;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getHuesped() {
        return huesped;
    }

    public void setHuesped(int huesped) {
        this.huesped = huesped;
    }

    public int getIdcargos() {
        return idcargos;
    }

    public void setIdcargos(int idcargos) {
        this.idcargos = idcargos;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getKeymovtos() {
        return keymovtos;
    }

    public void setKeymovtos(int keymovtos) {
        this.keymovtos = keymovtos;
    }

    public int getMultiformato() {
        return multiformato;
    }

    public void setMultiformato(int multiformato) {
        this.multiformato = multiformato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroref() {
        return numeroref;
    }

    public void setNumeroref(int numeroref) {
        this.numeroref = numeroref;
    }

    public int getNumhues() {
        return numhues;
    }

    public void setNumhues(int numhues) {
        this.numhues = numhues;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getTcambio() {
        return tcambio;
    }

    public void setTcambio(String tcambio) {
        this.tcambio = tcambio;
    }

    public String getTpersonas() {
        return tpersonas;
    }

    public void setTpersonas(String tpersonas) {
        this.tpersonas = tpersonas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSfecha() {
        return sfecha;
    }

    public void setSfecha(String sfecha) {
        this.sfecha = sfecha;
    }

    public String getSfechaaplicacion() {
        return sfechaaplicacion;
    }

    public void setSfechaaplicacion(String sfechaaplicacion) {
        this.sfechaaplicacion = sfechaaplicacion;
    }

    public String getSfechacierre() {
        return sfechacierre;
    }

    public void setSfechacierre(String sfechacierre) {
        this.sfechacierre = sfechacierre;
    }
    
    


}
