package com.unla.controladores;

import java.io.IOException;

import com.unla.datos.Estadia;
import com.unla.negocio.ClienteABM;
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
			ClienteABM clienteABM = Facade.getInstance().getClienteABM();
			
			
			String dni = request.getParameter("dni");
			
			long dniLong = Long.parseLong(dni);
			
			Estadia estadia = estadiaABM.traerEstadiaSegunCliente(dniLong);
			
			
			if(estadia != null){
				
				request.getRequestDispatcher("/jsp/mostrarconsumos.jsp").forward(request, response);
			}else{
				request.getRequestDispatcher("/jsp/errorlogin.jsp").forward(request, response);
			}
			

		}

}


