package com.unla.negocio;

import com.unla.dao.DireccionDao;

import com.unla.datos.Direccion;

public class DireccionABM {

	DireccionDao dao = new DireccionDao();
	
	public int agregar(String calle, int numero, String codigoPostal) { //consultar si existe un cliente con el mismo dni, si existe arrojar laExcepcion 
		Direccion d = new Direccion(calle, numero,codigoPostal);
		return dao.agregar(d);
}
	
	public int agregar(Direccion d) { //consultar si existe un cliente con el mismo dni, si existe arrojar laExcepcion 
		return dao.agregar(d);
}
	
	public Direccion traerDireccion(long idDireccion){
		Direccion d = dao.traerDireccion(idDireccion);
		
		return d;
		
	}

	
}
