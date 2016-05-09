package com.unla.datos;

import java.util.GregorianCalendar;

public class Empleado {
	
	 private int legajo;
	 private String nombre;
	 private String apellido;
	 private long dni;
	 private TipoEmpleado tipo;
	 private Contacto contacto;
	 private GregorianCalendar fechaNacimiento;
	 private Login login;
	 
	 
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
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
	public TipoEmpleado getTipo() {
		return tipo;
	}
	public void setTipo(TipoEmpleado tipo) {
		this.tipo = tipo;
	}
	public Contacto getContacto() {
		return contacto;
	}
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	public GregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	 
	 

}
