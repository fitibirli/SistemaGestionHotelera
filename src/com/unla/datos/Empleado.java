package com.unla.datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class Empleado {
	
	 private int legajo;
	 private String nombre;
	 private String apellido;
	 private int dni;
	 private TipoEmpleado tipo;
	 private Contacto contacto;
	 private GregorianCalendar fechaNacimiento;
	 private Login login;
	 private Set<Ticket>tickets;
	 private Set<Factura> facturas;
	// private List<ReporteLimpieza> reportesDeLimpieza;
	// private List<ReporteMantenimiento> reportesDeMantenimiento;
	 
	public int getLegajo() {
		return legajo;
	}
	
	public Empleado()
	{};
	
	public Empleado(String nombre, String apellido, int dni, TipoEmpleado tipo, Contacto contacto,
			GregorianCalendar fechaNacimiento, Login login) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.tipo = tipo;
		this.setContacto(contacto);
		this.fechaNacimiento = fechaNacimiento;
		this.login = login;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public TipoEmpleado getTipo() {
		return tipo;
	}
	public void setTipo(TipoEmpleado tipo) {
		this.tipo = tipo;
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

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Set<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}
	
	

	 
	 
	 

}
