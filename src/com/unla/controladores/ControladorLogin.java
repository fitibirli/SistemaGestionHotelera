package com.unla.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unla.datos.Login;
public class ControladorLogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		
		try {
		//LoginABM lbm1 = new LoginABM();
		String usuario = request.getParameter("usuario");
		String contrasenia = request.getParameter("clave");
		//Login login = new Login(usuario,contrasenia, null);
		request.setAttribute("usuario", usuario);
		request.setAttribute("contrasenia", contrasenia);
		request.getRequestDispatcher("/jsp/bienvenido.jsp").forward(request, response);;

		} catch (Exception e) {
			response.sendError(500, "");
		}

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		
		try {
		//LoginABM lbm1 = new LoginABM();
		String usuario = request.getParameter("usuario");
		String contrasenia = request.getParameter("clave");
		//Login login = new Login(usuario,contrasenia, null);
		request.setAttribute("usuario", usuario);
		request.setAttribute("contrasenia", contrasenia);
		request.getRequestDispatcher("/jsp/bienvenido.jsp").forward(request, response);;

		} catch (Exception e) {
			response.sendError(500, "");
		}

	}
}
