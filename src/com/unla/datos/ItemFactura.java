package com.unla.datos;

public class ItemFactura {

	private int idItemFactura;
	private int cantidad;
	private String descripcion;
	private double precioUnitario;
	private Factura factura;


	public ItemFactura(){
	}

	public ItemFactura(int cantidad, String descripcion, double precioUnitario, Factura factura) {
		super();
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.factura = factura;
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

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	
}
