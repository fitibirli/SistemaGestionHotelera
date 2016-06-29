package com.unla.datos;

import java.util.GregorianCalendar;

public class Recibo {

	private int idRecibo;
	private GregorianCalendar fecha;
	private double importe;
	private FormaDePago formaDePago;
	private Cliente cliente;
	
	public Recibo(){
	}
	
	public Recibo(GregorianCalendar fecha, double importe, FormaDePago formaDePago, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.importe = importe;
		this.formaDePago = formaDePago;
		this.cliente = cliente;
	}



	public int getIdRecibo() {
		return idRecibo;
	}
	protected void setIdRecibo(int idRecibo) {
		this.idRecibo = idRecibo;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public FormaDePago getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	

}
