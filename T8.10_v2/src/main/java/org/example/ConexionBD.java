package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection conectar() throws SQLException {
        String cadenaConexion = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
        String user = "root";
        String password = "1dam";

        return DriverManager.getConnection(cadenaConexion, user, password);
    }
}