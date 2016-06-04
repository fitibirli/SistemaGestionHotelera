package com.unla.datos;

public class EstadoTerminada extends EstadoEstadia {

	@Override
	public EstadoEstadia reservar(Cliente cliente) {
		try{
			
		} catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}

	@Override
	public EstadoEstadia confirmarReserva(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoEstadia confirmarReserva(Empleado empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoEstadia enCurso() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoEstadia terminarEstadia() {
		// TODO Auto-generated method stub
		return null;
	}

}
