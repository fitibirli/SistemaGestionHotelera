package com.unla.negocio;

import com.unla.dao.TipoEmpleadoDao;
import com.unla.datos.TipoEmpleado;

public class TipoEmpleadoABM {
	
	private TipoEmpleadoDao dao = new TipoEmpleadoDao();
	
	public int agregar(String descripcion) {
		TipoEmpleado te = new TipoEmpleado(descripcion);
		return dao.agregar(te);

	}
	
	public int agregar(TipoEmpleado te) {
		return dao.agregar(te);

	}

}
