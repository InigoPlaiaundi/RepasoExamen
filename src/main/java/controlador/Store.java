package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Caballero;
import modelo.Conector;
import modelo.ModeloArma;
import modelo.ModeloCaballero;
import modelo.ModeloEscudo;

/**
 * Servlet implementation class Store
 */
@WebServlet("/Store")
public class Store extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recibir los tatos del caballero

		String nombre = request.getParameter("nombre");
		int fuerza = Integer.parseInt(request.getParameter("fuerza"));
		int experiencia = Integer.parseInt(request.getParameter("experiencia"));
		String foto = request.getParameter("foto");
		int arma_id = Integer.parseInt(request.getParameter("arma_id"));
		int escudo_id = Integer.parseInt(request.getParameter("escudo_id"));

		// almacenar la tarea en BBDD

		Conector conector = new Conector();

		Caballero caballero = new Caballero();
		ModeloArma modeloArma = new ModeloArma();
		modeloArma.setConector(conector);

		ModeloEscudo modeloEscudo = new ModeloEscudo();
		modeloEscudo.setConector(conector);

		caballero.setNombre(nombre);
		caballero.setFuerza(fuerza);
		caballero.setExperiencia(experiencia);
		caballero.setFoto(foto);
		caballero.setArma(modeloArma.getArma(arma_id));
		caballero.setEscudo(modeloEscudo.getEscudo(escudo_id));

		ModeloCaballero modeloCaballero = new ModeloCaballero();
		modeloCaballero.setConector(conector);
		modeloCaballero.insert(caballero);

		// abrir lo que quiera, en mi caso inicio
		
		response.sendRedirect("IndexCaballero");
	}

}
