package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Arma;
import modelo.Caballero;
import modelo.Conector;
import modelo.Escudo;
import modelo.ModeloArma;
import modelo.ModeloCaballero;
import modelo.ModeloEscudo;

/**
 * Servlet implementation class Index
 */
@WebServlet("/IndexCaballero")
public class IndexCaballero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexCaballero() {
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
		
		ModeloArma modeloArma = new ModeloArma();
		modeloArma.setConector(conector);
		
		ModeloEscudo modeloEscudo = new ModeloEscudo();
		modeloEscudo.setConector(conector);

		ArrayList<Caballero> caballeros = modeloCaballero.getTodos();
		ArrayList<Arma> armas = modeloArma.getTodos();
		ArrayList<Escudo> escudos = modeloEscudo.getTodos();
		

		request.setAttribute("caballeros", caballeros);
		request.setAttribute("armas", armas);
		request.setAttribute("escudos", escudos);
		
		request.setAttribute("msg", request.getParameter("msg"));
		

		request.getRequestDispatcher("indexCaballero.jsp").forward(request, response);

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
