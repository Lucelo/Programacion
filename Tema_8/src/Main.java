import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
    String cadenaConexion = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";

    try (Connection connection = DriverManager.getConnection(cadenaConexion, "root", "root")){

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    }

}