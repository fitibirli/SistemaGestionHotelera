package com.unla.datos;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

public class Estadia {

	private int idEstadia;
	private Cliente cliente;
	private GregorianCalendar fechaIngreso;
	private GregorianCalendar fechaSalida;
	private EstadoEstadia estado;
	private List<Ticket> tickets;
	private Set<Habitacion> habitaciones;

	public Estadia()
	{
	}
	
	public Estadia(Cliente cliente, GregorianCalendar fechaIngreso, GregorianCalendar fechaSalida) {
		super();
		this.cliente = cliente;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
	}

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
	
	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Set<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Set<Habitacion> habitaciones) {
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

	@Override
	public String toString() {
		return "Estadia [cliente=" + cliente + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida
				+ ", estado=" + estado + "]";
	}
	
	
}
