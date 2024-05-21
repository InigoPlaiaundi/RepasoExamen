package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloArma {

    private Conector conector;

    public ArrayList<Arma> getTodos() {

        ArrayList<Arma> armas = new ArrayList<>();
        String sql = "SELECT * FROM armas";

        try {
            PreparedStatement pst = this.conector.getConexion().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Arma arma = new Arma();

                arma.setId(rs.getInt("id"));
                arma.setNombre(rs.getString("nombre"));
                arma.setCapacidad_danio(rs.getInt("capacidad_danio"));
                arma.setFoto(rs.getString("foto"));

                armas.add(arma);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return armas;
    }

    public Arma getArma(int idArma) {

        String sql = "SELECT * FROM armas WHERE id=?";
        Arma arma = new Arma();

        try {
            PreparedStatement pst = this.conector.getConexion().prepareStatement(sql);
            pst.setInt(1, idArma); 
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {  

                arma.setId(rs.getInt("id"));
                arma.setNombre(rs.getString("nombre"));
                arma.setCapacidad_danio(rs.getInt("capacidad_danio"));
                arma.setFoto(rs.getString("foto"));

                return arma;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void setConector(Conector conector) {
        this.conector = conector;
    }

    public Conector getConector() {
        return conector;
    }
}
