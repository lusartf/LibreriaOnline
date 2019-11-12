<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administracion de Libreria Evergreen</title>
</head>
<body>
	<!-- HEADER -->
	<jsp:directive.include file="header.jsp" />
	<!-- END HEADER -->
	
	<!-- MAIN -->
	<div align="center">
		<h2>Panel de Administración</h2>
	</div>
	<div align="center">
		<hr width="60%"/>
		<h2>Acciones Rápidas</h2>
		<b>
				<a href="create_book">Agregar Libro</a> | 
				<a href="create_user">Agregar Usuario</a> |
				<a href="create_category">Agregar Categoria</a> |
				<a href="create_customer">Agregar Cliente</a> |
		</b>
	</div>
	<div align="center">
		<hr width="60%"/>
		<h2>Ventas Recientes:</h2>
	</div>
	<div align="center">
		<hr width="60%"/>
		<h2>Reseñas Recientes:</h2>
	</div>
	<div align="center">
		<hr width="60%"/>
		<h2>Estadisticas:</h2>
	</div>
	<!-- END_MAIN -->
		
	<!-- FOOTER -->
	<jsp:directive.include file="footer.jsp" />
	<!-- END FOOTER -->
</body>
</html>