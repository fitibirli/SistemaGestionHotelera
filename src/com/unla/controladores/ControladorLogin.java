package com.unla.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.unla.datos.Cliente;
import com.unla.datos.Empleado;
import com.unla.datos.Hotel;
import com.unla.negocio.Facade;
import com.unla.negocio.LoginABM;
public class ControladorLogin extends HttpServlet {
	Hotel hotel=Hotel.getInstanciaHotel();		
	private static final long serialVersionUID = 1L;
	
	/* NO deberia atender por GET */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		
		doPost(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		Facade facade = Facade.getInstance();
		
		try {
			
		LoginABM loginABM = facade.getLoginABM();
		String usuario = request.getParameter("usuario");
		String contrasenia = request.getParameter("clave");
				
		Cliente cliente = loginABM.validarCliente(usuario, contrasenia);
		
		if(cliente !=null){ //Si es un cliente
			request.setAttribute("usuario", cliente.getLogin().getUsuario());
			request.setAttribute("contrasenia", cliente.getLogin().getClave());
			session.setAttribute("cliente", cliente);
			request.getRequestDispatcher("/jsp/bienvenido.jsp").forward(request, response);	
		}else{//Si es un empleado
			
			Empleado empleado = loginABM.validarEmpleado(usuario, contrasenia);
			
			
			if(empleado != null){
				request.setAttribute("usuario", empleado.getLogin().getUsuario());
				request.setAttribute("contrasenia", empleado.getLogin().getClave());
				session.setAttribute("empleado", empleado);
				request.getRequestDispatcher("/jsp/bienvenidoempleado.jsp").forward(request, response);	
				
				
			}else{
				request.getRequestDispatcher("/jsp/errorlogin.jsp").forward(request, response);		
			}
		}
		
		
		} catch (Exception e) {
			request.getRequestDispatcher("/jsp/errorlogin.jsp").forward(request, response);
			
		}

	}
}
