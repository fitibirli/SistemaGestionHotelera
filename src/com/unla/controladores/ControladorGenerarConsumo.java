package com.unla.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unla.datos.Estadia;
import com.unla.datos.Ticket;
import com.unla.datos.TipoTicket;
import com.unla.negocio.EstadiaABM;
import com.unla.negocio.Facade;
import com.unla.negocio.TipoTicketABM;




public class ControladorGenerarConsumo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
			
			doPost(request, response);	
			
			

		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
			
			String tipoTicketStr = (String) request.getAttribute("descripcion");
			
			TipoTicketABM tipoTicketABM = Facade.getInstance().getTipoTicketABM();
			
			TipoTicket tipoTicket = tipoTicketABM.traerTipoTicketSegunDesc(tipoTicketStr);
			
			EstadiaABM estadiaABM = Facade.getInstance().getEstadiaABM();
			
			String dni = (String) request.getAttribute("dni");
					
			long dniLong = Long.parseLong(dni);
			
			Estadia estadia = estadiaABM.traerEstadiaSegunCliente(dniLong);

			Ticket ticket = new Ticket();
			
			ticket.setTipoTicket(tipoTicket);
			
			ticket.setDescripcion(tipoTicketStr);
			
			ticket.setPrecio(tipoTicket.getPrecio());
			
			estadia.agregarTicket(ticket);
			
			estadiaABM.actualizarEstadia(estadia);
			
			request.getRequestDispatcher("/jsp/bienvenidoempleado.jsp").forward(request, response);
		}
		

}


