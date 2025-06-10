package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://localhost:3306/classicmodels" + "?serverTimezone=UTC";

        try (Connection connection = DriverManager.getConnection(cadenaConexion, "root", "1dam")){
            PreparedStatement stmt = connection.prepareStatement("select * from customers where customerNumber = ?");
            stmt.setInt(1, 141);
            ResultSet rs = stmt.executeQuery();

            String cat = "' or '1' = '1'";

            //String cat = "Classic cars";

            Statement st = connection.createStatement();
            ResultSet es = st.executeQuery("select * from products where productline = '' or '1' = '1'");

            int contador = 0;

            while (rs.next()){
                System.out.println(rs.getString("customerName"));

                //System.out.println(rs.getInt(1));

                contador++;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}