package test;

import java.util.GregorianCalendar;

import com.unla.datos.Contacto;
import com.unla.datos.Login;
import com.unla.datos.Privilegio;
import com.unla.datos.TipoEmpleado;
import com.unla.negocio.ContactoABM;
import com.unla.negocio.EmpleadoABM;
import com.unla.negocio.LoginABM;
import com.unla.negocio.PrivilegioABM;
import com.unla.negocio.TipoEmpleadoABM;

public class TestEmpleado {

	public static void main(String[] args) throws Exception {

	 EmpleadoABM empleadoABM = new EmpleadoABM();
	 TipoEmpleadoABM tipoEmpleadoABM = new TipoEmpleadoABM();
	 ContactoABM contactoABM = new ContactoABM();
	 LoginABM loginABM = new LoginABM();
	 PrivilegioABM privilegioABM = new PrivilegioABM();
	 
	 //Atributos del empleado
	 String nombre = "Rodriguez";
	 String apellido = "Filipito";
	 int dni = 12345678;
	 GregorianCalendar fechaNacimiento = new GregorianCalendar();
	 
	 //Tipo de empleado
	 String descripcionTipo = "recepcionista";
	 
	 //Contacto del empleado
	 String telefono="12345678";
	 String celular="87654321";
	 String email="ElFilipitoRodri@gmail.com";
	 
	 //Login del empleado
	 String usuario = "Filipin";
	 String contrasenia = "Soleado";
	 
	 //Privilegio del login.
	 int idPrivilegio = 1;
	 Privilegio p = privilegioABM.traerPrivilegio(1);
	 
	 
	 //Instancias y guardado en la bd de las tablas relacionadas al empleado
	 TipoEmpleado tipo = new TipoEmpleado(descripcionTipo);
	 tipoEmpleadoABM.agregar(tipo);
	 
	 Contacto contacto = new Contacto(telefono,celular,email);
	 contactoABM.agregar(contacto);
	 
	 Login login = new Login(usuario,contrasenia,p);
	 loginABM.agregar(login, p);
	 
	 //Instancia del empleado
	 empleadoABM.agregarEmpleado(nombre, apellido, dni, tipo, contacto, fechaNacimiento, login);
	 
}

}