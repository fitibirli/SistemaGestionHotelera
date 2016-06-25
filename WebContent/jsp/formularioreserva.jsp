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
			<form method="POST" action="/SistemaGestionHotelera/Reservar">
			
						<div class="input-registro"><p class="texto-normal">Fecha de ingreso:</p></div> <div><input type="date" name="fechaIngreso" /></div>	
						<div class="input-registro"><p class="texto-normal">Fecha de egreso:</p></div> <div><input type="date" name="fechaEgreso" /></div>	
						<div class="input-registro"><input class="boton" type="submit" value="Consultar"/></div>
			</form>	
		</div>
		<div class="col-md-4"></div>				
	</div>
	
 
  <%@include file="footer.jsp" %>

</body>
</html>