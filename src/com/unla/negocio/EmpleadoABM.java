package com.unla.negocio;

import java.util.List;

import com.unla.dao.EmpleadoDao;
import com.unla.datos.Empleado;

public class EmpleadoABM {

	private EmpleadoDao dao = new EmpleadoDao();
	
	
	
	public List<Empleado> traerEmpleados(){
		
		return dao.traerEmpleados();
		
	}
	
	
}
