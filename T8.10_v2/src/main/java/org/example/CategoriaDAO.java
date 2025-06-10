package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import modelo.Categoria;

public class CategoriaDAO {
    public List<Categoria> obtenerTodas() {
        // SELECT * FROM categorias
        return null;
    }

    public Categoria buscarPorNombre(String nombre) {
        try (Connection con = ConexionBD.conectar()) {
            String sql = "SELECT * FROM categorias WHERE nombre = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Categoria c = new Categoria();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                return c;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



        return null;
    }
}

