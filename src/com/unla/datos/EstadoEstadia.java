package com.unla.datos;

public abstract class EstadoEstadia {

//sin atributos
	
	
	private int idEstadoEstadia;
	
	public abstract EstadoEstadia reservar(Cliente cliente);
	public abstract EstadoEstadia confirmarReserva(Cliente cliente);
	public abstract EstadoEstadia confirmarReserva(Empleado empleado);
	public abstract EstadoEstadia enCurso();
	public abstract EstadoEstadia terminarEstadia();
	
	public EstadoEstadia(){
		
	}
	public int getIdEstadoEstadia() {
		return idEstadoEstadia;
	}
	public void setIdEstadoEstadia(int idEstadoEstadia) {
		this.idEstadoEstadia = idEstadoEstadia;
	}
	
	

}
