package com.unla.datos;

import java.util.Set;

public class TipoHabitacion {

	private int idTipoHabitacion;
	private String descripcion;
	//private Set<Habitacion> habitaciones;
	
	public TipoHabitacion(){
	}
	
	public TipoHabitacion(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public int getIdTipoHabitacion() {
		return idTipoHabitacion;
	}
	protected void setIdTipoHabitacion(int idTipoHabitacion) {
		this.idTipoHabitacion = idTipoHabitacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*
	public Set<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Set<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	*/
	

	
}
