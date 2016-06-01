package com.unla.datos;

public abstract class EstadoEstadia {

//sin atributos
	
	public abstract EstadoEstadia reservar(Cliente cliente);
	public abstract EstadoEstadia confirmarReserva(Cliente cliente);
	public abstract EstadoEstadia confirmarReserva(Empleado empleado);
	public abstract EstadoEstadia enCurso();
	public abstract EstadoEstadia terminarEstadia();
	
	

}
