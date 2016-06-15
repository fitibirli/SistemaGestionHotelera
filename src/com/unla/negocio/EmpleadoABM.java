package com.unla.negocio;

import java.util.GregorianCalendar;
import java.util.List;

import com.unla.dao.EmpleadoDao;
import com.unla.datos.Contacto;
import com.unla.datos.Empleado;
import com.unla.datos.Login;
import com.unla.datos.TipoEmpleado;

public class EmpleadoABM {

	private EmpleadoDao dao = new EmpleadoDao();
	
	public int agregarEmpleado(String nombre, String apellido, int dni, TipoEmpleado tipo, Contacto contacto,
			GregorianCalendar fechaNacimiento, Login login)
	{
		Empleado e = new Empleado();
		e.setNombre(nombre);
		e.setApellido(apellido);
		e.setDni(dni);
		e.setTipo(tipo);
		e.setContacto(contacto);
		e.setFechaNacimiento(fechaNacimiento);
		e.setLogin(login);
		

		return dao.agregar(e);
		
	}
	
	
	
	
	
	public List<Empleado> traerEmpleados(){
		
		return dao.traerEmpleados();
		
	}
	
	
}
