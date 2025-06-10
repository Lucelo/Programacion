package org.example;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static Object Connection;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Insertar nuevo producto");
            System.out.println("2. Realizar pedido");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    // Lógica para insertar producto
                    break;
                case 2:
                    // Lógica para realizar pedido
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

    }
}