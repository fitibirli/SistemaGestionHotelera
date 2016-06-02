package com.unla.datos;

public class ItemFactura {

	private int idItemFactura;
	private int cantidad;
	private String descripcion;
	private double precioUnitario;

	
	public ItemFactura(){
	}

	public ItemFactura(int idItemFactura, int cantidad, String descripcion, double precioUnitario) {
		super();
		this.idItemFactura = idItemFactura;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
	}

	public int getIdItemFactura() {
		return idItemFactura;
	}

	public void setIdItemFactura(int idItemFactura) {
		this.idItemFactura = idItemFactura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	
	
}
