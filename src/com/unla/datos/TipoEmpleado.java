package com.unla.datos;

public class TipoEmpleado {

	private int idTipoEmpleado;
	private String descripcion;
	
	public TipoEmpleado()
	{
	}

	public TipoEmpleado(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	public int getIdTipoEmpleado() {
		return idTipoEmpleado;
	}
	public void setIdTipoEmpleado(int idTipoEmpleado) {
		this.idTipoEmpleado = idTipoEmpleado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}
