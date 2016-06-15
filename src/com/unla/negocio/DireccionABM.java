package com.unla.negocio;

import com.unla.dao.DireccionDao;

import com.unla.datos.Direccion;

public class DireccionABM {

	DireccionDao dao = new DireccionDao();
	
	public int agregar(String calle, int numero, String codigoPostal) {
		Direccion d = new Direccion(calle, numero,codigoPostal);
		return dao.agregar(d);
}
	
	public int agregar(Direccion d) { 
		return dao.agregar(d);
}
	
	public Direccion traerDireccion(long idDireccion){
		Direccion d = dao.traerDireccion(idDireccion);
		
		return d;
		
	}

	
}
