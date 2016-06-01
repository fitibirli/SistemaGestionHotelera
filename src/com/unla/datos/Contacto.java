package com.unla.datos;

public class Contacto {
	
	private int idContacto;
	private String telefono;
	private String celular;
	private String email;
	//modificar lo de abajo
	public Contacto() {
	}
	
	public Contacto(long telefono, long celular, String email) {
		super();
		this.telefono = telefono;
		this.celular = celular;
		this.email = email;
	}

	public int getIdContacto() {
		return idContacto;
	}
	
	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	
	public long getTelefono() {
		return telefono;
	}
	
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public long getCelular() {
		return celular;
	}
	
	public void setCelular(long celular) {
		this.celular = celular;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
