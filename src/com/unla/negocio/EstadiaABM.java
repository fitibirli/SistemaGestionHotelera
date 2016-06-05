package com.unla.negocio;

import java.util.GregorianCalendar;

import com.unla.dao.EstadiaDao;
import com.unla.datos.Cliente;
import com.unla.datos.Estadia;
import com.unla.datos.EstadoEstadia;
import com.unla.datos.EstadoReservada;

public class EstadiaABM {
	
	
	private EstadiaDao estadiaDao = new EstadiaDao();
	
	public Estadia crearEstadia(GregorianCalendar fechaIngreso, GregorianCalendar fechaEgreso, Cliente cliente){
		
		Estadia estadia = new Estadia();
		
		estadia.setFechaIngreso(fechaIngreso);
		estadia.setFechaSalida(fechaEgreso);
		
		EstadoEstadia estado = new EstadoReservada();
		
		estadia.setEstado(estado);
		
		estadia.setCliente(cliente);
		
		estadiaDao.agregar(estadia);
		
		return estadia;
	}

}
