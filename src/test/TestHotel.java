package test;


import com.unla.dao.HotelDao;

import com.unla.dao.ContactoDao;
import com.unla.dao.DireccionDao;

import com.unla.datos.Contacto;
import com.unla.datos.Direccion;

import com.unla.negocio.HotelABM;

import com.unla.negocio.ContactoABM;
import com.unla.negocio.DireccionABM;

public class TestHotel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ContactoDao daoC = new ContactoDao();
		DireccionDao daoD = new DireccionDao();
		HotelDao dao=new HotelDao();
		
		HotelABM abmHotel = new HotelABM();
		ContactoABM abmContacto = new ContactoABM();
		DireccionABM abmDireccion = new DireccionABM();
		
		//atributos auxiliares
		String cuil="23-36771843-9";
		String nombre="Hotel UNLa";
		int categoria= 5;
		String checkIn = "10:30hs";
		String checkOut = "22:30hs";
		/*
		String calle="calle falsa";
	    int numero=123;
	    String codigoPostal="1234";
	    
	    String telefono="12345678";
	    String celular="87654321";
		String email="hotelUnla@gmail.com";
				
		Direccion direccion = new Direccion(calle,numero,codigoPostal);
		Contacto contacto = new Contacto(telefono,celular,email);
		*/

		abmHotel.crearHotel(cuil, nombre, categoria, checkIn,checkOut);


}
}
