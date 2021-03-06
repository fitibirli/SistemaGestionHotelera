package com.unla.controladores;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unla.excepciones.YaExisteClienteException;
import com.unla.negocio.ClienteABM;
import com.unla.negocio.Facade;

public class ControladorModificarDatosCliente extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		
		try {
			
		ClienteABM clienteABM = Facade.getInstance().getClienteABM();
		
		
		String fechaNacimientoStr = request.getParameter("fechaNacimiento");
		
		 
		StringTokenizer tokenizer = new StringTokenizer(fechaNacimientoStr,"-");
		
		String[] param = new String[3];
		
		param[0] = tokenizer.nextToken();
		param[1] = tokenizer.nextToken();
		param[2] = tokenizer.nextToken();
		
		GregorianCalendar fechaNacimiento = new GregorianCalendar(Integer.parseInt(param[2]), Integer.parseInt(param[1]), Integer.parseInt(param[0]));
		
		//GregorianCalendar fechaNacimiento = Funciones.traerFecha(fechaNacimientoStr);
		
		clienteABM.crearCliente(request.getParameter("nombre"), request.getParameter("apellido"), Integer.parseInt(request.getParameter("dni")), fechaNacimiento, request.getParameter("usuario"), request.getParameter("contrasenia"));
			
		
		request.getRequestDispatcher("/jsp/bienvenido.jsp").forward(request, response);;

		} catch(YaExisteClienteException e){
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("/jsp/errorlogin.jsp").forward(request, response);;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
