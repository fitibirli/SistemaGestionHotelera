package com.unla.datos;

import java.util.Set;

public class FormaDePago {

	private int idFormaDePago;
	private String descripcion;
	//private Set<Recibo> recibos;
	
	public FormaDePago(){
	}
	
	public FormaDePago(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public int getIdFormaDePago() {
		return idFormaDePago;
	}
	public void setIdFormaDePago(int idFormaDePago) {
		this.idFormaDePago = idFormaDePago;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
/*
	public Set<Recibo> getRecibos() {
		return recibos;
	}

	public void setRecibos(Set<Recibo> recibos) {
		this.recibos = recibos;
	}
*/
	
}
