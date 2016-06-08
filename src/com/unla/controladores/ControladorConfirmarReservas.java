package com.unla.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unla.negocio.EstadiaABM;
import com.unla.negocio.Facade;


public class ControladorConfirmarReservas extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
			
			
			//traer todas las estadias y listarlas en otra pantalla, cuando le de click a una que haga reservar()
			
			EstadiaABM estadiaABM = Facade.getInstance().getEstadiaABM();
			
			request.setAttribute("estadias", estadiaABM.traerEstadias());
			
			request.getRequestDispatcher("/jsp/mostrarreservassinconfirmar.jsp").forward(request, response);

		}
		

}


