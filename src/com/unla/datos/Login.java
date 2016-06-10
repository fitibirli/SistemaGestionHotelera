package com.unla.datos;

public class Login {

	private int idLogin;
	private String usuario;
	private String clave; 
	private Privilegio privilegio;
	
	public Login(){
	}

	public Login(String usuario, String clave, Privilegio privilegio) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.privilegio = privilegio;
	}

	public int getIdLogin() {
		return idLogin;
	}

	protected void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Privilegio getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(Privilegio privilegio) {
		this.privilegio = privilegio;
	}

	
}
