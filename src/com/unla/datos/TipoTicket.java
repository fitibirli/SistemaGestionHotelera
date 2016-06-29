package com.unla.datos;

import java.util.Set;

public class TipoTicket {

	private int idTipoTicket;
	private String descripcion;
	private long precio;
	//private Set<Ticket>tickets;
	
	public TipoTicket(){	
	}
	
	public TipoTicket(String descripcion, long precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getIdTipoTicket() {
		return idTipoTicket;
	}
	
	protected void setIdTipoTicket(int idTipoTicket) {
		this.idTipoTicket = idTipoTicket;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}

	/*
	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	*/
	
	
}
