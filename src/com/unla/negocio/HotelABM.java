package com.unla.negocio;

import java.util.GregorianCalendar;

import com.unla.datos.Contacto;
import com.unla.datos.Direccion;
import com.unla.datos.Hotel;
import com.unla.dao.HotelDao;
import com.unla.dao.DireccionDao;
import com.unla.dao.ContactoDao;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class HotelABM {
	
	private HotelDao dao=new HotelDao();
	
	
	public int crearHotel(String cuil, String nombre, int categoria, String checkIn,
			String checkOut) /*throws Exception*/{
		
		Hotel hotel = new Hotel();
		Contacto contacto= new Contacto();
		Direccion direccion=new Direccion();		
		
		hotel.setCuil(cuil);
		hotel.setNombre(nombre);
		hotel.setCategoria(categoria);
		hotel.setCheckIn(checkIn);
		hotel.setCheckOut(checkOut);
		
		//setteo vacio por ahora
		hotel.setDireccion(direccion);
		hotel.setContacto(contacto);
				
		return dao.agregar(hotel);
	}

}
