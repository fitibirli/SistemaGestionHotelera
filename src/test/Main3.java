package test;

import java.util.GregorianCalendar;

import com.unla.dao.ClienteDao;
import com.unla.dao.ContactoDao;
import com.unla.dao.DireccionDao;
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

public class Main3 {
	
	public static void main(String[] args) throws Exception {
		
		ClienteABM abmCliente = new ClienteABM();
		ContactoABM abmContacto = new ContactoABM();
		DireccionABM abmDireccion = new DireccionABM();
		LoginABM abmLogin = Facade.getInstance().getLoginABM();
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
		
		
		Direccion d = new Direccion(calle,numero,codigoPostal);
		Contacto c = new Contacto(telefono,celular,email);		
		Privilegio p = new Privilegio("administrador");
		Login l = new Login(usuario,contrasenia,p);
		
		abmDireccion.agregar(d);
		abmPrivilegio.agregar(p);
		abmContacto.agregar(c);
		abmLogin.agregar(l, p);
		
		abmCliente.agregarCliente(nombre, apellido, dni, fNac, l, c, d);
		
		
	}

}
