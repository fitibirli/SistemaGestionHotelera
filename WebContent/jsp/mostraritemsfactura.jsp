<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.unla.datos.Estadia" %>
    <%@ page import="com.unla.datos.Ticket" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.Map" %>
    <%@ page import="com.unla.datos.ItemsDeFactura" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<% Map<String, ItemsDeFactura> hash = (Map<String, ItemsDeFactura>) request.getAttribute("itemsFactura"); %>
	
	<% long precioTotalFactura = 0; %>
	
	<% for(String key : hash.keySet()){ %>
	
		<div>Descripcion: <%= key %></div>
		<div>Cantidad: <%= hash.get(key).getCantidadDeTickets() %></div>
		<div>Precio(Subtotal): <%= hash.get(key).getPrecioTotal() %></div>
		<% precioTotalFactura += hash.get(key).getPrecioTotal(); %>
	<%} %>

	<div>Precio Total facturado: <%= precioTotalFactura %></div>
</body>
</html>