package org.example;

import java.util.Scanner;

public class Main {
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
                    Scanner producto = new Scanner(System.in);

                    System.out.print("Nombre del producto: ");
                    String nombre = producto.nextLine();

                    System.out.print("Precio: ");
                    double precio = Double.parseDouble(producto.nextLine());

                    System.out.print("Stock: ");
                    int stock = Integer.parseInt(producto.nextLine());

                    System.out.print("Nombre de la categoría: ");
                    String nombreCategoria = producto.nextLine();

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