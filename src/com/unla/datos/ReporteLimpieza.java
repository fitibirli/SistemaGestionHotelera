package com.unla.datos;

import java.util.GregorianCalendar;

public class ReporteLimpieza {

	private int idReporteLimpieza;
	private GregorianCalendar fecha;
	private Empleado mucama;
	private boolean desperfecto;

	public int getIdReporteLimpieza() {
		return idReporteLimpieza;
	}

	public void setIdReporteLimpieza(int idReporteLimpieza) {
		this.idReporteLimpieza = idReporteLimpieza;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public Empleado getMucama() {
		return mucama;
	}

	public void setMucama(Empleado mucama) {
		this.mucama = mucama;
	}

	public boolean isDesperfecto() {
		return desperfecto;
	}

	public void setDesperfecto(boolean desperfecto) {
		this.desperfecto = desperfecto;
	}

}
