package com.unla.datos;

import java.util.Set;

import com.unla.negocio.CuentaCliente;

public class Cliente {
	
	private int idCliente;
	private String nombre;
	private String apellido;
	private int dni;
	private CuentaCliente cuenta;
	private Contacto contacto;
	private Direccion direccion;
	private Login login;
/*	private Set<Recibo> recibos;
	private Set<Factura> facturas;
*/
	public Cliente()
	{	
	}
	
	public Cliente(String nombre, String apellido, int dni, CuentaCliente cuenta, Contacto contacto,
			Direccion direccion, Login login) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuenta = cuenta;
		this.contacto = contacto;
		this.direccion = direccion;
		this.login = login;
	}

	//Constructor para modificar datos	
	public Cliente(Contacto contacto, Direccion direccion, Login login) {
		super();
		this.contacto = contacto;
		this.direccion = direccion;
		this.login = login;
	}

	public int getIdCliente() {
		return idCliente;
	}

	protected void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public CuentaCliente getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaCliente cuenta) {
		this.cuenta = cuenta;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

/*	public Set<Recibo> getRecibos() {
		return recibos;
	}

	public void setRecibos(Set<Recibo> recibos) {
		this.recibos = recibos;
	}

	public Set<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}
	
	*/
}
