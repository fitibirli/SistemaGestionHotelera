package com.unla.datos;

import java.util.GregorianCalendar;

public class ReporteMantenimiento {

	private int idReporteMantenimiento;
	private String reparacion;
	private GregorianCalendar fechaOrigen;
	private GregorianCalendar fechaResolucion;
	private String desperfecto;
	private Empleado empleadoACargo;
	private boolean terminado;
	
	public ReporteMantenimiento(){
	}
	
	public ReporteMantenimiento(String reparacion, GregorianCalendar fechaOrigen, GregorianCalendar fechaResolucion,
			String desperfecto, Empleado empleadoACargo, boolean terminado) {
		super();
		this.reparacion = reparacion;
		this.fechaOrigen = fechaOrigen;
		this.fechaResolucion = fechaResolucion;
		this.desperfecto = desperfecto;
		this.empleadoACargo = empleadoACargo;
		this.terminado = terminado;
	}



	public int getIdReporteMantenimiento() {
		return idReporteMantenimiento;
	}
	protected void setIdReporteMantenimiento(int idReporteMantenimiento) {
		this.idReporteMantenimiento = idReporteMantenimiento;
	}
	public String getReparacion() {
		return reparacion;
	}
	public void setReparacion(String reparacion) {
		this.reparacion = reparacion;
	}
	public GregorianCalendar getFechaOrigen() {
		return fechaOrigen;
	}
	public void setFechaOrigen(GregorianCalendar fechaOrigen) {
		this.fechaOrigen = fechaOrigen;
	}
	public GregorianCalendar getFechaResolucion() {
		return fechaResolucion;
	}
	public void setFechaResolucion(GregorianCalendar fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}
	public String getDesperfecto() {
		return desperfecto;
	}
	public void setDesperfecto(String desperfecto) {
		this.desperfecto = desperfecto;
	}
	public Empleado getEmpleadoACargo() {
		return empleadoACargo;
	}
	public void setEmpleadoACargo(Empleado empleadoACargo) {
		this.empleadoACargo = empleadoACargo;
	}
	public boolean isTerminado() {
		return terminado;
	}
	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}

	
	

	
}
