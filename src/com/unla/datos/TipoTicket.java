package com.unla.datos;

public class TipoTicket {

	private int idTipoTicket;
	private String descripcion;
	private long precio;
	
	public TipoTicket(){
		
	}
	
	public int getIdTipoTicket() {
		return idTipoTicket;
	}
	public void setIdTipoTicket(int idTipoTicket) {
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

	
	
}
