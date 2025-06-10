package org.example;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el cliente a eliminar: ");

        String nombreCliente = scanner.nextLine();

        scanner.close();

        String cadenaConexion = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";

        try (Connection connection = DriverManager.getConnection(cadenaConexion, "root", "1dam")) {
            connection.setAutoCommit(false); // Empezamos transacción

            // Buscar Cliente
            int customerNumber = -1;
            String sqlBuscar = "SELECT customerNumber FROM customers WHERE customerName = ?";
            try (PreparedStatement buscar = connection.prepareStatement(sqlBuscar)) {
                buscar.setString(1, nombreCliente);
                ResultSet rs = buscar.executeQuery();
                if (rs.next()) {
                    customerNumber = rs.getInt("customerNumber");
                } else {
                    System.out.println("No se encontró el cliente con nombre: " + nombreCliente);
                    return;
                }
            }

            // Borrar orderdetails
            String sqlBorrarDetalles = "DELETE FROM orderdetails WHERE orderNumber IN " + "(SELECT orderNumber FROM orders WHERE customerNumber = ?)";

            try (PreparedStatement borrarDetalles = connection.prepareStatement(sqlBorrarDetalles)) {
                borrarDetalles.setInt(1, customerNumber);
                borrarDetalles.executeUpdate();
            }

            // Borrar orders
            String sqlBorrarPedidos = "DELETE FROM orders WHERE customerNumber = ?";

            try (PreparedStatement borrarPedidos = connection.prepareStatement(sqlBorrarPedidos)) {
                borrarPedidos.setInt(1, customerNumber);
                borrarPedidos.executeUpdate();
            }

            // Borrar pagos
            String sqlBorrarPagos = "DELETE FROM payments WHERE customerNumber = ?";

            try (PreparedStatement borrarPagos = connection.prepareStatement(sqlBorrarPagos)) {
                borrarPagos.setInt(1, customerNumber);
                borrarPagos.executeUpdate();
            }

            // Borrar customer
            String sqlBorrarCliente = "DELETE FROM customers WHERE customerNumber = ?";
            
            try (PreparedStatement borrarCliente = connection.prepareStatement(sqlBorrarCliente)) {
                borrarCliente.setInt(1, customerNumber);
                int filas = borrarCliente.executeUpdate();
                if (filas > 0) {
                    System.out.println("Cliente '" + nombreCliente + "' y sus datos han sido eliminados.");
                }
            }

            connection.commit(); // Confirmamos los cambios

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el cliente. Revirtiendo cambios.");
        }
    }
}

