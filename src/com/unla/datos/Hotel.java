package com.unla.datos;

import java.util.GregorianCalendar;
import java.util.List;

public class Hotel {
	private static Hotel instanciaHotel ;
	protected long cuil;
	protected String nombre;
	protected List<Servicio> servicios;
	protected int categoria;
	protected Contacto contacto;
	protected GregorianCalendar checkIn;
	protected GregorianCalendar checkOut;
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

	public long getCuil() {
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
	public GregorianCalendar getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(GregorianCalendar checkIn) {
		this.checkIn = checkIn;
	}
	public GregorianCalendar getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(GregorianCalendar checkOut) {
		this.checkOut = checkOut;
	}
	private void inicializar() { // pueden leer la instancia de un archivo xml
		this.setNombre("SistemaGestionHotelera");
		this.setCategoria(3);
		
	}
}