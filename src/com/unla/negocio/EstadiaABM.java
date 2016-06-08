package com.unla.negocio;

import java.util.GregorianCalendar;
import java.util.List;

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
	
	public Estadia traerEstadiaSegunCliente(long dni){
		
		Estadia estadia = estadiaDao.traerEstadia(dni);
		
		return estadia;
		
	}

	public void actualizarEstadia(Estadia estadia) {
		// TODO Auto-generated method stub
		estadiaDao.actualizar(estadia);
	}

	public List<Estadia> traerEstadias() {
		// TODO Auto-generated method stub
		List<Estadia> estadias = null;
		try {
			 estadias = estadiaDao.traerEstadia();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estadias;
		
	}

	

}
