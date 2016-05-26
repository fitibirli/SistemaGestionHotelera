package com.unla.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unla.datos.Cliente;
import com.unla.datos.Hotel;
import com.unla.datos.Login;
import com.unla.negocio.LoginABM;
public class ControladorLogin extends HttpServlet {
	Hotel hotel=Hotel.getInstanciaHotel();		
	private static final long serialVersionUID = 1L;
	
	/* NO deberia atender por GET */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		
		try {
		LoginABM loginABM = new LoginABM();

		String usuario = request.getParameter("usuario");
		String contrasenia = request.getParameter("clave");
		
		Cliente cliente = loginABM.validarCliente(usuario, contrasenia);
		
		request.setAttribute("usuario", cliente.getLogin().getUsuario());
		request.setAttribute("contrasenia", cliente.getLogin().getContrasenia());

		request.getRequestDispatcher("/jsp/bienvenido.jsp").forward(request, response);;

		} catch (Exception e) {
			request.getRequestDispatcher("/jsp/errorlogin.jsp").forward(request, response);;
		}

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		
		try {
		LoginABM loginABM = new LoginABM();
		String usuario = request.getParameter("usuario");
		String contrasenia = request.getParameter("clave");
				
		Cliente cliente = loginABM.validarCliente(usuario, contrasenia);
		
		request.setAttribute("usuario", cliente.getLogin().getUsuario());
		request.setAttribute("contrasenia", cliente.getLogin().getContrasenia());
		request.getRequestDispatcher("/jsp/bienvenido.jsp").forward(request, response);;

		} catch (Exception e) {
			request.getRequestDispatcher("/jsp/errorlogin.jsp").forward(request, response);;
			
		}

	}
}
