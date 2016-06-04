package com.unla.datos;

public class Ticket {

	private int idTicket;
	private Empleado empleado;
	private TicketTipo tipoTicket;
	private Factura factura;
	private Servicio servicio;
	private Estadia estadia;
//modificar
	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public TicketTipo getTipoTicket() {
		return tipoTicket;
	}

	public void setTipoTicket(TicketTipo tipoTicket) {
		this.tipoTicket = tipoTicket;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Estadia getEstadia() {
		return estadia;
	}

	public void setEstadia(Estadia estadia) {
		this.estadia = estadia;
	}

}
