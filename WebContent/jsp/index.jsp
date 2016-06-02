<%@page language="java" import="com.unla.datos.Hotel" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/styles.css" rel="stylesheet" type="text/css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Sistema Gestion Hotelera</title>
</head>
<body>

<div class="im-centered">
	<form method="POST" action="/SistemaGestionHotelera/MostrarInicio">
	<div class="row contenedor-titulo text-center">
		<div class="col-md-4"><span><img class="imagen-unla" src="img/Lanus.jpg"><h1 class="titulo">Bienvenido a Hotel UNLa.:</h1></span></div>
		<div class="col-md-4"></div>
		<div class="col-md-4"></div>
	</div>
	<div class="row">	
		<div class="col-md-4"></div>
		<div class="col-md-4 text-center">
			<div class="contenedor-login">
				<p>Usuario:</p><input required name="usuario" type="text"/>
				<p class="boton-margen-inferior">Contrasena:</p><input name="contrasenia" required type="password"/></p>
				<p class="boton-margen-inferior"><input class="boton" type="submit" name="ingresar" value="Ingresar"/></p>
			</div>
		</div>
		<div class="col-md-4"></div>		
	</div>
	</form>
	<div class="row registrate">	
		<div class="col-md-4"></div>
		<div class="col-md-4" class="contenedor-link-registrate" style="padding-left: 273px;"><a class="link-registrate" href="/SistemaGestionHotelera/jsp/registrarse.jsp">Registrate aqui.</a></div>
		<div class="col-md-4"></div>				
	</div>
	<div class="row footer">	
		<div class="col-md-4"></div>
		<div class="col-md-4 copyright">Copyright @ 2016</div>
		<div class="col-md-4"></div>				
	</div>
</div>

</body>
</html>