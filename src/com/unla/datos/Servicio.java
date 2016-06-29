package com.unla.datos;

import java.util.Set;

public class Servicio {

	private int idServicio;
	private String nombre;
	private String descripcion;
	private double precio;
	private Set<Ticket> tickets;
	
	
	public Servicio(){
	}
	
	public Servicio(String nombre, String descripcion, double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public int getIdServicio() {
		return idServicio;
	}
	protected void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	

}
