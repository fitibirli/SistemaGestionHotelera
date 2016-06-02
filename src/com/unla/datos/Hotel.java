package com.unla.datos;

public class Hotel {
	private static Hotel instanciaHotel ;
	protected int idHotel;
	protected String cuil;
	protected String nombre;
	protected int categoria;
	protected Contacto contacto;
	protected String checkIn;
	protected String checkOut;
	protected Direccion direccion;

	//Singleton
	
	protected Hotel() {
		this.inicializar();
	}

	public static Hotel getInstanciaHotel() {
		if (instanciaHotel == null) {
			instanciaHotel = new Hotel();
		}
		return instanciaHotel;
	}
	

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public void setCuil(String cuil) {
		this.cuil=cuil;
	}
	public String getCuil() {
		return cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public int getCategoria() {
		return categoria;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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
	private void inicializar() { // pueden leer la instancia de un archivo xml
		/*settear el singleton Hotel con los datos de la base*/
	}
}