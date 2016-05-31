package com.unla.datos;

public abstract class EstadoEstadia {

	private Cliente cliente;
	private Empleado empleado;
	
	public abstract EstadoEstadia reservar(Cliente cliente);
	public abstract EstadoEstadia confirmarReserva(Cliente cliente);
	public abstract EstadoEstadia confirmarReserva(Empleado empleado);
	public abstract EstadoEstadia enCurso();
	public abstract EstadoEstadia terminarEstadia();
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	

}
