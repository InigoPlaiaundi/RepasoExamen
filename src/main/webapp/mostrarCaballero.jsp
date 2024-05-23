<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Caballeros</title>
</head>
<body>
	<div class="container">
		<div class="col">
			<a href="IndexCaballero">Volver</a>
		</div>

		<div class="row">
			<div class="col">
				<!-- ${caballeros} -->
				<table class="table">
					<thead>
						<tr>
							<th scope="col">nombre</th>
							<th scope="col">fuerza</th>
							<th scope="col">experiencia</th>
							<th scope="col">foto</th>
							<th scope="col">arma</th>
							<th scope="col">escudo</th>

							<th></th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${caballeros}" var="caballeros">
							<tr>
								<td>${caballeros.nombre}</td>
								<td>${caballeros.fuerza}</td>
								<td>${caballeros.experiencia}</td>
								<td>${caballeros.foto}</td>
								<td>${caballeros.arma.nombre}</td>
								<td>${caballeros.escudo.nombre}</td>
								<td></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>