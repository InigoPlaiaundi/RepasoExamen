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

<title>Index</title>
</head>
<body>


	<div class="container">
		<div class="row">

			<!-- Mensajes de resultado -->
			<c:if test="${msg=='petao'}">
				<div class="alert alert-danger alert-dismissible fade show m-0"
					role="alert">
					<strong>Error:</strong> No validado.
					<button type="button" class="btn-close" data-bs-dismiss="alert"
						aria-label="Close"></button>
				</div>
			</c:if>

			<c:if test="${msg== 'correcto'}">

				<div class="alert alert-success alert-dismissible fade show m-0"
					role="alert">
					<strong>Ok!</strong> Caballero insertado correctamente.
					<button type="button" class="btn-close" data-bs-dismiss="alert"
						aria-label="Close"></button>
				</div>
			</c:if>

			<div class="col">
				<a href="Create">Crear</a>
			</div>

			<form action="Buscador" method="post">
				<div class="mb-3">
					<label for="exampleInputEmail1"  class="form-label">Nombre</label> <input type="text" name="nombre" class="form-control">
				</div>
				
				
				<button type="submit" class="btn btn-primary">Buscar</button>
			</form>
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

						<c:forEach items="${caballeros}" var="caballero">
							<tr>
								<td>${caballero.nombre}</td>
								<td>${caballero.fuerza}</td>
								<td>${caballero.experiencia}</td>
								<td>${caballero.foto}</td>
								<td>${caballero.arma.nombre}</td>
								<td>${caballero.escudo.nombre}</td>
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