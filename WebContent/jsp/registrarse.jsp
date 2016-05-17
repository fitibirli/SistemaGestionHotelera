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
			<div>
				Nombre: <input type="text" name="nombre" />
				Apellido: <input type="text" name="apellido"/>
				Dni: <input type="text" name="dni" />
				Fecha de nacimiento: <input type="date" name="fechaNacimiento" />
				
				Usuario: <input type="text" name="usuario" />
				Contraseña: <input type="password" name="contrasenia" />
				Mail: <input type="text" name="mail" />
			
			<input type="submit" value="Enviar"/>
			</div>
		</form>
	</section>
	<footer></footer>

</body>
</html>