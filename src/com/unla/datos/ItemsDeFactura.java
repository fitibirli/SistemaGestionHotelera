package com.unla.datos;

import java.util.ArrayList;
import java.util.List;

public class ItemsDeFactura {
	
	private List<Ticket> tickets = new ArrayList<Ticket>();
	private long precioTotal = 0;
	
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public long getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(long precioTotal) {
		this.precioTotal = precioTotal;
	} 
	
	
	
	public int getCantidadDeTickets(){
		return tickets.size();
	}
	
	public void agregarTicket(Ticket ticket){
		
		this.tickets.add(ticket);
		this.precioTotal+=ticket.getPrecio();
		
	}

}
