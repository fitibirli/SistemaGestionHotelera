package com.unla.negocio;

public class Facade {
	
	private ClienteABM clienteABM = new ClienteABM();
	private LoginABM loginABM = new LoginABM();
	private static Facade instanciaFacade;
	
	protected Facade() {
		clienteABM = new ClienteABM();
		loginABM = new LoginABM();
	}

	public static Facade getInstance() {
		if (instanciaFacade == null) {
			instanciaFacade = new Facade();
		}
		return instanciaFacade;
	}
	
	public ClienteABM getClienteABM() {
		return clienteABM;
	}
	
	public LoginABM getLoginABM() {
		return loginABM;
	}

	
	
		

}
