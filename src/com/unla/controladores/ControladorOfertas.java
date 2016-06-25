package com.unla.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorOfertas
 */

public class ControladorOfertas extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ControladorOfertas() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/jsp/ofertas.jsp").forward(request, response);
		
		String articulo=request.getParameter("articulo");
		
		if(articulo=="reservar"){
			request.getRequestDispatcher("/jsp/confirmarreserva.jsp").forward(request, response);
					
		}
	}

}
