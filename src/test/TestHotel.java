package test;

import com.unla.datos.Contacto;
import com.unla.datos.Direccion;

import com.unla.negocio.HotelABM;

import com.unla.negocio.ContactoABM;
import com.unla.negocio.DireccionABM;

public class TestHotel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HotelABM abmHotel = new HotelABM();
		ContactoABM abmContacto = new ContactoABM();
		DireccionABM abmDireccion = new DireccionABM();
		
		//Atributos del Hotel
		String cuil="23-36771843-9";
		String nombre="Hotel UNLa";
		int categoria= 5;
		String checkIn = "10:30";
		String checkOut = "22:30";
		
		//Atributos de la direccion
		String calle="calle falsa";
	    int numero=123;
	    String codigoPostal="1234";
	    
	    //Atributos del contacto
	    String telefono="12345678";
	    String celular="87654321";
		String email="hotelUnla@gmail.com";
				
		Direccion direccion = new Direccion(calle,numero,codigoPostal); //Instancias y agregas a la base de datos las tablas relacionadas a la tabla que querés crear.
		
		abmDireccion.agregar(direccion);
		
		Contacto contacto = new Contacto(telefono,celular,email);
		
		abmContacto.agregar(contacto);
		
		//Después creas la tabla y le pasas por parametro la misma instancia

		abmHotel.crearHotel(cuil, nombre, categoria, checkIn,checkOut,contacto, direccion);


}
}