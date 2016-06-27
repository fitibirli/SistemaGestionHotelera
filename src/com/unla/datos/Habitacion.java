package com.unla.datos;

import java.util.Set;

public class Habitacion {

	private int idHabitacion;
	private int capacidadMaxima;
	private boolean disponible;
	private double precio;
	private TipoHabitacion tipoHabitacion;
	private Set<Estadia> estadias;
	
	public Habitacion(){
	}
	
	public int getIdHabitacion() {
		return idHabitacion;
	}
	protected void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public Set<Estadia> getEstadias() {
		return estadias;
	}

	public void setEstadias(Set<Estadia> estadias) {
		this.estadias = estadias;
	}

	
	

}
