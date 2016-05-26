<%@page language="java" import="com.unla.datos.Hotel" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema Gestion Hotelera</title>
</head>
<body>

<%!Hotel hotel=Hotel.getInstanciaHotel();%>
###########<%=hotel.getNombre()%>##########<%=hotel.getCuil()%>############<%=hotel.getContacto().getEmail()%>

	<FORM method="POST" action="/SistemaGestionHotelera/MostrarInicio">
		Login<BR>
		<BR>
		<TABLE border="0">
			<TR>
				<TD>Usuario:</TD>
				<TD><INPUT required name="usuario"></TD>
			</TR>
			
			<TR>
				<TD>Contraseña:</TD>
				<TD><INPUT name="contrasenia" required type="password"></TD>
			</TR>
					
			<TR>
				<TD><INPUT type="submit" name="ingresar" value="Ingresar"></TD>
			</TR>
		</TABLE>
	</FORM>
###########<%=hotel.getNombre()%>##########<%=hotel.getCuil()%>############<%=hotel.getContacto().getEmail()%>	
	<a href="/SistemaGestionHotelera/jsp/registrarse.jsp">Registrate aqui.</a>

</body>
</html>