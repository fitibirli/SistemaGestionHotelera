package com.unla.datos;

import java.util.GregorianCalendar;
import java.util.List;

public class Factura {
	
	private int idFactura;
	private Cliente cliente;
	private List<ItemFactura> items;
	private GregorianCalendar fechaEmision;
	private Empleado recepcionista;
	//private long monto;
	
	
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemFactura> getItems() {
		return items;
	}
	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}
	public GregorianCalendar getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(GregorianCalendar fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Empleado getRecepcionista() {
		return recepcionista;
	}
	public void setRecepcionista(Empleado recepcionista) {
		this.recepcionista = recepcionista;
	}
	public long getMonto() {
		return monto;
	}
	public void setMonto(long monto) {
		this.monto = monto;
	}
	
	
	

}
