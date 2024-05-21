package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Escudo;

public class ModeloEscudo {
	
	private Conector conector;
	
	
	
	
	public void setConector(Conector conector) {
		this.conector = conector;
	}

	public Conector getConector() {
		return conector;
	}

	public ArrayList<Escudo> getTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Escudo getEscudo(int idEscudo) {
		
		 String sql = "SELECT * FROM escudos WHERE id=?";
	        Escudo escudo = new Escudo();

	        try {
	            PreparedStatement pst = this.conector.getConexion().prepareStatement(sql);
	            pst.setInt(1, idEscudo); 
	            ResultSet rs = pst.executeQuery();

	            while (rs.next()) {  

	                escudo.setId(rs.getInt("id"));
	                escudo.setNombre(rs.getString("nombre"));
	                escudo.setCapacidad_defensa(rs.getInt("capacidad_defensa"));
	                

	                return escudo;

	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return null;
	}

}
