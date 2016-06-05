package com.unla.negocio;

import java.util.List;

import com.unla.dao.LoginDao;
import com.unla.datos.Cliente;
import com.unla.datos.Empleado;


public class LoginABM {
	
	private LoginDao loginDao = new LoginDao();
	private ClienteABM clienteABM = new ClienteABM();
	private EmpleadoABM empleadoABM = new EmpleadoABM();
		
	public Cliente validarCliente(String usuario, String contrasenia){
		
		Cliente retorno = null;
		
		List<Cliente> listaClientes = clienteABM.traerClientes();
		
		for (Cliente cliente : listaClientes) {
			
			if(usuario.equals(cliente.getLogin().getUsuario()) && contrasenia.equals(cliente.getLogin().getUsuario())){
				
				retorno = cliente;
				
			}
			
		}
		
		return retorno;
		
	}
	
	
	public Empleado validarEmpleado(String usuario, String contrasenia){
		
		Empleado retorno = null;
		
		List<Empleado> listaEmpleados = empleadoABM.traerEmpleados();
		
		for (Empleado empleado : listaEmpleados) {
			
			if(usuario.equals(empleado.getLogin().getUsuario()) && contrasenia.equals(empleado.getLogin().getUsuario())){
				
				retorno = empleado;
				
			}
			
		}
		
		return retorno;
		
	}
	
}
