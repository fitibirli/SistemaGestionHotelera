package com.unla.controladores;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unla.datos.Cliente;
import com.unla.negocio.ClienteABM;
import com.unla.negocio.LoginABM;

import funciones.Funciones;

public class RegistrarseController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		
		try {
			
		ClienteABM clienteABM = new ClienteABM();
		
		
		String fechaNacimientoStr = request.getParameter("fechaNacimiento");
		
		 
		StringTokenizer tokenizer = new StringTokenizer(fechaNacimientoStr,"-");
		
		String[] param = new String[3];
		
		param[0] = tokenizer.nextToken();
		param[1] = tokenizer.nextToken();
		param[2] = tokenizer.nextToken();
		
		GregorianCalendar fechaNacimiento = new GregorianCalendar(Integer.parseInt(param[2]), Integer.parseInt(param[1]), Integer.parseInt(param[0]));
		
		//GregorianCalendar fechaNacimiento = Funciones.traerFecha(fechaNacimientoStr);
		
		clienteABM.crearCliente(request.getParameter("nombre"), request.getParameter("apellido"), Long.parseLong(request.getParameter("dni")), fechaNacimiento);
			
		
		request.getRequestDispatcher("/jsp/bienvenido.jsp").forward(request, response);;

		} catch (Exception e) {
			request.getRequestDispatcher("/jsp/errorlogin.jsp").forward(request, response);;
			
		}

	}

}
