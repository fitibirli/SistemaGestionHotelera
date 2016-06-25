<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>  
<head>  
  <title>Hotel UNLa.: Las mejores ofertas</title>
</head>  
<body>  
 <%@include file="header.jsp" %>
  
   <form method="POST" action="/SistemaGestionHotelera/Reserva">
  	<div class="row">	
		<div class="col-md-4"></div>
		<div class="col-md-4"><h1 style="text-align:center">Reservas disponibles</h1>

			<article class="oferta">		
				<img class="imagen-ofertas" src="img/suite.jpg">
				<div style="text-align:center">Tipo: SUITE</div>
				<div style="text-align:center">Para 2 personas</div>
				<div style="text-align:center">Precio por dia: $3900</div>
				<div style="text-align:center"><input class="boton" type="submit" name="reservar" value="Reservar"></div>
			</article>
			<article class="oferta">
			<div style="text-align:left">
				<img class="imagen-ofertas" src="img/premiun.jpg">
			</div>
				<div style="text-align:center">Tipo: PREMIUN</div>
				<div style="text-align:center">Para 2 personas</div>
				<div style="text-align:center">Precio por dia: $1900</div>
				<div style="text-align:center"><input class="boton" type="submit" name="reservar" value="Reservar"></div>
			</article>
			<article class="oferta">
				<img class="imagen-ofertas" src="img/base.jpg">
				<div style="text-align:center">Tipo: BASE</div>
				<div style="text-align:center">Para 2 personas</div>
				<div style="text-align:center">Precio por dia: $1200</div>
				<div style="text-align:center"><input class="boton" type="submit" name="reservar" value="Reservar"></div>
			</article>
		</div>
		<div class="col-md-4"></div>				
	</div>
	 </form>

		
		 <%@include file="footer.jsp" %>
</body>  
</html>  
