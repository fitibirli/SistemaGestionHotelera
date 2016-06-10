package com.unla.negocio;

import java.util.List;

import com.unla.dao.LoginDao;
import com.unla.dao.PrivilegioDao;
import com.unla.datos.Cliente;
import com.unla.datos.Empleado;
import com.unla.datos.Login;
import com.unla.datos.Privilegio;
import com.unla.excepciones.YaExisteClienteException;


public class LoginABM {
	
	private LoginDao loginDao = new LoginDao();
	private PrivilegioDao privilegioDao = new PrivilegioDao();
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
	
	public int agregar(String usuario, String contrasenia, Privilegio p) throws Exception {
		Login l = new Login();
		
		List<Privilegio> listaPrivilegio = privilegioDao.traerPrivilegio();
		
		for (Privilegio p2 : listaPrivilegio) {
			
			if(p.getDescripcion()==p2.getDescripcion()){
				throw new YaExisteClienteException();
			}
			else
			privilegioDao.agregar(p);
			l.setUsuario(usuario);
			l.setClave(contrasenia);
			l.setPrivilegio(p);
		}

		
		return loginDao.agregar(l);

	}
	
	public int agregar(Login l, Privilegio p)
	{
		l.setPrivilegio(p);
		return loginDao.agregar(l);
		
	}
	
	public Login traerLogin(int idLogin)
	{
		Login l = loginDao.traerLogin(idLogin);
		return l;
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
