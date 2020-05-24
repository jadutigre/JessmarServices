/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jdelgado
 */
public class HtlServiciosContratados {
    

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");    

    private BigDecimal idservicios;
    private String idservicio;
    private BigDecimal idsubservicio;
    private String idtipopago;
    private BigDecimal cantidad;
    private BigDecimal costo;
    private BigDecimal personas;
    private BigDecimal moneda;
    private Date fechainicial;
    private String sfechainicial;
    private Date fechafinal;
    private String sfechafinal;
    private BigDecimal numsolicitud;
    private String descripcion;
    private BigDecimal total;
    private String iduser;
    private String tipo;
    private String temp;
    private Date fechareg;
    private String sfechareg;
    private String horareg;
    private Integer diapromocion;
    private Integer menorpromocion;
    private Integer cenapromocion;
    private String segmento;
    private BigDecimal comision;
    private String toper;
    private Integer activo;
    private String claveespecial;
    private String nombreespecial;
    private BigDecimal norecibo;
    private String tdpago;
    private String tdcambio;
    private String tdcuenta;
    private Integer folio;
    private String tdtarifa;
    private String ctamaestra;
    private String cfechainicial;
    private String cfechafinal;
    
    private String comisiona;

    public HtlServiciosContratados() {
    }

    public HtlServiciosContratados(BigDecimal idservicios, String idservicio, BigDecimal idsubservicio,
            String idtipopago, BigDecimal cantidad, BigDecimal costo, BigDecimal personas, BigDecimal moneda,
            Date fechainicial, Date fechafinal, BigDecimal numsolicitud, String descripcion, BigDecimal total,
            String iduser, String tipo, String temp, Date fechareg, String horareg, Integer diapromocion,
            Integer menorpromocion, Integer cenapromocion, String segmento, BigDecimal comision, String toper,
            Integer activo, String claveespecial, String nombreespecial, BigDecimal norecibo, String tdpago,
            String tdcambio, String tdcuenta, Integer folio, String tdtarifa,String ctamaestra,
            String cfechainicial,String cfechafinal,String comisiona) {

        this.idservicios = idservicios;
        this.idservicio = idservicio;
        this.idsubservicio = idsubservicio;
        this.idtipopago = idtipopago;
        this.cantidad = cantidad;
        this.costo = costo;
        this.personas = personas;
        this.moneda = moneda;
        this.fechainicial = fechainicial;
        this.fechafinal = fechafinal;
        this.numsolicitud = numsolicitud;
        this.descripcion = descripcion;
        this.total = total;
        this.iduser = iduser;
        this.tipo = tipo;
        this.temp = temp;
        this.fechareg = fechareg;
        this.horareg = horareg;
        this.diapromocion = diapromocion;
        this.menorpromocion = menorpromocion;
        this.cenapromocion = cenapromocion;
        this.segmento = segmento;
        this.comision = comision;
        this.toper = toper;
        this.activo = activo;
        this.claveespecial = claveespecial;
        this.nombreespecial = nombreespecial;
        this.norecibo = norecibo;
        this.tdpago = tdpago;
        this.tdcambio = tdcambio;
        this.tdcuenta = tdcuenta;
        this.folio = folio;
        this.tdtarifa = tdtarifa;
        this.ctamaestra = ctamaestra;
        this.cfechainicial = cfechainicial;
        this.cfechafinal = cfechafinal;
        this.comisiona = comisiona ;
    }


    public Integer getActivo() {
        return (activo==null)?new Integer("0"):activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public BigDecimal getCantidad() {
        return (cantidad==null)?new BigDecimal("0"):cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCenapromocion() {
        return (cenapromocion==null)?new Integer("0"):cenapromocion;
    }

    public void setCenapromocion(Integer cenapromocion) {
        this.cenapromocion = cenapromocion;
    }

    public String getClaveespecial() {
        return (claveespecial==null)?"":claveespecial;
    }

    public void setClaveespecial(String claveespecial) {
        this.claveespecial = claveespecial;
    }

    public BigDecimal getComision() {
        return (comision==null)?new BigDecimal("0"):comision;
    }

    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    public BigDecimal getCosto() {
        return (costo==null)?new BigDecimal("0"):costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return (descripcion==null)?"":descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDiapromocion() {
        return (diapromocion==null)?new Integer("0"):diapromocion;
    }

    public void setDiapromocion(Integer diapromocion) {
        this.diapromocion = diapromocion;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public Date getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(Date fechainicial) {
        this.fechainicial = fechainicial;
    }

    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }

    public Integer getFolio() {
        return (folio==null)?new Integer("0"):folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public String getHorareg() {
        return (horareg==null)?"":horareg;
    }

    public void setHorareg(String horareg) {
        this.horareg = horareg;
    }

    public String getIdservicio() {
        return (idservicio==null)?"":idservicio;
    }

    public void setIdservicio(String idservicio) {
        this.idservicio = idservicio;
    }

    public BigDecimal getIdservicios() {
        return (idservicios==null)?new BigDecimal(0):idservicios;
    }

    public void setIdservicios(BigDecimal idservicios) {
        this.idservicios = idservicios;
    }

    public BigDecimal getIdsubservicio() {
        return (idsubservicio==null)?new BigDecimal("0"):idsubservicio;
    }

    public void setIdsubservicio(BigDecimal idsubservicio) {
        this.idsubservicio = idsubservicio;
    }

    public String getIdtipopago() {
        return (idtipopago==null)?"":idtipopago;
    }

    public void setIdtipopago(String idtipopago) {
        this.idtipopago = idtipopago;
    }

    public String getIduser() {
        return (iduser==null)?"":iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public Integer getMenorpromocion() {
        return menorpromocion;
    }

    public void setMenorpromocion(Integer menorpromocion) {
        this.menorpromocion = menorpromocion;
    }

    public BigDecimal getMoneda() {
        return (moneda==null)?new BigDecimal("0"):moneda;
    }

    public void setMoneda(BigDecimal moneda) {
        this.moneda = moneda;
    }

    public String getNombreespecial() {
        return (nombreespecial==null)?"":nombreespecial;
    }

    public void setNombreespecial(String nombreespecial) {
        this.nombreespecial = nombreespecial;
    }

    public BigDecimal getNorecibo() {
        return (norecibo==null)?new BigDecimal("0"):norecibo;
    }

    public void setNorecibo(BigDecimal norecibo) {
        this.norecibo = norecibo;
    }

    public BigDecimal getNumsolicitud() {
        return (numsolicitud==null)?new BigDecimal("0"):numsolicitud;
    }

    public void setNumsolicitud(BigDecimal numsolicitud) {
        this.numsolicitud = numsolicitud;
    }

    public BigDecimal getPersonas() {
        return (personas==null)?new BigDecimal("0"):personas;
    }

    public void setPersonas(BigDecimal personas) {
        this.personas = personas;
    }

    public String getSegmento() {
        return (segmento==null)?"":segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getTdcambio() {
        return (tdcambio==null)?"":tdcambio;
    }

    public void setTdcambio(String tdcambio) {
        this.tdcambio = tdcambio;
    }

    public String getTdcuenta() {
        return (tdcuenta==null)?"":tdcuenta;
    }

    public void setTdcuenta(String tdcuenta) {
        this.tdcuenta = tdcuenta;
    }

    public String getTdpago() {
        return (tdpago==null)?"":tdpago;
    }

    public void setTdpago(String tdpago) {
        this.tdpago = tdpago;
    }

    public String getTdtarifa() {
        return (tdtarifa==null)?"":tdtarifa;
    }

    public void setTdtarifa(String tdtarifa) {
        this.tdtarifa = tdtarifa;
    }

    public String getTemp() {
        return (temp==null)?"":temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTipo() {
        return (tipo==null)?"":tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getToper() {
        return (toper==null)?"":toper;
    }

    public void setToper(String toper) {
        this.toper = toper;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * @return the ctamaestra
     */
    public String getCtamaestra() {
        return (ctamaestra==null)?"":ctamaestra;
    }

    /**
     * @param ctamaestra the ctamaestra to set
     */
    public void setCtamaestra(String ctamaestra) {
        this.ctamaestra = ctamaestra;
    }

    /**
     * @return the cfechainicial
     */
    public String getCfechainicial() {
        return (cfechainicial==null)?"":cfechainicial;
    }

    /**
     * @param cfechainicial the cfechainicial to set
     */
    public void setCfechainicial(String cfechainicial) {
        this.cfechainicial = cfechainicial;
    }

    /**
     * @return the cfechafinal
     */
    public String getCfechafinal() {
        return (cfechafinal==null)?"":cfechafinal;
    }

    /**
     * @param cfechafinal the cfechafinal to set
     */
    public void setCfechafinal(String cfechafinal) {
        this.cfechafinal = cfechafinal;
    }
    
    
    
    

    public String getSfechainicial() {
        return (this.fechainicial!=null)?sdf.format(this.fechainicial):null;
    }

    public void setSfechainicial(String sfechainicial) {
        this.sfechainicial =(this.fechainicial!=null)?sdf.format(this.fechainicial):null;
    }

    public String getSfechafinal() {
        return (this.fechafinal!=null)?sdf.format(this.fechafinal):null;
    }

    public void setSfechafinal(String sfechafinal) {
        this.sfechafinal = (this.fechafinal!=null)?sdf.format(this.fechafinal):null;
    }

    public String getSfechareg() {
        return (this.fechareg!=null)?sdf.format(this.fechareg):null;
    }

    public void setSfechareg(String sfechareg) {
        this.sfechareg = (this.fechareg!=null)?sdf.format(this.fechareg):null;
    }

    public String getComisiona() {
        return comisiona;
    }

    public void setComisiona(String comisiona) {
        this.comisiona = comisiona;
    }

     


}
