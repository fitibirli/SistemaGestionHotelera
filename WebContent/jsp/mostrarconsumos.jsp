<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$('#consultar').click(function (){
			var dni = $('#dni').val();
			$.ajax({
				
				method: "POST",
					url:"GenerarFactura",
					data: {dni:dni},
					async: false
			}).done(function (data){
				$("#itemsFactura").html(data);
			});
			
		});
	});
	

</script>
</head>
<body>
	
	<%@include file="header.jsp" %>
 
	<div class="row">	
		<div class="col-md-4">
		
			<div>
				Ingrese DNI a facturar: <input type="text" name="dni">
			</div>
			<div>
				<input type="button" value="Consultar" id="consultar">
			</div>
		</div>
		<div class="col-md-4" id="itemsFactura">
			
		
			
		</div>
		<div class="col-md-4"></div>				
	</div>
	
 
	<%@include file="footer.jsp" %>
  
</body>
</html>