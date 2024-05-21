<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    <!doctype html>
    <html lang="en">
      <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Caballero</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
      </head>
      <body>
       
        <div class="container">
            <div class="row">
                <div class="col">
                    <a href="IndexCaballero">Inicio</a>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <form action="Store" method="post">
                    	<p>Nombre: <input type="text" name="nombre"/></p>
                    	<p>Fuerza: <input type="text" name="fuerza"/></p>
                    	<p>Experiencia: <input type="text" name="experiencia"/></p>
                    	<p>Foto: <input type="text" name="foto"/></p>
                    	<p>Arma: <input type="text" name="arma_id"/></p>
                    	<p>Escudo: <input type="text" name="escudo_id"/></p>
						<input type="submit" value="Guardar" name="Guardar">
					</form>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
      </body>
    </html>