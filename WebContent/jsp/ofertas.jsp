<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>  
<head>  
  <title>Las mejores ofertas</title>
</head>  
<body>  
 <%@include file="header.jsp" %>
  
   <form method="POST" action="/SistemaGestionHotelera/Reserva">
  	<div class="row">	
		<div class="col-md-4"></div>
		<div class="col-md-4"><h1 style="text-align:center">Reservas disponibles</h1>
			<article class="oferta">
				<div style="text-align:center">Tipo: PREMIUM</div>
				<div style="text-align:center">Para 2 personas</div>
				<div style="text-align:center">Precio por dia: $1500</div>
				<div style="text-align:center"><input class="boton" type="submit" name="reservar" value="Reservar"></div>
			</article>
			<article class="oferta">
				<div style="text-align:center">Tipo: PREMIUM</div>
				<div style="text-align:center">Para 2 personas</div>
				<div style="text-align:center">Precio por dia: $1500</div>
				<div style="text-align:center"><input class="boton" type="submit" name="reservar" value="Reservar"></div>
			</article>
			<article class="oferta">
				<div style="text-align:center">Tipo: PREMIUM</div>
				<div style="text-align:center">Para 2 personas</div>
				<div style="text-align:center">Precio por dia: $1500</div>
				<div style="text-align:center"><input class="boton" type="submit" name="reservar" value="Reservar"></div>
			</article>
			<article class="oferta">
				<div style="text-align:center">Tipo: PREMIUM</div>
				<div style="text-align:center">Para 2 personas</div>
				<div style="text-align:center">Precio por dia: $1500</div>
				<div style="text-align:center"><input class="boton" type="submit" name="reservar" value="Reservar"></div>
			</article>
		</div>
		<div class="col-md-4"></div>				
	</div>
	 </form>

		
		 <%@include file="footer.jsp" %>
</body>  
</html>  
