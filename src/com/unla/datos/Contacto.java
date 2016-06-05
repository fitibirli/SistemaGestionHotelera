package com.unla.datos;

public class Contacto {
	
	private int idContacto;
	private String telefono;
	private String celular;
	private String email;
	
	
	public Contacto() {
	}
	
	public Contacto(String telefono, String celular, String email) {
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
