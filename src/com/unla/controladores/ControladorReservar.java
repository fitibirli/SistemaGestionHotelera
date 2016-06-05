package com.unla.controladores;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.unla.datos.Cliente;
import com.unla.datos.Estadia;
import com.unla.negocio.EstadiaABM;
import com.unla.negocio.Facade;


public class ControladorReservar extends HttpServlet {

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
			
			EstadiaABM estadiaABM = Facade.getInstance().getEstadiaABM();
			
			HttpSession session = request.getSession();
			
			Cliente cliente = (Cliente) session.getAttribute("cliente");
			
			/*fecha ingreso*/
			String fechaIngresoStr = request.getParameter("fechaIngreso");
			
			 
			StringTokenizer tokenizer = new StringTokenizer(fechaIngresoStr,"-");
			
			String[] param = new String[3];
			
			param[0] = tokenizer.nextToken();
			param[1] = tokenizer.nextToken();
			param[2] = tokenizer.nextToken();
			
			GregorianCalendar fechaIngreso = new GregorianCalendar(Integer.parseInt(param[2]), Integer.parseInt(param[1]), Integer.parseInt(param[0]));
			
			
			/*fecha egreso*/
			String fechaEgresoStr = request.getParameter("fechaEgreso");
			
			 
			StringTokenizer tokenizer2 = new StringTokenizer(fechaEgresoStr,"-");
			
			String[] param2 = new String[3];
			
			param2[0] = tokenizer2.nextToken();
			param2[1] = tokenizer2.nextToken();
			param2[2] = tokenizer2.nextToken();
			
			GregorianCalendar fechaEgreso = new GregorianCalendar(Integer.parseInt(param2[2]), Integer.parseInt(param2[1]), Integer.parseInt(param2[0]));
			
			
			
			Estadia estadiaReservada = estadiaABM.crearEstadia(fechaIngreso, fechaEgreso, cliente);
			
			request.setAttribute("estadiaReservada", estadiaReservada);
			
			request.getRequestDispatcher("/jsp/reservapendientedeconfirmacion.jsp").forward(request, response);

		}
		
}


