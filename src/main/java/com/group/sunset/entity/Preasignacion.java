package com.group.sunset.entity;



public class Preasignacion {

	String  noreserva;
	String  idhabit;
	Integer resultado; 
	
	
	public Preasignacion() {
		// TODO Auto-generated constructor stub
	}


	public Preasignacion(String noreserva, String idhabit, Integer resultado) {
		super();
		this.noreserva = noreserva;
		this.idhabit = idhabit;
		this.resultado = resultado;
	}


	public String getNoreserva() {
		return noreserva;
	}


	public void setNoreserva(String noreserva) {
		this.noreserva = noreserva;
	}


	public String getIdhabit() {
		return idhabit;
	}


	public void setIdhabit(String idhabit) {
		this.idhabit = idhabit;
	}


	public Integer getResultado() {
		return resultado;
	}


	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	
	
	
	
	
	

}
