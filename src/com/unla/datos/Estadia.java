package com.unla.datos;

import java.util.GregorianCalendar;
import java.util.List;

public class Estadia {

	private int idEstadia;
	private Cliente cliente;
	private List<Habitacion> habitaciones;
	private GregorianCalendar fechaIngreso;
	private GregorianCalendar fechaSalida;
	private EstadoEstadia estado;
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

	public EstadoEstadia getEstado() {
		return estado;
	}

	public void setEstado(EstadoEstadia estado) {
		this.estado = estado;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public void cancelarReserva()
	{
		this.setEstado(this.getEstado().terminarEstadia());
	}
	
	public void reservarEstadia(Cliente cliente)
	{
		this.setEstado(this.getEstado().reservar(cliente));
	}
	
	public void confirmar(Cliente cliente)
	{
		this.setEstado(this.getEstado().confirmarReserva(cliente));
	}
	
	public void confirmar(Empleado empleado)
	{
		this.setEstado(this.getEstado().confirmarReserva(empleado));
	}
	
	public void agregarTicket(Ticket ticket){
		
		this.tickets.add(ticket);
		
	}
}
