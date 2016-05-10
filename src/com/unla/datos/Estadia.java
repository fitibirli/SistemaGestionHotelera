package com.unla.datos;

import java.util.GregorianCalendar;
import java.util.List;

public class Estadia {

	private int idEstadia;
	private Cliente cliente;
	private List<Habitacion> habitaciones;
	private GregorianCalendar fechaIngreso;
	private GregorianCalendar fechaSalida;
	private TipoEstado tipoEstado;
	private List<Ticket> tickets;

	public int getIdEstadia() {
		return idEstadia;
	}

	public void setIdEstadia(int idEstadia) {
		this.idEstadia = idEstadia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public GregorianCalendar getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(GregorianCalendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public GregorianCalendar getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(GregorianCalendar fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public TipoEstado getTipoEstado() {
		return tipoEstado;
	}

	public void setTipoEstado(TipoEstado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

}
