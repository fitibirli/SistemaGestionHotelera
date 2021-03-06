package com.unla.datos;

import com.unla.datos.TipoTicket;

public class Ticket {

	private int idTicket;
	private Empleado empleado;
	private TipoTicket tipoTicket;
	private Servicio servicio;
	private Estadia estadia;
	private String descripcion;
	private long precio;
	//private Factura factura;
	
	//modificar
	
	public Ticket()
	{
	}
	
	public Ticket(Empleado empleado, TipoTicket tipoTicket, Servicio servicio, Estadia estadia, String descripcion,
			long precio) {
		super();
		this.empleado = empleado;
		this.tipoTicket = tipoTicket;
		this.servicio = servicio;
		this.estadia = estadia;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getIdTicket() {
		return idTicket;
	}
	protected void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public TipoTicket getTipoTicket() {
		return tipoTicket;
	}
	public void setTipoTicket(TipoTicket tipoTicket) {
		this.tipoTicket = tipoTicket;
	}
	/*public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}*/
	public Estadia getEstadia() {
		return estadia;
	}
	public void setEstadia(Estadia estadia) {
		this.estadia = estadia;
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

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	
	
}
