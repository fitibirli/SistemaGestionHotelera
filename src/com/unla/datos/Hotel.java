package com.unla.datos;

import java.util.GregorianCalendar;
import java.util.List;

public class Hotel {
	
	private long cuil;
	private String nombre;
	private List<Servicio> servicios;
	private int categoria;
	private Contacto contacto;
	private GregorianCalendar checkIn;
	private GregorianCalendar checkOut;
	private Direccion direccion;
	private List<Habitacion> habitaciones;
	
	
	public long getCuil() {
		return cuil;
	}
	public void setCuil(long cuil) {
		this.cuil = cuil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
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
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	
	public void agregarHabitacion(Habitacion habitacion){
		this.habitaciones.add(habitacion);
	}
	
}
