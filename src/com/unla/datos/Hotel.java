package com.unla.datos;

import com.unla.dao.HotelDao;

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

	private void inicializar() { // pueden leer la instancia de un archivo xml tmb
		HotelDao hotelDao = new HotelDao();
		
		Hotel hotel = hotelDao.traerHotel(1);
		this.setIdHotel(hotel.getIdHotel());
		this.setCuil(hotel.getCuil());
		this.setNombre(hotel.getNombre());
		this.setCategoria(hotel.getCategoria());
		//this.setContacto(hotel.getContacto()); necesito el contacto y la direccion del hotel
		this.setCheckIn(hotel.getCheckIn());
		this.setCheckOut(hotel.getCheckOut());
		//this.setDireccion(hotel.getDireccion());
	}
}