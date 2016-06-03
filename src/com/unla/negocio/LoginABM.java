package com.unla.negocio;

import com.unla.dao.LoginDao;
import com.unla.datos.Cliente;
import com.unla.datos.Empleado;



public class LoginABM {
	

	
	private LoginDao loginDao = new LoginDao();
	
	public Cliente validarCliente(String usuario, String contrasenia) throws Exception{
		Cliente cliente;
		
		cliente = loginDao.existeCliente(usuario, contrasenia);
		
		if(cliente == null){
			throw new Exception();
		}
		
		return cliente;
		
	}
	
	
	public Empleado validarEmpleado(String usuario, String contrasenia) throws Exception{
		
		Empleado empleado;
		
		empleado = loginDao.existeEmpleado(usuario, contrasenia);
		
		if(empleado == null){
			throw new Exception();
		}
		
		return empleado;
		
	}
}
