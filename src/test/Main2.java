package test;

import java.util.GregorianCalendar;

import com.unla.dao.ClienteDao;
import com.unla.dao.ContactoDao;
import com.unla.dao.DireccionDao;
import com.unla.datos.Cliente;
import com.unla.datos.Contacto;
import com.unla.datos.Direccion;
import com.unla.datos.Login;
import com.unla.datos.Privilegio;
import com.unla.negocio.ClienteABM;
import com.unla.negocio.ContactoABM;
import com.unla.negocio.DireccionABM;
import com.unla.negocio.Facade;
import com.unla.negocio.LoginABM;
import com.unla.negocio.PrivilegioABM;

public class Main2 {
	
	public static void main(String[] args) throws Exception {
		ContactoDao daoC = new ContactoDao();
		DireccionDao daoD = new DireccionDao();
		ClienteDao dao=new ClienteDao();
		
		ClienteABM abmCliente = new ClienteABM();
		ContactoABM abmContacto = new ContactoABM();
		DireccionABM abmDireccion = new DireccionABM();
		LoginABM la = Facade.getInstance().getLoginABM();
		PrivilegioABM abmPrivilegio = new PrivilegioABM();
		
		String apellido="Gutierrez";
		String nombre="Pepito";
		int dni= 12344567;
		GregorianCalendar fNac = new GregorianCalendar();
		String usuario = "dbnick";
		String contrasenia = "1234";
		
		String calle="calle falsa";
	    int numero=123;
	    String codigoPostal="1234";
	    
	    String telefono="12345678";
	    String celular="87654321";
		String email="ElPepiGuti@gmail.com";
		
		
		Direccion direccion = new Direccion(calle,numero,codigoPostal);
		Contacto contacto = new Contacto(telefono,celular,email);
		Privilegio privilegio = new Privilegio("administrador");
		Login login = new Login(usuario, contrasenia,privilegio);
		/*
		long ultimoIdContacto = abmContacto.agregar(contacto);
		long ultimoIdDireccion = abmDireccion.agregar(direccion);
		*/
		//long ultimoIdPrivilegio = abmPrivilegio.agregar(privilegio);
		
		//int ultimoIdLogin = la.agregar(privilegio);
		
		abmCliente.crearCliente(nombre,apellido,dni, fNac, login, contacto, direccion);

		
		
	}

}