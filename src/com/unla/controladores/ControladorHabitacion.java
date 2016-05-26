package com.unla.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unla.datos.Habitacion;

public class ControladorHabitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws

	ServletException, IOException {

		try {
		
		/* clienteABM traerHabitacionesDisponibles() y 
		 * enviar esa lista a la vista para que la vea
		 * el cliente y pueda reservar 
		*/
			request.getRequestDispatcher("/jsp/verofertas.jsp").forward(request, response);
			;

		} catch (Exception e) {
			request.getRequestDispatcher("/jsp/errorDisponibilidad.jsp").forward(request, response);
			;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			request.getRequestDispatcher("/jsp/verofertas.jsp").forward(request, response);
			;

		} catch (Exception e) {
			request.getRequestDispatcher("/jsp/errorDisponibilidad.jsp").forward(request, response);
			;

		}

	}
}
