package com.unla.negocio;

import com.unla.dao.ContactoDao;

import com.unla.datos.Contacto;

public class ContactoABM {
	
	ContactoDao dao = new ContactoDao();
	
	public int agregar(String telefono, String celular, String email) {
		Contacto c = new Contacto(telefono,celular,email);
		return dao.agregar(c);

	}
	
	public int agregar(Contacto c) {
		return dao.agregar(c);

	}

	public Contacto traerContacto(long idContacto){
		Contacto c = dao.traerContacto(idContacto);
		
		return c;
		
	}
}
