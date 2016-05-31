<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header></header>
	<section>
		<form method="POST" action="/SistemaGestionHotelera/Registrarse">
			<div><CENTER>
				<BR>Nombre: <input type="text" name="nombre" />
				<BR>Apellido: <input type="text" name="apellido"/>
				<BR>Dni: <input type="text" name="dni" />
				<BR>Fecha de nacimiento: <input type="date" name="fechaNacimiento" />	
				<BR>Usuario: <input type="text" name="usuario" />
				<BR>Contraseña: <input type="password" name="contrasenia" />
				<BR>Mail: <input type="text" name="mail" />
				</CENTER>
			<input type="submit" value="Enviar"/>
			</div>
		</form>
	</section>
	<footer></footer>

</body>
</html>