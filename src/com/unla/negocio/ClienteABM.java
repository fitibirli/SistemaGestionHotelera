package com.unla.negocio;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.unla.dao.ClienteDao;
import com.unla.dao.EstadiaDao;
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
	private EstadiaDao eDao = new EstadiaDao();
	
	public void crearCliente(String nombre, String apellido, long dni, GregorianCalendar fechaNacimiento, String usuario, String contrasenia) throws Exception{
		
		Cliente cliente = new Cliente();
		
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		
		
		Login login = new Login();
		Privilegio privilegio=new Privilegio();
		
		login.setUsuario(usuario);
		login.setContrasenia(contrasenia);
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
	
	public void modificarDatos(Cliente c, String nombre, String apellido, long telefono, long celular, String email, String calle, int numero, String codigoPostal)
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
	
	
	
}