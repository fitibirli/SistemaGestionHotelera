package com.unla.datos;

public class Privilegio {

	private int idPrivilegio;
	private String descripcion;
	
	public Privilegio()
	{
	}
	
	public Privilegio(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdPrivilegio() {
		return idPrivilegio;
	}
	protected void setIdPrivilegio(int idPrivilegio) {
		this.idPrivilegio = idPrivilegio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean equals(Privilegio p)
	{
		return descripcion==p.getDescripcion();
	}

}
