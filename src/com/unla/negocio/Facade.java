package com.unla.negocio;

public class Facade {
	
	private ClienteABM clienteABM = new ClienteABM();
	private LoginABM loginABM = new LoginABM();
	private EstadiaABM estadiaABM = new EstadiaABM();
	private static Facade instanciaFacade;
	
	protected Facade() {
		clienteABM = new ClienteABM();
		loginABM = new LoginABM();
		estadiaABM = new EstadiaABM();
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

	public EstadiaABM getEstadiaABM() {
		return estadiaABM;
	}

	
	
		

}
