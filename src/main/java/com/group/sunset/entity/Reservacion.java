/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;


import java.util.Date;
import java.util.List;

public class Reservacion  {

    String tipoHabitacionID;
    Date fechaEntrada;
    Date fechaSalida;
    Date fechaReserva;
    String status;
    String nombre;
    String direccion;
    String ciudad;
    String estado;
    String pais;
    String compania;
    String dirCIA;
    String ciudadCIA;
    String rfc;
    String segmento;
    String agencia;
    String ciaHuesped;
    String grupo;
    String paquete;
    String tarifa;
    String formaPago;
    String planViaje;
    String obs1;
    String obs2;
    String obs3;
    String passSupervisor;
    String passUser;
    String horamovto;
    boolean garantizada;
    int adultos;
    int numeroHabitaciones;
    int numcancelacion;
    int ninios;
    boolean comisionable;
    int numreservacion;
    String email1;
    String email2;
    String telefono;
    int moneda;
    int numeroclub;
    String idUser;
    int numSolicitud;
    boolean split;
    Integer niniosFree;
    
    List<Depositos> depositos;   
    
    String origen;
    String motivo;

    public Reservacion() {

    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public String getAgencia() {
        return (agencia==null)?"":agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCiaHuesped() {
        return (ciaHuesped==null)?"":ciaHuesped;
    }

    public void setCiaHuesped(String ciaHuesped) {
        this.ciaHuesped = ciaHuesped;
    }

    public String getCiudad() {
        return (ciudad==null)?"":ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudadCIA() {
        return (ciudadCIA==null)?"":ciudadCIA;
    }

    public void setCiudadCIA(String ciudadCIA) {
        this.ciudadCIA = ciudadCIA;
    }

    public boolean isComisionable() {
        return comisionable;
    }

    public void setComisionable(boolean comisionable) {
        this.comisionable = comisionable;
    }

    public String getCompania() {
        return (compania==null)?"":compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getDirCIA() {
        return (dirCIA==null)?"":dirCIA;
    }

    public void setDirCIA(String dirCIA) {
        this.dirCIA = dirCIA;
    }

    public String getDireccion() {
        return (direccion==null)?"":direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail1() {
        return (email1==null)?"":email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return (email2==null)?"":email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEstado() {
        return (estado==null)?"":estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFormaPago() {
        return (formaPago==null)?"":formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public boolean isGarantizada() {
        return garantizada;
    }

    public void setGarantizada(boolean garantizada) {
        this.garantizada = garantizada;
    }

    public String getGrupo() {
        return (grupo==null)?"":grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getHoramovto() {
        return (horamovto==null)?"":horamovto;
    }

    public void setHoramovto(String horamovto) {
        this.horamovto = horamovto;
    }

    public String getIdUser() {
        return (idUser==null)?"":idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getNinios() {
        return ninios;
    }

    public void setNinios(int ninios) {
        this.ninios = ninios;
    }

    public Integer getNiniosFree() {
        return (niniosFree==null)?new Integer(0):niniosFree;
    }

    public void setNiniosFree(Integer niniosFree) {
        this.niniosFree = niniosFree;
    }

    public String getNombre() {
        return (nombre==null)?"":nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSolicitud() {
        return numSolicitud;
    }

    public void setNumSolicitud(int numSolicitud) {
        this.numSolicitud = numSolicitud;
    }

    public int getNumcancelacion() {
        return numcancelacion;
    }

    public void setNumcancelacion(int numcancelacion) {
        this.numcancelacion = numcancelacion;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroclub() {
        return numeroclub;
    }

    public void setNumeroclub(int numeroclub) {
        this.numeroclub = numeroclub;
    }

    public int getNumreservacion() {
        return numreservacion;
    }

    public void setNumreservacion(int numreservacion) {
        this.numreservacion = numreservacion;
    }

    public String getObs1() {
        return (obs1==null)?"":obs1;
    }

    public void setObs1(String obs1) {
        this.obs1 = obs1;
    }

    public String getObs2() {
        return (obs2==null)?"":obs2;
    }

    public void setObs2(String obs2) {
        this.obs2 = obs2;
    }

    public String getObs3() {
        return (obs3==null)?"":obs3;
    }

    public void setObs3(String obs3) {
        this.obs3 = obs3;
    }

    public String getPais() {
        return (pais==null)?"":pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPaquete() {
        return (paquete==null)?"":paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getPassSupervisor() {
        return (passSupervisor==null)?"":passSupervisor;
    }

    public void setPassSupervisor(String passSupervisor) {
        this.passSupervisor = passSupervisor;
    }

    public String getPassUser() {
        return (passUser==null)?"":passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public String getPlanViaje() {
        return (planViaje==null)?"":planViaje;
    }

    public void setPlanViaje(String planViaje) {
        this.planViaje = planViaje;
    }

    public String getRfc() {
        return (rfc==null)?"":rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getSegmento() {
        return (segmento==null)?"":segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public boolean isSplit() {
        return split;
    }

    public void setSplit(boolean split) {
        this.split = split;
    }

    public String getStatus() {
        return (status==null)?"":status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTarifa() {
        return (tarifa==null)?"0":tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getTipoHabitacionID() {
        return (tipoHabitacionID==null)?"":tipoHabitacionID;
    }

    public void setTipoHabitacionID(String tipoHabitacionID) {
        this.tipoHabitacionID = tipoHabitacionID;
    }

    public String getTelefono() {
        return (telefono==null)?"":telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Depositos> getDepositos() {
        return depositos;
    }

    public void setDepositos(List<Depositos> depositos) {
        this.depositos = depositos;
    }

    public String getOrigen() {
        return (origen==null)?"":origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
    


   
}
