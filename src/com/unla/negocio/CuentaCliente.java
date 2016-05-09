package com.unla.negocio;

import java.util.List;

import com.unla.datos.Factura;
import com.unla.datos.Recibo;

public class CuentaCliente {

	private List<Factura> facturas;
	private List<Recibo> recibos;

	public List<Factura> getFacturas() {
		return facturas;
	}

	public List<Recibo> getRecibos() {
		return recibos;
	}
	
	public void agregarFactura(Factura factura){
		this.facturas.add(factura); //ver si es factura valida
	}
	
	public void agregarRecibo(Recibo recibo){
		this.recibos.add(recibo);
	}
	
	public long totalFacturado(){
		long totalFacturado = 0;
		
		for (Factura factura : this.facturas) {
			//falta implementar
		}
		return totalFacturado;
	}
	
	public long totalCobrado(){
		long totalCobrado = 0;
		
		for (Recibo recibo : this.recibos) {
			//falta implementar 
		}
		return totalCobrado;
	}
	
	public long saldo(){
		return calcularSaldo();
	}
	
	private long calcularSaldo(){
		
		long saldoCalculado = totalFacturado() - totalCobrado();
		
		return saldoCalculado;
	}

}
