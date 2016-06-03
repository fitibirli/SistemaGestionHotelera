<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header><%@include file="header.jsp" %></header>
	<section>
		
	<div class="row">	
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div>
				<form method="POST" action="/SistemaGestionHotelera/Registrarse">
						<div>Nombre:</div> <div><input type="text" name="nombre" /></div>
						<div>Apellido:</div> <div><input type="text" name="apellido"/></div>
						<div>Dni:</div> <div><input type="text" name="dni" /></div>
						<div>Fecha de nacimiento:</div> <div><input type="date" name="fechaNacimiento" /></div>	
						<div>Usuario:</div> <div><input type="text" name="usuario" /></div>
						<div>Contraseña:</div> <div><input type="password" name="contrasenia" /></div>
						<div>Mail:</div> <div><input type="text" name="mail" /></div>
					<input type="submit" value="Enviar"/>
				</form>
			</div>
		</div>
		<div class="col-md-4"></div>				
	</div>
				
		
	</section>
	<footer></footer>
 <%@include file="footer.jsp" %>
</body>
</html>