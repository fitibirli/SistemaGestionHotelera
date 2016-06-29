package com.unla.datos;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

public class Factura {
	
	private int idFactura;
	private Cliente cliente;
	private List<ItemFactura> items;
	private Set<ItemFactura> sitems;
	private GregorianCalendar fechaEmision;
	private Empleado recepcionista;
	
	public Factura(){
	}
	
	public Factura(int idFactura, Cliente cliente, List<ItemFactura> items, GregorianCalendar fechaEmision,
			Empleado recepcionista) {
		super();
		this.idFactura = idFactura;
		this.cliente = cliente;
		this.items = items;
		this.fechaEmision = fechaEmision;
		this.recepcionista = recepcionista;
	}

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

	public Set<ItemFactura> getSitems() {
		return sitems;
	}

	public void setSitems(Set<ItemFactura> sitems) {
		this.sitems = sitems;
	}
		

}
