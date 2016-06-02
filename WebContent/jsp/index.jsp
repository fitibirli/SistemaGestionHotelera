<%@page language="java" import="com.unla.datos.Hotel" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
 <%@include file="header.jsp" %>
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
	<form method="GET" action="/SistemaGestionHotelera/MostrarInicio">
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
	<form method="GET" action="/SistemaGestionHotelera/FormularioRegistro">
	<div class="row registrate">	
		<div class="col-md-4"></div>
		<div class="col-md-4" class="contenedor-link-registrate" style="padding-left: 273px;"><input class="boton-registrar" type="submit" name="Registrate" value="Registrarte aqui"/></div>
		<div class="col-md-4"></div>				
	</div>
	</form>
 <%@include file="footer.jsp" %>
</div>

</body>
</html>