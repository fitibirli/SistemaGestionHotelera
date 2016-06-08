<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.unla.datos.TipoTicket" %>
    <%@ page import="java.util.List" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<form method="POST" action="/SistemaGestionHotelera/MostrarConsumos">
						Elegir el tipo de producto: 
						<select id="tiposTicket">
        					<c:forEach var="descripcion" items="${tiposTicket}">
            					<option value="${descripcion}">${descripcion}</option>
        					</c:forEach>
    					</select>
    					
    					Dni del cliente:<input type="text" name="dni">
    					<input type="submit" value="Agregar consumo">
			</form>	
		</div>
		<div class="col-md-4"></div>				
	</div>
	
 
  <%@include file="footer.jsp" %>

</body>
</html>