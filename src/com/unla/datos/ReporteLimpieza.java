package com.unla.datos;

import java.util.GregorianCalendar;

public class ReporteLimpieza {

	private int idReporteLimpieza;
	private GregorianCalendar fecha;
	private Empleado mucama;
	private String desperfecto;

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

	public String getDesperfecto() {
		return desperfecto;
	}

	public void setDesperfecto(String desperfecto) {
		this.desperfecto = desperfecto;
	}


}
