package test;

import java.util.GregorianCalendar;

import com.unla.datos.Cliente;
import com.unla.datos.Estadia;
import com.unla.negocio.ClienteABM;
import com.unla.negocio.EstadiaABM;
import com.unla.negocio.Facade;
public class TestEstadia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClienteABM abmc=Facade.getInstance().getClienteABM();
		
		Cliente cliente=abmc.traerCliente(1);

		//abme.crearEstadia(new GregorianCalendar(), new GregorianCalendar(), cliente);
		
				
		//System.out.println(abme.traerEstadia(1).toString());
		
	}

}
