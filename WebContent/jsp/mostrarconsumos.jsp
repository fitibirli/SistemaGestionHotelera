<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.unla.datos.Estadia" %>
    <%@ page import="com.unla.datos.Ticket" %>
    <%@ page import="java.util.List" %>
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
			<% Estadia estadia = request.getAttribute("estadia"); %>
			<% List<Ticket> tickets = estadia.getTickets(); %>
			<%for(Ticket ticket: tickets){ %>
				<div>
					
				</div>
			<%} %>
		</div>
		<div class="col-md-4"></div>				
	</div>
	
 
	<%@include file="footer.jsp" %>
  
</body>
</html>