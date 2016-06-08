package com.unla.controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unla.datos.Estadia;
import com.unla.datos.ItemsDeFactura;
import com.unla.datos.Ticket;
import com.unla.negocio.EstadiaABM;
import com.unla.negocio.Facade;


public class ControladorGenerarFactura extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			doPost(request, response);

		}
		
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			EstadiaABM estadiaABM = Facade.getInstance().getEstadiaABM();
			
			String dni = request.getParameter("dni");
			
			long dniLong = Long.parseLong(dni);
			
			Estadia estadia = estadiaABM.traerEstadiaSegunCliente(dniLong);
			
			
			List<Ticket> tickets = estadia.getTickets();
			
			Map<String, ItemsDeFactura> itemfactura = agruparTickets(tickets);
			
			request.setAttribute("itemsFactura", itemfactura);
			
			if(itemfactura != null){
				
				request.getRequestDispatcher("/jsp/mostraritemsfactura.jsp").forward(request, response);
			}else{
				request.getRequestDispatcher("/jsp/errorlogin.jsp").forward(request, response);
			}
			

		}
		
		
		private Map<String, ItemsDeFactura> agruparTickets(List<Ticket> tickets){
			
			HashMap<String, ItemsDeFactura> map = new HashMap<String,ItemsDeFactura>();
			
			
			for (Ticket ticket : tickets) {
				if(map.containsKey(ticket.getTipoTicket().getDescripcion())){
					
					map.get(ticket.getTipoTicket().getDescripcion()).agregarTicket(ticket);
					
				}else{
					ItemsDeFactura itemFactura = new ItemsDeFactura();
					itemFactura.agregarTicket(ticket);
					map.put(ticket.getTipoTicket().getDescripcion(), itemFactura);
					
				}
			}
			
			return map;
			
		}

}


