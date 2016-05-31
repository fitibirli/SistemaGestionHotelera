<%@page language="java" import="com.unla.datos.Hotel" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema Gestion Hotelera</title>
</head>
<body>

<%!Hotel hotel=Hotel.getInstanciaHotel();%>
<h1>###########<%=hotel.getNombre()%>###########</h1>

	<FORM method="POST" action="/SistemaGestionHotelera/MostrarInicio">
		Login<BR>
		<BR>
		<TABLE border="0">
			<TR>
				<TD>Usuario:</TD>
				<TD><INPUT required name="usuario"></TD>
			</TR>
			
			<TR>
				<TD>Password:</TD>
				<TD><INPUT name="contrasenia" required type="password"></TD>
			</TR>
					
			<TR>
				<TD><INPUT type="submit" name="ingresar" value="Ingresar"></TD>
			</TR>
		</TABLE>
	</FORM>
<h2>###########<%=hotel.getNombre()%>##########<%=hotel.getContacto().getEmail()%></h2>	

<h3><i>Si no estas registrado, registrate!</i></h3>
	<a href="/SistemaGestionHotelera/jsp/registrarse.jsp">Registrate aqui.</a>
	<a href="/SistemaGestionHotelera/jsp/verofertas.jsp">Ver ofertas!</a>

</body>
</html>

<!--Referencias básicas HTML
• Formato del párrafo:
– <P>: Nuevo Párrafo
– <BR>: Salto de línea
– <PRE></PRE>: Texto con fuente de ancho fijo
– <CENTER></CENTER>: Centrar texto
• Formato del texto:
– <B></B>: Negrita
– <I></I>: Itálica
– <U></U>: Subrayado
– <SUB></SUB>: Subíndice
– <SUP></SUP>: Superíndice
– <H1></H1>…<H6></H6>: Cabeceras
Listas:
– <UL></UL>: Sin numerar
– <OL></OL>: Numerada

-->