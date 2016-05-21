package com.unla.datos;

public class Direccion {
	
	private int idDireccion;
	private String calle;
	private int numero;
	private String codigoPostal;

	public Direccion(String calle, int numero, String codigoPostal)
	{
		this.calle=calle;
		this.numero=numero;
		this.codigoPostal=codigoPostal;
	}
	
	public int getIdDireccion() {
		return idDireccion;
	}
	
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	

}
