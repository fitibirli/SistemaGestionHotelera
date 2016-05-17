package com.unla.negocio;

import java.util.GregorianCalendar;
import java.util.List;

import com.unla.dao.ClienteDao;
import com.unla.datos.Cliente;
import com.unla.datos.Login;
import com.unla.excepciones.YaExisteClienteException;

public class ClienteABM {
	
	private ClienteDao dao = new ClienteDao();
	
	public void crearCliente(String nombre, String apellido, long dni, GregorianCalendar fechaNacimiento, String usuario, String contrasenia) throws Exception{
		
		Cliente cliente = new Cliente();
		
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		
		
		Login login = new Login();
		
		login.setUsuario(usuario);
		login.setContrasenia(contrasenia);
		
		cliente.setLogin(login);
		
		
		List<Cliente> listaClientes = dao.traerCliente();
		
		for (Cliente cliente2 : listaClientes) {
			
			if(cliente.getDni() == cliente2.getDni()){
				throw new YaExisteClienteException();
			}
			
		}
		
		dao.agregar(cliente);
		
		
	}

}
