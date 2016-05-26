package com.unla.datos;

import java.util.GregorianCalendar;
import java.util.List;

public class Hotel {
	private static Hotel instanciaHotel ;
	protected String cuil;
	protected String nombre;
	protected List<Servicio> servicios;
	protected int categoria;
	protected Contacto contacto;
	protected String checkIn;
	protected String checkOut;
	protected Direccion direccion;

	protected Hotel() {
		this.inicializar();
	}

	public static Hotel getInstanciaHotel() {
		if (instanciaHotel == null) {
			instanciaHotel = new Hotel();
		}
		return instanciaHotel;
	}

	public void setCuil(String cuil) {
		this.cuil=cuil;
	}
	public String getCuil() {
		return cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Contacto getContacto() {
		return contacto;
	}
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	private void inicializar() { // pueden leer la instancia de un archivo xml
		this.setCuil("23-36771843-9");
		this.setNombre("SistemaGestionHotelera");
		this.setCategoria(3);
		this.setContacto(new Contacto(42303233,1567892345,"gestionhotelera@sistgestionhotelera.com"));
		this.setCheckIn("10:30");
		this.setCheckOut("23:30");
		this.setDireccion(new Direccion("ituzaingo",3168,"C1824H"));
	}
}