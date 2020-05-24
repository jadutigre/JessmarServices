/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.group.sunset.entity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ReservaHotelII implements  Cloneable, Externalizable {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ReservaHotelII() {
	}

	public int getIdvip() {
		return idvip;
	}

	public void setIdvip(int xidvip) {
		idvip = xidvip;
	}
        
        

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int xidcliente) {
		idcliente = xidcliente;
	}

	public int getGarantizada() {
		return garantizada;
	}

	public void setGarantizada(int xGarantizada) {
		garantizada = xGarantizada;
	}

	public int getIdhuesped() {
		return idhuesped;
	}

	public void setIdhuesped(int xhuesped) {
		idhuesped = xhuesped;
	}

	public void setNombre(String nombre) {
		this.nombre =
			nombre == null
				? ""
				: ((nombre.length() < 100)
					? nombre.toUpperCase()
					: nombre.toUpperCase().substring(0, 100));
	}

	public String getNombre() {
		return nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion =
			direccion == null
				? ""
				: ((direccion.length() < 100)
					? direccion.toUpperCase()
					: direccion.toUpperCase().substring(0, 100));
	}

	public String getDireccion() {
		return direccion;
	}

	public void setCiudad(String ciudad) {
		this.ciudad =
			ciudad == null
				? ""
				: ((ciudad.length() < 50)
					? ciudad.toUpperCase()
					: ciudad.toUpperCase().substring(0, 50));
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setTelefono(String telefono) {
		this.telefono =
			(telefono == null)
				? ""
				: ((telefono.length() < 25)
					? telefono.toUpperCase()
					: telefono.toUpperCase().substring(0, 25));
	}

	public String getTelefono() {
		return telefono;
	}

	public void setEmailhogar(String emailhogar) {
		this.emailhogar =
			emailhogar == null
				? ""
				: ((emailhogar.length() < 100)
					? emailhogar.toUpperCase()
					: emailhogar.toUpperCase().substring(0, 100));
	}

	public String getEmailhogar() {
		return emailhogar;
	}

	public void setEmailnegocios(String emailnegocios) {
		this.emailnegocios =
			emailnegocios == null
				? ""
				: ((emailnegocios.length() < 100)
					? emailnegocios.toUpperCase()
					: emailnegocios.toUpperCase().substring(0, 100));
	}

	public String getEmailnegocios() {
		return emailnegocios;
	}

	public void setIdagencia(String idagencia) {
		this.idagencia =
			idagencia == null
				? ""
				: ((idagencia.length() < 10)
					? idagencia.toUpperCase()
					: idagencia.toUpperCase().substring(0, 10));
	}

	public String getIdagencia() {
		return idagencia;
	}

	public void setIdsegmento(String idsegmento) {
		this.idsegmento =
			idsegmento == null
				? ""
				: ((idsegmento.length() < 10)
					? idsegmento.toUpperCase()
					: idsegmento.toUpperCase().substring(0, 10));
	}

	public String getIdsegmento() {
		return idsegmento;
	}

	public void setIdpaquete(String idpaquete) {
		this.idpaquete =
			idpaquete == null
				? ""
				: ((idpaquete.length() < 10)
					? idpaquete.toUpperCase()
					: idpaquete.toUpperCase());
	}

	public String getIdpaquete() {
		return idpaquete;
	}

	public void setIdcompania(String idcompania) {
		this.idcompania =
			(idcompania == null)
				? ""
				: ((idcompania.length() < 10)
					? idcompania.toUpperCase()
					: idcompania.toUpperCase().substring(0, 10));
	}

	public String getIdcompania() {
		return idcompania;
	}

	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public int getIdreserva() {
		return idreserva;
	}

	public void setFechareserva(Date fechareserva) {
		this.fechareserva = fechareserva;
	}
	public Date getFechareserva() {
		return fechareserva;
	}

	public void setFechacancela(Date fechacancela) {
		this.fechacancela = fechacancela;
	}

	public Date getFechacancela() {
		return fechacancela;
	}

	public void setFechaentrada(Date fechaentrada) {
		this.fechaentrada = fechaentrada;
	}

	public Date getFechaentrada() {
		return fechaentrada;
	}

	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
	}

	public Date getFechasalida() {
		return fechasalida;
	}

	public void setNoadultos(int noadultos) {
		this.noadultos = noadultos;
	}

	public int getNoadultos() {
		return noadultos;
	}

	public void setNoninios(int noninios) {
		this.noninios = noninios;
	}

	public int getNoninios() {
		return noninios;
	}

	public void setIdstatus(String idstatus) {
		this.idstatus =
			idstatus == null
				? ""
				: ((idstatus.length() < 1)
					? idstatus.toUpperCase()
					: idstatus.toUpperCase().substring(0, 1));
	}

	public String getIdstatus() {
		return idstatus;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setTarifa(String tarifa) {
		this.tarifa =
			(tarifa == null)
				? ""
				: ((tarifa.length() < 12)
					? tarifa.toUpperCase()
					: tarifa.toUpperCase().substring(0, 12));
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setMoneda(int moneda) {
		this.moneda = moneda;
	}

	public int getMoneda() {
		return moneda;
	}

	public void setIdtipohabit(String idtipohabit) {
		this.idtipohabit =
			idtipohabit == null
				? ""
				: ((idtipohabit.length() < 10)
					? idtipohabit.toUpperCase()
					: idtipohabit.toUpperCase().substring(0, 10));
	}

	public String getIdtipohabit() {
		return idtipohabit;
	}

	public void setIdtipohabitorig(String xidtipohabitorig) {
		idtipohabitorig =
			xidtipohabitorig == null ? "" : xidtipohabitorig.toUpperCase();
	}

	public String getIdtipohabitorig() {
		return idtipohabitorig;
	}

	public void setNomcia(String nomcia) {
		this.nomcia =
			(nomcia == null)
				? ""
				: ((nomcia.length() < 100)
					? nomcia.toUpperCase()
					: nomcia.toUpperCase().substring(0, 100));
	}

	public String getNomcia() {
		return nomcia;
	}

	public void setCiudadcia(String ciudadcia) {
		this.ciudadcia =
			(ciudadcia == null)
				? ""
				: ((ciudadcia.length() < 50)
					? ciudadcia.toUpperCase()
					: ciudadcia.toUpperCase().substring(0, 50));
	}

	public String getCiudadcia() {
		return ciudadcia;
	}

	public void setDircia(String dircia) {
		this.dircia =
			(dircia == null)
				? ""
				: ((dircia.length() < 100)
					? dircia.toUpperCase()
					: dircia.toUpperCase().substring(0, 100));
	}

	public String getDircia() {
		return dircia;
	}

	public void setRfc(String rfc) {
		this.rfc =
			(rfc == null)
				? ""
				: ((rfc.length() < 20)
					? rfc.toUpperCase()
					: rfc.toUpperCase().substring(0, 20));
	}

	public String getRfc() {
		return rfc;
	}

	public void setObs1(String obs1) {
		this.obs1 =
			(obs1 == null)
				? ""
				: ((obs1.length() < 100)
					? obs1.toUpperCase()
					: obs1.toUpperCase().substring(0, 100));
	}

	public String getObs1() {
		return obs1;
	}

	public void setObs2(String obs2) {
		this.obs2 =
			(obs2 == null)
				? ""
				: ((obs2.length() < 100)
					? obs2.toUpperCase()
					: obs2.toUpperCase().substring(0, 100));
	}

	public String getObs2() {
		return obs2;
	}

	public void setObs3(String obs3) {
		this.obs3 =
			(obs3 == null)
				? ""
				: ((obs3.length() < 100)
					? obs3.toUpperCase()
					: obs3.toUpperCase().substring(0, 100));
	}

	public String getObs3() {
		return obs3;
	}

	public void setFormapago(String formapago) {
		this.formapago = formapago == null ? "" : formapago.toUpperCase();
	}

	public String getFormapago() {
		return formapago;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor =
			(supervisor == null)
				? ""
				: ((supervisor.length() < 20)
					? supervisor.toUpperCase()
					: supervisor.toUpperCase().substring(0, 20));

		//this.supervisor = supervisor == null ? "" : supervisor.toUpperCase();
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setUsuarioregistro(String usuarioregistro) {
		this.usuarioregistro =
			(usuarioregistro == null)
				? ""
				: ((usuarioregistro.length() < 20)
					? usuarioregistro.toUpperCase()
					: usuarioregistro.toUpperCase().substring(0, 20));

		//this.usuarioregistro = usuarioregistro == null ? "" : usuarioregistro.toUpperCase().substring(0,10);
	}

	public String getUsuarioregistro() {
		return usuarioregistro;
	}

	public void setIdgrupo(String idgrupo) {
		this.idgrupo = idgrupo == null ? "" : idgrupo.toUpperCase();
	}

	public String getIdgrupo() {
		return idgrupo;
	}

	public void setPlanviaje(String planviaje) {
		this.planviaje = planviaje == null ? "" : planviaje.toUpperCase();
	}

	public String getPlanviaje() {
		return planviaje;
	}

	public void setUcantidad(int ucantidad) {
		this.ucantidad = ucantidad;
	}

	public int getUcantidad() {
		return ucantidad;
	}

	public void setUcheckin(Date ucheckin) {
		this.ucheckin = ucheckin;
	}

	public Date getUcheckin() {
		return ucheckin;
	}

	public void setUcheckout(Date ucheckout) {
		this.ucheckout = ucheckout;
	}

	public Date getUcheckout() {
		return ucheckout;
	}

	public void setUclub(int uclub) {
		this.uclub = uclub;
	}

	public int getUclub() {
		return uclub;
	}

	public void setConfirmacion(String confirmacion) {
		this.confirmacion =
			confirmacion == null ? "" : confirmacion.toUpperCase();
	}

	public String getConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion2(String confirmacion2) {
		this.confirmacion2 =
			confirmacion2 == null ? "" : confirmacion2.toUpperCase();
	}

	public String getConfirmacion2() {
		return confirmacion2;
	}

	public void setNumsolicitud(int numsolicitud) {
		this.numsolicitud = numsolicitud;
	}

	public int getNumsolicitud() {
		return numsolicitud;
	}

	public void setTiposemana(String tiposemana) {
		this.tiposemana = tiposemana == null ? "" : tiposemana.toUpperCase();
	}

	public String getTiposemana() {
		return tiposemana;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad == null ? "" : unidad.toUpperCase();
	}

	public String getUnidad() {
		return unidad;
	}

	public void setNumcancela(int numcancela) {
		this.numcancela = numcancela;
	}

	public int getNumcancela() {
		return numcancela;
	}

	public void setPais(String pais) {
		this.pais = pais == null ? "" : pais.toUpperCase();
	}

	public String getPais() {
		return pais;
	}

	public void setCredito(String credito) {
		this.credito = credito == null ? "" : credito.toUpperCase();
	}

	public String getCredito() {
		return credito;
	}

	public void setComision(String comision) {
		this.comision = comision == null ? "" : comision.toUpperCase();
	}

	public String getComision() {
		return comision;
	}

	public void setCajasegu(String cajasegu) {
		this.cajasegu = cajasegu == null ? "" : cajasegu.toUpperCase();
	}

	public String getCajasegu() {
		return cajasegu;
	}

	public void setEstado(String estado) {
		this.estado = estado == null ? "" : estado.toUpperCase();
	}

	public String getEstado() {
		return estado;
	}

	public void setIdhabitacion(int idhabitacion) {
		this.idhabitacion = idhabitacion;
	}

	public int getIdhabitacion() {
		return idhabitacion;
	}

	public void setIdhabitorig(int xidhabitorig) {
		idhabitorig = xidhabitorig;
	}

	public int getIdhabitorig() {
		return idhabitorig;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios == null ? "" : comentarios.toUpperCase();
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setTarjetacredito(String tarjetacredito) {
		this.tarjetacredito =
			tarjetacredito == null ? "" : tarjetacredito.toUpperCase();
	}

	public String getTarjetacredito() {
		return tarjetacredito;
	}

	public void setFechavencto(String fechavencto) {
		this.fechavencto = fechavencto == null ? "" : fechavencto.toUpperCase();
	}

	public String getFechavencto() {
		return fechavencto;
	}

	public void setPendiente1(String pendiente1) {
		this.pendiente1 = pendiente1 == null ? "" : pendiente1.toUpperCase();
	}

	public String getPendiente1() {
		return pendiente1;
	}

	public void setPendiente2(String pendiente2) {
		this.pendiente2 = pendiente2 == null ? "" : pendiente2.toUpperCase();
	}

	public String getPendiente2() {
		return pendiente2;
	}

	public void setTipohuesped(String tipohuesped) {
		this.tipohuesped = tipohuesped == null ? "" : tipohuesped.toUpperCase();
	}

	public String getTipohuesped() {
		return tipohuesped;
	}

	public void setProcgeograf(String procgeograf) {
		this.procgeograf = procgeograf == null ? "" : procgeograf.toUpperCase();
	}

	public String getProcgeograf() {
		return procgeograf;
	}

	public void setUnidad2(String unidad2) {
		this.unidad2 = unidad2 == null ? "" : unidad2.toUpperCase();
	}

	public String getUnidad2() {
		return unidad2;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion == null ? "" : ocupacion.toUpperCase();
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion =
			localizacion == null ? "" : localizacion.toUpperCase();
	}

	public String getLocalizacion() {
		return localizacion;
	}



        public ArrayList<Pulseras> getVecpul() {
            return vecpul;
        }

        public void setVecpul(ArrayList<Pulseras> vecpul) {
            this.vecpul = vecpul;
        }
        
        
        

        public ArrayList<Acompaniantes> getVecaco() {
            return vecaco;
        }

        public void setVecaco(ArrayList<Acompaniantes> vecaco) {
            this.vecaco = vecaco;
        }



	public void setVecsercon(ArrayList xvector) {
		vecsercon = xvector;
	}

	public ArrayList getVecsercon() {
		return vecsercon;
	}


        public void setVecdepositos(ArrayList xvector) {
                vecdepositos = xvector;
        }

        public ArrayList getVecdepositos() {
                return vecdepositos;
	}

	public void setVecCargos(ArrayList xvector) {
		veccar = xvector;
	}

	public ArrayList getVecCargos() {
		return veccar;
	}

        public ArrayList getVeccar() {
            return veccar;
        }

        public void setVeccar(ArrayList veccar) {
            this.veccar = veccar;
        }
        

	public void setFolio1(String xfol) {
		folio1 = xfol == null ? "" : xfol;
	}

	public String getFolio1() {
		return folio1 == null ? "" : folio1;
	}

	public void setFolio2(String xfol) {
		folio2 = xfol == null ? "" : xfol;
	}

	public String getFolio2() {
		return folio2 == null ? "" : folio2;
	}

	public void setFolio3(String xfol) {
		folio3 = xfol == null ? "" : xfol;
	}

	public String getFolio3() {
		return folio3 == null ? "" : folio3;
	}

	public void setCtarfol(int xfol) {
		ctarfol = xfol;
	}

	public int getCtarfol() {
		return ctarfol;
	}

	public void setCtarmae(int xfol) {
		ctarmae = xfol;
	}

	public int getCtarmae() {
		return ctarmae;
	}

	public double getImpcredito() {
		return impcredito;
	}

	public void setImpcredito(double impcredito) {
		this.impcredito = impcredito;
	}

	public void setHoraentrada(String horaentrada) {
		this.horaentrada = horaentrada;
	}

	public String getHoraentrada() {
		return horaentrada;
	}

	public void setRegistrosalida(String registrosalida) {
		this.registrosalida = registrosalida;
	}

	public String getRegistrosalida() {
		return registrosalida;
	}

	public void setRegistroentrada(String registroentrada) {
		this.registroentrada = registroentrada;
	}

	public String getRegistroentrada() {
		return registroentrada;
	}

	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}

	public String getHorasalida() {
		return horasalida;
	}

	public double getTarifanumber() {
		return tarifanumber;
	}

	public void setTarifanumber(double tarifanumber) {
		this.tarifanumber = tarifanumber;
	}

        public void setNomembresia(String membresia) {
                  this.nomembresia = membresia;
        }

        public String getNomembresia() {
                  return nomembresia;
        }


        public void setMotivo(String motivo) {
                  this.motivo = motivo;
        }

        public String getMotivo() {
                  return motivo;
        }



    public String getCcomision() {
        return ccomision;
    }

    public void setCcomision(String ccomision) {
        this.ccomision = ccomision;
    }
        
        
        



    public String getClavehabitacion() {
        return clavehabitacion;
    }

    public void setClavehabitacion(String clavehabitacion) {
        this.clavehabitacion = clavehabitacion;
    }
        
        
        

        public void setCpsocio(String cpsocio) {
                  this.cpsocio = cpsocio;
        }

        public String getCpsocio() {
                  return cpsocio;
        }

        public void setCpcia(String cpcia) {
                  this.cpcia = cpcia;
        }

        public String getCpcia() {
                  return cpcia;
        }

        public void setClavetarifa(String clavetarifa) {
                  this.clavetarifa = clavetarifa;
        }

        public String getClavetarifa() {
                  return clavetarifa;
        }

        public void setNoadolecentes(int noadolecentes) {
                this.noadolecentes = noadolecentes;
        }

        public int getNoadolecentes() {
                return noadolecentes;
	}

        public void setIdUser(String idUser) {
                this.idUser = idUser;
        }

        public String getIdUser() {
                return idUser;
	}



        public void setTcredito(String tcredito) {
                this.tcredito = tcredito;
        }

        public String getTcredito() {
                return tcredito;
        }


        public void setFexpiracion(String fexpiracion) {
                this.fexpiracion = fexpiracion;
        }

        public String getFexpiracion() {
                return fexpiracion;
        }


        public void setCseguridad(String cseguridad) {
                this.cseguridad = cseguridad;
        }

        public String getCseguridad() {
                return cseguridad;
        }



        public void setHoraRentrada(String horaRentrada) {
                this.horaRentrada = horaRentrada;
        }
        public String getHoraRentrada() {
                return horaRentrada;
        }
        public void setHoraRsalida(String horaRsalida) {
                this.horaRsalida = horaRsalida;
        }
        public String getHoraRsalida() {
                return horaRsalida;
        }
        public void setTipoRvip(String tipoRvip) {
                this.tipoRvip = tipoRvip;
        }
        public String getTipoRvip() {
                return tipoRvip;
        }
        public void setContacto(String contacto) {
                this.contacto = contacto;
        }
        public String getContacto() {
                return contacto;
        }
        public void setTelefonocia(String telefonocia) {
                this.telefonocia = telefonocia;
        }
        public String getTelefonocia() {
                return telefonocia;
        }

        public void setAj(Boolean aj) {
                this.aj = aj;
        }
        public Boolean getAj() {
                return aj;
        }
        public void setAm(Boolean am) {
                this.am = am;
        }
        public Boolean getAm() {
                return am;
        }
        public void setAn(Boolean an) {
                this.an = an;
        }
        public Boolean getAn() {
                return an;
        }
        public void setCn(Boolean cn) {
                this.cn = cn;
        }
        public Boolean getCn() {
                return cn;
        }
        public void setCr(Boolean cr) {
                this.cr = cr;
        }
        public Boolean getCr() {
                return cr;
        }
        public void setDd(Boolean dd) {
                this.dd = dd;
        }
        public Boolean getDd() {
                return dd;
        }
        public void setHi(Boolean hi) {
                this.hi = hi;
        }
        public Boolean getHi() {
                return hi;
        }
        public void setHy(Boolean hy) {
                this.hy = hy;
        }
        public Boolean getHy() {
                return hy;
        }
        public void setKg(Boolean kg) {
                this.kg = kg;
        }
        public Boolean getKg() {
                return kg;
        }
        public void setLi(Boolean li) {
                this.li = li;
        }
        public Boolean getLi() {
                return li;
        }
        public void setLo(Boolean lo) {
                this.lo = lo;
        }
        public Boolean getLo() {
                return lo;
        }
        public void setLf(Boolean lf) {
                this.lf = lf;
        }
        public Boolean getLf() {
                return lf;
        }
        public void setPk(Boolean pk) {
                this.pk = pk;
        }
        public Boolean getPk() {
                return pk;
        }


        public void setTabtar(String tabtar) {
                this.tabtar = tabtar;
        }
        public String getTabtar() {
                return tabtar;
        }

        public void setTipoReserva(String tipoReserva) {
                this.tipoReserva = tipoReserva;
        }
        public String getTipoReserva() {
                return tipoReserva;
        }

        public void setMercado(String mercado) {
                this.mercado = mercado;
        }
        public String getMercado() {
                return mercado;
        }


        public String getAreainflu() {
            return areainflu;
        }

        public void setAreainflu(String areainflu) {
            this.areainflu = areainflu;
        }



	public void setStatuliga(Integer statuliga) {
		this.statuliga = statuliga;
	}

	public Integer getStatuliga() {
		return statuliga;
	}

	public void setHabitliga(Integer habitliga) {
		this.habitliga = habitliga;
	}

	public Integer getHabitliga() {
		return habitliga;
	}

        public Integer getNiniosnopagan() {
            return niniosnopagan;
        }

        public void setNiniosnopagan(Integer niniosnopagan) {
            this.niniosnopagan = niniosnopagan;
        }

        public Integer getNiniospagan() {
            return niniospagan;
        }

        public void setNiniospagan(Integer niniospagan) {
            this.niniospagan = niniospagan;
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
        
        
        

    public String getSfechareserva() {
        return (this.fechareserva!=null)?sdf.format(this.fechareserva):null;
    }

    public void setSfechareserva(String sfechareserva) {
        this.sfechareserva = (this.fechareserva!=null)?sdf.format(this.fechareserva):null;
    }

    public String getSfechacancela() {
        return (this.fechacancela!=null)?sdf.format(this.fechacancela):null;
    }

    public void setSfechacancela(String sfechacancela) {
        this.sfechacancela = (this.fechacancela!=null)?sdf.format(this.fechacancela):null;
    }

    public String getSfechaentrada() {
        return (this.fechaentrada!=null)?sdf.format(this.fechaentrada):null;
    }

    public void setSfechaentrada(String sfechaentrada) {
        this.sfechaentrada = (this.fechaentrada!=null)?sdf.format(this.fechaentrada):null;
    }

    public String getSfechasalida() {
        return (this.fechasalida!=null)?sdf.format(this.fechasalida):null;
    }

    public void setSfechasalida(String sfechasalida) {
        this.sfechasalida = (this.fechasalida!=null)?sdf.format(this.fechasalida):null;
    }

    public String getSucheckin() {
        return (this.ucheckin!=null)?sdf.format(this.ucheckin):null;
    }

    public void setSucheckin(String sucheckin) {
        this.sucheckin = (this.ucheckin!=null)?sdf.format(this.ucheckin):null;
    }

    public String getSucheckout() {
        return (this.ucheckout!=null)?sdf.format(this.ucheckout):null;
    }

    public void setSucheckout(String sucheckout) {
        this.sucheckout = (this.ucheckout!=null)?sdf.format(this.ucheckout):null;
    }





	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException clonenotsupportedexception) {
		}
		return clone;
	}


	private int idcliente;
	private String nombre;
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
        private String sfechareserva;
	private Date fechacancela;
        private String sfechacancela;
	private Date fechaentrada;
        private String sfechaentrada;
	private Date fechasalida;
        private String sfechasalida;

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
        private String sucheckin;
	private Date ucheckout;
        private String sucheckout;
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

        private Integer niniospagan;
        private Integer niniosnopagan;
        
        private String ciamunicipio;
        private String ciaestado;
        
	private ArrayList<Pulseras> vecpul;
	private ArrayList<Acompaniantes> vecaco;
	private ArrayList<CargosExtras> veccar;
	private ArrayList<HtlServiciosContratados> vecsercon;
        private ArrayList vecdepositos;



	public void readExternal(ObjectInput in)
		throws IOException, ClassNotFoundException {
		vecpul = (ArrayList) in.readObject();
		vecaco = (ArrayList) in.readObject();
		veccar = (ArrayList) in.readObject();
		vecsercon = (ArrayList) in.readObject();
                vecdepositos = (ArrayList) in.readObject();
		idcliente = in.readInt();
		nombre = (String) in.readObject();
		direccion = (String) in.readObject();
		ciudad = (String) in.readObject();
		telefono = (String) in.readObject();
		emailhogar = (String) in.readObject();
		emailnegocios = (String) in.readObject();
		idagencia = (String) in.readObject();
		idsegmento = (String) in.readObject();
		idpaquete = (String) in.readObject();
		idcompania = (String) in.readObject();
		nomcia = (String) in.readObject();
		ciudadcia = (String) in.readObject();
		dircia = (String) in.readObject();
		rfc = (String) in.readObject();
		obs1 = (String) in.readObject();
		obs2 = (String) in.readObject();
		obs3 = (String) in.readObject();
		idgrupo = (String) in.readObject();
		pais = (String) in.readObject();
		garantizada = in.readInt();
		idreserva = in.readInt();

		fechareserva = parseDate(in.readObject());
		fechacancela = parseDate(in.readObject());
		fechaentrada = parseDate(in.readObject());
		fechasalida = parseDate(in.readObject());

		noadultos = in.readInt();
		noninios = in.readInt();
		idstatus = (String) in.readObject();
		supervisor = (String) in.readObject();
		usuarioregistro = (String) in.readObject();
		idhabitacion = in.readInt();
		idhabitorig = in.readInt();
		idhuesped = in.readInt();
		idvip = in.readInt();
		horaentrada = (String) in.readObject();
		horasalida = (String) in.readObject();
		registroentrada = (String) in.readObject();
		registrosalida = (String) in.readObject();

		cantidad = in.readInt();
		tarifa = (String) in.readObject();
		moneda = in.readInt();
		idtipohabit = (String) in.readObject();
		idtipohabitorig = (String) in.readObject();
		formapago = (String) in.readObject();
		planviaje = (String) in.readObject();
		ucantidad = in.readInt();

		ucheckin = parseDate(in.readObject());
		ucheckout = parseDate(in.readObject());

		uclub = in.readInt();
		confirmacion = (String) in.readObject();
		confirmacion2 = (String) in.readObject();
		numsolicitud = in.readInt();
		tiposemana = (String) in.readObject();
		unidad = (String) in.readObject();
		numcancela = in.readInt();
		credito = (String) in.readObject();
		comision = (String) in.readObject();
		cajasegu = (String) in.readObject();
		estado = (String) in.readObject();
		comentarios = (String) in.readObject();
		tarjetacredito = (String) in.readObject();
		fechavencto = (String) in.readObject();
		pendiente1 = (String) in.readObject();
		pendiente2 = (String) in.readObject();
		tipohuesped = (String) in.readObject();
		procgeograf = (String) in.readObject();
		unidad2 = (String) in.readObject();
		ocupacion = (String) in.readObject();
		localizacion = (String) in.readObject();
		folio1 = (String) in.readObject();
		folio2 = (String) in.readObject();
		folio3 = (String) in.readObject();
		ctarfol = in.readInt();
		ctarmae = in.readInt();
		impcredito = in.readDouble();

		tarifanumber = in.readDouble();

                nomembresia = (String) in.readObject();
                motivo = (String) in.readObject();
                ccomision = (String) in.readObject();

                clavehabitacion = (String) in.readObject();
                cpsocio = (String) in.readObject();
                cpcia = (String) in.readObject();
                clavetarifa = (String) in.readObject();
                noadolecentes = in.readInt();
                idUser = (String) in.readObject();

                tcredito = (String) in.readObject();
                fexpiracion = (String) in.readObject();
                cseguridad = (String) in.readObject();

                horaRentrada= (String) in.readObject();
                horaRsalida = (String) in.readObject();
                tipoRvip    = (String) in.readObject();
                contacto    = (String) in.readObject();
                telefonocia = (String) in.readObject();
                aj = (Boolean) in.readObject();
                am = (Boolean) in.readObject();
                an = (Boolean) in.readObject();
                cn = (Boolean) in.readObject();
                hy = (Boolean) in.readObject();
                cr = (Boolean) in.readObject();
                dd = (Boolean) in.readObject();
                hi = (Boolean) in.readObject();
                kg = (Boolean) in.readObject();
                li = (Boolean) in.readObject();
                lo = (Boolean) in.readObject();
                lf = (Boolean) in.readObject();
                pk = (Boolean) in.readObject();

                tabtar      = (String) in.readObject();
                tipoReserva = (String) in.readObject();
                mercado     = (String) in.readObject();
                areainflu   = (String) in.readObject();

                statuliga   = in.readInt();
                habitliga   = in.readInt();

                niniospagan     = in.readInt();
                niniosnopagan   = in.readInt();
                
                ciaestado    = (String) in.readObject();
                ciamunicipio = (String) in.readObject();
                
	}


	private Date parseDate(Object objDate) {
		Date fecha = null;

		if (objDate != null) {
			String strDate = objDate.toString();

			try {
				fecha = sdf.parse(strDate);
			} catch (ParseException dummy) {
			}
		}
		return fecha;
	}

	private String formatDate(Date fecha) {
		return (fecha != null) ? sdf.format(fecha) : null;
	}


	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(vecpul);
		out.writeObject(vecaco);
		out.writeObject(veccar);
		out.writeObject(vecsercon);
                out.writeObject(vecdepositos);
		out.writeInt(idcliente);

		out.writeObject(nombre);
		out.writeObject(direccion);
		out.writeObject(ciudad);
		out.writeObject(telefono);
		out.writeObject(emailhogar);
		out.writeObject(emailnegocios);
		out.writeObject(idagencia);
		out.writeObject(idsegmento);
		out.writeObject(idpaquete);
		out.writeObject(idcompania);
		out.writeObject(nomcia);
		out.writeObject(ciudadcia);
		out.writeObject(dircia);
		out.writeObject(rfc);
		out.writeObject(obs1);
		out.writeObject(obs2);
		out.writeObject(obs3);
		out.writeObject(idgrupo);
		out.writeObject(pais);
		out.writeInt(garantizada);
		out.writeInt(idreserva);

		out.writeObject(formatDate(fechareserva));
		out.writeObject(formatDate(fechacancela));
		out.writeObject(formatDate(fechaentrada));
		out.writeObject(formatDate(fechasalida));

		out.writeInt(noadultos);
		out.writeInt(noninios);
		out.writeObject(idstatus);
		out.writeObject(supervisor);
		out.writeObject(usuarioregistro);
		out.writeInt(idhabitacion);
		out.writeInt(idhabitorig);
		out.writeInt(idhuesped);
		out.writeInt(idvip);
		out.writeObject(horaentrada);
		out.writeObject(horasalida);
		out.writeObject(registroentrada);
		out.writeObject(registrosalida);

		out.writeInt(cantidad);
		out.writeObject(tarifa);
		out.writeInt(moneda);
		out.writeObject(idtipohabit);
		out.writeObject(idtipohabitorig);
		out.writeObject(formapago);
		out.writeObject(planviaje);
		out.writeInt(ucantidad);

		out.writeObject(formatDate(ucheckin));
		out.writeObject(formatDate(ucheckout));

		out.writeInt(uclub);
		out.writeObject(confirmacion);
		out.writeObject(confirmacion2);
		out.writeInt(numsolicitud);
		out.writeObject(tiposemana);
		out.writeObject(unidad);
		out.writeInt(numcancela);
		out.writeObject(credito);
		out.writeObject(comision);
		out.writeObject(cajasegu);
		out.writeObject(estado);
		out.writeObject(comentarios);
		out.writeObject(tarjetacredito);
		out.writeObject(fechavencto);
		out.writeObject(pendiente1);
		out.writeObject(pendiente2);
		out.writeObject(tipohuesped);
		out.writeObject(procgeograf);
		out.writeObject(unidad2);
		out.writeObject(ocupacion);
		out.writeObject(localizacion);
		out.writeObject(folio1);
		out.writeObject(folio2);
		out.writeObject(folio3);
		out.writeInt(ctarfol);
		out.writeInt(ctarmae);
		out.writeDouble(impcredito);

		out.writeDouble(tarifanumber);

                out.writeObject(nomembresia);
                out.writeObject(motivo);
                out.writeObject(ccomision);

                out.writeObject(clavehabitacion);
                out.writeObject(cpsocio);
                out.writeObject(cpcia);
                out.writeObject(clavetarifa);
                out.writeInt(noadolecentes);
                out.writeObject(idUser);

                out.writeObject(tcredito);
                out.writeObject(fexpiracion);
                out.writeObject(cseguridad);


                out.writeObject(horaRentrada);
                out.writeObject(horaRsalida);
                out.writeObject(tipoRvip);
                out.writeObject(contacto);
                out.writeObject(telefonocia);
                out.writeObject(aj);
                out.writeObject(am);
                out.writeObject(an);
                out.writeObject(cn);
                out.writeObject(hy);
                out.writeObject(cr);
                out.writeObject(dd);
                out.writeObject(hi);
                out.writeObject(kg);
                out.writeObject(li);
                out.writeObject(lo);
                out.writeObject(lf);
                out.writeObject(pk);


                out.writeObject(tabtar);
                out.writeObject(tipoReserva);
                out.writeObject(mercado);
                out.writeObject(areainflu);

                out.writeInt(statuliga);
                out.writeInt(habitliga);

                out.writeInt(niniospagan);
                out.writeInt(niniosnopagan);

                out.writeObject(ciaestado);
                out.writeObject(ciamunicipio);

	}

}
