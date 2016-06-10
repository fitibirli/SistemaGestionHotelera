<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvendido, Sistema Gestion Hotelera:</title>
</head>
<body>
 <%@include file="header.jsp" %>
	<h1>Bienvenido Usuario:  <%=request.getAttribute("usuario")%></h1>
	
	<h2>Que desea realizar?:</h2>
	
	<div>
		Reserva
		<form method="POST" action="/SistemaGestionHotelera/EmitirFactura">
		Emitir y cobrar factura
			<div class="input-registro"><input class="boton" type="submit" value="Emitir Factura"/></div>
		</form>
		
		<form method="POST" action="/SistemaGestionHotelera/ConfirmarReservas">
		Confirmar reservas
			<div class="input-registro"><input class="boton" type="submit" value="Confirmar reservas"/></div>
		</form>
		
		Generar Ticket de mantenimiento
		<form method="POST" action="/SistemaGestionHotelera/GenerarConsumo">
		Generar Ticket de consumo
			<div class="input-registro"><input class="boton" type="submit" value="Generar Ticket"/></div>
		</form>
		
		Generar Ticket de reparacion
		
	
	</div>
	 <%@include file="footer.jsp" %>
</body>
</html>