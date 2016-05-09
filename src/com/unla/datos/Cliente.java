package com.unla.datos;

import com.unla.negocio.CuentaCliente;

public class Cliente {
	
	private int idCliente;
	private String nombre;
	private String apellido;
	private long dni;
	private CuentaCliente cuenta;
	private Contacto contacto;
	private Direccion direccion;
	private Login login;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public long getDni() {
		return dni;
	}
	
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public CuentaCliente getCuenta() {
		return cuenta;
	}
	
	public void setCuenta(CuentaCliente cuenta) {
		this.cuenta = cuenta;
	}
	
	public Contacto getContacto() {
		return contacto;
	}
	
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public Login getLogin() {
		return login;
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	

}
