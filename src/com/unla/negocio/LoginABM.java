package com.unla.negocio;

import com.unla.dao.LoginDao;
import com.unla.datos.Cliente;



public class LoginABM {
	
	private Cliente cliente;
	private LoginDao loginDao = new LoginDao();
	
	public Cliente validarCliente(String usuario, String contrasenia) throws Exception{
		
		cliente = loginDao.existeCliente(usuario, contrasenia);
		
		if(cliente == null){
			throw new Exception();
		}
		
		return cliente;
		
	}
	
}
