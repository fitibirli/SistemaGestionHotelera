package com.unla.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unla.datos.TipoTicket;
import com.unla.negocio.Facade;
import com.unla.negocio.TipoTicketABM;


public class ControladorConsumoCliente extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
			
			TipoTicketABM tipoTicketABM = Facade.getInstance().getTipoTicketABM();
			
			List<TipoTicket> tipoTickets = tipoTicketABM.traerTiposDeTicket();
			
			request.setAttribute("tiposTicket", tipoTickets);
			
			request.getRequestDispatcher("/jsp/consumocliente.jsp").forward(request, response);

		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
			
			doGet(request, response);

		}
		

}


