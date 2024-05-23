package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Caballero;
import modelo.Conector;
import modelo.ModeloCaballero;

/**
 * Servlet implementation class Buscador
 */
@WebServlet("/Buscador")
public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Buscador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Conector conector = new Conector();
		ModeloCaballero modeloCaballero = new ModeloCaballero();
		modeloCaballero.setConector(conector);

		ArrayList<Caballero> caballeros = modeloCaballero.getTodos();

		String nombreBuscado = request.getParameter("nombre").toLowerCase(); 
		ArrayList<Caballero> caballerosEncontrados = new ArrayList<>();

		Iterator<Caballero> iterador = caballeros.iterator();

		while (iterador.hasNext()) {
			Caballero caballero = iterador.next();
			if (caballero.getNombre().toLowerCase().contains(nombreBuscado)) {
				caballerosEncontrados.add(caballero);
			}
		}

		request.setAttribute("caballeros", caballerosEncontrados);
		request.getRequestDispatcher("mostrarCaballero.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
