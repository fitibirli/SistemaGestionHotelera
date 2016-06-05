package test;

import com.unla.dao.ClienteDao;
import com.unla.datos.Cliente;
import com.unla.negocio.ClienteABM;
import com.unla.negocio.Facade;
import com.unla.negocio.LoginABM;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDao cd = new ClienteDao();
		
		ClienteABM ca = Facade.getInstance().getClienteABM();
		
		LoginABM la = Facade.getInstance().getLoginABM();
		
		try {
			Cliente cliente = la.validarCliente("fito", "fito");
			
			System.out.println(cliente.getNombre());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
