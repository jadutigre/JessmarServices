/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author jdelgado
 */
public class HtlReservaHotel {

	private ArrayList<HtlPulseras> vecpul;
	private ArrayList<Acompaniantes> vecaco;
	private ArrayList<CargosExtras> veccar;
	private ArrayList<HtlServiciosContratados> vecsercon;
        private ArrayList vecdepositos;
	private int idcliente;
	private String nombre;
        private String apellido;
	private String direccion;
	private String ciudad;
	private String telefono;
	private String emailhogar;
	private String emailnegocios;
	private String idagencia = "";
	private String idsegmento = "";
	private String idpaquete = "";
	private String idcompania = "";
	private String nomcia;
	private String ciudadcia;
	private String dircia;
	private String rfc;
	private String obs1;
	private String obs2;
	private String obs3;
	private String idgrupo = "";
	private String pais = "";
	private int garantizada;
	private int idreserva;

	private Date fechareserva;
	private Date fechacancela;
	private Date fechaentrada;
	private Date fechasalida;

	private int noadultos;
	private int noninios;
	private String idstatus;
	private String supervisor;
	private String usuarioregistro;
	private int idhabitacion;
	private int idhabitorig;
	private int idhuesped;
	private int idvip;
	private String horaentrada;
	private String horasalida;
	private String registroentrada;
	private String registrosalida;

	private int cantidad;
	private String tarifa;
	private int moneda;
	private String idtipohabit;
	private String idtipohabitorig;
	private String formapago;
	private String planviaje;
	private int ucantidad;
	private Date ucheckin;
	private Date ucheckout;
	private int uclub;
	private String confirmacion;
	private String confirmacion2;
	private int numsolicitud;
	private String tiposemana;
	private String unidad;
	private int numcancela;
	private String credito;
	private String comision;
	private String cajasegu;
	private String estado = "";
	private String comentarios;
	private String tarjetacredito;
	private String fechavencto;
	private String pendiente1;
	private String pendiente2;
	private String tipohuesped;
	private String procgeograf;
	private String unidad2;
	private String ocupacion;
	private String localizacion;
	private String folio1;
	private String folio2;
	private String folio3;
	private int ctarfol;
	private int ctarmae;
	private double impcredito;
	private double tarifanumber;
        private String nomembresia;
        private String motivo;
        private String ccomision;
        private Boolean split;

        private String clavehabitacion;
        private String cpsocio;
        private String cpcia;
        private String clavetarifa;
        private int    noadolecentes;
        private String idUser;

        private String tcredito;
        private String fexpiracion;
        private String cseguridad;



        private String horaRentrada;
        private String horaRsalida;
        private String tipoRvip;
        private String contacto;
        private String telefonocia;
        private Boolean aj;
        private Boolean am;
        private Boolean an;
        private Boolean cn;
        private Boolean hy;
        private Boolean cr;
        private Boolean dd;
        private Boolean hi;
        private Boolean kg;
        private Boolean li;
        private Boolean lo;
        private Boolean lf;
        private Boolean pk;

        private String tabtar;
        private String tipoReserva;
        private String mercado;
        private String areainflu;

        private Integer statuliga;
        private Integer habitliga;
        
        private String ciamunicipio;
        private String ciaestado; 
        private String origen;
        
        
        

    public Boolean getAj() {
        return aj;
    }

    public void setAj(Boolean aj) {
        this.aj = aj;
    }

    public Boolean getAm() {
        return am;
    }

    public void setAm(Boolean am) {
        this.am = am;
    }

    public Boolean getAn() {
        return an;
    }

    public void setAn(Boolean an) {
        this.an = an;
    }

    public String getAreainflu() {
        return areainflu;
    }

    public void setAreainflu(String areainflu) {
        this.areainflu = areainflu;
    }

    public String getCajasegu() {
        return cajasegu;
    }

    public void setCajasegu(String cajasegu) {
        this.cajasegu = cajasegu;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCcomision() {
        return ccomision;
    }

    public void setCcomision(String ccomision) {
        this.ccomision = ccomision;
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

    public String getClavehabitacion() {
        return clavehabitacion;
    }

    public void setClavehabitacion(String clavehabitacion) {
        this.clavehabitacion = clavehabitacion;
    }

    public String getClavetarifa() {
        return clavetarifa;
    }

    public void setClavetarifa(String clavetarifa) {
        this.clavetarifa = clavetarifa;
    }

    public Boolean getCn() {
        return cn;
    }

    public void setCn(Boolean cn) {
        this.cn = cn;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

    public String getConfirmacion2() {
        return confirmacion2;
    }

    public void setConfirmacion2(String confirmacion2) {
        this.confirmacion2 = confirmacion2;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCpcia() {
        return cpcia;
    }

    public void setCpcia(String cpcia) {
        this.cpcia = cpcia;
    }

    public String getCpsocio() {
        return cpsocio;
    }

    public void setCpsocio(String cpsocio) {
        this.cpsocio = cpsocio;
    }

    public Boolean getCr() {
        return cr;
    }

    public void setCr(Boolean cr) {
        this.cr = cr;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getCseguridad() {
        return cseguridad;
    }

    public void setCseguridad(String cseguridad) {
        this.cseguridad = cseguridad;
    }

    public int getCtarfol() {
        return ctarfol;
    }

    public void setCtarfol(int ctarfol) {
        this.ctarfol = ctarfol;
    }

    public int getCtarmae() {
        return ctarmae;
    }

    public void setCtarmae(int ctarmae) {
        this.ctarmae = ctarmae;
    }

    public Boolean getDd() {
        return dd;
    }

    public void setDd(Boolean dd) {
        this.dd = dd;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechacancela() {
        return fechacancela;
    }

    public void setFechacancela(Date fechacancela) {
        this.fechacancela = fechacancela;
    }

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public Date getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(Date fechareserva) {
        this.fechareserva = fechareserva;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getFechavencto() {
        return fechavencto;
    }

    public void setFechavencto(String fechavencto) {
        this.fechavencto = fechavencto;
    }

    public String getFexpiracion() {
        return fexpiracion;
    }

    public void setFexpiracion(String fexpiracion) {
        this.fexpiracion = fexpiracion;
    }

    public String getFolio1() {
        return folio1;
    }

    public void setFolio1(String folio1) {
        this.folio1 = folio1;
    }

    public String getFolio2() {
        return folio2;
    }

    public void setFolio2(String folio2) {
        this.folio2 = folio2;
    }

    public String getFolio3() {
        return folio3;
    }

    public void setFolio3(String folio3) {
        this.folio3 = folio3;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public int getGarantizada() {
        return garantizada;
    }

    public void setGarantizada(int garantizada) {
        this.garantizada = garantizada;
    }

    public Integer getHabitliga() {
        return habitliga;
    }

    public void setHabitliga(Integer habitliga) {
        this.habitliga = habitliga;
    }

    public Boolean getHi() {
        return hi;
    }

    public void setHi(Boolean hi) {
        this.hi = hi;
    }

    public String getHoraRentrada() {
        return horaRentrada;
    }

    public void setHoraRentrada(String horaRentrada) {
        this.horaRentrada = horaRentrada;
    }

    public String getHoraRsalida() {
        return horaRsalida;
    }

    public void setHoraRsalida(String horaRsalida) {
        this.horaRsalida = horaRsalida;
    }

    public String getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(String horaentrada) {
        this.horaentrada = horaentrada;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    public Boolean getHy() {
        return hy;
    }

    public void setHy(Boolean hy) {
        this.hy = hy;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(String idagencia) {
        this.idagencia = idagencia;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdcompania() {
        return idcompania;
    }

    public void setIdcompania(String idcompania) {
        this.idcompania = idcompania;
    }

    public String getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(String idgrupo) {
        this.idgrupo = idgrupo;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public int getIdhabitorig() {
        return idhabitorig;
    }

    public void setIdhabitorig(int idhabitorig) {
        this.idhabitorig = idhabitorig;
    }

    public int getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(int idhuesped) {
        this.idhuesped = idhuesped;
    }

    public String getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(String idpaquete) {
        this.idpaquete = idpaquete;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public String getIdsegmento() {
        return idsegmento;
    }

    public void setIdsegmento(String idsegmento) {
        this.idsegmento = idsegmento;
    }

    public String getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(String idstatus) {
        this.idstatus = idstatus;
    }

    public String getIdtipohabit() {
        return idtipohabit;
    }

    public void setIdtipohabit(String idtipohabit) {
        this.idtipohabit = idtipohabit;
    }

    public String getIdtipohabitorig() {
        return idtipohabitorig;
    }

    public void setIdtipohabitorig(String idtipohabitorig) {
        this.idtipohabitorig = idtipohabitorig;
    }

    public int getIdvip() {
        return idvip;
    }

    public void setIdvip(int idvip) {
        this.idvip = idvip;
    }

    public double getImpcredito() {
        return impcredito;
    }

    public void setImpcredito(double impcredito) {
        this.impcredito = impcredito;
    }

    public Boolean getKg() {
        return kg;
    }

    public void setKg(Boolean kg) {
        this.kg = kg;
    }

    public Boolean getLf() {
        return lf;
    }

    public void setLf(Boolean lf) {
        this.lf = lf;
    }

    public Boolean getLi() {
        return li;
    }

    public void setLi(Boolean li) {
        this.li = li;
    }

    public Boolean getLo() {
        return lo;
    }

    public void setLo(Boolean lo) {
        this.lo = lo;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getNoadolecentes() {
        return noadolecentes;
    }

    public void setNoadolecentes(int noadolecentes) {
        this.noadolecentes = noadolecentes;
    }

    public int getNoadultos() {
        return noadultos;
    }

    public void setNoadultos(int noadultos) {
        this.noadultos = noadultos;
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

    public String getNomembresia() {
        return nomembresia;
    }

    public void setNomembresia(String nomembresia) {
        this.nomembresia = nomembresia;
    }

    public int getNoninios() {
        return noninios;
    }

    public void setNoninios(int noninios) {
        this.noninios = noninios;
    }

    public int getNumcancela() {
        return numcancela;
    }

    public void setNumcancela(int numcancela) {
        this.numcancela = numcancela;
    }

    public int getNumsolicitud() {
        return numsolicitud;
    }

    public void setNumsolicitud(int numsolicitud) {
        this.numsolicitud = numsolicitud;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPendiente1() {
        return pendiente1;
    }

    public void setPendiente1(String pendiente1) {
        this.pendiente1 = pendiente1;
    }

    public String getPendiente2() {
        return pendiente2;
    }

    public void setPendiente2(String pendiente2) {
        this.pendiente2 = pendiente2;
    }

    public Boolean getPk() {
        return pk;
    }

    public void setPk(Boolean pk) {
        this.pk = pk;
    }

    public String getPlanviaje() {
        return planviaje;
    }

    public void setPlanviaje(String planviaje) {
        this.planviaje = planviaje;
    }

    public String getProcgeograf() {
        return procgeograf;
    }

    public void setProcgeograf(String procgeograf) {
        this.procgeograf = procgeograf;
    }

    public String getRegistroentrada() {
        return registroentrada;
    }

    public void setRegistroentrada(String registroentrada) {
        this.registroentrada = registroentrada;
    }

    public String getRegistrosalida() {
        return registrosalida;
    }

    public void setRegistrosalida(String registrosalida) {
        this.registrosalida = registrosalida;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Integer getStatuliga() {
        return statuliga;
    }

    public void setStatuliga(Integer statuliga) {
        this.statuliga = statuliga;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getTabtar() {
        return tabtar;
    }

    public void setTabtar(String tabtar) {
        this.tabtar = tabtar;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifanumber() {
        return tarifanumber;
    }

    public void setTarifanumber(double tarifanumber) {
        this.tarifanumber = tarifanumber;
    }

    public String getTarjetacredito() {
        return tarjetacredito;
    }

    public void setTarjetacredito(String tarjetacredito) {
        this.tarjetacredito = tarjetacredito;
    }

    public String getTcredito() {
        return tcredito;
    }

    public void setTcredito(String tcredito) {
        this.tcredito = tcredito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonocia() {
        return telefonocia;
    }

    public void setTelefonocia(String telefonocia) {
        this.telefonocia = telefonocia;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public String getTipoRvip() {
        return tipoRvip;
    }

    public void setTipoRvip(String tipoRvip) {
        this.tipoRvip = tipoRvip;
    }

    public String getTipohuesped() {
        return tipohuesped;
    }

    public void setTipohuesped(String tipohuesped) {
        this.tipohuesped = tipohuesped;
    }

    public String getTiposemana() {
        return tiposemana;
    }

    public void setTiposemana(String tiposemana) {
        this.tiposemana = tiposemana;
    }

    public int getUcantidad() {
        return ucantidad;
    }

    public void setUcantidad(int ucantidad) {
        this.ucantidad = ucantidad;
    }

    public Date getUcheckin() {
        return ucheckin;
    }

    public void setUcheckin(Date ucheckin) {
        this.ucheckin = ucheckin;
    }

    public Date getUcheckout() {
        return ucheckout;
    }

    public void setUcheckout(Date ucheckout) {
        this.ucheckout = ucheckout;
    }

    public int getUclub() {
        return uclub;
    }

    public void setUclub(int uclub) {
        this.uclub = uclub;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad2() {
        return unidad2;
    }

    public void setUnidad2(String unidad2) {
        this.unidad2 = unidad2;
    }

    public String getUsuarioregistro() {
        return usuarioregistro;
    }

    public void setUsuarioregistro(String usuarioregistro) {
        this.usuarioregistro = usuarioregistro;
    }

    public ArrayList<Acompaniantes> getVecaco() {
        return vecaco;
    }

    public void setVecaco(ArrayList<Acompaniantes> vecaco) {
        this.vecaco = vecaco;
    }

    public ArrayList<CargosExtras> getVeccar() {
        return veccar;
    }

    public void setVeccar(ArrayList<CargosExtras> veccar) {
        this.veccar = veccar;
    }

    public ArrayList getVecdepositos() {
        return vecdepositos;
    }

    public void setVecdepositos(ArrayList vecdepositos) {
        this.vecdepositos = vecdepositos;
    }

    public ArrayList<HtlPulseras> getVecpul() {
        return vecpul;
    }

    public void setVecpul(ArrayList<HtlPulseras> vecpul) {
        this.vecpul = vecpul;
    }

    public ArrayList<HtlServiciosContratados> getVecsercon() {
        return vecsercon;
    }

    public void setVecsercon( ArrayList<HtlServiciosContratados> vecsercon) {
        this.vecsercon = vecsercon;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiamunicipio() {
        return ciamunicipio;
    }

    public void setCiamunicipio(String ciamunicipio) {
        this.ciamunicipio = ciamunicipio;
    }

    public String getCiaestado() {
        return ciaestado;
    }

    public void setCiaestado(String ciaestado) {
        this.ciaestado = ciaestado;
    }

    public Boolean getSplit() {
        return split;
    }

    public void setSplit(Boolean split) {
        this.split = split;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
    
    

}
