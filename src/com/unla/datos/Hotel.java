package com.unla.datos;

public class Hotel {
	protected int idHotel;
	protected String cuil;
	protected String nombre;
	protected int categoria;
	protected Contacto contacto;
	protected String checkIn;
	protected String checkOut;
	protected Direccion direccion;
	
	public Hotel() {
	}
	
	public Hotel(String cuil, String nombre, int categoria, Contacto contacto, String checkIn,
			String checkOut, Direccion direccion) {
		super();
		this.cuil = cuil;
		this.nombre = nombre;
		this.categoria = categoria;
		this.contacto = contacto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.direccion = direccion;
	}



	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


}