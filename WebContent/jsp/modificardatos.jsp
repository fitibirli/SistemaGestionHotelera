<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	
	<div class="row">	
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="contenedor-registro">
				<form method="POST" action="/SistemaGestionHotelera/ModificarDatos">
						<div class="input-registro"><p class="texto-normal">Nombre:</p></div> <div><input type="text" name="nombre" /></div>
						<div class="input-registro"><p class="texto-normal">Apellido:</p></div> <div><input type="text" name="apellido"/></div>
						<div class="input-registro"><p class="texto-normal">Fecha de nacimiento:</p></div> <div><input type="date" name="fechaNacimiento" /></div>	
						<div class="input-registro"><p class="texto-normal">Mail:</p></div> <div><input type="text" name="mail" /></div>
						<div class="input-registro"><input class="boton" type="submit" value="Enviar"/></div>
				</form>
			</div>
		</div>
		<div class="col-md-4"></div>				
	</div>
	
	<%@include file="footer.jsp" %>
</body>
</html>