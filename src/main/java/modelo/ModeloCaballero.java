package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ModeloCaballero {

	private Conector conector;

	public ArrayList<Caballero> getTodos() {

		ArrayList<Caballero> caballeros = new ArrayList<>();
		String sql = "SELECT * FROM caballeros";

		try {
			PreparedStatement pst = this.conector.getConexion().prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			
			while (rs.next()) {

			Caballero caballero = new Caballero();

			caballero.setId(rs.getInt("id"));
			caballero.setNombre(rs.getString("nombre"));
			caballero.setFuerza(rs.getInt("fuerza"));
			caballero.setExperiencia(rs.getInt("experiencia"));
			caballero.setFoto(rs.getString("foto"));

			caballeros.add(caballero);
			
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return caballeros;
	}

	public void setConector(Conector conector) {
		this.conector = conector;
	}

	public Conector getConector() {
		return conector;
	}

}
