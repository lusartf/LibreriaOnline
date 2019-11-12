<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Customer</title>
</head>
<body>
	<!-- HEADER -->
	<jsp:directive.include file="header.jsp" />
	<!-- END HEADER -->
	
	<!-- BODY -->
	<div align="center">
		<h3>Por favor, Identifiquese:</h3>
		<form action="">
			Email: <input type="text" size="10"/><br/>
			Password: <input type="password" size="10"/>
			<input type="submit"  value="login" />
		</form>
	</div>
	<!-- END BODY -->
	
	<!-- FOOTER -->
	<jsp:directive.include file="footer.jsp" />
	<!-- END FOOTER -->
	
</body>
</html>