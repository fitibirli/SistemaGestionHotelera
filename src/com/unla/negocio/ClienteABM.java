package com.unla.negocio;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import com.unla.dao.ClienteDao;
import com.unla.dao.ContactoDao;
import com.unla.dao.DireccionDao;
import com.unla.dao.EstadiaDao;
import com.unla.dao.LoginDao;
import com.unla.dao.PrivilegioDao;
import com.unla.datos.Cliente;
import com.unla.datos.Contacto;
import com.unla.datos.Direccion;
import com.unla.datos.Estadia;
import com.unla.datos.Habitacion;
import com.unla.datos.Privilegio;
import com.unla.datos.Login;
import com.unla.excepciones.YaExisteClienteException;

import funciones.Funciones;

public class ClienteABM {
	
	private ClienteDao dao = new ClienteDao();
	private ContactoDao cDao = new ContactoDao();
	private DireccionDao dDao = new DireccionDao();
	private EstadiaDao eDao = new EstadiaDao();
	private PrivilegioDao pDao = new PrivilegioDao();
	
	public void crearCliente(String nombre, String apellido, int dni, GregorianCalendar fechaNacimiento, String usuario, String contrasenia) throws Exception{
		
		Cliente cliente = new Cliente();
		
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		
		
		Login login = new Login();
		Privilegio privilegio=new Privilegio();
		
		login.setUsuario(usuario);
		login.setClave(contrasenia);
		//privilegio.setDescripcion(descripcion);
		
		login.setPrivilegio(privilegio);
		cliente.setLogin(login);
	
		
		List<Cliente> listaClientes = dao.traerCliente();
		
		for (Cliente cliente2 : listaClientes) {
			
			if(cliente.getDni() == cliente2.getDni()){
				throw new YaExisteClienteException();
			}
			
		}
		
		dao.agregar(cliente);
		
		
	}
	
	public int crearCliente(String nombre, String apellido, int dni, GregorianCalendar fechaNacimiento, Login login, Contacto contacto, Direccion direccion) throws Exception{
		
		LoginABM loginABM = new LoginABM();
		Cliente cliente = new Cliente();
		List<Cliente> listaClientes = dao.traerCliente();
		
		List<Privilegio> listaPrivilegio = pDao.traerPrivilegio();
		
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		for (Cliente cliente2 : listaClientes) {
			
			if(cliente.getDni() == cliente2.getDni()){
				throw new YaExisteClienteException();
			}
			else

			cDao.agregar(contacto);
			dDao.agregar(direccion);
			cliente.setContacto(contacto);
			cliente.setDireccion(direccion);
			int ultimoIdLogin = loginABM.agregar(login.getUsuario(), login.getClave(), login.getPrivilegio());
			cliente.setLogin(login);
		}
		
		//privilegio.setDescripcion(descripcion);

		
		return dao.agregar(cliente);
		
		
	}
	
	public int agregarCliente(String nombre, String apellido, int dni, GregorianCalendar fechaNacimiento, Login login, Contacto contacto, Direccion direccion) throws Exception{
		
		Cliente cliente = new Cliente();
		//List<Cliente> listaClientes = dao.traerCliente();
		
		
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		cliente.setContacto(contacto);
		cliente.setDireccion(direccion);
		cliente.setLogin(login);
		
		/*for (Cliente cliente2 : listaClientes) {
			
			if(cliente.getDni() == cliente2.getDni()){
				throw new YaExisteClienteException();
			}
			else


			int ultimoIdLogin = loginABM.agregar(login.getUsuario(), login.getClave(), login.getPrivilegio());
			cliente.setLogin(login);
		}
		*/
		//privilegio.setDescripcion(descripcion);

		
		return dao.agregar(cliente);
		
		
	}
	
	
	
	public List<Habitacion> traerHabitacionesDisponibles(GregorianCalendar fecha, Estadia e)
	{
		List<Habitacion> lista = new ArrayList<Habitacion>();
		GregorianCalendar fechaActual = new GregorianCalendar();
		
		for(int i=0;i<e.getHabitaciones().size();i++)
		{
			if(e.getHabitaciones().get(i).isDisponible()==true)
			{
				if(Funciones.esAnioIgual(fecha, fechaActual) || Funciones.esAnioMayor(fecha, fechaActual))
				{
					if(Funciones.esMesIgual(fecha, fechaActual) || Funciones.esMesMayor(fecha, fechaActual))
					{
						lista.add(e.getHabitaciones().get(i));
					}
			}
		}
			
		}	
		return lista;		
	}
	
	public List<Habitacion> traerHabitacionesDisponibles(GregorianCalendar fecha) throws Exception
	{
		List<Estadia> lista = eDao.traerEstadia();
		List<Habitacion> listaHabitacion = new ArrayList<Habitacion>();
		for (int i = 0; i < lista.size(); i++) {
			if(Funciones.estaEntreFechas(lista.get(i).getFechaIngreso(), fecha, lista.get(i).getFechaSalida()))
			{
				listaHabitacion.add(lista.get(i).getHabitaciones().get(i));
			}	
		}
		
		return listaHabitacion;
		
	}
	
	public void modificarDatos(Cliente c)	
	{
		dao.actualizar(c);
	}
	
	public void modificarDatos(Cliente c, String nombre, String apellido, String telefono, String celular, String email, String calle, int numero, String codigoPostal)
	{
		Contacto cc = new Contacto(telefono, celular, email);
		Direccion dc = new Direccion(calle, numero, codigoPostal);
		c.setNombre(nombre);
		c.setApellido(apellido);
		c.setContacto(cc);
		c.setDireccion(dc);
		dao.actualizar(c);
	}
	
	//en proceso
	/*public Estadia consultarReserva(Cliente c)
	{
		List<Estadia> lista = eDao.traerEstadia();
		Estadia e = new Estadia();
		for (int i = 0; i < lista.size(); i++) {
			if(lista.getEstadoEstadia().getCliente().equals(c))
			{
				e=lista.getEstadia();
			}
		}
		
		return e;
		
	}
	
	*/
	
	
	public List<Cliente> traerClientes(){
		
		return dao.traerCliente();
		
	}
	
	public void modificarCliente(String nombre, String apellido, GregorianCalendar fechaNacimiento, Cliente cliente){
		
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		//cliente.setFechaNacimiento(fechaNacimiento);
		dao.actualizar(cliente);
	}
	
	
	
}